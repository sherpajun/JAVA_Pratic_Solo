package DoitJavaPratice;

public class FunctionTest {
    public static void main(String []args){
        int num1 = 10;
        int num2 = 40;
        int sum = add(num1,num2);
        System.out.println(num1 + "+"+num2+"="+sum+"입니다.");
    }

    private static int add(int n1, int n2) {
        return n1+n2;
    }

}
