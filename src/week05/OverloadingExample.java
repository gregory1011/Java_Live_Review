package week05;

public class OverloadingExample {


  public static int add(int a, int b) {

      return a + b;
    }
    // this example is valid
    public static double add(double a, double b){
      return a + b;
    }

    // this method is invalid

   // public static float add(int c, int d){
    // return c + d;
   // }


    // valid method
    public static float add(String s) {
      return 0.0f;
    }
    // other idea
     /**
    public static String m(int a){
      return
    }
    public static char m2(float f){
      return
    }
      **/
}
