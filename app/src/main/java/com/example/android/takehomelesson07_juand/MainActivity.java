package com.example.android.takehomelesson07_juand;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Main Page Yo!");
    }

    public void goToNavPage(View view){
        Intent intent = new Intent(this, ToolBarActivity.class);
        startActivity(intent);

    }

    public static class Person {
        public String name;
        public String info;
        public int photoId;

        public Person(String name, String info, int photoId){
            this.name = name;
            this.info = info;
            this.photoId = photoId;
        }


    }
}
