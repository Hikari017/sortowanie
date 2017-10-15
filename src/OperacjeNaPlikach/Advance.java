package OperacjeNaPlikach;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Advance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1-katalog
        //2-menu
        //3-exit
        System.out.println("1 - aby utworzyć nowy katalog");
        System.out.println("2 - aby utworzyć plik");
        System.out.println("3 - aby wyjsc");
        int option = 0;

        do {
            System.out.println("Wybierz opcję: ");
            option = scanner.nextInt();
            scanner = new Scanner(System.in);
            switch (option) {
                case 1: {
                    System.out.println("Podaj adres do katalogu: ");
                    String catalog = scanner.nextLine();
                    File file = new File(catalog);
                    if (file.mkdirs()) {
                        System.out.println("Udalo sie utworzy katalog ! ");
                    } else {
                        System.out.println("Wystąpił błąd lub katalog już istnieje");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Podaj scieżkę do pliku: ");
                    String catalog= scanner.nextLine();
                    File file = new File(catalog);
                    try {
                        if (file.createNewFile()){
                            System.out.println("Udało się utworzyć plik ! ");
                        }else {
                            System.out.println("Wystąpił bład lub plik już istnieje ! ");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
break;
                }
            }

        } while (option!=3);
    }
}
