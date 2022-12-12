package Exam;

 class box {
     int w;
     int h;
     int l;
     int v;


box() {
    w=5;
    h=5;
    l=6;
}


     public void v() {
         v =w*h*l;
     }
 }
class constructor {
    public static void main(String[] args) {
        box obj = new box();
        obj.v();
        System.out.println(obj.v);

    }
}
