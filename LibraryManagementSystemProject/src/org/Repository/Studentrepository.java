package org.Repository;

import java.util.ArrayList;

import org.model.Student;

public class Studentrepository 
{
    ArrayList al = new ArrayList();
    public int getrno()
    {
        return al.size();
    }
    public boolean isAddStudent(Student s)
    {
        boolean b = al.add(s);
        return b;
    }
    public ArrayList showallStudent()
    {
        return al;
    }
}
