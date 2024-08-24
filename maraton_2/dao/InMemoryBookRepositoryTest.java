package dao;

import model.Book;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryBookRepositoryTest {
    private InMemoryBookRepository repository;

    @BeforeEach
    void setUp() {
        repository = new InMemoryBookRepository();

    }

    @org.junit.jupiter.api.Test
    void createAndRead() {
        Book book = new Book("1", "1984", "Lisa Braun", 9.99);
        repository.create(book);
        Book found = repository.read("1");
        assertEquals(book, found);

    }



    @org.junit.jupiter.api.Test
    void update() {
        Book book = new Book("1","1984","Lisa Braun",9.99);
        repository.create(book);
        book.setPrice(7.99);
        repository.update(book);
        assertEquals(7.99,repository.read("1").getPrice());
    }

    @org.junit.jupiter.api.Test
    void delete() {
        Book book = new Book("1","1984","Lisa Braun",9.99);
        repository.create(book);
        repository.delete("1");
        assertNull(repository.read("1"));
    }

    @org.junit.jupiter.api.Test
    void findAll() {
        Book book1 = new Book("1","1984","Lisa Braun",9.99);
        Book book2 = new Book("2","Title B","Puschkin A.C",10.99);
        repository.create(book1);
        repository.create(book2);
        List<Book> allBooks= repository.findAll();
        assertEquals(2,allBooks.size());
        assertTrue(allBooks.contains(book1));
        assertTrue(allBooks.contains(book2));

    }

    @org.junit.jupiter.api.Test
    public void findByAuthor(){
        Book book1 = new Book("1","1984","Lisa Braun",9.99);
        Book book2 = new Book("2","Title B","Lisa Braun",10.99);
        Book book3 = new Book("3","Title A","Martin",10.99);
        repository.create(book1);
        repository.create(book2);
        repository.create(book3);
        List<Book> orwellBooks= repository.findByAuthor("Lisa Braun");
        assertEquals(2,orwellBooks.size());
        assertTrue(orwellBooks.contains(book1));
        assertTrue(orwellBooks.contains(book2));



        List<Book> huxleyBooks = repository.findByAuthor("Martin");
        assertEquals(1,huxleyBooks.size());
        assertTrue(huxleyBooks.contains(book3));


    }

}