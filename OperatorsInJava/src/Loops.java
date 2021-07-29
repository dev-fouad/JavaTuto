import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        byte age;
        String name;
        Scanner reader = new Scanner(System.in);
        System.out.println("enter your name");
        name = reader.nextLine();
        // if (age == 0) System.out.println("your age is invalid");
        //if (age == 0){
        //if (age <= 0){
        //if (age < 0){
        //if (age >= 0){
        //if (age > 0){
        do {
            System.out.println("anter your age");
            age = reader.nextByte();
        } while (age <= 0 || age >=120);

        if (age<=0 || name.isEmpty() || age>120){
            if (age <=0 || age>=120){
                System.out.println("your age is invalid");
            }
            if (name.isEmpty()){
                System.out.println("your name is invalid");
            }
        }else {
            System.out.println("hi " + name + " your age is "+ age);
        }
        if (age>=1&&age<=13){
            System.out.println("you are a child");
        }else if (age>=13&&age<=18){
            System.out.println("you are a youg");
        }else if (age>=18){
            System.out.println("you are adult");
        }
        int sum = 0;
        for (int index = 1;index<=age;index++){
            sum = sum + index;
        }
        System.out.println("sum is : " + sum);

        for (int index = 1; index <= age ; index ++) {
            if (index % 2 == 0) {
                int factorial  = 1;
                for (int j =1 ; j<= index; j++){
                    factorial=factorial*j;
                    //factorial*=j;
                }
                System.out.println(index +":"+factorial);
            }
        }
        //if (age != 0){
        //  System.out.println("hi " + name + " your age is "+ age);
        //}else {
        //    System.out.println("your age is valid");
        //  System.out.println("your age is invalid");
        //}
    }
}
