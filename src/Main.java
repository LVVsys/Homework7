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
        }
}