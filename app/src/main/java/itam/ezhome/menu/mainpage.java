package itam.ezhome.menu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import itam.ezhome.R;
import itam.ezhome.user_session.UserLoginActivity;

public class mainpage extends AppCompatActivity {
    private Button buttonroom1;
    private Button buttonroom2;
    private Button buttonroom3;
    private Button buttonroom4;
    private Button buttonroom5;
    Button LogOut;
    TextView EmailShow;
    String EmailHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);


        LogOut = (Button)findViewById(R.id.button);
        EmailShow = (TextView)findViewById(R.id.EmailShow);


        Intent intent = getIntent();
        EmailHolder = intent.getStringExtra(UserLoginActivity.UserEmail);
        EmailShow.setText(EmailHolder);


        LogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

                Intent intent = new Intent(mainpage.this, UserLoginActivity.class);

                startActivity(intent);

                Toast.makeText(mainpage.this, "Log Out Successfully", Toast.LENGTH_LONG).show();


            }
        });

        buttonroom1 = (Button) findViewById(R.id.buttonroom1);
        buttonroom2 = (Button) findViewById(R.id.buttonroom2);
        buttonroom3 = (Button) findViewById(R.id.buttonroom3);
        buttonroom4 = (Button) findViewById(R.id.buttonroom4);
        buttonroom5 = (Button) findViewById(R.id.buttonroom5);

        buttonroom1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openMasterBedroom();
            }
        });

        buttonroom2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openReadingRoom();
            }
        });

        buttonroom3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openGuestRoom();
            }
        });

        buttonroom4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openKitchen();
            }
        });

        buttonroom5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openLivingRoom();
            }
        });
    }

    public void openMasterBedroom() {
        Intent intent = new Intent(mainpage.this, masterbedroom.class);
        startActivity(intent);
    }

    public void openReadingRoom() {
        Intent intent = new Intent(mainpage.this, readingroom.class);
        startActivity(intent);
    }

    public void openGuestRoom() {
        Intent intent = new Intent(mainpage.this, guestroom.class);
        startActivity(intent);
    }

    public void openKitchen() {
        Intent intent = new Intent(mainpage.this, kitchen.class);
        startActivity(intent);
    }

    public void openLivingRoom() {
        Intent intent = new Intent(mainpage.this, livingroom.class);
        startActivity(intent);
    }



}
