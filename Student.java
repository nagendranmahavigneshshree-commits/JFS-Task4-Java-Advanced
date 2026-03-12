class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {

    int rollNo;
    String name;
    int age;
    String course;

    Student(int rollNo, String name, int age, String course)
            throws AgeNotWithinRangeException, NameNotValidException {

        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age not between 15 and 21");
        }

        if (!name.matches("[a-zA-Z ]+")) {
            throw new NameNotValidException("Name should not contain numbers or symbols");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + age + " " + course);
    }

    public static void main(String[] args) {
        try {
            Student s = new Student(1, "Ramesh", 18, "Java");
            s.display();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
