package com.company;

public class Main {

        public static void main(String args[]) throws Exception {
            String text = "Some text here ...";
            byte arr[] = text.getBytes("UTF8");
            for (byte x: arr) {
                System.out.print(x+" ");
            }
    }
}
