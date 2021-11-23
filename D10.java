import java.util.Scanner;

public class D10 {

	public static void main(String[] args) {
		
		int 더하기 = 0;
		int 정수= 1;
		System.out.print("입력:");
		Scanner sc = new Scanner(System.in);
		int 입력값 =sc.nextInt();
		for(int 출력값 = 1; 출력값 < 입력값+1; 출력값 ++) {
			더하기+=출력값 ;
		}
		System.out.printf("%d부터 %d까지 합은 %d이다.",정수,입력값,더하기);
	}

}
