import java.util.Scanner;

public class arra {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("hello array");

        int number[] = new int[5];
        System.out.println("input array element");
        for (int i =0; i<5; i++){
            number[i] = obj.nextInt();
        }
        System.out.println("the array output :");
        for (int i=0; i<5; i++)
            System.out.println(number[i]);

    }





}
