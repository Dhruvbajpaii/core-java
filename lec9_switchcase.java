import java.util.Scanner;

public class lec9_switchcase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        int age= sc.nextInt();
//        System.out.println("enter ur age");
//        if(age>56)
//        {
//            System.out.println("you are experienced");
//
//        }
//        else if(age>46)
//        {
//            System.out.println("you are semi experienced");
//
//        }
//       else if(age>36)
//        {
//            System.out.println("you are semi semi experienced");
//
//        }
//       else{
//            System.out.println("you are not experienced");
//        //switch case
        System.out.println("enter ur age");
        int age= sc.nextInt();
        switch(age)
        {
            case 18:
                System.out.println("you are going to be an adult!");
                break;
            case 21:
                System.out.println("you are going to join a job!");
                break;
            case 68:
                System.out.println("you are going to get retired!");
                break;
            default:
                System.out.println("enjoy ur life!");
        }
//        }
    }
}
