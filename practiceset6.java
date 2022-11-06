import java.util.Scanner;

public class practiceset6 {
    public static void main(String[] args) {
        //ques1 array of 5 floats and calculate their sum
//        float []num=new float[5];
//        System.out.println("enter numbers");
//        for(int i=0;i<5;i++)
//        {
//            Scanner sc=new Scanner(System.in);
//            num[i]=sc.nextFloat();
//        }
//        float sum=0.0f;
//        for(int i=0;i<5;i++)
//        {
//            sum=sum+num[i];
//        }
//        System.out.println("the sum is: "+sum);
//        //ques2 find out whether int is in array or not
//                int []num=new int[5];
//        System.out.println("enter numbers");
//        for (int element:num) {
//            Scanner sc=new Scanner(System.in);
//            num[element]=sc.nextInt();
//        }
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter element u wanna find");
//        int key= sc.nextInt();
//        boolean isInArray=false;
//        for (int element:num)
//              { if(key==element){
//                  isInArray=true;
//                  break;
//
//        }
//        }
//        if(isInArray){
//            System.out.println("the value s present in the array");
//
//        }
//        else {
//            System.out.println("the value is not present in the array");
//        }
        //avg of phys marks in class
//       float[] marks={45.5f,67.8f,32.67f,56.9f,79.7f};
//       float sum=0;
//        for (float element :marks) {
//            sum=sum+element;
//        }
//        System.out.println("the value of avg marks"+ sum/ marks.length);

        //java program t add two matrix of size 2*3

//        int [][]m1={{1,2,3},
//                    {4,5,6}};
//        int [][]m2={{7,5,3},
//                    {2,1,8}};
//        int[][]result={{0,0,0},
//                       {0,0,0}};
//        for(int i=0;i<m1.length;i++) {
//            for (int j = 0; j < m1[i].length; j++) {
//
//                result[i][j] = m1[i][j] + m2[i][j];
//                System.out.print(result[i][j]+ " ");
//
//
//            }
//            System.out.println("");
//        }

//reversing an array
//int []a={1,2,3,4,5,6};
//        int n= Math.floorDiv(a.length,2);
//        int l=a.length;
//        int temp;
//        for(int i=0;i<n;i++)
//        {
//            temp=a[i];
//            a[i]=a[l-1-i];
//            a[l-1-i]=temp;
//        }
//for (int i=0;i<a.length;i++)
//{
//    System.out.print(a[i]);
//    System.out.print(" ");
// }
        //finding max in array
//        int []num=new int[5];
//        System.out.println("enter numbers");
//        for(int i=0;i<5;i++)
//        {
//            Scanner sc=new Scanner(System.in);
//            num[i]=sc.nextInt();
//        }
//   int max= Integer.MIN_VALUE
//        for(int i=0;i<5;i++)
//        {
//            if (num[i]>max) {
//                max=num[i];
//            }
//        }
//        System.out.println("maximum number is "+max);

        // finding min in array
//        int []num=new int[5];
//        System.out.println("enter numbers");
//        for(int i=0;i<5;i++)
//        {
//            Scanner sc=new Scanner(System.in);
//            num[i]=sc.nextInt();
//        }
//        int min= Integer.MAX_VALUE
//        for(int i=0;i<5;i++)
//        {
//            if (num[i]<min) {
//                min=num[i];
//            }
//        }
//        System.out.println("minimum number is "+min);

        //whether array is sorted or nott
        int []num=new int[5];
        boolean isSorted=true;
        System.out.println("enter numbers");
        for(int i=0;i<5;i++)
        {
            Scanner sc=new Scanner(System.in);
            num[i]=sc.nextInt();
        }
        for(int i=0;i< num.length-1;i++)
        {
         if(num[i]>num[i+1]){
                  isSorted=false;
                  break;
         }
            }
        if(isSorted){
            System.out.println("the array is sorted");

        }
        else{
            System.out.println("the array is unsorted");
        }
    }
}
