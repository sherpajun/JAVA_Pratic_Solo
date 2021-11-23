import java.util.Scanner;
public class D8 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("첫번째 숫자를 입력하세요:"+ System.getProperty("line.separator"));
		        int a = sc.nextInt();
		        System.out.print("두번째 숫자를 입력하세요:"+ System.getProperty("line.separator"));
		        int b = sc.nextInt();

		        System.out.print("둘 중에 큰 수는 : ");
		        if (a >= b) {
		            System.out.println(a);
		        } else if (a < b) {
		            System.out.println(b);
		        } else {
		            System.out.println("잘못된 입력 숫자입니다.");
		        }
		        sc.close();
		    }
		}


