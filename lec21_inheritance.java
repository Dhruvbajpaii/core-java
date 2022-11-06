
class base{
    int x;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

}

class Derived extends base{
    int y;

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}
public class lec21_inheritance {
    public static void main(String[] args) {
        //creating object of base class
 base b= new base();
         b.setX(4);
        System.out.println( b.getX());
        //creating obj of derived class
        Derived d= new Derived();
        b.setX(43);
        System.out.println( b.getX());
        d.setY(47);
        System.out.println(d.getY());


    }
}
