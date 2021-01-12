package br.ufs.dcomp.ExemploRMIJava;

import java.util.*;
import java.rmi.*;
public class MyClient{
    public static void main(String args[])throws Exception{
        Bank b=(Bank)Naming.lookup("rmi://localhost:5001/javatpoint");

        List<Customer> list=b.getCustomers();
        for(Customer c:list){
            System.out.println(c.getId()+" "+c.getFirstname());
        }

    }}