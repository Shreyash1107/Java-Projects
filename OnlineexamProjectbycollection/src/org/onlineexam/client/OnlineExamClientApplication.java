package org.onlineexam.client;

import java.util.Scanner;

import org.onlineexam.Service.QuestionService;
import org.onlineexam.model.Question;


public class OnlineExamClientApplication 
{
    public static void main(String[] args) 
    {
        int choice;
        QuestionService qservice = new QuestionService();
        Scanner xyz = new Scanner(System.in);    
        do
        {
            System.out.println("1.Add Questions in a Collection");
            System.out.println("2.View All Questions");
            System.out.println("3.Add New Exam Schedule");
            System.out.println("4.View all Exams");
            System.out.println("5.Attempt exam by Schedule");
            System.out.println("6.Store result of Student and Display");
            System.out.println("7.Delete Questions");
            System.out.println("8.Update Questions");
            System.out.println("9.Update Exam Schedule");
            System.out.println("10.Delete Students");
            System.out.println("Enter the Choice:");
            choice = xyz.nextInt();
            switch(choice)
            {
                case 1:
                xyz.nextLine();
                System.out.println("Enter the Question,Options and Answers:");
                String qname = xyz.nextLine();
                String op1 = xyz.nextLine();
                String op2 = xyz.nextLine();
                String op3 = xyz.nextLine();
                String op4 = xyz.nextLine();
                String answer = xyz.nextLine();
                Question q= new Question(qname,op1,op2,op3,op4,answer);
                qservice.isAddQuestion(q);
                boolean b = qservice.isAddQuestion(q);
                if(b)
                {
                    System.out.println("Question Added Successfully...");
                }
                else
                {
                    System.out.println("There is some Issue......");
                }
                    break;
            }
        }while(true);
    }
}
