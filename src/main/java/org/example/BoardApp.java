package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardApp {
    Scanner scan = new Scanner(System.in);
    ArrayList<Article> ArticleList = new ArrayList<>();
    public void run() {

        while (true) {

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

                Article article = new Article(title, body, 0);

                ArticleList.add(article);
                System.out.println("게시물이 등록되었습니다.");
            }
            else if (cmd.equals("list")){
                System.out.println("==================");

//                for(int i = 0; i < ArticleList.size(); i++){
//                    Article article = ArticleList.get(i);
//
//                    System.out.print("제목 : " + article.getTitle()+"\n");
//                    System.out.print("내용 : " + article.getBody()+"\n");
//
//                    System.out.println("==================");
//                }
                for(Article article : ArticleList){
                    System.out.print("제목 : " + article.getTitle()+"\n");
                    System.out.print("내용 : " + article.getBody()+"\n");
                    System.out.println("==================");
                }
            }
            else if (cmd.equals("update")){
                System.out.print("수정할 게시물 번호 : ");
                int InputId = Integer.parseInt(scan.nextLine());
                int index = indexNumFind(InputId);

                if(index == -1){
                    System.out.println("없는 게시물입니다.");
                    return;
                }

                System.out.print("새로운 제목을 입력해주세요 : ");
                String newTitle = scan.nextLine();

                System.out.print("새로운 내용을 입력해주세요 : ");
                String newBody = scan.nextLine();

                Article target = ArticleList.get(index);
                target.setTitle(newTitle);
                target.setBody(newBody);
                System.out.println(InputId + "번 게시물이 수정되었습니다." );
            }
        }
    }
    public int indexNumFind(int id){
        int index = -1;
        for (int i = 0; i < ArticleList.size(); i++){
            Article article = ArticleList.get(i);

            if(article.getIndex() == index){
                return i;
            }
        }
        return -1;
    }
}
