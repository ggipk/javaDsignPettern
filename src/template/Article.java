package template;

import java.util.ArrayList;

public class Article {
    private String title;
    private ArrayList<String> content;
    private String footer;

    public Article() {
    }

    public Article(String title, ArrayList<String> content, String footer) {
        this.title = title;
        this.content = content;
        this.footer = footer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getContent() {
        return content;
    }

    public void setContent(ArrayList<String> content) {
        this.content = content;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }
}
