package com.ll;

import java.util.Scanner;

class App {
    void run() {
        int number = 0;
        System.out.println("==명언 앱==");
       while (true) {
           Scanner scanner = new Scanner(System.in);
           System.out.printf("명령) ");
           String cmd = scanner.nextLine();
           if (cmd.equals("종료")) {
               break;
           }
           else if (cmd.equals("등록")){
               System.out.printf("명언 : ");
               String wiseSaying= scanner.nextLine();
               System.out.printf("작가 : ");
               String author= scanner.nextLine();
               number ++;
               System.out.printf("%d번 명언이 등록되었습니다.%n" , number);
           }
       }
    }
}
