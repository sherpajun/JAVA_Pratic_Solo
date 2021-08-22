package DoitJavaPratice;

public class IfExample3 {
    public static void main(String[]args){
        int ranking = 1;
        String medalColor;
        switch (ranking){
            case 1 : medalColor = "Gold";
                break;
            case 2 : medalColor = "Silver";
                break;
            case 3 : medalColor = "Bronze";
                break;
            default: medalColor = "Gold";
        }
        System.out.println(ranking+"등 메달의 색깔은"+medalColor+"입니다");
    }
}
