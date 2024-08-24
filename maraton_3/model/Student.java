package model;

import java.util.Objects;

public class Student {
    private String id;
    private String name;
    private String course;
    private double gpa;

    public Student(String id, String name, String course, double gpa) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", course='").append(course).append('\'');
        sb.append(", gpa=").append(gpa);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(gpa, student.gpa) == 0 && Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(course, student.course);
    }
}


