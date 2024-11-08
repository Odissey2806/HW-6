public class Main {
    public static void main(String[] args) {

        // Задача №1
        System.out.println("Задача №1");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Задача №2
        System.out.println("Задача №2");

        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(i);
        }

        // Задача №3
        System.out.println("Задача №3");

        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        // Задача №4
        System.out.println("Задача №4");

        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }

        // Задача №5
        System.out.println("Задача №5");

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println("« " + i + " год является високосным»");
        }

        // Задача №6
        System.out.println("Задача №6");

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        // Задача №7
        System.out.println("Задача №7");

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        // Задача №8
        System.out.println("Задача №8");

        int capital = 29_000;
        int annualSavingsJar = 0;
        for (int i = 1; i <= 12; i++) {
            annualSavingsJar = annualSavingsJar + capital;
            System.out.println("«Месяц " + i + ", сумма накоплений равна " + annualSavingsJar + " рублей»");
        }

        // Задача №9
        System.out.println("Задача №9");

        int money = 29_000;
        int annualSavingsBank = 0;
        for (int i = 1; i <= 12; i++) {
            annualSavingsBank = annualSavingsBank + annualSavingsBank / 100;
            annualSavingsBank = annualSavingsBank + money;
            System.out.println("«Месяц " + i + ", сумма накоплений равна " + annualSavingsBank + " рублей»");
        }

        // Задача №10
        System.out.println("Задача №10");

        int number = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }

        // Урок 2
        // Задача №1
        System.out.println("Урок 2");
        System.out.println("Задача №1");

        int savingMoney = 15_000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            i++;
            total = total + savingMoney;
            System.out.println("«Месяц " + i + ", сумма накоплений равна " + total + " рублей»");
        }

        // Задача №2
        System.out.println("Задача №2");

        int j = 0;
        while (j < 10) {
            j = j + 1;
            System.out.print(j + " ");
                    }
        System.out.println();
        for (int k = 10; k >= 1; k--) {
            System.out.print(k + " ");
        }
        System.out.println();

        // Задача №3
        System.out.println("Задача №3");

        int yPopulation = 12_000_000;
        int birthRate = 17;
        int mortalityRate = 8;
        int years = 1;
        for (; years <= 10; years++) {
            int populationGrowth = yPopulation / 1000 * birthRate;
            int populationDecline = yPopulation / 1000 * mortalityRate;
            yPopulation = yPopulation + populationGrowth - populationDecline;
            System.out.println("«Год " + years + ", численность населения составляет " + yPopulation + "».");
        }

        // Задача №4
        System.out.println("Задача №4");

        int moneyVasiliy = 15000;
        int savingsAccount = 0;
        for (int l = 0; savingsAccount < 12_000_000; l++) {
            savingsAccount = savingsAccount + (savingsAccount * 7) / 100;
            savingsAccount = savingsAccount + moneyVasiliy;
            System.out.println("Месяц " + l + " Итого " + savingsAccount);
        }

        // Задача №5
        System.out.println("Задача №5");

        int moneyVasiliyX = 15000;
        int savingsAccountX = 0;
        for (int l = 1; savingsAccountX < 12_000_000; l++) {
            savingsAccountX = savingsAccountX + (savingsAccountX * 7) / 100;
            savingsAccountX = savingsAccountX + moneyVasiliyX;
            if (l % 6 == 0) {
                System.out.println("Месяц " + l + " Итого " + savingsAccountX);
            }
        }

        // Задача №6
        System.out.println("Задача №6");

        int vasiliyMoney = 15000;
        int totalVasiliy = 0;
        int month = 0;
        for (; month <= 108; month++) {
            totalVasiliy = totalVasiliy + (totalVasiliy * 7) / 100;
            totalVasiliy = totalVasiliy + vasiliyMoney;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " Итого " + totalVasiliy);
            }
        }

        // Задача №7
        System.out.println("Задача №7");

        int friday = 5;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + " -е число.Необходимо подготовить отчет");
            friday += 7;
        }

        // Задача №8
        System.out.println("Задача №8");

        int passageOfTheComet = 79;
        int yearZeroOfTheComet = 0;
        int yearNow = 2024;
        int yearZero = yearNow - 200;
        int comingYears = yearNow + 100;
        for (int time = yearZeroOfTheComet; time<comingYears; time += passageOfTheComet){
            if (time>yearZero){
                System.out.println(time);

            }
        }
    }
}