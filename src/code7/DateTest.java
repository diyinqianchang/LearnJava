package code7;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d1 = new Date();
		System.out.println(d1);
		
		Calendar calendar = Calendar.getInstance();
		
		Date date = calendar.getTime();
		System.out.println(date);
		System.out.println(calendar.get(Calendar.YEAR));
		
		Locale[] locallist = Locale.getAvailableLocales();
		for (int i = 0; i < locallist.length; i++) {
			System.out.println(locallist[i].getDisplayCountry()+"="+locallist[i].getCountry());
		}
		

	}

}
