import java.util.Scanner;

public class lec10_loops_brk_continue {
    public static void main(String[] args) {
        //while loops
//        int i=1;
//        while(i<=3) {
//            System.out.println(i);
//            i++;
//        }
        //do-while
//        int a=0;
//        do{
//            System.out.println(a);
//            a++;
//        }while (a<5);
        //for loop
//        for (int i = 0; i <= 5; i++) {
//            System.out.println(i);
//        }
        //printing first n odd numbers
//        Scanner sc= new Scanner(System.in);
//        System.out.println("enter number of odd number to be printed");
//        int n= sc.nextInt();
//        for(int i=0;i<n;i++)
//        {
//            System.out.println((2*i)+1);
//        }
        //printing numbers in reverse order
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter number of natural number to be printed");
//        int n= sc.nextInt();
//        for(int i=n;i>0;i--){
//            System.out.println(i);

        ////break and continue using  for loop
//        for(int i=0;i<5;i++ ){
//            System.out.println(i);
//            System.out.println("java is great");
//           if(i==2)
//           {
//               System.out.println("ending the loop");
//               break;
//
//           }
//
//        }
//        System.out.println("loop ends here");

        ////break and continue using  while loop

//        int i=0;
//        while ( i<5){
//            System.out.println(i);
//            System.out.println("java is great");
//           if(i==2)
//           {
//               System.out.println("ending the loop");
//               break;
//
//
//         }
//           i++;
//        }


        ////break and continue using do-while loop
//        int i = 0;
//        do {
//
//
//            System.out.println(i);
//            System.out.println("java is great");
//            if (i == 2) {
//                System.out.println("ending the loop");
//                break;
//
//
//            }
//            i++;
//        } while (i < 5);

        //continue using for loop

        for(int i=0;i<5;i++ ) {

            if (i == 2) {
                System.out.println("skipping the itteration");
                continue;

            }
            System.out.println(i);
            System.out.println("java is great");


        }
    }
}