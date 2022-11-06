
        class Cylinder{
       private      float height;
        private     float radius;
         //ques 1 get data
            public void setdata(float h,float r){
             height=h;
             radius=r;
         }
         public float getheight(){
             return height;
            }
            public float getradius(){
             return radius;
         }
            //ques2 calulate surface area and vol
            public float surfacearea(){
                float sarea=(2.0f*3.14f*radius*height)+(2.0f*3.14f*radius*radius);
                return sarea;

            }
            public float volume() {
                float volume = 3.14f * radius * radius * height;
                return volume;
            }

            public Cylinder(float height,float radius) {
                this.height = height;
                this.radius=radius;
            }


        }
        //ques 4 recttangle overloading using constructors
        class Rectangle{
      private    int length;
          private int breadth;

            public Rectangle() {
                this.length = 4;
                this.breadth=5;
            }

            public int getLength() {
                return length;
            }

            public int getBreadth() {
                return breadth;
            }
        }
        public class practiceset9 {
            public static void main(String[] args) {
    //ques 1 and 2
//                Cylinder dhruv=new Cylinder();
//                dhruv.setdata(5,4);
//                System.out.println("height is "+dhruv.getheight());
//                System.out.println("radius is "+ dhruv.getradius());
//                System.out.println("surface area is "+dhruv.surfacearea());
//                System.out.println("volume is " + dhruv.volume());
        //ques 3 do whole ussing constructors
  // Cylinder MyCylinder=new Cylinder(4,5);
  //ques 4
                Rectangle r = new Rectangle();
                System.out.println(r.getLength());
                System.out.println(r.getBreadth());
}
}
