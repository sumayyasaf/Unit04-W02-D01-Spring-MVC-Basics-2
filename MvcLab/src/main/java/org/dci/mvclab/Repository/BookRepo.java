package org.dci.mvclab.Repository;

import org.dci.mvclab.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepo {
    private List<Book> books = new ArrayList<>();

    public BookRepo() {
        books.add(new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy", 1937, true, 10.99));
        books.add(new Book("1984", "George Orwell", "Dystopian", 1949, true, 8.99));
        books.add(new Book("Clean Code", "Robert C. Martin", "Programming", 2008, false, 30.00));
        books.add(new Book("Moby Dick", "Herman Melville", "Classic", 1851, true, 12.50));
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", "Classic", 1951, true, 9.75));
        books.add(new Book("Effective Java", "Joshua Bloch", "Programming", 2018, true, 35.20));
        books.add(new Book("Pride and Prejudice", "Jane Austen", "Romance", 1813, false, 11.80));
        books.add(new Book("The Pragmatic Programmer", "Andrew Hunt", "Programming", 1999, true, 28.45));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", "Classic", 1960, true, 7.30));
        books.add(new Book("Harry Potter", "J.K. Rowling", "Fantasy", 1997, false, 14.00));
}
public List<Book> getBooks() {
    return books;
    }
}
