public class Main {
    public static void main(String[] args) {

//        System.out.println("Клепа хорошая");
//
//        int x = -5;
//        if (x > 0) {
//            System.out.println("Клепа хорошая");
//        } else {
//            System.out.println("Клепа вонючка");
//        }
//
//
//        int amount = 50_000;
//        boolean isRegistered = true;
//        int percent;
//
//        if (isRegistered) {
//            percent = 3;
//        } else {
//            percent = 1;
//        }
//
//        int percent = isRegistered ? 3 : 1;
//
//        int bonus = amount * percent / 100;
//
//        if (bonus > 500) {
//            bonus = 500;
//        }
//
//
//        System.out.println("Итоговый бонус:" + bonus);



//        int ticket = 15650;
//        int oneMile = 20;
//        int bonus = ticket/oneMile;
//        System.out.println("Ваш бонус за купленный билет составил: " +  bonus);

        int balance = 100;
        int refill = 400;

        int bonus = (balance + refill)/ 100;

        //  если пополнение больше 1000, то бонус = пополнение / 100

        if (refill >= 1000) {
            System.out.println("Итоговая сумма на счету клиента " +  (balance+refill+bonus) + " рублей. Начислены бонусы в размере " + bonus  + " рублей");
        } else {
            System.out.println("Итоговая сумма на счету клиента " +  (balance+refill) + " рублей. Бонусы не начисляются.");




        }






    }
}