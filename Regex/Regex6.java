package Regex;

import java.util.Scanner;

public class Regex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("");
        String str = in.nextLine();
        if (str.matches("0-255\\.0-255\\.0-255\\.0-255")) {
            System.out.println("Ваш IP адрес был успешно загружен на сервер.");
        } else {
            System.out.println("Ваш IP адрес выглядит странно. Возможно, в нем ошибка.");
        }
    }
}
