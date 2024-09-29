package Assignment;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class getRequiredDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date dateobj = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		String date = sdf.format(dateobj);
		
		//System.out.println(date);
		
		getRequiredDate dobj = new getRequiredDate();
		dobj.getRequireddateYYYYMMDD(30);
		
		
	}
	
	public String getRequireddateYYYYMMDD(int days)
	{

		Date dateobj = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		String date = sdf.format(dateobj);
		Calendar cal =sdf.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, days);
		date = sdf.format(cal.getTime());
		return date;
		
	}

}
