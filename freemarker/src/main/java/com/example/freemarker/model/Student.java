package com.example.freemarker.model;

public class Student {

    private Integer id;
    private  String name;
    private  double grade;


    public  Student (){}

    public Student (Integer id, String name, double grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public  void setId (Integer id){
        this.id = id;
    }

    public  void setName (String name){
        this.name = name;
    }


    public double getGrade() {
        return grade;
    }

    public  Integer getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}
