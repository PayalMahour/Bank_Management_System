/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmanagement;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Kashmir Singh
 */
public class DateToday 
{
    public static String day;
    public static String month;
    public static String monthName;
    public static String year;
    
    public static String getDate()
    {
        GregorianCalendar date = new GregorianCalendar();
       int dd=date.get(Calendar.DAY_OF_MONTH);
        int mm=date.get(Calendar.MONTH)+1;
        int yy=date.get(Calendar.YEAR);
       
        day = String.valueOf(dd);
        String month=String.valueOf(mm);
        year=String.valueOf(yy);
        
        switch(mm)
        {
            case 1:
                monthName="January";
                break;
            case 2:
                monthName="February";
                break;
            case 3:
                monthName="March";
                break;
            case 4:
                monthName="April";
                break;
            case 5:
                monthName="May";
                break;
                
            case 6:
                monthName="June";
                break;
             case 7:
                monthName="July";
                break;
             case 8:
                monthName="August";
                break;
             case 9:
                monthName="September";
                break;
             case 10:
                monthName="October";
                break;
             case 11:
                monthName="November";
                break;
             case 12:
                monthName="December";
                break;      
                
        }
        return(year+"-"+month+"-"+day);
    }
}
