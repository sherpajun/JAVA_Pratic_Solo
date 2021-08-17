public class ImplicilConversion {
    public static void main(String[]args){
        byte a= 10;
        int b = a;
        System.out.println(a);
        System.out.println(b);

        int aa= 20;
        float c = aa;
        System.out.println(aa);
        System.out.println(c);

        double e;
        e = a + aa;
        System.out.println(e);

    }
}
