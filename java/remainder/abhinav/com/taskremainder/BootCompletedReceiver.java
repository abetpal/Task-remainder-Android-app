
/**
 * Created by DEADPOOL on 7/13/2017.
 */

package remainder.abhinav.com.taskremainder;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.widget.Toast;
import android.os.Bundle;

public class BootCompletedReceiver extends BroadcastReceiver
{
  @RequiresApi(api = Build.VERSION_CODES.KITKAT)
  @Override
  public void onReceive(Context context, Intent intent)
  {

    new AlarmListAdapter(context);
  }
}

