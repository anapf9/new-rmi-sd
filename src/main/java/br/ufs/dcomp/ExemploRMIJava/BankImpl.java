package br.ufs.dcomp.ExemploRMIJava;

import java.rmi.*;
import java.rmi.server.*;
import java.sql.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
class BankImpl extends UnicastRemoteObject implements Bank{
    BankImpl()throws RemoteException{}

    public List<Customer> getCustomers(){
        List<Customer> list=new ArrayList<Customer>();
        try{
            // Class.forName("oracle.jdbc.driver.OracleDriver");
            // Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/students", "postgres",
                "exams@123");
            System.out.println("Connection established successfully");
            PreparedStatement ps = con.prepareStatement("select * from customer400");
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Customer customer = new Customer();
                customer.setId(rs.getInt(1));
                customer.setFirstname(rs.getString(2));
                list.add(customer);
            }

            con.close();
        }catch(Exception e){System.out.println(e);}
        return list;
    }//end of getCustomers()
}