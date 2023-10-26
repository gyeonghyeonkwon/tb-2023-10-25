package com.ll;

import java.util.Scanner;

class App {

    void run() {

        System.out.println("==명업 앱 ==");
        while (true) {
            System.out.print("명령) ");
            Scanner scanner = new Scanner(System.in);
            String cmd = scanner.nextLine();
            if (cmd.equals("종료")) {
                break;
            } else if (cmd.equals("등록")) {
                System.out.printf("명언: ");
                String str = scanner.nextLine();
                System.out.printf("작가: ");
                String str2 = scanner.nextLine();
                System.out.println("1번 명언이 등록되었습니다" );

            }
        }
    }
}