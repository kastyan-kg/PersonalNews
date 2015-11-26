package com.github.kastyan.slownewsspringmvc.controllers;

import com.github.kastyan.slownewsspringmvc.classes.DAO;
import com.github.kastyan.slownewsspringmvc.classes.Rss;

import javax.ws.rs.client.WebTarget;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class IndexController {
    @Autowired
    public WebTarget webTarget;


    @RequestMapping(value = "/news.html")
    public ModelAndView showNews(){

        final ModelAndView mav = new ModelAndView("WEB-INF/views/login.html");

        Rss rss = webTarget.request().get().readEntity(com.github.kastyan.slownewsspringmvc.classes.Rss.class);
       
        mav.addObject("rss", rss);
        return mav;



    }

}
