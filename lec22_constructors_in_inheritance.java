class Base11{
    Base11(){
        System.out.println("i am a  constructor");
    }
    Base11(int x){
        System.out.println(" i am overloaded constructor with value x as: "+x);
    }
    public int x;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

}
class Derived1 extends Base11{
    Derived1()
    {
        System.out.println("i am derived class constructor");
    } Derived1(int x,int y){
      super(x);
        System.out.println("i am an derived overloaded constructor with values of x as: "+x+" and y as: "+y);
    }

    public int y;


    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

}
class Childofderived extends  Derived1{
    Childofderived() {
        System.out.println("I am child of derived constructor");
    }
   Childofderived(int x,  int y,int z){
       super(x,y);
            System.out.println("i am child overloaded constructor with value of z as: "+ z);

    }
}

public class lec22_constructors_in_inheritance {
    public static void main(String[] args) {
   // Derived1 d1=new Derived1(3,4);
   // Base11 b1=new Base11(2);
         Childofderived child=new Childofderived(3,4,5);
   // Childofderived child=new Childofderived();
    }
}
