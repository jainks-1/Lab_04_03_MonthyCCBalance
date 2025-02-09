// Kaden Jain
// Computer Programming 1 - Spring 2025
/* A program that starts with a credit card balance of $5000
and then calculates the interest at a rate of 17%. Assume
the user does not make any payments. . Display the interest
due after one month and again after two months.*/

public class Main {
    public static void main(String[] args) {

        // declare variables
        int initialBalance = 5000;
        double balanceAfterOneMonth;
        double INTEREST_RATE = 0.17;
        double monthlyInterestRate;
        double interestDueMonthOne;
        double interestDueMonthTwo;

        // logic
        monthlyInterestRate = INTEREST_RATE / 12;
        interestDueMonthOne = initialBalance * monthlyInterestRate;
        balanceAfterOneMonth = initialBalance + interestDueMonthOne;

        interestDueMonthTwo = balanceAfterOneMonth * monthlyInterestRate;

        // print output
        System.out.println("Interest due after 1 month is: $" + interestDueMonthOne);
        System.out.println("Interest due after 2 months is: $" + interestDueMonthTwo);

    }
}