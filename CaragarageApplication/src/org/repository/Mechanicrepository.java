package org.repository;

import java.util.ArrayList;

import org.model.Mechanic;

public class Mechanicrepository 
{
    ArrayList al = new ArrayList();
    public boolean ismechanicAdded(Mechanic m)
    {
        boolean b = al.add(m);
        return b;
    }
    public ArrayList getmechanic()
    {
        return al;
    }
}
