package org.model;

import java.util.ArrayList;

public class Student 
{
    private int rno;
    private String name;
    private String email;
    private String Contact;
    private ArrayList bookissued;
    public Student()
    {
        
    }
    public Student(String name,String email,String Contact)
    {
        this.rno=rno;
        this.name=name;
        this.email=email;
        this.Contact=Contact;
        this.bookissued = new ArrayList(); 
    }
    
    public int getrno() 
    {
        return rno;
    }
    public void setrno(int rno) 
    {
        this.rno = rno;
    }
    public String getName() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public String getEmail() 
    {
        return email;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }
    public String getContact() 
    {
        return Contact;
    }
    public void setContact(String Contact) 
    {
        this.Contact = Contact;
    }
    public void setBook(ArrayList books)
    {
        this.bookissued=books;
    }
    public ArrayList getissuedbooks()
    {
        return bookissued;
    }
}
