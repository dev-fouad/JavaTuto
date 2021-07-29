import java.util.Scanner;
public class ReaderExample {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter your name");
        String name = reader.nextLine();
        System.out.println("anter your age");
        byte age = reader.nextByte();
       // if (age == 0) System.out.println("your age is invalid");
        //if (age == 0){
        //if (age <= 0){
        //if (age < 0){
        //if (age >= 0){
        //if (age > 0){
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
        if (age>=1&&age<13){
            System.out.println("you are a child");
        }else if (age>=13&&age<18){
            System.out.println("you are a youg");
        }else if (age>=18){
            System.out.println("you are adult");
        }
        //if (age != 0){
          //  System.out.println("hi " + name + " your age is "+ age);
        //}else {
        //    System.out.println("your age is valid");
          //  System.out.println("your age is invalid");

        //}
    }
    }
