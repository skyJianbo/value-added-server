package cn.sh.ideal.valueaddedserver.common.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


@SuppressWarnings("unchecked")
public class DateUtil {
	/**
	 * getDateStr get a string with format YYYY-MM-DD from a Date object
	 * 
	 * @param date
	 *            date
	 * @return String
	 */
	static public String getDateStr(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return format.format(date);
	}

	static public String getYear(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy");
		return format.format(date);
	}
	
	static public String getMonth(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("MM");
		return format.format(date);
	}

	static public String getDateStrC(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
		return format.format(date);
	}

	static public String getDateStrCompact(Date date) {
		if (date == null)
			return "";
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		String str = format.format(date);
		return str;
	}
	
	static public String getDateTime(String aMask, Date aDate) {
		SimpleDateFormat df = null;
		String returnValue = "";

		if (aDate == null) {
			return "";
		} else {
			df = new SimpleDateFormat(aMask);
			returnValue = df.format(aDate);
		}

		return (returnValue);
	}

	/**
	 * getDateStr get a string with format YYYY-MM-DD HH:mm:ss from a Date
	 * object
	 * 
	 * @param date
	 *            date
	 * @return String
	 */
	static public String getDateTimeStr(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return format.format(date);
	}

	static public String getDateTimeStrC(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		return format.format(date);
	}

	public static String getCurDateStr(String pattern) {
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		return format.format(new Date());
	}

	/**
	 * Parses text in 'YYYY-MM-DD' format to produce a date.
	 * 
	 * @param s
	 *            the text
	 * @return Date
	 * @throws ParseException
	 */
	static public Date parseDate(String s) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return format.parse(s);
	}

	static public Date parseDateC(String s) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
		return format.parse(s);
	}

	/**
	 * Parses text in 'YYYY-MM-DD' format to produce a date.
	 * 
	 * @param s
	 *            the text
	 * @return Date
	 * @throws ParseException
	 */
	static public Date parseDateTime(String s) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return format.parse(s);
	}

	static public Date parseDateTimeC(String s) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		return format.parse(s);
	}

	/**
	 * Parses text in 'HH:mm:ss' format to produce a time.
	 * 
	 * @param s
	 *            the text
	 * @return Date
	 * @throws ParseException
	 */
	static public Date parseTime(String s) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		return format.parse(s);
	}

	static public Date parseTimeC(String s) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("HH时mm分ss秒");
		return format.parse(s);
	}

	static public int yearOfDate(Date s) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String d = format.format(s);
		return Integer.parseInt(d.substring(0, 4));
	}

	static public int monthOfDate(Date s) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String d = format.format(s);
		return Integer.parseInt(d.substring(5, 7));
	}

	static public int dayOfDate(Date s) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String d = format.format(s);
		return Integer.parseInt(d.substring(8, 10));
	}

	static public String getDateTimeStr(java.sql.Date date, double time) {
		int year = date.getYear() + 1900;
		int month = date.getMonth() + 1;
		int day = date.getDate();
		String dateStr = year + "-" + month + "-" + day;
		Double d = new Double(time);
		String timeStr = String.valueOf(d.intValue()) + ":00:00";

		return dateStr + " " + timeStr;
	}

	/**
	 * Get the total month from two date.
	 * 
	 * @param sd
	 *            the start date
	 * @param ed
	 *            the end date
	 * @return int month form the start to end date
	 * @throws ParseException
	 */
	static public int diffDateM(Date sd, Date ed) throws ParseException {
		return (ed.getYear() - sd.getYear()) * 12 + ed.getMonth() - sd.getMonth() + 1;
	}

	static public int diffDateD(Date sd, Date ed) throws ParseException {
		return Math.round((ed.getTime() - sd.getTime()) / 86400000) + 1;
	}

	static public int diffDateM(int sym, int eym) throws ParseException {
		return (Math.round(eym / 100) - Math.round(sym / 100)) * 12 + (eym % 100 - sym % 100) + 1;
	}

	static public java.sql.Date getNextMonthFirstDate(java.sql.Date date) throws ParseException {
		Calendar scalendar = new GregorianCalendar();
		scalendar.setTime(date);
		scalendar.add(Calendar.MONTH, 1);
		scalendar.set(Calendar.DATE, 1);
		return new java.sql.Date(scalendar.getTime().getTime());
	}

	static public java.sql.Date getFrontDateByDayCount(java.sql.Date date, int dayCount) throws ParseException {
		Calendar scalendar = new GregorianCalendar();
		scalendar.setTime(date);
		scalendar.add(Calendar.DATE, -dayCount);
		return new java.sql.Date(scalendar.getTime().getTime());
	}
	
	static public String getAddDayToString(String str_day, int dayCount) throws ParseException {
		Date date = parseDate(str_day);
		Calendar scalendar = new GregorianCalendar();
		scalendar.setTime(date);
		scalendar.add(Calendar.DATE, +dayCount);
		return getDateStr(new Date(scalendar.getTime().getTime()));
	}

	/**
	 * Get first day of the month.
	 * 
	 * @param year
	 *            the year
	 * @param month
	 *            the month
	 * @return Date first day of the month.
	 * @throws ParseException
	 */
	static public Date getFirstDay(String year, String month) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return format.parse(year + "-" + month + "-1");
	}

	static public Date getFirstDay(int year, int month) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return format.parse(year + "-" + month + "-1");
	}

	static public Date getLastDay(String year, String month) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse(year + "-" + month + "-1");

		Calendar scalendar = new GregorianCalendar();
		scalendar.setTime(date);
		scalendar.add(Calendar.MONTH, 1);
		scalendar.add(Calendar.DATE, -1);
		date = scalendar.getTime();
		return date;
	}

	static public Date getLastDay(int year, int month) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse(year + "-" + month + "-1");

		Calendar scalendar = new GregorianCalendar();
		scalendar.setTime(date);
		scalendar.add(Calendar.MONTH, 1);
		scalendar.add(Calendar.DATE, -1);
		date = scalendar.getTime();
		return date;
	}

	/**
	 * getToday get todat string with format YYYY-MM-DD from a Date object
	 * 
	 * @return String
	 */

	static public String getTodayStr() throws ParseException {
		Calendar calendar = Calendar.getInstance();
		return getDateStr(calendar.getTime());
	}

	static public Date getToday() throws ParseException {
		return new Date(System.currentTimeMillis());
	}

	static public String getTodayAndTime() {
		return new Timestamp(System.currentTimeMillis()).toString();
	}

	static public String getTodayC() throws ParseException {
		Calendar calendar = Calendar.getInstance();
		return getDateStrC(calendar.getTime());
	}

	static public int getThisYearMonth() throws ParseException {
		Date today = Calendar.getInstance().getTime();
		return (today.getYear() + 1900) * 100 + today.getMonth() + 1;
	}

	static public int getYearMonth(Date date) throws ParseException {
		return (date.getYear() + 1900) * 100 + date.getMonth() + 1;
	}

	// 获取相隔月数
	static public long getDistinceMonth(String beforedate, String afterdate) throws ParseException {
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
		long monthCount = 0;
		try {
			Date d1 = d.parse(beforedate);
			Date d2 = d.parse(afterdate);

			monthCount = (d2.getYear() - d1.getYear()) * 12 + d2.getMonth() - d1.getMonth();
			// dayCount = (d2.getTime()-d1.getTime())/(30*24*60*60*1000);

		} catch (ParseException e) {
			System.out.println("Date parse error!");
			// throw e;
		}
		return monthCount;
	}

	// 获取相隔天数
	static public long getDistinceDay(String beforedate, String afterdate) throws ParseException {
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
		long dayCount = 0;
		try {
			Date d1 = d.parse(beforedate);
			Date d2 = d.parse(afterdate);

			dayCount = (d2.getTime() - d1.getTime()) / (24 * 60 * 60 * 1000);

		} catch (ParseException e) {
			System.out.println("Date parse error!");
			// throw e;
		}
		return dayCount;
	}

	// 获取相隔天数
	static public long getDistinceDay(Date beforedate, Date afterdate) throws ParseException {
		long dayCount = 0;

		try {
			dayCount = (afterdate.getTime() - beforedate.getTime()) / (24 * 60 * 60 * 1000);

		} catch (Exception e) {
			// System.out.println("Date parse error!");
			// // throw e;
		}
		return dayCount;
	}

	static public long getDistinceDay(java.sql.Date beforedate, java.sql.Date afterdate) throws ParseException {
		long dayCount = 0;

		try {
			dayCount = (afterdate.getTime() - beforedate.getTime()) / (24 * 60 * 60 * 1000);

		} catch (Exception e) {
			// System.out.println("Date parse error!");
			// // throw e;
		}
		return dayCount;
	}

	// 获取相隔天数
	static public long getDistinceDay(String beforedate) throws ParseException {
		return getDistinceDay(beforedate, getTodayStr());
	}

	// 获取相隔时间数
	static public long getDistinceTime(String beforeDateTime, String afterDateTime) throws ParseException {
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		long timeCount = 0;
		try {
			Date d1 = d.parse(beforeDateTime);
			Date d2 = d.parse(afterDateTime);

			timeCount = (d2.getTime() - d1.getTime()) / (60 * 60 * 1000);

		} catch (ParseException e) {
			System.out.println("Date parse error!");
			throw e;
		}
		return timeCount;
	}

	// 获取相隔时间数
	static public long getDistinceTime(String beforeDateTime) throws ParseException {
		return getDistinceTime(beforeDateTime, new Timestamp(System.currentTimeMillis()).toLocaleString());
	}

	// 获取相隔分钟数
	static public long getDistinceMinute(String beforeDateTime, String afterDateTime) throws ParseException {
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		long timeCount = 0;
		try {
			Date d1 = d.parse(beforeDateTime);
			Date d2 = d.parse(afterDateTime);
			timeCount = (d2.getTime() - d1.getTime()) / (60 * 1000);

		} catch (ParseException e) {
			System.out.println("Date parse error!");
			throw e;
		}
		return timeCount;
	}
	//取当前时间多少分钟之后的时间
	public static Date getAfterMinute(int min){
		Calendar c3 = Calendar.getInstance();
		c3.add(Calendar.MINUTE, min);
		return c3.getTime();
		
	}

	public static String getDateTimeStrNum(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		return format.format(date);
	}
	
	static public String getDateInMonthFormat3(String str){
		String resultDate = str;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("jan", "01");
		map.put("feb", "02");
		map.put("mar", "03");
		map.put("apr", "04");
		map.put("may", "05");
		map.put("jun", "06");
		map.put("jul", "07");
		map.put("aug", "08");
		map.put("sep", "09");
		map.put("oct", "10");
		map.put("nov", "11");
		map.put("dec", "12");
		
		if(str != null){
			String month = str.substring(0, 3).trim();
			String strs[] = (str.substring(3, str.length())).split(",");
			String day = strs[0].trim();
			if(day.length()< 2){
				day = "0"+day;
			}
			String year = strs[1].trim();
			resultDate = year +"-"+ map.get(month.toLowerCase())+"-"+day;
		}
		return resultDate;
		
	}
	/**
	 *根据时间获取月份
	 * @param str
	 * @return
	 */
	static public String getDateInMonth(String str){
		String result=null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("jan", "01");
		map.put("feb", "02");
		map.put("mar", "03");
		map.put("apr", "04");
		map.put("may", "05");
		map.put("jun", "06");
		map.put("jul", "07");
		map.put("aug", "08");
		map.put("sep", "09");
		map.put("oct", "10");
		map.put("nov", "11");
		map.put("dec", "12");
		
		if(str != null){
			String month = str.substring(0, 3).trim().toLowerCase();
			result=(String)map.get(month);
		}
		return result;
	}
	
}
