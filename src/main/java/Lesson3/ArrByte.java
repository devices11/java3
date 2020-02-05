package Lesson3;


import java.io.*;

public class ArrByte {

    public byte[] readFile(String file) throws IOException {
        return readFile(new File(file));
    }

    public static byte[] readFile(File file) throws IOException {

        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r")) {
            long longlength = randomAccessFile.length();
            int length = (int) longlength;

            byte[] data = new byte[length];
            randomAccessFile.readFully(data);
            return data;
        }
    }
}
