package com.alice.alpaca.uiaanna;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Alice on 12/7/2559.
 */
public class Userlogin extends AppCompatActivity {
    Button btnuserlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userlogin);
        btnuserlogin = (Button) findViewById(R.id.userloginbtn);

        btnuserlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Userlogin.this, Userlist.class);
                startActivity(intent);
            }
        });
    }
}