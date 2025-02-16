import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main10 {
    public static void main(String[] args) {

        Student student2 = new Student(17, "Misha", 2, 'm');
        Student student3 = new Student(19, "Kate", 1, 'f');
        Student student4 = new Student(12, "Dan", 1, 'm');
        Student student5 = new Student(14, "Liza", 2, 'f');
        Student student6 = new Student(15, "Fedya", 3, 'm');
        List<Student> students = new ArrayList<>();

        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
//         students.stream().map(el -> {
//             el.setName(el.setName(el.getName().toUpperCase()));
//             return el;
//         })
//                 .collect(Collectors.groupingBy(el -> el.getAvgGrade()));
//     }
// }
