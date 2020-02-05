package Lesson3;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadBook {

    public static void reader(String fileName, int page) throws IOException {
        try (RandomAccessFile rf = new RandomAccessFile(fileName, "rw")) {
            rf.seek((page-1) * 1800);
            byte[] bytes = new byte[1800];
            rf.read(bytes);
            rf.close();
            System.out.println(new String(bytes));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

class Main {

    public static void main(String[] args) throws IOException {
        ReadBook rb = new ReadBook();

        Scanner scanner = new Scanner(System.in);

        try {
            while (true)
            {
                System.out.print("Введите номер страницы для перехода: ");
                int page = scanner.nextInt();


                try {
                    rb.reader("src/main/resources/Lesson3/Book.txt", page);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                System.out.println("Для выхода введите любой символ");
            }
        } catch (InputMismatchException e){
            //кастыль
        }

    }
}
