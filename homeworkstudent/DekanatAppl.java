package homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DekanatAppl {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Jonn","Doe", LocalDate.of(2000,1,15),1,"A1","USA","male"));
        students.add(new Student(2,"Jane","Smith", LocalDate.of(1999,5,20),1,"A2","UK","female"));
        students.add(new Student(3,"Mario","Rossi", LocalDate.of(1998,2,8),1,"B1","Italy","male"));
        students.add(new Student(4,"Maria","Gonzalez", LocalDate.of(2001,7,16),1,"B2","Spain","female"));
        students.add(new Student(5,"Ali","Khan", LocalDate.of(1997,3,22),1,"C1","Pakistan","male"));

        //Сколько студентов мужчин и женщин
        long maleCount = students.stream().filter(s-> s.getGender().equals("male")).count();
        long femaleCount = students.stream().filter(s-> s.getGender().equals("female")).count();
        System.out.println("Anzahl der Männer: " + maleCount);
        System.out.println("Anzahl Frauen: " + maleCount);

        //Средний возраст по курсам
        Map<Integer,Double> averageAgeByCourse=students.stream()
                .collect(Collectors.groupingBy(Student::getCourse,Collectors.averagingInt(Student::getAge)));

        averageAgeByCourse.forEach((course,avgAge)->System.out.println("Durchschittsalter der Kursteilnehmer " + course + ": " + avgAge));

        // Список по группам \ по фамилии и возрасту
     List<Student> sortedStudents =students.stream()
             .sorted(Comparator.comparing(Student::getLastName)
                     .reversed()
                     .thenComparing(Comparator.comparingInt(Student::getAge)))
             .collect(Collectors.toList());
     sortedStudents.forEach(student -> System.out.println(student));

    }
}
