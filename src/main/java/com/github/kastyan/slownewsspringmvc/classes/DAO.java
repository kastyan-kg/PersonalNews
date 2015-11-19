
package com.github.kastyan.slownewsspringmvc.classes;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.client.WebTarget;
import java.util.List;

public class DAO {

    @Autowired
    public WebTarget webTarget;

    public void setArchive(List <Article> articleList){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Article");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        for (Article a : articleList ){
            entityManager.persist(a);
        }

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }

    public List <Article> getArchive(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Article");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        List <Article> articles = (List <Article>) entityManager.createQuery("select e from Article e").getResultList();
        entityManager.close();
        entityManagerFactory.close();
        return articles;
    }


    public List <Article> getNews(){

        Rss rss = webTarget.request().get().readEntity(com.github.kastyan.slownewsspringmvc.classes.Rss.class);
        List <Article> articleList = rss.getArticleList();
        return articleList;
    }



}
