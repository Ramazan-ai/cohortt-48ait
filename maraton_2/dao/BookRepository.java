package dao;

import model.Book;

import java.util.List;

public interface BookRepository {
    void create(Book book);
    Book read(String id);
    void update(Book book);
    void delete(String id);
    List<Book> findAll();
    List<Book> findByAuthor(String author);
}
