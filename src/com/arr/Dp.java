package com.arr;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Dp {

	// The url of the website. This is just an example
	private static final String webSiteURL = "https://www.google.com/search?q=salesforce&source=lnms&tbm=isch&sa=X&ved=0ahUKEwjk4PuG4ezfAhUENo8KHYRQBkMQ_AUIDygC&biw=1600&bih=789";
	public static int xxa = 0;
	// The path of the folder that you want to save the images to
	private static final String folderPath = "D://df";

	public static void main(String[] args) {

		try {
			Response response = Jsoup.connect(webSiteURL).ignoreContentType(true)
					.userAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:25.0) Gecko/20100101 Firefox/25.0")
					.referrer("http://www.google.com").timeout(12000).followRedirects(true).execute();
			// Connect to the website and get the html
			Document doc = response.parse();

			// Get all elements with img tag ,
			Elements img = doc.getElementsByTag("img");

			for (Element el : img) {

				// for each element get the srs url
				String src = el.absUrl("src");

				// System.out.println("Image Found!");
				// System.out.println(el.absUrl("src"));

				if (src.length() > 10)
					System.out.println("src attribute is :" + src);
				// getImages(src);

			}

		} catch (IOException ex) {
			System.err.println("There was an error");
			Logger.getLogger(Dp.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	private static void getImages(String src) throws IOException {

		String folder = null;

		// Exctract the name of the image from the src attribute
		int indexname = src.lastIndexOf("/");

		if (indexname == src.length()) {
			src = src.substring(1, indexname);
		}

		indexname = src.lastIndexOf("/");
		// String name = String.valueOf(xxa++);
		String name = src.substring(indexname, src.length());
		String as = name.substring(name.length() - 5, name.length());

		xxa++;

		// Open a URL Stream
		URL url = new URL(src);
		InputStream in = url.openStream();

		OutputStream out = new BufferedOutputStream(new FileOutputStream(folderPath + as));
		System.out.println(as);
		for (int b; (b = in.read()) != -1;) {
			out.write(b);
		}
		out.close();
		in.close();

	}
}