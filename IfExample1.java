public class IfExample1 {
    public static void main(String[] args) {
        int age = 9;
        int charge;
        if (age < 8) {
            charge = 1000;
            System.out.println("미취학 아동");
        } else if (age < 14) {
            charge = 2000;
            System.out.println("취학 아동");

        } else if (age < 20) {
            charge = 2000;
            System.out.println("학생입니다");

        } else {
            charge = 3000;
            System.out.println("성인입니다");
        }
        System.out.println("입장료는"+charge+"원입니다");
    }
}
