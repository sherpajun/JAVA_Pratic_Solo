public class Pratice2 {
    public static void main(String[] args) {
        int line = 4;
        int SC = line /2 +1;
        int starCount = 1;

        for(int i = 0; i< line; i++) {
            for(int j = 0; j< SC; j++) {
                System.out.print(' ');
            }
            for(int j=0; j<starCount; j++) {
                System.out.print('*');
            }
            for(int j = 0; j< SC; j++) {
                System.out.print(' ');
            }
            SC -=1;
            starCount+=2;
            System.out.println();
        }
    }
}
