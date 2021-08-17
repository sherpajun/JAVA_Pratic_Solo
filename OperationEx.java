package DoitJavaPratice;

public class OperationEx {
    public static void main(String[] args){
        int mathScore = 90;
        int engScore = 70;
        int korScore = 85;
        int totalScore= mathScore+engScore+korScore;
        System.out.println(totalScore);

        double avgScore = totalScore / 3;
        System.out.println(avgScore);
    }
}
