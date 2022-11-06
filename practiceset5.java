import java.util.Scanner;

public class practiceset5 {
    public static void main(String[] args) {
        //ques 1 pattern *
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter number of *");
//        int n = sc.nextInt();
//        for (int i = n; i >0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//                System.out.print("\n");
//
//        }
        //sum of n even numbers
//        int sum=0;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter no of even numbers");
//        int n= sc.nextInt();
//        int i=0;
//        while (i<n){
//            sum=sum+i+i;
//            i++;
//        }
//        System.out.println("sum of "+n+" natural number is: "+sum);

        //multiplication table of n
        Scanner sc= new Scanner(System.in);
//        System.out.println("enter number of which multi table u want");
//        int n= sc.nextInt();
//        for(int i=1;i<=10;i++){
//            System.out.println(n+"*"+i+"="+n*i);
//        }
        //multi table in reverse
//        System.out.println("enter number of which multi table u want in reverse order");
//        int n= sc.nextInt();
//        for(int i=10;i>=1;i--){
//            System.out.println(n+"*"+i+"="+n*i);
//        }
        //factorial
//        int fact=1;
//        System.out.println("enter number which factorial u want");
//        int n= sc.nextInt();
//        for (int i=2;i<=n;i++){
//            fact=fact*i;
//        }
//        System.out.println("factorial of "+n+" is : "+ fact);
     //repeat 5 using while loop
        System.out.println("enter number of time u wanna repeat 5");
        int n= sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.println(5);
           i++;
         }
        System.out.println("5 is repeated "+ n+" times");

    }
}