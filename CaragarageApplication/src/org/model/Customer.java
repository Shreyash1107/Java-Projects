package org.model;

import java.util.ArrayList;

public class Customer 
{
    private String name;
    private String address;
    private String Contact;
    public Customer()
    {

    }
    public Customer(String name,String address,String Contact)
    {
        this.name=name;
        this.address=address;
        this.Contact=Contact;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public String getname()
    {
        return name;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public String getaddress()
    {
        return address;
    }
    public void setContact(String Contact)
    {
        this.Contact=Contact;
    }
    public String getContact()
    {
        return Contact;
    }
    public ArrayList<Cars> getCarsList() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCarsList'");
    }
}
