import java.util.Scanner;
public class Statistics {
    //The main class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three numbers: ");
        //First Number
        System.out.print("First Number: ");
        int FristNum = sc.nextInt();
        //Second Number
        System.out.print("Second Number: ");
        int SecondNum = sc.nextInt();
        //Third Number
        System.out.print("Third Number: ");
        int ThirdNum = sc.nextInt();

        int highestNum= muximum(FristNum, SecondNum, ThirdNum);
        System.out.println("The highest Number is:"+highestNum);

        System.out.println("Enter 4 Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        
        int average= average(num1,num2,num3,num4);
        System.out.println("The average is:"+average);

    }
    //Question 1
    public static int muximum(int a,int b,int c){
        int maxNum = 0;
        if(a>b && a>c){
            maxNum = a;
        }
        else if(b>a && b>c){
            maxNum = b;
        }
        else if(c>a && c>b){
            maxNum = c;
        }
        return maxNum;
    }
    //Question 2
    public static int average(int a,int b, int c,int d){
        int average= (a+b+c+d)/4;
        return average;
    }
}
