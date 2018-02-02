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
        float SILVERPERGOLD = 6.7f;
        float BROADSWORDCOST = 3.6f;
        short broadswords;

        System.out.printf("У тебя %.0f золотых монет и %d серебряных.", gold, silver);
        gold += silver / SILVERPERGOLD;
        System.out.printf("Это будет %.2f золотых монет.", gold);
        System.out.printf("Сколько палашей ты желаешь приобрести? (каждый стоит %.1f золотых)%n", BROADSWORDCOST);

        broadswords = in.nextShort();

        while (broadswords < 0) {
            System.out.println("Маловато палашей ты хочешь. Приходи, когда наиграешь аппетит!");
            System.out.printf("Ну что, нагулял? Сколько палашей ты желаешь приобрести? (каждый стоит %.1f золотых)%n", BROADSWORDCOST);
            broadswords = in.nextShort();
        }

        gold = gold - broadswords * BROADSWORDCOST;
        System.out.printf("Спасибо за покупку. У тебя осталось %.2f золотых монет.%n", gold);
        silver = (int) ((gold - (int) gold) * SILVERPERGOLD);
        gold = (int) gold;
        System.out.printf("Это будет %.0f золотых и %d серебряных монет.%n", gold, silver);
        System.out.println("Спасибо, что посетили Оружейный магазин.");
        System.out.printf("Всего хорошего, сэр %s", name);

    }
}
