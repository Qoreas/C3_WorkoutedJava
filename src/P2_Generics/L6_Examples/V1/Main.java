package P2_Generics.L6_Examples.V1;

public class Main {
    public static void main(String[] args) {
        Schooler sc1 = new Schooler("Grigor", 10);
        Schooler sc2 = new Schooler("Andrew", 13);

        Student st1 = new Student("Holiq", 20);
        Student st2 = new Student("Locker", 23);

        Employee emp1 = new Employee("Jack", 40);
        Employee emp2 = new Employee("Mike", 35);

        Team<Schooler> schoolarTeam = new Team<>("Dragons");
        schoolarTeam.addNewParticipant(sc1);
        Team<String> d = new Team<String>();
    }
}
