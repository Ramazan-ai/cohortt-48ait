package dao;

import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InMemoryStudentRepository implements StudentRepository {
    private List<Student> students = new ArrayList<>();

    @Override
    public void create(Student student) {
        students.add(student);

    }

    @Override
    public Student read(String id) {
        return students.stream()
                .filter(student -> student.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void update(Student student) {
        int index = students.indexOf(read(student.getId()));
        if (index!=-1){
            students.set(index,student);
        }

    }

    @Override
    public void delete(String id) {
        students.removeIf(student -> student.getId().equals(id));

    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(students);
    }

    @Override
    public List<Student> findByCourse(String course) {
        return students.stream()
                .filter(student -> student.getCourse().equalsIgnoreCase(course))
                .collect(Collectors.toList());
    }

}
