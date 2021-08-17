public class ExplicitConversion {
    public static void main (String[]args){
        double a =1.2;
        float b = 0.9F;

        int c = (int)a+(int)b;
        int d = (int)(a+b);
        System.out.println(c);
        System.out.println(d);
    }
}
