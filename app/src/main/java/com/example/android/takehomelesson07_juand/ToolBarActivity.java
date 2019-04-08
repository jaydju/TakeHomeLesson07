package com.example.android.takehomelesson07_juand;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ToolBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tool_bar);
        setTitle("ToolBar Test");
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void shareIt(MenuItem item){
        Toast.makeText(this, "Share it baby", Toast.LENGTH_SHORT).show();
    }

    public void saved(MenuItem item){
        Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show();
    }

    public void recyclerView(MenuItem item){
        Intent intent = new Intent(this, RecyclerActivity.class);
        startActivity(intent);

    }
}
