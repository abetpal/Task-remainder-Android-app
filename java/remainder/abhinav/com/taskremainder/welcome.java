package remainder.abhinav.com.taskremainder;


/**
 * Created by DEADPOOL on 6/28/2017.
 */

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class welcome extends Activity {
    MediaPlayer ourSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.welcome);
        ourSong= MediaPlayer.create(welcome.this,R.raw.call);
        ourSong.start();
        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent openStartingPoint = new Intent("remainder.abhinav.com.taskremainder.STARTINGPOINT");
                    startActivity(openStartingPoint);

                }
            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        ourSong.release();
        finish();
    }
}
