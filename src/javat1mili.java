public class javat1mili {
    public static void main(String[] args) {

        // хранение стоимости билета
        int price = 450;

        // хранения количества рублей для одной бонусной милли
        int prbonus = 20;
        int bonus;

        // Рассчитываете количество бонусных милль, используя значения заведённых переменных
        // Ответ сохраняете в новую переменную и выводите на экран
        bonus = price / prbonus;

        System.out.println ("При стоимости билета:" + price);
        System.out.println ("Итоговый бонус составит:" + bonus);


    }
}
