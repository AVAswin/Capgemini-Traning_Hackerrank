import java.util.*;

// Student class
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
    public int compare(Student s1, Student s2) {
        if (Double.compare(s2.getCgpa(), s1.getCgpa()) != 0) {
            return Double.compare(s2.getCgpa(), s1.getCgpa()); // Descending CGPA
        } else if (!s1.getFirstName().equals(s2.getFirstName())) {
            return s1.getFirstName().compareTo(s2.getFirstName()); // Ascending name
        } else {
            return Integer.compare(s1.getId(), s2.getId()); // Ascending ID
        }
    }
}

public class JavaSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        List<Student> studentList = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int id = scan.nextInt();
            String firstName = scan.next();
            double cgpa = scan.nextDouble();
            studentList.add(new Student(id, firstName, cgpa));
        }
        scan.close();

        // Sort using custom comparator
        Collections.sort(studentList, new StudentComparator());

        // Print sorted names
        for(Student s : studentList) {
            System.out.println(s.getFirstName());
        }
    }
}
