public class lec12_foreachloop {
    public static void main(String[] args) {
//        int [] marks={89,67,34,75};
//        System.out.println(marks.length);
//        String [] students={"dhruv","ramesh","suresh"};
//        System.out.println(students.length);
//        System.out.println(students[2]);
        int [] marks={98,47,87,65,34};
        //printing Array
//        for(int i=0;i<marks.length;i++){
//            System.out.println(marks[i]);
//        }
        //reverse order
//        for(int i=marks.length-1;i>=0;i--){
//            System.out.println(marks[i]);
//        }
        //printing using for each loop
        for (int element: marks) {
            System.out.println(element);
        }

    }
}
