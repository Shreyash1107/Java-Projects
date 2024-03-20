package org.model;

public class Mechanic 
{
    private int id;
    private String name;
    private String Address;
    private String Contact;
    private String Speciality;
    public Mechanic()
    {
        
    }
    public Mechanic(int id,String name,String Address,String Contact,String Speciality)
    {
        this.id=id;
        this.name=name;
        this.Address=Address;
        this.Contact=Contact;
        this.Speciality=Speciality;
    }
    public void setid(int id)
    {
        this.id=id;
    }
    public int getid()
    {
        return id;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public String getname()
    {
        return name;
    }
    public void setAddress(String Address)
    {
        this.Address=Address;
    }
    public String getAddress()
    {
        return Address;
    }
    public void setContact(String Contact)
    {
        this.Contact=Contact;
    }
    public String getContact()
    {
        return Contact;
    }
    public void setSpeciality(String Speciality)
    {
        this.Speciality=Speciality;
    }
    public String getSpeciality()
    {
        return Speciality;
    }
}
