import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

      /*  int [] myNumbers = {10,20,30,40,50,60,70};

        myNumbers[2]=150;
        System.out.println(myNumbers.length);

        for (int index = 0 ;index < myNumbers.length;index++){
            System.out.println(myNumbers[index]);
        }*/

       /* for (int el :myNumbers)
            System.out.println(el);*/

        int[] myNumbers = new int[5];
        Scanner reder =new Scanner(System.in);
        for (int index = 0; index < myNumbers.length;index++){
            System.out.println("enter number" + (index+1));
            myNumbers[index]=reder.nextInt();
        }

        for (int index= myNumbers.length -1 ;index >= 0; index-- ){
            System.out.println(myNumbers[index]);
        }
    }
}
