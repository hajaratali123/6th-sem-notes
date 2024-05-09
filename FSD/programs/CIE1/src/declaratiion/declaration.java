package declaratiion;

public class declaration {
 static int a,b,c; //static variable
 void num(int a,int b){
    int d =10;//local variable
    System.out.println("the local variable is : "+d);
        int c = a + b;
        System.out.println("the static variable is : "+c);

    }
    public static void main(String[] args) {
         int f=20;//instance variable
         a = 10;
         b = 20;
         c = a + b;
         System.out.println("the instance variable is : "+f);
        declaration d = new declaration();
        System.out.println(c);
        d.num(a,b);
    }

}
