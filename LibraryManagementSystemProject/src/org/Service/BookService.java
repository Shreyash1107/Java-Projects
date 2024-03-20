package org.Service;

import java.util.ArrayList;
import java.util.Iterator;

import org.Repository.BookRepository;
import org.model.Books;

public class BookService 
{
    BookRepository brepo = new BookRepository();
    public boolean isBookAdded(Books b)
    {
        int bookid;
        bookid = brepo.getid();
        bookid = bookid + 1;
        b.setId(bookid);
        boolean m = brepo.isAddBooks(b);
        return m;
    }
    public ArrayList getallbook()
    {
        ArrayList al = brepo.getallbooks();
        return al.size()>0?al:null;
    }
    public Books getbookbyid(int bid)
    {
        ArrayList books = brepo.getallbooks();
        for (Object object : books) 
        {
            Books book = (Books)object;
            if(book.getId()==bid)
            {
                return book;
            }
        }
        return null;
    }
    public boolean deleteboosbyauthor(String author) 
    {
        ArrayList books = brepo.getallbooks();
        boolean deletedBook = false;
    
        for (int i = 0; i < books.size(); i++) 
        {
            Books book = (Books) books.get(i);
    
            if (book.getAuthor().equalsIgnoreCase(author)) 
            {
                books.remove(i);
                deletedBook = true;
                i--;
            }
        }
        return deletedBook;
    }
    public ArrayList getBooksIssuedToStudent(String studentRollNumber) 
    {
        ArrayList allBooks = brepo.getallbooks();
        ArrayList booksIssuedToStudent = new ArrayList();

        for (Object obj : allBooks) 
        {
            Books book = (Books) obj;
            if (studentRollNumber.equals(book.getIssuedTo())) 
            {
                booksIssuedToStudent.add(book);
            }
        }
        return booksIssuedToStudent.size() > 0 ? booksIssuedToStudent : null;
    }
}
