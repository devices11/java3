package Lesson1.task3;

import java.util.ArrayList;

public class Box <T> {
    ArrayList<T> arrayBox = new ArrayList<T>();

    // метод добавления фрукта в коробку.
    public void addFruit(Fruit fruit){
        arrayBox.add((T) fruit.getWeight());
    }

    // метод compare, который позволяет сравнить текущую коробку с той,
    // которую подадут в compare в качестве параметра, true - если их веса равны,
    // false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
    public boolean compare(Box box) {
        Scales scales = new Scales();
        return scales.getWeight(this).equals(scales.getWeight(box));
    }

    // метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов,
    // нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается,
    // а в другую перекидываются объекты, которые были в этой коробке;
    public void shiftFruit(Box<T> box) {
        box.arrayBox.addAll(arrayBox);
        arrayBox.clear();
    }
}


class Scales{

    //метод, который высчитывает вес коробки, зная количество фруктов и вес одного фрукта
    // (вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
    public Number getWeight(Box box) {
        float weightFruit = 0;
        for (int i = 0; i < box.arrayBox.size(); i++){
            weightFruit = weightFruit + Float.parseFloat(box.arrayBox.get(i).toString());
        }
        return weightFruit;
    }
}