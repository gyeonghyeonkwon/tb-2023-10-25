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
            }
            else if (cmd.equals("등록")) {
                System.out.println("명언: 현재를사랑하라.");
                System.out.println("작가: 작자미상");
                System.out.println("1번 명언이 등록되었습니다");
            }

        }
    }
}