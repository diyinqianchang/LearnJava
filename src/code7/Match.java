package code7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Match {

	public static void main(String[] args) {
		
		String string = "求购一本《疯狂的Java讲义》，尽快联系我13500006666"+
		"交朋友，电话好好13611125565"+
		"出售二手电脑，联系方式15899903312";
		Matcher matcher = Pattern.compile("((13\\d)|(15\\d))\\d{8}").matcher(string);
		while(matcher.find()){
			System.out.println(matcher.group());
		}
		
		String regStr = "Java is very easy!";
		System.out.println("目标字符串是:"+regStr);
		Matcher matcher2 = Pattern.compile("\\w+").matcher(regStr);
		while(matcher2.find()){
			System.out.println(matcher2.group());
		}
		System.out.println(matcher2);

	}

}
