package campaign;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateSetting {
	public int dd,mm,yy;
	public int diff;
	public String date;
	public DateSetting checkD(String tabl)
	{
		DateSetting ds = new DateSetting();
		try
		{
		AdminDAO dao = new AdminDAO();
		String date = dao.showDate(tabl);
		
		LocalDate ld = LocalDate.now();
		ds.dd = Integer.parseInt(date.substring(0, 2));
		ds.mm = Integer.parseInt(date.substring(3, 5));
		ds.yy = Integer.parseInt(date.substring(6, 10));
		LocalDate ed = LocalDate.of(ds.yy, ds.mm, ds.dd);
		ds.diff = (int)ChronoUnit.DAYS.between(ld, ed);
		ds.date = date;
		return ds;
		}catch(Exception e)
		{
			return ds;
		}
	}
}
