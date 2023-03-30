import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<Student>();
        ArrayList<Teacher> teacherList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduceți numele studentului:");
            String name = scanner.nextLine();
            System.out.println("Introduceți vârsta studentului:");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Introduceți specializarea studentului:");
            String specialization = scanner.nextLine();

            Student student = new Student(name, age, specialization);
            studentList.add(student);
        }


        Teacher teacher1 = new Teacher("Betisor Natalia", 37, "Matematica si Informatica");
        Teacher teacher2 = new Teacher("Andriuta Lilia", 35, "Fizica");
        Teacher teacher3 = new Teacher("Postolache Ion", 45, "Geografie");
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);


        System.out.println("Lista de studenți:");
        for (Student student : studentList) {
            System.out.println(student.getName() + " (" + student.getAge() + ") - " + student.getSpecialization());
        }


        System.out.println("\nLista de profesori:");
        for (Teacher teacher : teacherList) {
            System.out.println(teacher.getName() + " (" + teacher.getAge() + ") - " + teacher.getSpecialization());
        }
    }
}

class Student {
    private String name;
    private final int age;
    private String specialization;

    public Student(String name, int age, String specialization) {
        this.name = name;
        this.age = age;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecialization() {
        return specialization;
    }
}

class Teacher {
    private String name;
    private int age;
    private String specialization;

    public Teacher(String name, int age, String specialization) {
        this.name = name;
        this.age = age;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecialization() {
        return specialization;
    }
}
