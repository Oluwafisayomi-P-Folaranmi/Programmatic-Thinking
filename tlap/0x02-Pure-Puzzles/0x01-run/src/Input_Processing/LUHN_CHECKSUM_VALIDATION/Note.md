## LUHN CHECKSUM VALIDATION

We can divide the problem in a **Luhn Checksum**:

### 1. Treating doubled numbers 10 and greater according to their individual digits

```java
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
```

### 2. Doubling the Numbers

We want to reduce the problem by taking in just a six-digit number.

We will take in the numbers and double them. But then, we can at first write a program that takes in the numbers, doesn't double, but only sum them up.

