package org.Service;

import java.util.ArrayList;

import org.model.Cars;
import org.repository.Carrepository;

public class Carservice 
{
    Carrepository crepo = new Carrepository();
    public boolean isCarAdded(Cars c)
    {
        boolean b = crepo.isCarAdded(c);
        return b;
    }
    public ArrayList getallCars()
    {
        ArrayList al = crepo.getallcars();
        return al.size()>0 ? al : null;
    }
    public boolean updatecarstatus(String regno,String status)
    {
        boolean b = crepo.updatecarstatus(regno, status);
        return b;
    }
    public boolean delcarbyregno(String Regno)
    {
        ArrayList al = crepo.getallcars();
        boolean cardel = false;
        for(int i=0;i<al.size();i++)
        {
            Cars c = (Cars)al.get(i);
            if(c.getregno().equalsIgnoreCase(Regno))
            {
                al.remove(i);
                cardel = true;
                i--;
            }
        }
        return cardel;
    }
}
