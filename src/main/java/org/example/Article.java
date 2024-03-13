package org.example;

public class Article {
    String title;
    String body;
    public Article(String title, String body){
        // this 는 앞에 붙여야 함
        this.title = title;
        this.body = body;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
