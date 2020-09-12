package com.example.activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("name","芜湖");
//                startActivity(intent);
                startActivityForResult(intent,0);

//                Intent intent = new Intent();
//                intent.setClass(MainActivity.this,MainActivity2.class);
//                startActivity(intent);

//                Intent intent = new Intent();
//                intent.setClassName(MainActivity.this,"com.example.activity.MainActivity2");
//                startActivity(intent);

//                Intent intent = new Intent();
//                intent.setAction("android.intent.action.MAIN1");
//                startActivity(intent);


            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Toast.makeText(MainActivity.this,data.getExtras().getString("地址"),Toast.LENGTH_SHORT).show();
    }
}