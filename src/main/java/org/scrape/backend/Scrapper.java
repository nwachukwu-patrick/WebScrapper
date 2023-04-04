package org.scrape.backend;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Scrapper {
    @SuppressWarnings("unchecked")
    Document html = null;
    public Scrapper(String url) {
try{

    this.html = Jsoup.connect(url).get();

}catch (Exception ex){
//    System.out.println(ex.getMessage());
}
    }


    public String  getTitle(){
        return this.html.title();
    }
    public List <String> getTags(String tagName){
        LinkedList <String> tags = new LinkedList<>();
        tags.add(this.html.getElementsByTag(tagName).toString());
        return tags;

    }
    public List<List> getAttr(String TagName, String attr){
        Elements attri = new Elements();
        LinkedList <List> attrValue = new LinkedList<>();
        attrValue.add(this.html.getElementsByTag("a").eachAttr("id"));
        return attrValue;
    }
    public  void test(){
        System.out.println(this.html.getElementsByTag("a").eachAttr("id"));
    }
    public List<String> getTagText(String tag){
        LinkedList <String> text = new LinkedList<>();
        this.html.getElementsByTag(tag).forEach(n ->text.add(n.text()));
        return  text;
    }
    public  void createXml(){
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            org.w3c.dom.Document doc = db.newDocument();
//            try(FileReader reader = new )

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scrapper scrapper = new Scrapper("http://localhost/a.html");
//        System.out.println(scrapper.getTagText("a"));
        scrapper.getTags("div").forEach(n-> {
            if(n.isEmpty() == false)
                System.out.println(n);
        });
//        scrapper.test();
    }

}
