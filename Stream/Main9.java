import java.util.ArrayList;
import java.util.List;

public class Main9 {
    public static void main(String[] args) {
        Student student1 = new Student(15, "Lina", 4.5, 'f');
        Student student2 = new Student(17, "Misha", 3.5, 'm');
        Student student3 = new Student(19, "Kate", 5.0, 'f');
        Student student4 = new Student(12, "Dan", 4.75, 'm');
        Student student5 = new Student(14, "Liza", 3.67, 'f');
        Student student6 = new Student(15, "Fedya", 4.3, 'm');
        Faculty f1 = new Faculty("Math");
        Faculty f2 = new Faculty("Economics");
        f1.list.add(student1);
        f1.list.add(student2);
        f1.list.add(student3);
        f2.list.add(student4);
        f2.list.add(student5);
        f2.list.add(student6);
        List<Faculty> faculties = new ArrayList<>();
        faculties.add(f1);
        faculties.add(f2);
        faculties.stream()
                .flatMap(faculty -> faculty.getList().stream())
                .forEach(st -> System.out.println(st.getName()));

    }
}

class Faculty {
    String name;
    List<Student> list;

    public List<Student> getList() {
        return list;
    }

    public Faculty(String name) {
        this.name = name;
        list = new ArrayList<>();
    }

}