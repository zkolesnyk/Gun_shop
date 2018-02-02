import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        System.out.println("Добро пожаловать в оружейный магазин, благородный рыцарь.");
        System.out.println("Снова настала пора экипировать армию?");
        System.out.println("Как твое имя?");
        name = in.next();

        System.out.println("Что ж, сэр " + name + ", вперед, за покупками!");

        float gold = 50;
        int silver = 8;
        float SILVERPERGOLD = (float) 6.7;
        float BROADSWORDCOST = (float) 3.6;
        short broadswords;

        System.out.println("У тебя " + gold + " золотых монет и " + silver + " серебряных.");
        gold += silver / SILVERPERGOLD;
        System.out.println("Это будет " + gold + " золотых монет. ");
        System.out.println("Сколько палашей ты желаешь приобрести? (каждый стоит 3.6 золотых)");

        broadswords = in.nextShort();

        while (broadswords < 0) {
            System.out.println("Маловато палашей ты хочешь. Приходи, когда наиграешь аппетит!");
            System.out.println("Ну что, нагулял? Сколько палашей ты желаешь приобрести? (каждый стоит 3.6 золотых)");
            broadswords = in.nextShort();
        }

        gold = gold - broadswords * BROADSWORDCOST;
        System.out.println("Спасибо за покупку. У тебя осталось " + gold + ".");
        silver = (int) ((gold - (int) gold) * SILVERPERGOLD);
        gold = (int) gold;

        System.out.println("Это будет " + gold + " золотых и " + silver + " серебряных монет.");
        System.out.println("Спасибо, что посетили Оружейный магазин.");
        System.out.println("Всего хорошего, сэр " + name);

    }
}
