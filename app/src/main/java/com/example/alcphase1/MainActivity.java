package com.example.alcphase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mabout_alc, mmy_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mabout_alc = findViewById(R.id.about_alc);
        mmy_profile = findViewById(R.id.my_profile);


        mabout_alc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent let_go_to_aboutALC = new Intent();
                let_go_to_aboutALC.setClass(MainActivity.this, About_ALC.class);
                startActivity(let_go_to_aboutALC);


            }
        });



        mmy_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent let_go_to_myprofile = new Intent();
                let_go_to_myprofile.setClass(MainActivity.this, MyProfile.class);
                startActivity(let_go_to_myprofile);


            }
        });






    }
}
