import java.util.HashMap;

public class StudentGrades {

    HashMap<String, Integer> map = new HashMap<>();

    void addStudent(String name, int grade) {
        map.put(name, grade);
    }

    void removeStudent(String name) {
        map.remove(name);
    }

    void displayGrade(String name) {
        if (map.containsKey(name)) {
            System.out.println(name + " grade: " + map.get(name));
        } else {
            System.out.println("Student not found");
        }
    }

    public static void main(String[] args) {

        StudentGrades s = new StudentGrades();

        s.addStudent("Ravi", 85);
        s.addStudent("Anu", 90);

        s.displayGrade("Ravi");

        s.removeStudent("Anu");

        s.displayGrade("Anu");
    }
}
