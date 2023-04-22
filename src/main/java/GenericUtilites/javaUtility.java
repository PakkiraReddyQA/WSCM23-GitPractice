package GenericUtilites;

import java.util.Date;

public class javaUtility {
	public String getSystemDateformat()
	{
		Date d = new Date();
		String darr[]=d.toString().split(" ");
		String date = darr[2];
		String month = darr[1];
		String year = darr[5];
		String time = darr[3].replace(":", "-");
		String dateFormat=date+"_"+month+" "+year+" "+time;
		return dateFormat;
		
	}
}
