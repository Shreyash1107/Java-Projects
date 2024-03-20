package org.client;

import java.util.ArrayList;
import java.util.Scanner;

import org.Service.BookService;
import org.Service.Studentservice;
import org.model.Books;
import org.model.Student;

public class ClientApplication 
{
    public static void main(String[] args) 
    {
        int choice,i;
        BookService bservice = new BookService(); 
        Studentservice studservice = new Studentservice();
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("1.Add Books in Collection");
            System.out.println("2.View All Books");
            System.out.println("3.Count Category wise Books");
            System.out.println("4.Display Category wise Books Info");
            System.out.println("5.Display Author wise Books");
            System.out.println("6.Add New Students");
            System.out.println("7.Issue Book to Students");
            System.out.println("8.Show stock after Book issue");
            System.out.println("9.View Student wise Books");
            System.out.println("10.Delete Book by author");
            System.out.println("Enter the Choice:");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                sc.nextLine();   //Consuming New Line Character
                System.out.println("Enter Name of the Book:");
                String name = sc.nextLine();
                System.out.println("Enter the Book Author Name:");
                String author = sc.nextLine();
                System.out.println("Enter the Book Publication");
                String pub = sc.nextLine();
                System.out.println("Enter the Book Price:");
                int price = sc.nextInt();
                sc.nextLine();   //Consuming new line character
                System.out.println("Enter the Book's Category:");
                String category = sc.nextLine();
                Books b = new Books(name, author, pub, price, category);
                boolean m = bservice.isBookAdded(b);
                if(m)
                {
                    System.out.println("Book has been Added Successfully....");
                }
                else
                {
                    System.out.println("There is Some Issue...");
                }
                      break;
                    case 2:
                    ArrayList al= bservice.getallbook();
                    if(al!=null)
                    {
                        System.out.println("Books are Present in Library..... ");
                        for(Object obj:al)
                        {
                            Books bk = (Books)obj;
                            System.out.println(bk.getId() + "\t" + bk.getName() + "\t" + bk.getAuthor() + "\t" + bk.getPublication() + "\t" + bk.getPrice() + "\t" + bk.getCategory() + "\t");
                        }
                    }
                    else
                    {
                        System.out.println("There is no book Present.....");
                    }
                      break;
                    case 3:
                    int count;
                    sc.nextLine();
                    System.out.println("Enter the Book Category:");
                    String cat = sc.nextLine();
                    al = bservice.getallbook();
                    if (al == null) 
                    {
                        System.out.println("There are No Books Present in Library....");
                    } 
                    else 
                    {
                        boolean flag = false;
                        for (i = 0; i < al.size(); i++) 
                        {
                            Books ob = (Books) al.get(i);
                            if (ob.getCategory().equalsIgnoreCase(cat)) 
                            {
                                if (!flag) 
                                {
                                    flag = true;
                                    count = 1;
                                    for (int k = i + 1; k < al.size(); k++) 
                                    {
                                        Books inner = (Books) al.get(k);
                                        if (inner.getCategory().equalsIgnoreCase(cat)) 
                                        {
                                            count++;
                                        }
                                    }
                                    System.out.println(cat + " has " + count + " Books Present in Library");
                                }
                            }
                        }
                
                        if (!flag) 
                        {
                            System.out.println("No books found for the given category: " + cat);
                        }
                    }
                        break;
                    case 4:
                        sc.nextLine();  //Consuming NewLine Character
                        String Category;
                        System.out.println("Enter the Category:");
                        Category = sc.nextLine();
                        al = bservice.getallbook();
                        if (al == null) 
                        {
                            System.out.println("There are No Books Present in Library....");
                        } 
                        else 
                        {
                            boolean flag = false;
                            System.out.println("Books in Category: " + Category);
                            for (i = 0; i < al.size(); i++) 
                            {
                                Books ob = (Books) al.get(i);

                                if (ob.getCategory().equalsIgnoreCase(Category)) 
                                {
                                    flag = true;
                                    System.out.println(ob.getId() + "\t" + ob.getName() + "\t" + ob.getAuthor() + "\t" + ob.getPublication() + "\t" + ob.getPrice() + "\t" + ob.getCategory());        
                                }
                            }
                            if (!flag) 
                            {
                                System.out.println("No books found for the given category: " + Category);
                            }
                        }
                         break;
                        case 5:
                        sc.nextLine();   //Consuming newline Character
                        String Author;
                        System.out.println("Enter the Author name:");
                        Author = sc.nextLine();
                        al = bservice.getallbook();
                        if(al==null)
                        {
                            System.out.println("There are no books with Author Name");
                        }
                        else
                        {
                            boolean flag2=false;
                            System.out.println("Books with Author name Are:" +Author);
                            for(i=0;i<al.size();i++)
                            {
                               Books ob = (Books)al.get(i);
                               if(ob.getAuthor().equalsIgnoreCase(Author))
                               {
                                    flag2 = true;
                                    System.out.println(ob.getId() + "\t" + ob.getName() + "\t" + ob.getAuthor() + "\t" + ob.getPublication() + "\t" + ob.getPrice() + "\t" + ob.getCategory() + "\t");
                               }
                            }
                            if(!flag2)
                            {
                                System.out.println("There is no such book with Author Name:" +Author);
                            }
                        }
                          break;
                        case 6:
                        sc.nextLine(); //Consuming NewLine Character
                        System.out.println("Enter the Name of the Student:");
                        String Name = sc.nextLine();
                        System.out.println("Enter the Email of a Student:");
                        String email = sc.nextLine();
                        System.out.println("Enter the Student's Contact Number:");
                        String Contact = sc.nextLine();
                        Student s = new Student(Name, email, Contact);
                        boolean bool = studservice.isAddStudent(s);
                        if(bool)
                        {
                            System.out.println("Student has been Added Sucessfully....");
                        }
                        else
                        {
                            System.out.println("There may be some issue while Adding Students....");
                        }
                           break;
                        case 7:
                            ArrayList bal = new ArrayList();
                            al = bservice.getallbook();
                            ArrayList st = studservice.getallStudent();
                            int f1 = 0;
                            System.out.println("Enter The Student Roll Number:");
                            int rno1 = sc.nextInt();
                            s = studservice.getStudentByrollno(rno1);
                            if (s != null) 
                            {
                                System.out.println("Books Present:");
                                ArrayList al1 = bservice.getallbook();

                                if (al1 != null) 
                                {
                                    for (i = 0; i < al1.size(); i++) 
                                    {
                                        b = (Books) al1.get(i);
                                        System.out.println( "\n" + b.getId() + "\t" + b.getName() + "\t" + b.getAuthor() + "\t"  + b.getPublication() + "\t" + b.getPrice() + "\t"
                                        + b.getCategory() + "\t");
                                    }
                                } 
                                else 
                                {
                                    System.out.println("NO BOOKS IN LIBRARY");
                                }
                                System.out.println("How Many Books Do You Want?:");
                                int limit = sc.nextInt();
                                for (i = 0; i < limit; i++) 
                                {
                                    System.out.println("Enter The Book Id:");
                                    int bid1 = sc.nextInt();
                                    for (Object obj : al) 
                                    {
                                        Books  book = (Books)obj;
                                        if (book.getId() == bid1) 
                                        {
                                            bal.add(obj);
                                            book.setStatus("Issued");
                                        }
                                        
                                    }
                                }
                                s.setBook(bal);
                                f1 = 1;

                                if (f1 == 1) 
                                {
                                    System.out.println("Book Is Added:");
                                } 
                                else 
                                {
                                    System.out.println("Book Is Not Added:");
                                }
                            } 
                            else 
                            {
                                System.out.println("Student with Roll Number " + rno1 + " not found.");
                            }
                            break;
                            case 8:
                            ArrayList stockAfterIssue = bservice.getallbook();

                            if (stockAfterIssue != null) 
                            {
                                if (!stockAfterIssue.isEmpty()) 
                                {
                                    System.out.println("Books are there in stock...");
                                    for (Object obj : stockAfterIssue) 
                                    {
                                            Books book = (Books) obj;
                                            System.out.println( book.getId() + "\t" + book.getName() + "\t" + book.getAuthor() + "\t" +  book.getPublication() + "\t" + book.getPrice() + "\t" +
                                            book.getCategory() + "\t" + book.getStatus());
                                    }
                                } 
                                else 
                                {
                                    System.out.println("No books in stock.");
                                }
                            } 
                            else 
                            {
                                System.out.println("Failed to retrieve stock information.");
                            }
                            break;
                            case 9:
                            sc.nextLine(); // Consuming newline character
                            System.out.println("Enter the Student's Roll Number:");
                            String studentRollNumber = sc.nextLine();
                            ArrayList booksIssued = bservice.getBooksIssuedToStudent(studentRollNumber);

                            if (booksIssued != null && !booksIssued.isEmpty()) 
                            {
                                System.out.println("Books issued to Student with Roll Number " + studentRollNumber);
                                for (Object obj : booksIssued) 
                                {
                                    Books book = (Books) obj;
                                    System.out.println(book.getId() + "\t" + book.getName() + "\t" + book.getAuthor() + "\t" + book.getPublication() + "\t" + book.getPrice() + "\t"
                                    + book.getCategory());         
                                }
                            } 
                            else 
                            {
                                System.out.println("No books issued to Student with Roll Number " + studentRollNumber);
                            }
                            break;
                        case 10:
                        sc.nextLine(); //Consuming New Line Character
                        System.out.println("Enter the Author Name for Deleting Book:");
                        Author = sc.nextLine();
                        boolean delbook = bservice.deleteboosbyauthor(Author);
                        if(delbook)
                        {
                            System.out.println("Book with Author name " + Author+ " is Deleted Successfully");
                        }
                        else
                        {
                            System.out.println("No books with Author name" + Author + "Found");
                        }
                           break;
                           default:
                           System.out.println("\t\t\t\t\t\t\t*******Thank you*********\t\t\t\t\t\t\t");
                            break;
            }
        }while(choice<=10);  
    }
}