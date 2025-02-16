import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main6 {
    public static void main(String[] args) {
        int[] array = { 38, 37, 93, 55, 37, 27, 71, 27, 52, 52 };
        int[] arra2 = Arrays.stream(array)
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(arra2));
        List<Student> array3 = new ArrayList<>();
        Student student1 = new Student(15, "Lina", 4.5, 'f');
        Student student2 = new Student(17, "Misha", 3.5, 'm');
        Student student3 = new Student(19, "Kate", 5.0, 'f');
        Student student4 = new Student(12, "Dan", 4.75, 'm');
        Student student5 = new Student(14, "Liza", 3.67, 'f');
        Student student6 = new Student(15, "Fedya", 4.3, 'm');
        array3.add(student1);
        array3.add(student2);
        array3.add(student3);
        array3.add(student4);
        array3.add(student5);
        array3.add(student6);
        List students = array3.stream()
                .sorted((s1, s2) -> s1.compareTo(s2))
                .collect(Collectors.toList());
        System.out.println(students);
    }
}

class Student implements Comparable<Student> {
    int age;
    String name;
    double avg;
    char sex;

    public Student(int age, String name, double avg, char sex) {
        this.age = age;
        this.name = name;
        this.avg = avg;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student [age= " + age + ", name= " + name + ", avg= " + avg + ", sex= " + sex + "]";
    }

    @Override
    public int compareTo(Student o) {
        if (this.age > o.age) {
            return 1;
        } else if (this.age == o.age) {
            return 0;
        } else {
            return -1;
        }
    }

    public String getName() {
        return name;
    }

    // @Override
    // public int compare(Student stud1, Student stud2) {
    // if (stud1.age == stud2.age) {
    // return 0;
    // } else if (stud1.age > stud2.age) {
    // return 1;
    // } else {
    // return -1;
    // }
    // }

}