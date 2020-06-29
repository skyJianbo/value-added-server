package cn.sh.ideal.valueaddedserver.common.util;

import java.security.MessageDigest;

public class MD5 {
	public String error = null;

	/*
	public static void main(String[] args) {
		try {
			MD5 md = new MD5();
			System.out.println(md.encrypt("123456"));

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	*/

	public String encrypt(String x) {
		try {
			MessageDigest m = MessageDigest.getInstance("MD5");
			m.update(x.getBytes("UTF8"));

			byte s[] = m.digest();
			//System.out.println("array "+new String(s));

			String result = "";
			for (int i = 0; i < s.length; i++) {
				result += Integer.toHexString((0x000000FF & s[i]) | 0xFFFFFF00)
						.substring(6);

			}
			return result;
		} catch (Exception e) {
			this.error = e.toString();
			return null;
		}
	}

	

}
