package P0_Comparible;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T2_comparable {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(100, "Zaur", "Trigulov", 12000));
        list.add(new Employee(21, "Ivan", "Petrov", 33221));
        list.add(new Employee(231, "Ivan", "Sidorov", 54400));

        System.out.println("Before sort - " + list);
        Collections.sort(list);
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
//        if (this.id == o.id) {
//            return 0;
//        } else if (this.id < o.id) {
//            return -1;
//        } else return 1;

//        return this.id - o.id;
//        return Integer.compare(this.id, o.id);

        int res = this.name.compareTo(o.name);

        if (res == 0) {
            res = this.surname.compareTo(o.name);
        }
        return res;
    }
}