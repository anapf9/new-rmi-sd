package br.ufs.dcomp.ExemploRMIJava;

public class Customer implements java.io.Serializable {
    private int id;
    private String firstname;
//getters and setters
    public int getId() {
    return id;
}
    public void setId(int accNo) {
        id = accNo;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}