package com.company;
import java.io.FileInputStream;

public class Main {

    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("/Users/macbook/IdeaProjects/zad1lab1/src/test.txt");
            int index = input.read();
            while (index != -1) {
                System.out.print((char) index);
                index = input.read();
            }
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
