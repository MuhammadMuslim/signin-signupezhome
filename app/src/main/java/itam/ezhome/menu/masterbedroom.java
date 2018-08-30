package itam.ezhome.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import itam.ezhome.R;

public class masterbedroom extends AppCompatActivity {
    private Button button;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masterbedroom);

        button = (Button) findViewById(R.id.button);
        button1 = (Button) findViewById(R.id.btn_off);


    }

}

