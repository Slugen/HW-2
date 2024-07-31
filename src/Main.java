public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        System.out.println("-----Задача 1-----");
        int age=15;
        if (age>=18){
            System.out.println("Если возраст человека "+age+" то он совершеннолетний");
        }else {
            System.out.println("Если возраст человека " + age + " то он еще не совершеннолетний надо еще подождать");
        }
        System.out.println("-----Задача 2-----");
        int outdoorTemperature=7;
        if (outdoorTemperature<=5) {
            System.out.println("Сегодня " + outdoorTemperature + " градусов по цельсию нужно надеть шапку");
        }else{
            System.out.println("Сегодня "+outdoorTemperature+" градусов по цельсию можно идти без шапки");
        }
        System.out.println("-----Задача 3-----");
        int carSpeed=25;
        if (carSpeed>60){
            System.out.println("Если скорость "+carSpeed+", то придеться платить штраф");
        }else{
            System.out.println("Если скорость "+carSpeed+", можно ездить спокойно");
        }
        System.out.println("-----Задача 4-----");
        int ageStages=68;
        if (ageStages>=2 && ageStages<=6){
            System.out.println("Ты должен идти в детский сад");
        }
        if (ageStages>=7 && ageStages<=17){
            System.out.println("Ты должен ходить в школу");
        }
        if (ageStages>=18 && ageStages<=24){
            System.out.println("Ты должен ходить в универ");
        }
        if (ageStages>24){
            System.out.println("Если ты не работаешь то иди работа лентяй!");
        }
        if (ageStages>63){
            System.out.println("Поздравляю ты прожил жизнь теперь ты на пенсии!!!");
        }
        System.out.println("-----Задача 5-----");
        int ageRistriction=15;
        if (ageRistriction<5){
            System.out.println("Малыш ты еще не можешь кататься на аттракционах");
        }
        if (ageRistriction>=5 && 14>ageRistriction){
            System.out.println("Ты можешь кататься на аттракционах но только с сопровождением");
        }
        if (ageRistriction>=14){
            System.out.println("Ты можешь кататься на аттракционах без сопровождения");
        }
        System.out.println("-----Задача 6-----");
        int totalSeats = 102;
        int wagonFullness = 70;
        boolean hasFreeSeats = wagonFullness < totalSeats;
        if (hasFreeSeats) {
            if (wagonFullness < 60) {
                System.out.println("Вагон не заполнен и есть свободные сидячие места");
            } else {
                System.out.println("Вагон не заполнен, но в нем нет свободных сидячих мест");
            }
        } else {
            System.out.println("Вагон заполнен");
        }
        System.out.println("-----Задача 7-----");
        int one=15;
        int two=28;
        int three=34;
        boolean oneBiggest=one>two && one>three;
        boolean twoBiggest=two>one && two>three;
        if (oneBiggest){
            System.out.println("Число под номером один больше");
        }else if (twoBiggest){
            System.out.println("Число под номером два больше");
        }else{
            System.out.println("Число под номером три больше");
        }
        System.out.println("-----Finished !!!-----");






        for(int i = 1; i <= 5; ++i) {
        }

    }
}

