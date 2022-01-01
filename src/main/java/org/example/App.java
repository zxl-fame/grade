package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 * @author 86173
 */
public class App {
    public static void main(String[] args) {
        int i = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("输入整数: ");
            if (scanner.hasNextInt()) {
                i = scanner.nextInt();
            }
            int grade = function(i);
            System.out.println("等级为" + grade);
        }
    }

    public static int function(int i) {
        if (i > 2000) {
            return 1;
        } else if (i > 1300 && i <= 2000) {
            return 2;
        } else if (i > 800 && i <= 1300) {
            return 3;
        } else if (i > 500 && i <= 800) {
            return 4;
        } else if (i > 200 && i <= 500) {
            return 5;
        } else if (i >= 50 && i <= 200) {
            return 6;
        } else if (i < 50) {
            return 7;
        }
        return -1;
    }
}
