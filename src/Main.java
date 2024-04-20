//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        byte boxOne = 15;
        System.out.println("Значение переменной" + " " + "boxOne" + " " + "с типом" + " " + "byte" + " " + "равно" + " " + boxOne + ".");
        short boxTwo = 15000;
        System.out.println("Значение переменной" + " " + "boxTwo" + " " + "с типом" + " " + "short" + " " + "равно" + " " + boxTwo + ".");
        int boxThree = 150000;
        System.out.println("Значение переменной" + " " + "boxThree" + " " + "с типом" + " " + "int" + " " + "равно" + " " + boxThree + ".");
        long box4 = 155555555555L;
        System.out.println("Значение переменной" + " " + "box4" + " " + "с типом" + " " + "long" + " " + "равно" + " " + box4 + ".");
        float box5 = 15.555555f;
        System.out.println("Значение переменной" + " " + "box5" + " " + "с типом" + " " + "float" + " " + "равно" + " " + box5 + ".");
        double box6 = 1.555645767567564;
        System.out.println("Значение переменной" + " " + "box6" + " " + "с типом" + " " + "double" + " " + "равно" + " " + box6 + ".");
        System.out.println(" ");

        System.out.println("Задание 2");
        float one = 27.12f;
        System.out.println("float" + " " + "one" + " " + "=" + " " + one);
        long two = 987_678_965_549L;
        System.out.println("long" + " " + "two" + " " + "=" + " " + two);
        double three = 2.786;
        System.out.println("double" + " " + "three" + " " + "=" + " " + three);
        short four = 569;
        System.out.println("short" + " " + "four" + " " + "=" + " " + four);
        short five = -159;
        System.out.println("short" + " " + "five" + " " + "=" + " " + five);
        int six = 27897;
        System.out.println("int" + " " + "six" + " " + "=" + " " + six);
        byte seven = 67;
        System.out.println("byte" + " " + "seven" + " " + "=" + " " + seven);
        System.out.println(" ");

        System.out.println("Задание 3");
        byte teacherLp = 23;
        byte teacherAs = 27;
        byte teacherEa = 30;
        short totalPaper = 480;
        int totalStudents = teacherLp + teacherAs + teacherEa;
        int paper = totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано" + " " + paper + " " + "листов бумаги.");
        System.out.println(" ");

        System.out.println("Задание 4");
        byte machinePerformanceIn2Minutes = 16;
        byte minutesInOneHour = 60;
        byte hoursInOneDay = 24;
        byte daysInOneMonth = 30;
        int minutesInOneDay = minutesInOneHour * hoursInOneDay;
        int machinePerformanceIn1Minutes = machinePerformanceIn2Minutes / 2;
        int machinePerformanceIn20Minutes = machinePerformanceIn1Minutes * 20;
        System.out.println("За 20 минут машина произвела" + " " + machinePerformanceIn20Minutes + " " + "штук бутылок");
        int machinePerformanceIn1day = machinePerformanceIn1Minutes * minutesInOneDay;
        System.out.println("За сутки машина произвела" + " " + machinePerformanceIn1day + " " + "штук бутылок");
        int threeDays = machinePerformanceIn1day * 3;
        System.out.println("За 3 дня машина произвела" + " " + threeDays + " " + "штук бутылок");
        int oneMonth = machinePerformanceIn1day * daysInOneMonth;
        System.out.println("За месяц машина произвела" + " " + oneMonth + " " + "штук бутылок");
        System.out.println(" ");

        System.out.println("Задание 5");
        byte totalCans = 120;
        byte white = 2;
        byte brown = 4;
        int totalPaint = white + brown;
        int totalClass = totalCans / totalPaint;
        // Cчитаем сколько нужно белой и коричневой краски
        int white1 = white * totalClass;
        int brown1 = brown * totalClass;
        System.out.println("В школе, где" + " " + totalClass + " " + "классов, нужно" + " " + white1 + " " + "банок белой краски и" + " " + brown1 + " " + "банок коричневой краски");
        System.out.println(" ");

        System.out.println("Задание 6");
        int bananaInGrams = 5 * 80;
        int milkInGram = (200 * 105) / 100;
        int iceCreamInGram = 2 * 100;
        int eggInGram = 4 * 70;
        double totalGram = bananaInGrams + milkInGram + iceCreamInGram + eggInGram;
        double totalKg = totalGram / 1000;
        System.out.println("Завтрак состовляет" + " " + totalGram + " " + "г." + " " + "или" + " " + totalKg + " " + "кг.");
    }
}