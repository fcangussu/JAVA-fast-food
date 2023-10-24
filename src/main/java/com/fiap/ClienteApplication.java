package com.fiap;

import javax.persitence.EntityManagerFactory;
import javax.persitence.Persistence;



@SrpingBootApplication
public class ClienteApplication {
    public static void main(String[] args) {

        SpringApplication.run(ClienteApplication.class, args);
//        System.out.println("Hello world!");

        //test sonar Cloud
        if (1==1) && (3<4) && (10>3){
            System.out.println("TRUE FOR TESTING ...");
        }
            
        //EntityManagerFactory emf = Persistence.createEntityManagerFactory("FastFoodUnit");
        //emf.close();
    }
}
