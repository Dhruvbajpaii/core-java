public class lec16_variable_arguments {
//    static int sum(int a,int b)
//    {
//        return a+b;
//    }
//    static int sum(int a,int b,int c)
//    {
//        return a+b+c;
//    }
 public static int sum(int x,int ...arr){
        //available for int []arr;
        int result=x;
        for(int a: arr){
            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("the sum of 4 and 5 is "+sum(4,5));
        System.out.println("the sum of 4 and 5 is "+sum(4,5,1));
        System.out.println("the sum of 4 and 5 is "+sum(4,5,1,7,5,3,9));

    }
}
