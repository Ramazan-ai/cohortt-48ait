package dao;

import model.Student;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryStudentRepositoryTest {
    private  InMemoryStudentRepository repository;

    @BeforeEach
    void setUp() {
        repository = new InMemoryStudentRepository();
    }

    @org.junit.jupiter.api.Test
    void createAndRead() {
        Student student= new Student("1","Alice","Computer Science",3.5);
        repository.create(student);
        Student found= repository.read("1");
        assertEquals(student,found);
    }

    @org.junit.jupiter.api.Test
    void update() {
        Student student= new Student("1","Alice","Computer Science",3.5);
        repository.create(student);
         student= new Student("1","Alice","Mathematics",3.6);
         repository.update(student);
         assertEquals("Mathematics",repository.read("1").getCourse());
    }

    @org.junit.jupiter.api.Test
    void delete() {
        Student student= new Student("1","Alice","Computer Science",3.5);
        repository.create(student);
        repository.delete("1");
        assertNull(repository.read("1"));
    }

    @org.junit.jupiter.api.Test
    void findAll() {
        Student student1= new Student("1","Alice","Computer Science",3.5);
        Student student2= new Student("2","Bob","Mathematics",3.3);
        repository.create(student1);
        repository.create(student2);

        List<Student> alltudents =repository.findAll();
        assertEquals(2,alltudents.size());
       assertTrue(alltudents.contains(student1));
        assertTrue(alltudents.contains(student2));
    }

    @org.junit.jupiter.api.Test
    void findByCourse() {
        Student student1= new Student("1","Alice","Computer Science",3.5);
        Student student2= new Student("2","Bob","Computer Science",3.5);
        Student student3= new Student("3","Charlie","Mathematics",3.5);

        repository.create(student1);
        repository.create(student2);
        repository.create(student3);

        List<Student> csStudents= repository.findByCourse("Computer Science");
        assertEquals(2,csStudents.size());
        assertTrue(csStudents.contains(student1));
        assertTrue(csStudents.contains(student2));

        List<Student> matHStudents= repository.findByCourse("Mathematics");
        assertEquals(1,matHStudents.size());
        assertTrue(matHStudents.contains(student3));
    }
}