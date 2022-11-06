public class lec17_recursion {
    static int factorial(int n){
        int result=1;
        for(int  i=2;i<=n;i++)
        {
            result=result*i;
        }
        return result;
    }

    public static void main(String[] args) {
     //   System.out.println("the value of factorial n is "+ factorial(5));
    }
}
