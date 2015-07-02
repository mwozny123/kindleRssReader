package pl.mwozny123.kindlerssreader;

import java.net.URL;

import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

public class Test {

	public static void main(String[] args) {
		 try {
			 String url = "http://www.tvn24.pl/najnowsze.xml";
             URL feedUrl = new URL(url);

             SyndFeedInput input = new SyndFeedInput();
             SyndFeed feed = input.build(new XmlReader(feedUrl));

             System.out.println(feed);

         }
         catch (Exception ex) {
             ex.printStackTrace();
             System.out.println("ERROR: "+ex.getMessage());
         }
	}

}
