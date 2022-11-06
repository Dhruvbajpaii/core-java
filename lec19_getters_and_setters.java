class MyEmployee{
   private int id;
  private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}
//ques area and perimeter using getters and setters
class Circle{
    private float radius;
    private float area;
    private float circumference;

     void setRadius(float r) {
         radius=r;
    }

  void setArea(float a) {
      if (a == 22 * radius * radius / 7) {
          area = a;

      } else {
          System.out.println("WARNING:" +
                  "Wrong area as per the radius");
      }
  }
      void setcircumference(float c){
          if(c==2*22*radius/7){
              circumference=c;

          }
          else{
              System.out.println("WARNING:" +
                      "Wrong circumference as per the radius");
          }

    }

    public float getRadius() {
        return radius;
    }

    public float getArea() {
        return area;
    }

    public float getCircumference() {
        return circumference;
    }
}




public class lec19_getters_and_setters {
    public static void main(String[] args) {

//        MyEmployee dhruv= new MyEmployee();
////        dhruv.id=9215;                 //throws an error due to pvt access specifier
////        dhruv.name="dhruv bajpai";
//          dhruv.setName("dhruv bajpai");
//        System.out.println(dhruv.getName());
   //ques
    Circle cr=new Circle();
    cr.setRadius(9.0f);
    cr.setArea(254.571428571429f);
    cr.setcircumference(56.571428571429f);
        System.out.println("Area: "+cr.getArea()+ "sq.cm");
        System.out.println("Circumference: "+ cr.getCircumference()+"cm");
    }


}
