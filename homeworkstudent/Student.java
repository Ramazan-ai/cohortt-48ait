package homework;

import java.time.LocalDate;
import java.time.Period;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthDay;
    private int course;
    private String groupNum;
    private String country;
    private String gender;

    public Student(int id, String firstName, String lastName, LocalDate birthDay, int course, String groupNum, String country, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.course = course;
        this.groupNum = groupNum;
        this.country = country;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public int getCourse() {
        return course;
    }

    public String getGroupNum() {
        return groupNum;
    }

    public String getCountry() {
        return country;
    }

    public String getGender() {
        return gender;
    }
    public int getAge(){
        return Period.between(birthDay,LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", birthDay=").append(birthDay);
        sb.append(", course=").append(course);
        sb.append(", groupNum='").append(groupNum).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", gender='").append(gender).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
