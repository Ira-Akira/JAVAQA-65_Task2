public class Main {
    public static void main(String[] args) {

        int score = 250;
        int deposit = 1200;

        int bonus;
        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        int balance = score + deposit + bonus;
        System.out.println("Спасибо за пополнение счета. Ваш баланс: " + balance + " руб. Ваш бонус составил: " + bonus + " руб.");

    }
}