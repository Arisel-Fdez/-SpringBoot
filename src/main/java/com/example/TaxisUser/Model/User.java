package com.example.TaxisUser.Model;

import javax.persistence.*;


@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Long id;
    private String name;
    private String userName;
    private String company;
    private int age;
    private int numberTaxi;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCompany(){
        return company;
    }

    public void setCompany(String company){
        this.company = company;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getNumberTaxi(){
        return numberTaxi;
    }

    public void setNumberTaxi(int numberTaxi){
        this.numberTaxi = numberTaxi;
    }

    



}
