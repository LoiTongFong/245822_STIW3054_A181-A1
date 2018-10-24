
package com.mycompany.rta1;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class wikiData {
  
  public static List<Data> data = new ArrayList();
  public static void scraper() {
      try {
        Document doc = Jsoup.connect("https://ms.wikipedia.org/wiki/Malaysia").get();
        Element table = doc.select("h2:contains(Trivia)+[class=\"wikitable\"]").first();
        Elements rows = table.select("tr");
   
        for (Element tr : rows){
            String th = tr.select("th").text(); 
	    String td = tr.select("td").text();  
            data.add(new Data(th,td));
    }
      } catch (IOException e) {
         e.printStackTrace(); 
      }
     
  }
   
}
