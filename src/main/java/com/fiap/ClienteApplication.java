package com.fiap;

import javax.persitence.EntityManagerFactory;
import javax.persitence.Persistence;



@SrpingBootApplication
public class ClienteApplication {
    public static void main(String[] args) {

        SpringApplication.run(ClienteApplication.class, args);
//        System.out.println("Hello world!");

        //EntityManagerFactory emf = Persistence.createEntityManagerFactory("FastFoodUnit");
        //emf.close();
    }
}