package programming_challenges;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class natrij{
	public static void main(String[] args) {
			Kattio io = new Kattio(System.in);
			SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
			
			String start = io.getWord();
			String end = io.getWord();
			
			try {
				Date dStart = format.parse(start);
				Date dEnd = format.parse(end);
				
				//reorder
				if (dEnd.before(dStart)) dEnd.setTime(dEnd.getTime() + TimeUnit.DAYS.toMillis(1)); 
				
				//get difference
				long diff = dEnd.getTime() - dStart.getTime();
				
				//Convert 
				long seconds = diff / 1000 % 60;
				long minutes = diff / (60 * 1000) % 60;
				long hours = diff / (60 * 60 * 1000) % 24;
				
				long[] longTimes = {hours, minutes, seconds};
				String[] stringTimes = new String[3];
				
				
				for(int i = 0; i < 3; i++){
					if (longTimes[i] < 10) stringTimes[i] = "0" + longTimes[i]; 
					else stringTimes[i] = longTimes[i] + "";
				}
				
				if (diff == 0) System.out.println("24:00:00"); //if the same
				else System.out.println(stringTimes[0] + ":" + stringTimes[1] + ":" + stringTimes[2]);
				
			}catch (ParseException e){	
			}
			io.close();
		}
}



