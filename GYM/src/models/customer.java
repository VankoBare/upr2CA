package models;

import  membership.Membership;

public class customer {
    private String name;
    private int age;
    private Membership membership;

    public customer(String name, int age, Membership membership){
        this.name = name;
        this.age = age;
        this.membership = membership;
    }

    public void printInfo (){
        System.out.print("Name:" + name);
        System.out.print("Age:" + age);
        System.out.print("Membership:" + membership);
        System.out.print("Price:" + membership.getPrice());
        System.out.print("Benefits:");
        membership.printBenefits();
    }
}
