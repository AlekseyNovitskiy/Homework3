public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1");
        int usually = 1000000000;
        byte small = 64;
        short normal =30000;
        long big = 100000000000L;
        float point = 75.5F;
        double pointLong = 50.57387466;
        System.out.println("Значение переменной usually с типом int равно " + usually);
        System.out.println("Значение переменной small с типом byte равно " + small);
        System.out.println("Значение переменной normal с типом short равно " + normal);
        System.out.println("Значение переменной big с типом long равно " + big);
        System.out.println("Значение переменной point с типом float равно " + point);
        System.out.println("Значение переменной pointLong с типом double равно " + pointLong);

        // Задача 2
        System.out.println("Задача 2");

        float a = 27.12F;
        long b = 987678965549L;
        double c = 2.786;
        boolean d = false;
        char g = 569;
        short n = -159;
        int u = 27897;
        byte i = 67;

        // Задача 3
        System.out.println("Задача 3");

        byte classL = 23;
        byte classA = 27;
        byte classE = 30;
        byte classAll = (byte) (classL + classA + classE);
        int listPerStudent = 480 / classAll;
        System.out.println("На каждого ученика рассчитано " + listPerStudent + " листов бумаги" );

        // Задача 4
        System.out.println("Задача 4");

        byte producePerMinute = 16/2;
        short producePerTwenty = (short) (producePerMinute * 20);
        short producePerDay = (short) (producePerTwenty * 72);
        int producePerThreeDay = producePerDay * 3;
        int producePerMonth = producePerDay * 30;
        System.out.println("За 20 минут машина произвела бутылок " + producePerTwenty + " штук" );
        System.out.println("За сутки машина произвела бутылок " + producePerDay + " штук" );
        System.out.println("За 3 дня машина произвела бутылок " + producePerThreeDay + " штук" );
        System.out.println("За месяц машина произвела бутылок " + producePerMonth + " штук" );

        // Задача 5
        System.out.println("Задача 5");

        byte totalClasses = 120/6;
        byte whitePaint = (byte) (totalClasses * 2);
        byte brownPaint = (byte) (totalClasses * 4);
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски" );

        // Задача 6
        System.out.println("Задача 6");

        short banana = 80;
        short milk = 105;
        short iceCream = 100;
        short egg = 70;
        short numberOfGrams = (short) ( 5 * banana + 2 * milk + 2 * iceCream + 4 * egg);
        float numberOfKms = (float)(numberOfGrams)/1000;
        System.out.println("Вес спорт-завтрака в граммах " + numberOfGrams);
        System.out.println("Вес спорт-завтрака в килограммах " + numberOfKms);

        // Задача 7
        System.out.println("Задача 7");
        short minWeight = 250;
        short maxWeight = 500;
        short deltaWeight = 7 * 1000;
        short minDay = (short) (deltaWeight/minWeight);
        System.out.println("Если худеть по 250 грамм в день понадобиться " + minDay + " дней.");
        short maxDay = (short) (deltaWeight/maxWeight);
        System.out.println("Если худеть по 500 грамм в день понадобиться " + maxDay + " дней.");
        short midDay = (short) ((minDay + maxDay)/2);
        System.out.println("В среднем на похудение понадобиться " + midDay + " дней.");

        // Задача 8
        System.out.println("Задача 8");

        int salaryM = 67760;
        int salaryD = 83690;
        int salaryC = 76230;
        float upSalary = 0.1f;
        int upSalaryM = (int) (salaryM + salaryM * upSalary);
        int upYearSalaryM = (upSalaryM - salaryM) * 12;
        System.out.println("Маша теперь получает " + upSalaryM + " рублей. Годовой доход вырос на " + upYearSalaryM + " рублей");
        int upSalaryD = (int)(salaryD + salaryD * upSalary);
        int upYearSalaryD = (upSalaryD - salaryD) * 12;
        System.out.println("Маша теперь получает " + upSalaryD + " рублей. Годовой доход вырос на " + upYearSalaryD + " рублей");
        int upSalaryC = (int)(salaryC + salaryC * upSalary);
        int upYearSalaryC = (upSalaryC - salaryC) * 12;
        System.out.println("Маша теперь получает " + upSalaryC + " рублей. Годовой доход вырос на " + upYearSalaryC + " рублей");
    }
}