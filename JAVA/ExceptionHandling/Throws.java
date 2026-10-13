package JAVA.ExceptionHandling;
import java.io.*;
public class Throws {


    static void readFile() throws IOException {
        FileReader file = new FileReader("data.txt");
        System.out.println("File Opened");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Could not find the file");
        }
    }
}

