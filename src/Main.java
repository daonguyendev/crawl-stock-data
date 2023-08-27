import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
//    private final static String dataPriceStock = "https://finance.vietstock.vn";
    private final static String dataPriceStock = "https://dstock.vndirect.com.vn/";

    public static List<String> getDataStock( ) throws IOException {
        List<String> lyrics= new ArrayList<>();

        Document doc = Jsoup.connect(dataPriceStock).get();
        String title = doc.title();
        System.out.println(title);
//        Element table = doc.getElementById("top10share-content");
//        Elements table = doc.select("#top10share-content");
        Elements table = doc.select("div.box-topten__table");
//        Element table = doc.getElementsByClass("box-topten__table").get(0);
        System.out.println("Debug");
//        for (Node e: table.childNodes().get(1).childNodes()) {
//            var ten = e.childNodes().get(1);
//            var gia = e.childNodes().get(3);
//            //gia = e.childNodes().get(3);
//            if (e instanceof TextNode) {
//                lyrics.add(((TextNode)e).getWholeText());
//            }
//        }
        return lyrics;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(getDataStock());
    }
}