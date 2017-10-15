package OperacjeNaPlikach;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ZamianaSlow {
    public static void main(String[] args) {
        List<String> linesInFile = Collections.emptyList();
        List<String> linesInFileNew = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        try {
            linesInFile = Files.readAllLines(Paths.get("D:\\Akademia kodu\\FileCreated\\zamianaSlow.txt"), Charset.forName("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Plik został otwarty");
        System.out.println("Podaj dane do zamienienia: ");
        String data = scanner.nextLine();
        String[] dataArray = data.split(" ");

        for (String line : linesInFile) {
          linesInFileNew.add(line.replaceAll(dataArray[0], dataArray[1]));


        }
        try {
            Files.write(Paths.get("D:\\Akademia kodu\\FileCreated\\zamianaSlow.txt"), linesInFileNew, Charset.forName("UTF-8"), StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
