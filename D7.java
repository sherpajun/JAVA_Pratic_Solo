import java.util.Scanner;

public class D7 {

	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			//int a,b = sc.nextInt();	
			System.out.printf("첫번째 숫자: ");
			int a = sc.nextInt();
			System.out.printf("두번째 숫자: ");
			int b = sc.nextInt();
			System.out.println("---- 결과 ----");
			System.out.printf("%d + %d = %d\n", a, b, a+b);
			System.out.printf("%d - %d = %d\n", a, b, a-b);
			System.out.printf("%d * %d = %d\n", a, b, a*b);
			System.out.printf("%d / %d = %d\n", a, b, a/b);
			System.out.printf("%d % %d = %d\n", a, b, a%b);
			sc.close();
		}

	}


