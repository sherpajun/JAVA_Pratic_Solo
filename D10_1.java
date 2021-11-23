import java.util.Scanner;

public class D10_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		while(score != -1) {
			System.out.println("점수입력: ");
			score = sc.nextInt();
			if(score >=95) {
				System.out.println("A+");
			}else if (score>=80) {
				System.out.println("A");
			}else if (score>=70) {
				System.out.println("B+");
			}else if (score>=60) {
				System.out.println("B");
			}else if (score>=50) {
				System.out.println("C");
			}else if(score>=40){
				System.out.println("재수강");
				break;
			}else {
				System.out.println("학사경고");
				break;
			}
		}


	}

}
