package P1_Comparable_Comparator.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class T1_comparator {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(100, "Zaur", "Trigulov", 54400));
        list.add(new Employee(21, "Ivan", "Petrov", 33221));
        list.add(new Employee(231, "Ivan", "Sidorov", 12000));

        System.out.println("Before sort - " + list);
        Collections.sort(list, new SalaryComparator());
        System.out.println("After sort - " + list);

    }
}

class Employee implements Comparable<Employee> {
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }
}

class IdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.id, o2.id);
    }
}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.salary - o2.salary;
    }
}