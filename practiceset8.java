//ques 1 employee classs
class employee1 {
    int salary;
    String name;

    public int getsalary() {
        return salary;
    }


    public String getname() {
        return name;
    }

    public void setname(String n) {
        name = n;
    }
}
    //ques2 cellphone
    class Cellphone{
        public void ringing(){
            System.out.println("ringing...");
        }
        public void vibrating(){
            System.out.println("vibrating...");
        }
        public void CallFriend(){
            System.out.println("Calling Friend...");
        }
    }
//ques 3 square
 class square{
    int side;
    public void initializeside(int a){
        side=a;
    }
    public int area(){
       return side*side;
    }
    public int perimeter(){
        return 4*side;
    }


}
class rectangle{
    int length;
    int breadth;
    public void intializedim(int l,int b){
        length=l;
        breadth=b;

    }
    public int areaofrec(){
        return length*breadth;
    }
    public int perimeterofrec(){
        return 2*length+2*breadth;
    }
}
    //ques 5 rockstar games
    class TommyVecetti{
    public void hitting(){
        System.out.println("hitiing the enemy...");
    }
    public void running(){
        System.out.println("running from the enemy...");
    }
    public void firing(){
        System.out.println("firing the enemy...");
    }
        }
  //ques 8 circle
class circle{
    int radius;
    public void radius(int r){
        radius=r;
    }
    public float areaofcircle(){
        return 3.14f*radius*radius;
    }
    public float perimeter(){
        return 2.0f*3.14f*radius;
    }

  }


public class practiceset8 {
    public static void main(String[] args) {
//ques1
//        employee1 dhruv=new employee1();
//        dhruv.setname("dhruv bajpai");
//        dhruv.salary=223;
//        System.out.println(dhruv.getsalary());
//        System.out.println(dhruv.getname());

        //ques2
//        Cellphone redmi6=new Cellphone();
//        redmi6.CallFriend();
//        redmi6.ringing();
//        redmi6.vibrating();
        //ques3
//        square square1=new square();
//        square1.initializeside(5);
//        System.out.println("area of square is "+square1.area());
//        System.out.println("perimeter of square is "+square1.perimeter());

    //ques4
//        rectangle rectangle1=new rectangle();
//        rectangle1.intializedim(5,6);
//        System.out.println("area of rectangle is "+rectangle1.areaofrec());
//        System.out.println("perimeter of rectangle is "+rectangle1.perimeterofrec());
     //ques 5
//        TommyVecetti Carl=new TommyVecetti();
//        Carl.firing();
//        Carl.hitting();
//        Carl.running();
    //ques 6
        circle circle1=new circle();
        circle1.radius(6);
        System.out.println("the area of circle is "+circle1.areaofcircle());
        System.out.println("the perimeter of circle is "+ circle1.perimeter());

    }
}
//