package org.onlineexam.repository;
import java.util.*;

import org.onlineexam.model.Question;
public class QuestionRepository 
{
    ArrayList al = new ArrayList();  //temporary Database
    public int getqid()
    {
        return al.size();
    }
    public boolean isAddQuestion(Question q)
    {
        boolean b = al.add(q);
        return b;
    }
}
