package com.github.kastyan.personalnews.classes;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name="rss")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class Rss {

    @XmlElementWrapper( name = "channel" )
    @XmlElement( name = "item" )
    private ArrayList<Article> articleList;

    public ArrayList<Article> getArticleList() {
        return articleList;
    }

    public void setItems(ArrayList<Article> articleList) {
        this.articleList = articleList;
    }

    @Override
    public String toString() {
        return "Rss{" +
                "articleList=" + articleList.toString() +
                '}';
    }


}
