package org.Service;

import java.util.ArrayList;

import org.Repository.BookRepository;
import org.Repository.Studentrepository;
import org.model.Books;
import org.model.Student;

public class Studentservice 
{
    Studentrepository srepo = new Studentrepository();
    public boolean isAddStudent(Student s)
    {
        int rno;
        rno = srepo.getrno();
        rno = rno + 1;
        s.setrno(rno);
        boolean b = srepo.isAddStudent(s);
        return b;
    }
    public ArrayList getallStudent()
    {
        ArrayList al = srepo.showallStudent();
        return al.size()>0?al:null;
    }
    public Student getStudentByrollno(int Rollno) 
    {
        ArrayList students = srepo.showallStudent(); // Using raw ArrayList
        for (Object obj : students) 
        {
            Student s = (Student) obj; // Explicit casting to Student
            if (s.getrno() == Rollno) 
            {
                return s;
            }
        }
        return null;
    }
}
