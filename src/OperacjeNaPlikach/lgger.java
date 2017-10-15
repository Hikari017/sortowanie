package OperacjeNaPlikach;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class lgger {
    public static void main(String[] args) {
//wyobrazamy sobi esytuacje w ktorej musimy uzyc loggera

        File f = new File("D:\\Akademia kodu\\logger.txt");
        lgger loger = new lgger(f,"CodeCademy");
        loger.log("Hello world! I'm your a first log ! ");
    }
    private File file;
    private  String prefix;

    public lgger(   File f , String prefix) {
    this.file = f;
    this.prefix = prefix;
    }
    public void log(String message){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String i = dateTimeFormatter.format(LocalDateTime.now());
        String allPrefix = i+"<" + prefix + ">:" + message ;
        System.out.println(i);
        try {
            Files.write(file.toPath(),allPrefix.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
