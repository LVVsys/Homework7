import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        int contribution = 15000;
        int total = 0;
        int i = 1;

        for (; total <= 2_459_000; i++) {
            total = total + total / 100;
            total = total + contribution;

            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }


        System.out.println("Задание 2");

        int y = 0;

        while (y < 10){
            y++;
            System.out.print(y + " ");
                    }
        System.out.println();
        for (; y > 0; y--) {
            System.out.print(y + " ");
        }
            System.out.println();


        System.out.println("Задание 3");

        int populationNow = 12_000_000;                //население в текущее время
        int birthRate = ((populationNow / 1000) * 17); //рождаемость в год
        int mortality = ((populationNow / 1000) * 8);  //смертность в год


        for (int year = 2024; year <= 2034; year++) {
            populationNow = populationNow + birthRate - mortality;
            System.out.println("Год " + year + ", численность населения составляет " + populationNow + " челоаек.");
        }


        System.out.println("Задание 4");

        int deposit = 15000;
        int tot = 0;
        int m = 1;

        for (; tot <= 12_000_000; m++) {
            tot = tot + ((tot / 100) * 7);
            tot = tot + deposit;
            System.out.println("Сумма накоплений по вкладу в " + m + " месяц - " + tot + " рублей.");
        }


        System.out.println("Задание 5");

        int deposit2 = 15000;
        int tot2 = 0;
        int m2 = 1;

        for (; tot2 <= 12_000_000; m2++) {
            tot2 = tot2 + ((tot2 / 100) * 7);
            tot2 = tot2 + deposit2;
            if (m2 % 6 == 0) {
                System.out.println("Сумма накоплений по вкладу в " + m2 + " месяц - " + tot2 + " рублей.");
            }
        }


        System.out.println("Задание 6");

        int deposit3 = 15000;
        int tot3 = 0;
        int m3 = 1;

        for (; m3 <= 108; m3++) {
            tot3 = tot3 + ((tot3 / 100) * 7);
            tot3 = tot3 + deposit3;
            if (m3 % 6 == 0) {
                System.out.println("Сумма накоплений по вкладу в " + m3 + " месяц - " + tot3 + " рублей.");
            }
        }

        System.out.println("Задание 7");

        for (int date = 1; date <= 31; date++) {
            switch (date) {
                case 5:
                    System.out.println("«Сегодня пятница, " + date + "-е число. Необходимо подготовить отчет.».");
                    break;
                case 12:
                    System.out.println("«Сегодня пятница, " + date + "-е число. Необходимо подготовить отчет.».");
                    break;
                case 19:
                    System.out.println("«Сегодня пятница, " + date + "-е число. Необходимо подготовить отчет.».");
                    break;
                case 26:
                    System.out.println("«Сегодня пятница, " + date + "-е число. Необходимо подготовить отчет.».");
            }
        }

        System.out.println("Задание 8");


        int cometYear = 0;
        for (; cometYear >= 0; cometYear = cometYear + 79){
            if (cometYear >= 1824 && cometYear <= 2124) {
                System.out.println(cometYear);
            }
        }














        }
}