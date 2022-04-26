public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Решение задачи 1");
        for (int i = 10 ; i >= 1; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();
        int j = 1;
        while (j<=10) {
            System.out.print(j + " ");
            j++;
        }

        // Задача 2
        System.out.println();

        int dayOfWeek = 1;
        for ( ; dayOfWeek <=31; dayOfWeek=dayOfWeek+7) {
            System.out.println("Сегодня пятница, "+dayOfWeek+"-е число, время отправить отчет");
        }

        // Задача 3
        int cometFlightYear = 0;
        int currentYear = 2022;
        int past = currentYear-200;
        int future = currentYear+100;

        for ( ;cometFlightYear<=future; cometFlightYear=cometFlightYear+79) {
            if (cometFlightYear>=past) {
                System.out.println(cometFlightYear);
            }
        }







        }
}