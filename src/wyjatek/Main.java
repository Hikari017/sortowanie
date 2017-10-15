package wyjatek;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static int age;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        writeAge();
        age = 0;

        try {
            age = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("W polu wiek musi zostać podana cyfra!");
            writeAge();
        }
        if (age > 0) {
            System.out.println("Wiek jest wiekszy od zera");
        } else {
            System.out.println("wiek nie jest wiekszy od zera");
        }
    }

    private static void writeAge() {
        System.out.println("Wpisz wiek ");
        Scanner scanner = new Scanner(System.in);


        int age = 0;

        try {
            age = scanner.nextInt();

        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("W polu wiek musi zostać podana cyfra!");
            writeAge();
        }
    }
}
