package com.ll;

import java.util.Scanner;

class App {

    void run() {
        int number = 0;
        System.out.println("==명업 앱 ==");
        while (true) {
            System.out.print("명령) ");
            Scanner scanner = new Scanner(System.in);
            String cmd = scanner.nextLine();
            if (cmd.equals("종료")) {
                break;
            } else if (cmd.equals("등록")) {

                System.out.print("명언: ");
                String str1 = scanner.nextLine();
                System.out.print("작가: ");
                String str2 = scanner.nextLine();
                number++;
                System.out.printf("%d번 명언이 등록되었습니다%n", number);
            }

        }
    }
}
