package de.ait;

public class Main {
    public static void main(String[] args) {
        System.out.println(WeatherTools.getWindDescription(10, true));
        System.out.println(WeatherTools.getWindDescription(10, false));
        System.out.println(WeatherTools.getWindDescription(20, true));
        System.out.println(WeatherTools.getWindDescription(20, false));
        System.out.println(WeatherTools.getWindDescription(30, true));
        System.out.println(WeatherTools.getWindDescription(30, false));
        System.out.println(WeatherTools.getWindDescription(90, true));
        System.out.println(WeatherTools.getWindDescription(90, false));
    }

    }


///Создайте класс WeatherTools c методом
//
//public static String getWindDescription(double speed, boolean isGusty) Этот метод принимает скорость ветра и параметр сообщающий является ли ветер порывистым. Корреляция скорости ветра и описания:
//<1 == Calm
//1-5 == Light Air
//6-11 == Light Breeze
//12-19 == Gentle Breeze
//20-28 == Moderate Breeze
//29-38 == Fresh Breeze
//Можете дополнительно учесть остальные типы ветра из таблицы по ссылке
//
//Пример работы метода:
//getWindDescription(20, true) -> "Gusty Moderate Breeze with speed of 20 km"
//getWindDescription(20, false) -> "Moderate Breeze with speed of 20 km"
//getWindDescription(30, true) -> "Gusty Moderate Breeze with speed of 30 km"
//getWindDescription(30, false) -> "Moderate Breeze with speed of 30 km"
//Создайте тесты для методов.