package OperacjeNaPlikach;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("D:\\Akademia kodu\\FileCreated\\test.txt");
        Scanner scanner = new Scanner(System.in);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wpisz tekst: ");

        try {
            Files.write(file.toPath(), (scanner.nextLine() + "\r\n").getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }}
//        File myCatalog = new File("D:\\Akademia kodu\\" ,"akademia.kodu1");
//
//        myCatalog.mkdirs();
//        try {
//            myCatalog.createNewFile();
//            file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        if (file.exists()){
//            System.out.println("ISTNIEJE!");
//        }
    }
}
