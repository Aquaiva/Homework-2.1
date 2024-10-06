package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello, World!");
        // Homework2_1
        byte a = 1;
        short b = 700;
        int c = 50000;
        long d = 3000000000L;
        float e = 46.45f;
        double f = 24.6060604040;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);

        float g = 27.12f;
        long h = 987678965549L;
        float i = 2.786f;
        short j = 569;
        short k = -159;
        short l = 27897;
        byte m = 67;

        byte studentsA = 23;
        byte studentsB = 27;
        byte studentsC = 30;
        byte students = (byte) (studentsA + studentsB + studentsC);
        short sheetsOfPaper = 480;
        short sheetsForStudent = (short) ( sheetsOfPaper / students);
        System.out.println("На каждого из учеников рассчитано " + sheetsForStudent + " листов бумаги");

        byte bottlesPer2Minutes = 16;
        byte bottlesPer1Minute = (byte) (bottlesPer2Minutes / 2);
        short bottlesPer20Minutes = (short) (bottlesPer1Minute * 20);
        int minutesInDay = 60 * 24;
        int bottlesInDay = bottlesPer1Minute * minutesInDay;
        int bottlesIn3Days = bottlesInDay * 3;
        int bottlesInFebruary2020 = bottlesInDay * 29;
        System.out.println("За 20 минут машина произвела " + bottlesPer20Minutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesInDay + " штук бутылок");
        System.out.println("За трое суток машина произвела " + bottlesIn3Days + " штук бутылок");
        System.out.println("За Февраль 2020 машина произвела " + bottlesInFebruary2020 + " штук бутылок");

        byte paint = 120;
        byte brownPaintForClassroom = 4;
        byte whitePaintForClassroom = 2;
        byte paintForClassroom = (byte) (brownPaintForClassroom + whitePaintForClassroom);
        byte classrooms = (byte) (paint / paintForClassroom);
        byte totalBrownPaint = (byte) (brownPaintForClassroom * classrooms);
        byte totalWhitePaint = (byte) (whitePaintForClassroom * classrooms);
        System.out.println("В школе, где " + classrooms + " классов, нужно " + totalWhitePaint +
                " банок белой краски и " + totalBrownPaint + " банок коричневой краски");

        byte bananaWeight = 80;
        byte milk100MlWeight = 105;
        float milk1MlWeight = (float) (milk100MlWeight / 100);
        byte icecreamBriquetteWeight = 100;
        byte egg = 70;
        short bananaFromRecipeWeight = (short) (bananaWeight * 5);
        short milkFromRecipeWeight = (short) (milk1MlWeight * 200);
        short iceCreamFromRecipeWeight = (short) (icecreamBriquetteWeight * 2);
        short eggsFromRecipeWeight = (short) (egg * 4);
        short breakfastWeightGrams = (short) (bananaFromRecipeWeight + milkFromRecipeWeight +
                iceCreamFromRecipeWeight + eggsFromRecipeWeight);
        short gramsInKilogram = 1000;
        double breakfastWeightKilograms = (double) breakfastWeightGrams / gramsInKilogram;
        System.out.println("Спортсмен готовит себе завтрак массой " + breakfastWeightGrams +
                " грамм, т.е " + breakfastWeightKilograms + " килограмм");

        short minGramsLossInDay = 250;
        short maxGramsLossInDay = 500;
        short gramsIn7Kilograms = (short) (gramsInKilogram * 7);
        short daysForDietMinLoss = (short) (gramsIn7Kilograms / minGramsLossInDay);
        short daysForDietMaxLoss = (short) (gramsIn7Kilograms / maxGramsLossInDay);
        float averageDietDays = (float) ((daysForDietMaxLoss + daysForDietMinLoss) / 2);
        System.out.println("В среднем на похудение с диетой тренера уйдет " + averageDietDays + " дней");

        int currentSalaryMaria = 67760;
        int currentSalaryDenis = 83690;
        int currentSalaryChristine = 76230;
        int currentYearIncomeMaria = currentSalaryMaria * 12;
        int currentYearIncomeDenis = currentSalaryDenis * 12;
        int currentYearIncomeChristine = currentSalaryChristine * 12;
        float updatedSalaryMaria = (float) (currentSalaryMaria * 1.1);
        float updatedSalaryDenis = (float) (currentSalaryDenis * 1.1);
        float updatedSalaryChristine = (float) (currentSalaryChristine * 1.1);
        float updatedYearIncomeMaria = updatedSalaryMaria * 12;
        float updatedYearIncomeDenis =  updatedSalaryDenis * 12;
        float updatedYearIncomeChristine = updatedSalaryChristine * 12;
        float difYearIncomeMaria = updatedYearIncomeMaria - currentYearIncomeMaria;
        float difYearIncomeDenis = updatedYearIncomeDenis - currentYearIncomeDenis;
        float difYearIncomeChristine = updatedYearIncomeChristine - currentYearIncomeChristine;
        System.out.println("Маша теперь получает " + updatedSalaryMaria + " рублей. Годовой доход вырос на " +
                difYearIncomeMaria + "рублей");
        System.out.println("Денис теперь получает " + updatedSalaryDenis + " рублей. Годовой доход вырос на " +
                difYearIncomeDenis + " рублей");
        System.out.println("Кристина теперь получает " + updatedSalaryChristine + " рублей. Годовой доход вырос на " +
                difYearIncomeChristine + " рублей");


    }
}
