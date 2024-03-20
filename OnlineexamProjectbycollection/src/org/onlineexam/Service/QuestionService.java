package org.onlineexam.Service;

import org.onlineexam.model.Question;
import org.onlineexam.repository.QuestionRepository;

public class QuestionService 
{
    QuestionRepository qrepo = new QuestionRepository();
    public boolean isAddQuestion(Question q)
    {
        int qid = qrepo.getqid();
        qid = qid + 1;
        q.setId(qid);
        boolean b = qrepo.isAddQuestion(q);
        return b;
    }
}