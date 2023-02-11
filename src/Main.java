public class Main {
    public static void main(String[] args) {
        int firstBalance = 30;
        int refillBalance = 2000;
        int bonus = refillBalance / 100;
        int totalBalance = firstBalance + refillBalance;

        if (refillBalance > 1000) {
            System.out.println(bonus);
            System.out.println(totalBalance + bonus);
        } else {
            System.out.println(totalBalance);
        }
    }
}
