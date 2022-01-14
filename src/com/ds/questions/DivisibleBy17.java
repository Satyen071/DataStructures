
// Java Program to validate the above logic

import java.io.*;

class DivisibleBy17 {


    // Function to check if the
// number is divisible by 17 or not
    static boolean isDivisible(long n) {

        while (n / 100 > 0) {
            // Extracting the last digit
            long d = n % 10;

            // Truncating the number
            n /= 10;

            // Subtracting the five times the
            // last digit from the remaining number
            n -= d * 5;
        }

        // Return n is divisible by 17
        return (n % 17 == 0);
    }

// Driver code

    public static void main(String[] args) {
        long n = 19877658;
        if (isDivisible(n))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}