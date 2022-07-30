package com.company;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Main {
    static void splitText() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("//Users//macbook//Downloads//sample1.txt"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            String[] splitText = everything.split(" ");


            for(int i = 0; i < splitText.length; i++) {
                System.out.println(i +1  + " " + splitText[i]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }

    }
    public static void main(String[] args) throws IOException {
        splitText();
    }

}
