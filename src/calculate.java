import java.util.Scanner;
import java.lang.*;

public class calculate {

    //Addition
     public static float add(float a, float b) {
        return a + b;
    }

    //subtraction
    public static float sub(float a, float b) {
        return a - b;
    }
//multiplication
    public static float Multi(float a, float b) {
        return a * b;
    }
//division
    public static float div(float a, float b) {
        return a / b;
    }

    //remainder
    public static int Remain(int a, int b) {
        int remainder;
        remainder = a % b;
        return remainder;
    }

//factorial
    public static int fact(int n){
         if (n==0||n==1){
             return 1;
             }
         else {
             return n*fact(n-1);
         }
         }

         //power function

    public static int power(int x,int y){

         if (y == 0){
             return 1;
         }
         else {
             return x*power(x,y-1);
         }

    }


         //fibonancy number
    public static int fibo(int n){
         if (n==0||n==1){
             return n;
         }
         else {
             return fibo(n-1)+ fibo(n-2);
         }

        }

    /*public static double ln(double a){

         double result = math.log(a);
         return  result;

    }

    public static double logten(double a){
        return  math.log10(a);
    }

    public static int square(int a){
        return math.sqrt(a);
    }

    public static int absulate(int a){
        return math.fabs(a);
    }

*/




//main function start

    public static void main(String[] args) {
       // final double Pi = 3.1415926536;
        //3System.out.println("+, -,*,/");
        Scanner obj = new Scanner(System.in);
        System.out.println("input i :");
        //int i = obj.nextInt();
        //while (i!=0){
            System.out.println("\n\nEnter the switch input: ");
            int Num = obj.nextInt();
            System.out.println("\n\n");


            //switch case
            switch (Num) {

//calling addition
                case 1:
                    System.out.println("Enter two number: + ");
                    float A = obj.nextFloat();
                    float B = obj.nextFloat();
                    float subtract = add ( A,B);
                    System.out.println("Addition :" + subtract);
                    break;
//calling subtraction
                case 2:
                    System.out.println("Enter two number: - ");
                    float C = obj.nextFloat();
                    float D = obj.nextFloat();
                    float result = sub(C,D);
                    System.out.println("Subtraction :" + result);
                    break;
//calling multiplication
                case 3:
                    System.out.println("Enter two number: * ");
                    float E = obj.nextFloat();
                    float F = obj.nextFloat();
                    System.out.println("Multiplication :" + Multi(E, F));
                    break;
//calling division
                case 4:
                    System.out.println("Enter two number: / ");
                    int G = obj.nextInt();
                    int H = obj.nextInt();
                    System.out.println("division :" + div(G, H));
                    break;
//calling remainder
                case 5:
                    System.out.println("Enter two number: ");
                    int I = obj.nextInt();
                    int J = obj.nextInt();
                    System.out.println("Remainder :" + Remain(I, J));
                    break;
//calling factorial
                case 6:
                    System.out.println("Enter the factorial number :");
                    int N = obj.nextInt();
                    System.out.println("Factorial value: "+ fact(N));
                    break;

  //calling power function
                case 7:
                    System.out.println("enter the two number");
                    int X = obj.nextInt();
                    int Y = obj.nextInt();
                    System.out.println("the power is :"+ power(X,Y));
                    break;
//calling fibonancy number
                case  8:
                    System.out.println("enter the number :");
                    int Fi = obj.nextInt();
                    System.out.println("fibonancy number is : "+ fibo(Fi));
                    break;

                case 9:
                    System.out.println("Enter two number : ");
                    int n = obj.nextInt();
                    int r = obj.nextInt();
                    System.out.println("Permutation "+ fact(n)/fact(n-r));
                    break;


                case 10:
                    //System.out.println("enter a number : ");
                    double x =obj.nextDouble();
                    //System.out.println("lon value : "+ln(x));
                    System.out.println("Natural logarithm of " + x + " = " + Math.log(x));
                    break;


              /*  case 11:
                    System.out.println("enter a number :");
                    double x3 = obj.nextDouble();
                    System.out.println("log10" +logten(x3));
                    break;

                case 12:
                    System.out.println("enter the number :");
                    int x1 = obj.nextInt();
                    System.out.println("squer root : "+ square(x1));
                    break;

                case 13:
                    System.out.println("enter a number :");
                    int x2 = obj.nextInt();
                    System.out.println("absulute value" + absulate(x2));
                    break;

*/







                default:
                    System.out.println("Input must be take in 1 to.");
                    break;




            }



            //}

    }
}

