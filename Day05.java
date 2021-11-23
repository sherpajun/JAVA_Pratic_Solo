
public class Day05 {

	public static void main(String[] args) {
		String 차 = "포르쉐";
		String 워너비 = "가지고 싶다.";
		String 집 = "아파트";
		String 구매 = "에 살고싶다.";
		int 가진돈 = 10;
		int 대출금 = 30;
		System.out.println(차+워너비);
		System.out.printf("=============");
		System.out.println();
		System.out.println("+,-,*,%");
		System.out.println("자본="+(가진돈+대출금));
		System.out.println("자산="+(가진돈-대출금));
		System.out.println("체감이자="+(가진돈*대출금));
		System.out.println("텅장="+(가진돈/대출금));
		System.out.printf("=============");
		System.out.println(집+구매);

	}

}
