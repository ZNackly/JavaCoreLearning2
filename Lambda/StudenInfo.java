package Lambda;

import java.util.ArrayList;

public class StudenInfo {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Zaur", 'm', 25, 5, 2.5);
        Student st3 = new Student("Kate", 'f', 21, 2, 10.0);
        Student st4 = new Student("Dan", 'm', 21, 2, 8.7);
        Student st5 = new Student("Artem", 'm', 20, 1, 7.0);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        for (Student st : students) {
            System.out.println(st);
        }
        System.out.println("-------------------------------");
        StudenInfo studentInfo = new StudenInfo();
        studentInfo.printStudentsOvergrade(students, 8);
        System.out.println("-------------------------------");
        studentInfo.printStudentsUnderAge(students, 30);
        System.out.println("-------------------------------");
        studentInfo.printStudentsMixCondition(students, 21, 9, 'f');
    }

    void printStudentsOvergrade(ArrayList<Student> a1, double grade) {
        for (Student student : a1) {
            if (student.avgGrade > grade) {
                System.out.println(student);
            }
        }
    }

    void printStudentsUnderAge(ArrayList<Student> a1, int age) {
        for (Student student : a1) {
            if (student.age < age) {
                System.out.println(student);
            }
        }
    }

    void printStudentsMixCondition(ArrayList<Student> a1, int age, double grade, char sex) {
        for (Student student : a1) {
            if (student.age > age && student.avgGrade < grade && student.sex == sex) {
                System.out.println(student);
            }
        }
    }
}
