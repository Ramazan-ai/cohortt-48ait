package dao;

import model.Student;

import java.util.List;

public interface StudentRepository {
    void create(Student student);
    Student read(String id);
    void update(Student student);
    void delete(String id);
    List<Student> findAll();
    List<Student>findByCourse(String course);
}
