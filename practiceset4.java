import java.util.Scanner;

public class practiceset4 {
    public static void main(String[] args) {
        //ques1 find output of code
//        int a=10;
//        if(a==11)
//        {
//            System.out.println("I am 11");
//        }
//        else {
//            System.out.println("i am not 11");
//        }
//        //ques2 pass or fail
//        int m1,m2,m3;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your marks in physics");
//        m1 = sc.nextInt();
//        System.out.println("enter your marks in chemistry");
//        m2 = sc.nextInt();
//        System.out.println("enter your marks in mathematics");
//        m3 = sc.nextInt();
//        float total_per=(m1+m2+m3)/3.0f;
//        if(m1>33 && m2>33 & m3>33 & total_per>40)
//        {
//            System.out.println("overall % is ="+total_per+"%");
//            System.out.println("student is pass");
//        }
//        else {
//            System.out.println("student is fail");
//        }
      //  ques3 income tax finding
        Scanner sc = new Scanner(System.in);
        float tax = 0;
        System.out.println("enter your income in lakhs");
        float income = sc.nextFloat();
        if (income<= 2.5f) {
            tax = tax + 0;
        } else if (income > 2.5f && income <= 5f) {
            tax = tax + 0.05f * (income - 2.5f);

        } else if (income > 5f && income <= 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5.0f);

        } else if (income > 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5.0f);
            tax = tax + 0.3f * (income - 10.0f);

        }
        System.out.println("your total tax payable is : "+ tax +"lakhs only");
        //ques 4 day of the week
//        Scanner sc =new Scanner(System.in);
//        System.out.println("enter the number of day");
//        int day= sc.nextInt();
//        //method 1
////        switch (day)
////        {
////            case(1):
////                System.out.println("monday");
////                break;
////            case(2):
////                System.out.println("tuesday");
////                break;
////            case(3):
////                System.out.println("wednesday");
////            break;
////                case(4):
////                System.out.println("thursday");
////            break;
////                case(5):
////                System.out.println("friday");
////            break;
////                case(6):
////                System.out.println("saturday");
////            break;
////                case(7):
////                System.out.println("sunday");
////                break;
//        //method 2
////        switch (day){
////            case 1 -> System.out.println("monday");
////            case 2 -> System.out.println("tuesday");
////            case 3 -> System.out.println("wednesday");
////            case 4 -> System.out.println("thursday");
////            case 5 -> System.out.println("friday");
////            case 6 -> System.out.println("saturday");
////            case 7 -> System.out.println("sunday");
//
//        }
        //ques5 finding leap year
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the year");
//        int year= sc.nextInt();
//        if(year%4==0)
//        {
//            System.out.println("it is a leap year");
//        }
//        else {
//            System.out.println("it is not a leap year");
//        }
        //ques6 finding type of website
//        Scanner sc= new Scanner(System.in);
//        System.out.println("enter url");
//        String url= sc.nextLine();
//        if(url.endsWith(".com"))
//        {
//            System.out.println("it is a commercial website");
//        }
//       else if(url.endsWith(".org"))
//        {
//            System.out.println("it is a organization website");
//        }
//      else if(url.endsWith(".in"))
//        {
//            System.out.println("it is a indian website");
//        }

    }
}



