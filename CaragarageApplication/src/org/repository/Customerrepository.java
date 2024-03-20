package org.repository;

import java.util.ArrayList;

import org.model.Customer;

public class Customerrepository 
{
    ArrayList al = new ArrayList();
    public boolean iscustomerAdded(Customer cust)
    {
        boolean b = al.add(cust);
        return b;
    }
}
