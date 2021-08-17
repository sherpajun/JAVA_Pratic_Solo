public class OpreatiobEx1 {
    public static void main (String []args){
        int gameScore = 5;

        int lastScore = ++gameScore;
        System.out.println(lastScore);

        int lastScores = gameScore++;
        System.out.println(lastScores);

        int lastScore1 = --gameScore;
        System.out.println(lastScore1);

        int lastScore2 = gameScore--;
        System.out.println(lastScore2);
    }
}
