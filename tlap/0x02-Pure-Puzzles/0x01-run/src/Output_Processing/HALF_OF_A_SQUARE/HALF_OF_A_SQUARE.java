package Output_Processing.HALF_OF_A_SQUARE;

public class HALF_OF_A_SQUARE {

    public static void build() {

        for (int row = 1; row <= 5; row++) {
            for (int line = 1; line <= 6 - row; line++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
