package Input_Processing.LUHN_CHECKSUM_VALIDATION;

public class UtilityClass {

    public static int checkDouble(int number) {

        int doubledDigit = number * 2;
        int sum;
        if (doubledDigit < 10) {
            sum = doubledDigit;
        }
        // 2. If not, split the 2-digit into separate digits
        else {
            sum = 1 + doubledDigit % 10;
        }

        return sum;
    }
}
