package lesson17.articles;

import java.io.*;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Model {
    private Map<String, Article> articles;
    //  {qqq: {title: qqq, author: www, ...}, aaa: {title: aaa, author: sss, ...}}
    private String dbName;

    public Model() {
        this.dbName = "db.txt";
        this.articles = loadData(); // new LinkedHashMap<>();
    }

    public void addArticle(Map dictArticle){
        Article article = new Article(dictArticle);
        articles.put((String) dictArticle.get("название"), article);
//        System.out.println(articles);
    }

    public Collection getAllArticles(){
        return articles.values();
    }

    public Map getSingleArticle(String userTitle){
        Article article = articles.get(userTitle);
        Map<String, String> dictArticle = new LinkedHashMap<>();
        dictArticle.put("название", article.getTitle());
        dictArticle.put("автор", article.getAuthor());
        dictArticle.put("количество страниц", article.getPage());
        dictArticle.put("описание", article.getDescription());
        return dictArticle;
    }

    public Article removeArticle(String userTitle){
        return articles.remove(userTitle);
    }

    public void saveData(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dbName))){
            oos.writeObject(articles);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public LinkedHashMap loadData(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dbName))){
            return (LinkedHashMap) ois.readObject();
        } catch (Exception ex){
            return new LinkedHashMap<>();
        }
    }
}

class Article implements Serializable {
    private String title;
    private String author;
    private String page;
    private String description;

    public Article(Map dictArticle) {
        this.title = (String) dictArticle.get("название");
        this.author = (String) dictArticle.get("автора");;
        this.page = (String) dictArticle.get("количество страниц");;
        this.description = (String) dictArticle.get("описание");;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPage() {
        return page;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return title + " (" + author + ')';
    }
}
