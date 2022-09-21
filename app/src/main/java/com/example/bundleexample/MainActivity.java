package com.example.bundleexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //    Declaring Variables here
    public EditText et_title;
    public Button bt_openSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et_title = findViewById(R.id.tx_firstScreen);
        bt_openSecond = findViewById(R.id.bt_sendButton);
    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onResume() {
        super.onResume();
//        implementing button click here
        bt_openSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                implement intent here to reach secondActivity
                Bundle bb = new Bundle();
                bb.putString("key", et_title.getText().toString() );
                Intent i = new Intent(MainActivity.this, secondscreen.class);
                i.putExtras(bb);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();

    }

    @Override
    protected void onStop() {
        super.onStop();

    }

    @Override
    protected void onRestart() {
        super.onRestart();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}