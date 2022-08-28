public class Main {
    public static void main(String[] args) {
        //Задание 1

        byte box1 = 1;
        System.out.println("Значение переменной box1 с типом byte равно " + box1);
        short box2 = 2;
        System.out.println("Значение переменной box2 с типом short равно " + box2);
        int box3 = 3;
        System.out.println("Значение переменной box3 с типом int равно " + box3);
        long box4 = 4L;
        System.out.println("Значение переменной box4 с типом long равно " + box4);
        float box5 = 5.0f;
        System.out.println("Значение переменной box5 с типом float равно " + box5);
        double box6 = 6.0;
        System.out.println("Значение переменной box6 с типом double равно " + box6);

        //Задание 2

        float box7 = 27.12f;
        long box8 = 987678965549L;
        byte box9 = 2;
        short box10 = 786;
        boolean box11 = box9 > 10;
        System.out.println(box11);
        int box12 = 569;
        short box13 = -159;
        short box14 = 27897;
        byte box15 = 67;
        char box16 = 44;
        System.out.println(box16);

        //Задание 3

        int ludmilaPavlovna = 23;
        int annaSergeevna = 27;
        int ekaterinaAndreevna = 30;
        int ollStudents = ludmilaPavlovna + ekaterinaAndreevna + annaSergeevna;
        System.out.println("Всего учеников: " + ollStudents);
        int paper = 480;
        int perOneStudent = paper / ollStudents;
        System.out.println("На каждого ученика рассчитано " + perOneStudent + " листов бумаги");

        //Задание 4

        int productivityIn2Minutes = 16;
        int productivityIn1Minutes = productivityIn2Minutes / 2;
        System.out.println("Производительность за 1 минуту = " + productivityIn1Minutes + " бутылок");
        int productivityIn20Min = productivityIn1Minutes * 20;
        int productivityIn1Day = productivityIn1Minutes * 1440;
        int productivityIn3Day = productivityIn1Day * 3;
        int productivityIn1Month = productivityIn1Day * 30; // Берем стандарт 1 месяц = 30 дней
        System.out.println("за 20 минут работы машины произвела бутылок " + productivityIn20Min + " штук");
        System.out.println("за 1 сутки работы машины произвела бутылок " + productivityIn1Day + " штук");
        System.out.println("за 3 дня работы машины произвела бутылок " + productivityIn3Day + " штук");
        System.out.println("за 1 месяц работы машины произвела бутылок " + productivityIn1Month + " штук");

        //Задание 5

        int totalPaint = 120;
        int oneRoomWitePaint = 2;
        int oneRoomBrownPaint = 4;
        int oneRoomPaint = oneRoomWitePaint + oneRoomBrownPaint;
        int roomSchool = totalPaint / oneRoomPaint;
        int witePaintAlSchool = roomSchool * oneRoomWitePaint;
        int brownPaintAllSchool = roomSchool * oneRoomBrownPaint;
        System.out.println("В школе, где " + roomSchool + " классов, нужно " + witePaintAlSchool + " банок белой краски и " + brownPaintAllSchool + " банок коричневой краски");

        //Задание 6

        int weightOneBananas = 80; // Вес одного банан в граммах
        int banana = 5;
        int weightAllbananas = banana * weightOneBananas;

        int weighOnePortiontMilk = 105;
        int portionMilk = 2;
        int weightAllportionMilk = portionMilk * weighOnePortiontMilk;

        int weightIceCream = 100;
        int iceCream = 2;
        int weightAllIceCream = iceCream * weightIceCream;

        int weightEgg = 70;
        int egg = 4;
        int weightAllEgg = egg * weightEgg;

        int weightbreakfastInGrams = weightAllbananas + weightAllportionMilk + weightAllIceCream + weightAllEgg;
        float weightbreakfastInKilograms = weightbreakfastInGrams / 1000f;

        System.out.println("Вес завтрака спортсмена в граммах: " + weightbreakfastInGrams);
        System.out.println("Вес завтрака спортсмена в килограммах: " + weightbreakfastInKilograms);

        //Задание 7

        int loseWeightKilograms = 7; // кг
        int loseWeightGrams = loseWeightKilograms * 1000; // гр
        int loseMinInDay = 250;
        int loseMaxInDay = 500;
        int dayLoseMin = loseWeightGrams / loseMinInDay;
        System.out.println("Спортсмен похудеет при потерев в весе на 250 гр в день за : " + dayLoseMin + " дней");
        int dayLoseMax = loseWeightGrams / loseMaxInDay;
        System.out.println("Спортсмен похудеет при потерев в весе на 250 гр в день за : " + dayLoseMax + " дней");
        int dayMediumlose = (dayLoseMin + dayLoseMax) / 2;
        System.out.println("В среднем спортсмен должен похудеть за " + dayMediumlose + " дней");

        //Задание 8

        int salaryMashaMounth = 67760;
        int salaryMashaYear = salaryMashaMounth * 12;
        int newSalaryMashaMounth = salaryMashaMounth + ((salaryMashaMounth * 10)/100);
        int newSalaryMashaYear = newSalaryMashaMounth * 12;
        int diferebceSalaryMasha = newSalaryMashaYear - salaryMashaYear;
        System.out.println("Маша теперь получает " + newSalaryMashaMounth + " рублей в месяц. Годовой доход вырос на " + diferebceSalaryMasha + " рублей");

        int salaryDenisMounth = 83690;
        int salaryDenisYear = salaryDenisMounth * 12;
        int newSalaryDenisMounth = salaryDenisMounth + ((salaryDenisMounth * 10)/100);
        int newSalaryDenisYear = newSalaryDenisMounth * 12;
        int diferebceSalaryDenis = newSalaryDenisYear - salaryDenisYear;
        System.out.println("Денис теперь получает " + newSalaryDenisMounth + " рублей в месяц. Годовой доход вырос на " + diferebceSalaryDenis + " рублей");

        int salaryKristinaMounth = 76230;
        int salaryKristinaYear = salaryKristinaMounth * 12;
        int newSalaryKristinaMounth = salaryKristinaMounth + ((salaryKristinaMounth * 10)/100);
        int newSalaryKristinaYear = newSalaryKristinaMounth * 12;
        int diferebceSalaryKristina = newSalaryKristinaYear - salaryKristinaYear;
        System.out.println("Кристина теперь получает " + newSalaryKristinaMounth + " рублей в месяц. Годовой доход вырос на " + diferebceSalaryKristina + " рублей");






















    }
}