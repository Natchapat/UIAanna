package com.alice.alpaca.uiaanna;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Alice on 12/7/2559.
 */
public class Spklogin  extends AppCompatActivity {
    Button btnspklogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spklogin);


        btnspklogin = (Button) findViewById(R.id.spkloginbtn);

        btnspklogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Spklogin.this, SpkList.class);
                startActivity(intent);
            }
        });
    }
}
