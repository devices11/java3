package Lesson3;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class JoiningOfFiles {

    public static void main(String[] args) throws IOException {

        //1. Прочитать файл (около 50 байт) в байтовый массив и вывести этот массив в консоль;
        ArrByte arr = new ArrByte();
        System.out.println(Arrays.toString(arr.readFile("src/main/resources/Lesson3/1.txt")));


        //вариант 2
        byte[] buf = new byte[20];

        try (FileInputStream in = new FileInputStream("src/main/resources/Lesson3/1.txt")) {

            int count;
            while ((count = in.read(buf)) > 0) {
                for (int i = 0; i < count; i++) {
                    System.out.print(buf[i] + ", ");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        //2. Последовательно сшить 5 файлов в один (файлы примерно 100 байт).
        ArrayList<String> al = new ArrayList<>();
        al.add("src/main/resources/Lesson3/1.txt");
        al.add("src/main/resources/Lesson3/2.txt");
        al.add("src/main/resources/Lesson3/3.txt");
        al.add("src/main/resources/Lesson3/4.txt");
        al.add("src/main/resources/Lesson3/5.txt");

        MergeFile.mergeFile(al);

    }
}

class MergeFile {
    public static void mergeFile (ArrayList<String> ali) throws IOException {

        for (int i = 0; i < ali.size(); i++) {

            try(FileReader reader = new FileReader(ali.get(i)))
            {
                char[] buf = new char[256];
                int c;
                while((c = reader.read(buf))>0){

                    if(c < 256){
                        buf = Arrays.copyOf(buf, c);
                    }
//                    System.out.print(buf);
                    try(FileWriter writer = new FileWriter("src/main/resources/Lesson3/mergeFile.txt", true))
                    {
                        writer.write(buf);
                    }
                    catch(IOException ex){
                        System.out.println(ex.getMessage());
                    }
                }
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}
