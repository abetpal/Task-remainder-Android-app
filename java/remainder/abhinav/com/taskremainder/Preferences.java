
/**
 * Created by DEADPOOL on 8/11/2017.
 */

package remainder.abhinav.com.taskremainder;
 
import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceActivity;
 
public class Preferences extends PreferenceActivity
{
  @Override
  protected void onCreate(Bundle bundle)
  {
    super.onCreate(bundle);
    addPreferencesFromResource(R.xml.preferences);
  }
}

