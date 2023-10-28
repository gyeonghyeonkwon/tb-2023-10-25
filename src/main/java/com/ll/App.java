package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class App {
    void run() {
        List<Inventory> inventoryList = new ArrayList<>(); // 객체 를 리스트에 저장 하겠다는 정의
        int number = 0;
        System.out.println("==명언 앱==");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("명령) ");
            String cmd = scanner.nextLine();
            if (cmd.equals("종료")) { //참이 면 실행
                break;
            } else if (cmd.equals("등록")) { // equals 메소드로 입력된 값과 비교 , 참이면 실행
                System.out.printf("명언 : ");
                String wiseSaying = scanner.nextLine();
                System.out.printf("작가 : ");
                String author = scanner.nextLine();
                number++; // number 1증가
                System.out.printf("%d번 명언이 등록되었습니다.%n", number); // number 증가
                Inventory inventory = new Inventory(number, wiseSaying, author); //입력받았던 문자열을 객체 에 저장한다.
                inventoryList.add(inventory); // 객체를 리스트에 저장한다.
            } else if (cmd.equals("목록")) { //참이면 실행

                System.out.println("번호 / 작가 / 명언");
                System.out.println("-------------------");
                for (int i = inventoryList.size() - 1; i >= 0; i--) { // 마지막에 입력했던 인덱스 를 선수로 출력
                    Inventory inventory = inventoryList.get(i);
                    System.out.printf("%d %s %s %n", inventory.number, inventory.wiseSaying, inventory.author); //리스트에 저장되어있는 객체 들을 출력한다.
                }

            }
        }

    }
}
