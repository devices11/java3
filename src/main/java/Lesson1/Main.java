package Lesson1;

public class Main {
    public static void main(String[] args) {
        //проверка задачи 1
        String[] arr = {"aaaa","bbbbb","ccccc","ddddd","eeeeeee"};
        Character[] arr22 = {'a','b','c','d','e'};
        Integer[] arr33 = {1, 2, 3, 4, 5};

        Task_one_two<String> arr1 = new Task_one_two<String>(arr);
        Task_one_two<Character> arr2 = new Task_one_two<Character>(arr22);
        Task_one_two<Integer> arr3 = new Task_one_two<Integer>(arr33);

        System.out.println(arr1.transformArrayList());
        arr1.swapArray(1, 4);
        System.out.println(arr1.transformArrayList());

        System.out.println(arr2.transformArrayList());
        arr2.swapArray(0, 4);
        System.out.println(arr2.transformArrayList());

        System.out.println(arr3.transformArrayList());
        arr3.swapArray(2, 4);
        System.out.println(arr3.transformArrayList());

    }
}
