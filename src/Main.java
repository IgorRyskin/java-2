public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int replenishment = 1100;
        int bonus = replenishment > 1000 ? replenishment / 100 : replenishment;
        int finish = balance + replenishment + bonus;
        System.out.println("Итоговый баланс" + finish);

    }
}