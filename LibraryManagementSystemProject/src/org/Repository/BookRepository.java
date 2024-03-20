package org.Repository;

import java.util.ArrayList;

import org.model.Books;

public class BookRepository 
{
    ArrayList al = new ArrayList();
    public int getid()
    {
        return al.size();
    }  
    public boolean isAddBooks(Books b)
    {
        boolean m = al.add(b);
        return m;
    }
    public ArrayList getallbooks()
    {
        return al;
    }
}
