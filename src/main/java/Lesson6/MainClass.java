package Lesson6;

import java.util.ArrayList;

public class MainClass {


//1. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
// Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов, идущих после последней четверки.
// Входной массив должен содержать хотя бы одну четверку, иначе в методе необходимо выбросить RuntimeException.
// Написать набор тестов для этого метода (по 3-4 варианта входных данных). Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].

    public int[] arrCut(int[] arr){
        ArrayList<Integer> arrayList = new ArrayList<>();

        if (arr == null)
            throw new NullPointerException("Массив не может быть пустым");

        int[] arrNew = null;

        for (int i = arr.length-1; i != -1; i--) {
            if (arr[i] == 4) {
                for (int j = i+1; j < arr.length; j++) {
                    arrayList.add(arr[j]);
                }
                arrNew = arrayList.stream().mapToInt(k->k).toArray();
                break;
            }
        }

        if (arrNew == null)
            throw new RuntimeException("Массив должен содержать минимум одну четверку");

        return arrNew;
    }

//            2. Написать метод, который проверяет состав массива из чисел 1 и 4.
//            Если в нем нет хоть одной четверки или единицы, то метод вернет false;
//            Написать набор тестов для этого метода (по 3-4 варианта входных данных).

    public boolean containsNumber(int[] arr){
        boolean cn = false;

        for (int value : arr) {
            if (value == 1 || value == 4) {
                cn = true;
                break;
            }
        }
        return cn;
    }
}
