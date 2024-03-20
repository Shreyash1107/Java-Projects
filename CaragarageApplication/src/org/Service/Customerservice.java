package org.Service;

import org.model.Customer;
import org.repository.Customerrepository;

public class Customerservice 
{
    Customerrepository custrepo = new Customerrepository();
    public boolean isCustomerAdded(Customer cust)
    {
        boolean b = custrepo.iscustomerAdded(cust);
        return b;
    }
}
