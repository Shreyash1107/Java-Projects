package org.model;

public class Books 
{
    private int id;
    private String Name;
    private String Author;
    private String publication;
    private int price;
    private String Category;
    String status;
    String issuedTo;
    public Books()
    {

    }
    public Books(String Name,String Author,String publication,int price,String Category)
    {
        this.Name=Name;
        this.Author=Author;
        this.publication=publication;
        this.price=price;
        this.Category=Category;

    }   
    public int getId() 
    {
        return id;
    }    
    public void setId(int id) 
    {
        this.id = id;
    } 
    public String getName() 
    {
        return Name;
    }  
    public void setName(String Name) 
    {
        this.Name = Name;
    }   
    public String getAuthor() 
    {
        return Author;
    }
    public void setAuthor(String Author) 
    {
        this.Author = Author;
    }    
    public String getPublication() 
    {
        return publication;
    }   
    public void setPublication(String publication) 
    {
        this.publication = publication;
    }   
    public int getPrice() 
    {
        return price;
    }   
    public void setPrice(int price) 
    {
        this.price = price;
    }    
    public String getCategory() 
    {
        return Category;
    }    
    public void setCategory(String Category) 
    {
        this.Category = Category;
    }
    public void setStatus(String status) 
    {
        this.status=status;    
    }
    public  String getStatus()
    {
        return status;
    }
    public String getIssuedTo() {
        return issuedTo;
    }

    public void setIssuedTo(String issuedTo) {
        this.issuedTo = issuedTo;
    }
}    

