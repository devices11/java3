package Lesson1.task3;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<Apple>();
        Box<Apple> appleBox2 = new Box<Apple>();

        Apple apple = new Apple(1.0f);

        appleBox.addFruit(apple);
        appleBox.addFruit(apple);
        appleBox.addFruit(apple);

        System.out.println("Корзина 1 с яблоками весит: " + new Scales().getWeight(appleBox));

        appleBox2.addFruit(apple);
        appleBox2.addFruit(apple);
        appleBox2.addFruit(apple);
        System.out.println("Корзина 2 с яблоками весит: " + new Scales().getWeight(appleBox2));

        Box<Orange> orangeBox = new Box<Orange>();

        Orange orange = new Orange(1.5f);

        orangeBox.addFruit(orange);
        orangeBox.addFruit(orange);
        orangeBox.addFruit(orange);
        System.out.println("Корзина с апельсинами весит: " + new Scales().getWeight(orangeBox));


        System.out.println("Сравниваем вес карзин яблок 1 и яблок 2");
        System.out.println(appleBox.compare(appleBox2));
        System.out.println("Сравниваем вес карзин яблок 1 и апельсин");
        System.out.println(appleBox2.compare(orangeBox));

        System.out.println("Пересыпали яблоки из 2 корзины яблок в 1 ");
        appleBox2.shiftFruit(appleBox);

        System.out.println("Корзина 1 с яблоками весит: " + new Scales().getWeight(appleBox));
        System.out.println("Корзина 2 с яблоками весит: " + new Scales().getWeight(appleBox2));


    }

}
