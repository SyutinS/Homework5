public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age +
                    " то от совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age +
                    " то от не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        int temperature = 4;
        if (temperature > 5) {
            System.out.println("На улице " + temperature +
                    "градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature +
                    "градусов, нужно одеть шапку");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");

        int speed = 50;
        if (speed > 60) {
            System.out.println("Если скорость " + speed +
                    " то прийдется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed +
                    " то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4"); // переделать под else

        int age = 4;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age +
                    " то ему нужно ходить в детский сад");
        }
        if (age >6 && age <= 18) {
            System.out.println("Если возраст человека равен " + age +
                    " то ему нужно ходить школу");
        }
        if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age +
                    " то его место в университете ");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age +
                    " то ему пора ходить на работу ");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 10;
        if (age < 5) {
            System.out.println("Если возраст ребенка " + age +
                    "то он не может кататься на аттракционе");
        } else if (age > 14) {
            System.out.println("Если ребенку " + age +
                    "то он может кататься без сопровождения взрослого");
        } else {
            System.out.println("Если ребенку " + age +
                    "то он может кататься только в сопровождении взросного");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int vagPlace = 66;
        int vanAll = 102;
        int vanSit = 60;
        if (vagPlace > vanSit && vagPlace <= vanAll) {
            System.out.println("Места в вагоне есть. Ваше место в вагоне №: " + vagPlace + " стоячее.");
        } else if (vagPlace > vanAll) {System.out.println("Мест в вагоне нет!!! Ожидайте следующего поеда.");
        } else  {System.out.println("Места в вагоне есть. Ваше место в вагоне №: " + vagPlace + " сидячее.");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 10;
        int two = 20;
        int three = 30;
        System.out.print("Из трех чисел: " + one + " : " + two + " : " + three + " : " +
                " Самое большое : ");
        if (one > two && one > three) {
            System.out.println(one);}
        else if (two > three && two >three) {
            System.out.println(two);}
        else {
            System.out.println(three);}
    }
}