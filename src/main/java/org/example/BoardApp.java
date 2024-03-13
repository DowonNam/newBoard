package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardApp {
    public void run() {

        while (true) {
            Scanner scan = new Scanner(System.in);
            ArrayList<Article> ArticleList = new ArrayList<>();

            System.out.print("명령어 : ");
            String cmd = scan.nextLine();

            if (cmd.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else if (cmd.equals("add")) {
                System.out.print("게시물 제목을 입력해주세요. : ");
                String title = scan.nextLine();

                System.out.print("게시물 내용을 입력해주세요. : ");
                String body = scan.nextLine();

                Article article = new Article(title, body);

                ArticleList.add(article);
                System.out.println("게시물이 등록되었습니다.");
            }

        }
    }
}
