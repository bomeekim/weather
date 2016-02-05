package ah.hathi.simpleweather;

import android.app.Activity;
import android.content.SharedPreferences;

public class DaysPreference {

	SharedPreferences prefs;

	public DaysPreference(Activity activity){
		prefs = activity.getPreferences(Activity.MODE_PRIVATE);
	}
	
	String getDays(){
		return prefs.getString("days", "7");
	}
	
	void setDays(String days){
		prefs.edit().putString("days", days).commit();
	}
	
}
