package Lesson1;

import java.util.ArrayList;
import java.util.Collections;

public class Task_one_two<T> {
    private T[] arrayList;

    public Task_one_two(T[] arrayList) {
        this.arrayList = arrayList;
    }

    //метод, который меняет два элемента массива местами.
    public T[] swapArray(int oneSwap, int twoSwap){
        T[] arr = arrayList;
        T onesw = null;

        for (int i = 0; i < arrayList.length; i++){
            if (i == oneSwap) {
                onesw = arr[i];
                arr[i] = arrayList[twoSwap];
            }
            else if (i == twoSwap)
                arr[i] = onesw;
            else {
                arr[i] = arrayList[i];
            }
        }
        return arr;
    }

    //метод, который преобразует массив в ArrayList
    public ArrayList<T> transformArrayList(){
        ArrayList<T> arrList = new ArrayList<T>();

        Collections.addAll(arrList, arrayList);

        return arrList;
    }


}
