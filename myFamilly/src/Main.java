import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("inter number of person");
        int numberOfPersons = reader.nextInt();
        Person[] list = new Person[numberOfPersons];
        for(int index =0 ; index < list.length ;index++){
            Person person = new Person();
            System.out.println("enter name person " + (index +1) );
            person.name =reader.next();
            System.out.println("enter age person " + (index +1) );
            person.age = reader.nextInt();
            list[index] = person;
        }
        for (int index =0 ; index < list.length ;index++) {
            System.out.println(list[index].name + " " + list[index].age);
        }
        }
}
