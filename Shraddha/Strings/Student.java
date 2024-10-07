import java.util.*;

class Student {
    private int id;
    private String firstName;
    private double cgpa;

    public Student(int id, String firstName, double cgpa) {
        this.id = id;
        this.firstName = firstName;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getCgpa() != s2.getCgpa()) {
            // Sort by cgpa in descending order
            return Double.compare(s2.getCgpa(), s1.getCgpa());
        } else if (!s1.getFirstName().equals(s2.getFirstName())) {
            // If cgpa is equal, sort by firstName in alphabetical order
            return s1.getFirstName().compareTo(s2.getFirstName());
        } else {
            // If cgpa and firstName are equal, sort by id in ascending order
            return Integer.compare(s1.getId(), s2.getId());
        }
    }
}