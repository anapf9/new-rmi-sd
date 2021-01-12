package br.ufs.dcomp.ExemploRMIJava;

import java.rmi.*;
public class MyServer{
    public static void main(String args[])throws Exception{
        Remote remote = new BankImpl();
        Naming.rebind("rmi://localhost:5001/javatpoint", remote);
    }}