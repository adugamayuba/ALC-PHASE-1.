package com.example.alcphase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MyProfile extends AppCompatActivity {



    ImageView mback_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        mback_profile = findViewById(R.id.back_profile);

        mback_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mback_profile = new Intent();
                mback_profile.setClass(MyProfile.this, MainActivity.class);
                startActivity(mback_profile);
                finish();

            }
        });



    }
}
