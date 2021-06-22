package com.example.hellospring;


public class DemoOOP {

    public static void main(String[] args){
        Employee employee = new Employee();
        System.out.println(employee);
        System.out.println(employee.toString());

        if(employee instanceof Object){
            System.out.println("ok");
        }
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        /*if(employee1 == employee2){
            System.out.println("equl1");
        }ไม่ควรทำ*/

        if(employee1 .equals(employee2)){
            System.out.println("equl2");
        }else {
            System.out.println("not equal");
        }
    }
}
