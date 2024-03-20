package org.Service;

import java.util.ArrayList;

import org.model.Mechanic;
import org.repository.Mechanicrepository;

public class Mechanicservice 
{
    Mechanicrepository mrepo = new Mechanicrepository();
    public boolean ismechanicAdded(Mechanic m)
    {
        boolean b = mrepo.ismechanicAdded(m);
        return b;
    }
    public ArrayList getmechanic()
    {
        ArrayList al = mrepo.getmechanic();
        return al.size()>0?al:null;
    }
}
