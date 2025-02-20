import java.util.Scanner;
public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Person prs[] = new Person[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            prs[i] = new Person(name, age);
        }
        for (Person t : prs)
            System.out.println("Name: " + t.name + ", age: " + t.age);
        sc.close();
    }
}
