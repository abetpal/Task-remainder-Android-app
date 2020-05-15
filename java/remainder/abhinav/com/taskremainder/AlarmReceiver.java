
/**
 * Created by DEADPOOL on 7/18/2017.
 */
package remainder.abhinav.com.taskremainder;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AlarmReceiver extends BroadcastReceiver
{
  private final String TAG = "TaskRemainder";

  @Override
  public void onReceive(Context context, Intent intent)
  {
    Intent newIntent = new Intent(context, AlarmNotification.class);
    Alarm alarm = new Alarm(context);

    alarm.fromIntent(intent);
    alarm.toIntent(newIntent);
    newIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_SINGLE_TOP);

    Log.i(TAG, "AlarmReceiver.onReceive('" + alarm.getTitle() + "')");

    context.startActivity(newIntent);
  }
}

