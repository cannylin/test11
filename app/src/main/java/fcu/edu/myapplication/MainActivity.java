package fcu.edu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    Button btnMainPageStart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //取得所有物件
        btnMainPageStart = (Button) findViewById(R.id.btn_MainPage_Start);

        btnMainPageStart.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Log.d("TAG","onClick");
                Intent intent= new Intent();
                intent.setClass(MainActivity.this,SettungActivity.class);
                startActivity(intent);
            }
        });


    }
}
