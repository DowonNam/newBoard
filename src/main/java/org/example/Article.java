package org.example;

public class Article {
    String title;
    String body;
    int index;
    public Article(String title, String body, int index){
        // this 는 앞에 붙여야 함
        this.title = title;
        this.body = body;
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
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
