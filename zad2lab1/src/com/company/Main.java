package com.company;
import java.io.FileOutputStream;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String data = in.nextLine();

        try {
            FileOutputStream output = new FileOutputStream("\\Users\\macbook\\IdeaProjects\\zad2lab1\\src\\to_save.txt");
            byte[] array = data.getBytes();
            output.write(array);
            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
