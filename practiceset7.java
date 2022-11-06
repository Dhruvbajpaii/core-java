public class practiceset7 {
    //ques1 multi table
    static int table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + n * i);

        }
        return 0;
    }
    //ques 2 pattern
    static void pattern1(int n){
        for (int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");

            }
            System.out.println("");

        }

    }
    //ques 3 recursion of sum of n numbers
    static int sumRect(int n){
if(n==1){
    return 1;
}
return n+sumRect(n-1);
    }
//ques 4 reverse of pattern1
static void pattern2(int n){
    for (int i=0;i<n;i++){
        for(int j=n;j>i;j--){
            System.out.print("*");
        }
        System.out.println("");

    }

}

//   ques 5 fibonacci series
static int fib(int n) {
//    if (n == 1) {
//        return 0;
//    } else if (n == 2) {
//        return 1;
    if(n==1 || n==2){
        return n-1;

    } else {
        return fib(n - 1) + fib(n - 2);
    }
}
//ques6 finding avg of n numbers
static float avg(int  x,int ...arr){
        int result=x;
    for (int a:arr) {
        result+=a;
    }
    float avgg=result/ arr.length;
    return avgg;
}
//ques 7 pattern 1 using recursion
static void pattern1_rec(int n){

        if(n>0) {
            pattern1_rec(n - 1);

        for (int i=0;i<n;i++) {

                System.out.print("*");



        }
            System.out.println("");
        }

    }
    //ques 8 pattern 2 using recursion
    static void pattern2_rec(int n){

        if(n>0) {
            pattern2_rec(n - 1);

            for (int i=0;i>n;i++) {

                System.out.print("*");



            }
            System.out.println("");
        }

    }
    //ques 9 celsius into fahreneit
    static float conversion(float c){
        float f=(c*1.8f)+32.0f;
        return f;
    }
    //ques10 sum of n natural number using itteration
    static int sum(int n){
        int ressult=0;
        for (int i=1;i<=n;i++)
        {
            ressult+=i;
        }
        return ressult;
    }


    public static void main(String[] args) {
        //ques 1 table
//        System.out.println("multiplication table of n is");
//        System.out.println(table(8));
//     ques 2 pattern
//      pattern1(5);
        // ques 3 sum using recusrion
//        int c= sumRect(3);
//        System.out.println(c);
        //ques 4 reverse pattern
//        pattern2(5);
        //ques 5 fibonacci series
//        int result=fib(6);
//        System.out.println(result);
        //ques 6 avg of set of numbers
      //  System.out.println(avg(3,4,5,23,76,3,57));
//ques 7 pattern1 using recursion
      //  pattern1_rec(4);
        //ques 8 reverse pattern
      //  pattern2_rec(4);
        //ques 9 conversion
        System.out.println("conversion is: "+ conversion(32));
        //ques10 sum of n natural number using itteration
        System.out.println("sum of n natural numbers is: "+ sum(5));
   }
}
