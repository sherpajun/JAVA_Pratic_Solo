import java.util.Scanner;

public class D9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input="";
		System.out.println("MBTI");
		System.out.println("What type u r MBTI");
		System.out.println("영어로만 입력하세요");
		input = sc.next().toUpperCase();//소문자 입력시 대문자로 변환
//		System.out.println(input); 정상 대문자 출력 확인
//  비교 연산자 보단 두개가 동일한 의미인지를 알기 위해선 equals 메소드를 사용한다.		
		if(input.equals("INTP")) {
			System.out.println(input+"백엔드영역");
			}else if(input.equals("ENFJ")){
			System.out.println(input+"프론트엔드");
		}else if (input.equals("INFJ")) {
			System.out.println(input+"풀스택");
		}else if (input.equals("ISTJ")) {
			System.out.println(input+"아키텍쳐");
		}else if (input.equals("ISFJ")) {
			System.out.println(input+"보안전문가");
		}else if (input.equals("ENTP")) {
			System.out.println(input+"ios모바일");
		}else if (input.equals("ESFJ")) {
			System.out.println(input+"안드로이드");
		}else if (input.equals("ESFP")) {
			System.out.println(input+"게임개발자");
		}else if (input.equals("ESTP")) {
			System.out.println(input+"사물인터넷");
		}else if (input.equals("ESTJ")) {
			System.out.println(input+"QA");
		}else if (input.equals("INFP")) {
			System.out.println(input+"임베디드");
		}else if (input.equals("ISTP")) {
			System.out.println(input+"네트워크");
		}else {
			System.out.println("멀 입력하신겁니까 대체");
		}
	}

}
