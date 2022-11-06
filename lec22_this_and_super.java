class EKClass
{
    int a;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    EKClass(int a){
        this.a=a;
    }
        public int returnone(){
            return  1;
        }

}
class Doclass extends EKClass
{ Doclass(int c){
    super(c);
    System.out.println("i am constructor");
}

}
public class lec22_this_and_super {
    public static void main(String[] args) {
   EKClass cless=new EKClass(5);
   Doclass d=new Doclass(5);
        System.out.println(cless.getA());
    }
}
