package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
	/**
	 * validate email
	 */
	public boolean vEmail(String email) {
		String regex = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(email);
		return m.matches();
	}

	/**
	 * validate phone
	 */
	public boolean vPhone(String phone) {
		String regex = "^[0-9].*";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(phone);
		return m.matches();
	}

}
