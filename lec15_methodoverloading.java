public class lec15_methodoverloading {
    static void telljoke() {
        System.out.println("I invented a word!\n" +
                "Plagiarism");
    }
        static void change(int a){
            a=98;

    }
    static void change2(int []arr) {
        arr[0]= 98;
    }
   static void foo()
   {
       System.out.println("goood morning bro");
   }
   static void foo(int a){
       System.out.println("good morning "+a+" bro");

   }
    static void foo(int a,int b){

        System.out.println("good morning "+a+" bro");

        System.out.println("good morning "+b+" bro");

    }

    public static void main(String[] args) {
     //   telljoke();
//       int [] marks={54,45,87,66,55};
//       //case1 changing integer (remains same)
////       int x=54;
////       change(x);
////        System.out.println(x);
//       //case2 changing array
//        change2(marks);
//        System.out.println("value of x after running change is "+marks[0]);

        //method overloading
        foo();
        foo(3000); //arguments are actual
        foo(3000,4000);

    }
}
