package remainder.abhinav.com.taskremainder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


/**
 * Created by DEADPOOL on 6/28/2017.
 */

public class add_event_see_event extends Activity {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);

        setContentView(R.layout.addevent);
        b1=(Button) findViewById(R.id.imagebutton);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(add_event_see_event.this, AlarmMe.class);
                startActivity(myIntent);

            }
        });
    }
}
