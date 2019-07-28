package urllearn;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.RuleBasedCollator;

public class URLDecoderTest {

	public static void main(String[] args) throws UnsupportedEncodingException, MalformedURLException {
		// TODO Auto-generated method stub
		
		String keyWord = URLDecoder.decode("%E7%96%AF%E7%8B%82java", "utf-8");
		System.out.println(keyWord);
		String urlStr = URLEncoder.encode("疯狂Java讲义", "GBK");
		System.out.println(urlStr);
		
		URL url = new URL("http://crazyit.org/index.php/word");
       
		System.out.println(url.getQuery());
		System.out.println(url.getHost());
		System.out.println(url.getPath());
		System.out.println(url.getProtocol());
		
		

	}

}
