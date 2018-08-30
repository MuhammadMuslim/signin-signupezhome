package itam.ezhome.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import itam.ezhome.R;

public class guestroom extends AppCompatActivity {
    private Button button;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guestroom);

        button = (Button) findViewById(R.id.btn_on);
        button1 = (Button) findViewById(R.id.btn_off);


    }

}


