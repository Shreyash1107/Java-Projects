package org.repository;

import java.util.ArrayList;

import org.model.Cars;

public class Carrepository 
{
    ArrayList al = new ArrayList();
    public boolean isCarAdded(Cars c)
    {
        boolean b = al.add(c);
        return b;
    }
    public ArrayList getallcars()
    {
        return al;
    }
    public boolean updatecarstatus(String regno,String status)
    {
        for(Object obj:al)
        {
            Cars c = (Cars)obj;
            if(c.getregno().equalsIgnoreCase(regno))
            {
                c.setstatus(status);
                return true;
            }
        }
        return false;
    }
}
