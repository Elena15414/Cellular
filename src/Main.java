public class Main {
    public static void main(String[] args) {
        int x = 100; // за каждые 100руб начисляется 1 руб
        int initialAccount = 200; // начальный счет
        int depositAmount = 1200; // сумма пополнения
        int bonus;
        if (depositAmount > 100) {
            bonus = depositAmount / x;
        } else {
            bonus = 0;
        }
        int total = initialAccount + bonus;
        System.out.println("Итоговый бонус:" + bonus);
        System.out.println("Остаток на счету с бонусом:" + total);
    }
}