public class Main {
    public static void main(String[] args) {
        int count = 100;
        int addition = 1100;

        int bonusForAddition = 100;
        int bonus = 0;
        if (addition > 1000) {
            bonus = addition / bonusForAddition;
        }
        count = count + addition + bonus;
        System.out.println("Бонусные рубли: " + bonus);
        System.out.println("Всего сумма на счету: " + count);
    }
}