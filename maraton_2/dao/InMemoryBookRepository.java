package dao;

import model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InMemoryBookRepository implements BookRepository {
    private List<Book> books = new ArrayList<>();

    @Override
    public void create(Book book) {
        books.add(book);

    }

    @Override
    public Book read(String id) {
        return books.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void update(Book book) {
        int index = books.indexOf(read(book.getId()));
        if (index != -1) {
            books.set(index, book);
        }

    }

    @Override
    public void delete(String id) {
        books.removeIf(book -> book.getId().equals(id));

    }

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(books);
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

}
