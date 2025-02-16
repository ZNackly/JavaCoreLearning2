import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>(3);
        Employee emp1 = new Employee(100, "Zaur", "Tregulov", 12345);
        Employee emp2 = new Employee(15, "Ivan", "Petrov", 6542);
        Employee emp3 = new Employee(123, "Ivan", "Sidorov", 8542);
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        System.out.println("Before sorting: \n" + employees);
        Collections.sort(employees, new IdComparator());
        System.out.println("After sorting: \n" + employees);

    }
}

class Employee { // implements Comparable<Employee> {
    Integer id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id = " + id +
                ", name = " + name + " " +
                ", surname = " + surname + " " +
                ", salary = " + salary +
                "}";

    }

    // @Override
    // public int compareTo(Employee o) {
    // if (this.name.compareTo(o.name) == 1) {
    // return 1;
    // } else if (this.name.compareTo(o.name) == -1) {
    // return -1;
    // } else {
    // return this.surname.compareTo(o.surname);
    // }

    // // return this.id - o.id;

    // // return this.id.compareTo(o.id);
    // // return this.name.compareTo(o.name);
    // }
}

class IdComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.name.compareTo(o2.name) == 1) {
            return 1;
        } else if (o1.name.compareTo(o2.name) == -1) {
            return -1;
        } else {
            return o1.surname.compareTo(o2.surname);
        }
    }

}
