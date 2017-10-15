package OperacjeNaPlikach;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadAll {
    public static void main(String[] args) {
        try {
            List<String> linesOfText = Files.readAllLines(Paths.get("D:\\Akademia kodu\\FileCreated\\test.txt"));
            for (String line: linesOfText){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
