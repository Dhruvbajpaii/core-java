public class lec8_ifelse_relationalop {
    public static void main(String[] args) {
//        int age=26;
//        if(age>=18)
//        {
//            System.out.println("yes boy you can drive!");
//        }
//        else
//            System.out.println("no boy you cannot drive yet!");
        //relational oprators
        boolean a=true;
        boolean b=false;
        if (a && b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        if (a || b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        //logical not
        System.out.println(!a);
        System.out.println(!b);
    }
}
