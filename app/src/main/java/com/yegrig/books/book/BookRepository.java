package com.yegrig.books.book;

import java.util.ArrayList;

public interface BookRepository {
    ArrayList<Book> getBooks();
    Book getBookById(int id);

}
