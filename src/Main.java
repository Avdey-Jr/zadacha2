public class Main {
    public static void main(String[] args) {
        int accountBalance = 200;
        int deposit = 1100;
        int bonusAmount = 1000;

        int result = accountBalance;
        if (deposit > bonusAmount) {
            result += deposit + (deposit / 100);
        } else {
            result += deposit;
        }
        System.out.println(result);
    }
}
