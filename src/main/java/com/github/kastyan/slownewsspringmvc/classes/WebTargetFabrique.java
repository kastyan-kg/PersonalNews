package com.github.kastyan.slownewsspringmvc.classes;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

@Component
public class WebTargetFabrique {

    @Bean
    public WebTarget getWebTarget (){
        Client client = ClientBuilder.newClient();
        WebTarget webTarget =  client.target("http://tyzhden.ua/RSS/News/");
        return webTarget;
    }


}