package net.rahmony.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;


public class SupervisorActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supervisor);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_supervisor, menu);//Menu Resource, Menu
            return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mainPage:
                startActivity(new Intent(getBaseContext(),SupervisorActivity.class));
                return true;
            case R.id.currentTask:
                startActivity(new Intent(getBaseContext(),CurrentTaskActivity.class));
                return true;
            case R.id.completedTask:
                startActivity(new Intent(getBaseContext(),CompletedTaskActivity.class));
                return true;
            case R.id.settings:
                startActivity(new Intent(getBaseContext(),SettingsActivity.class));
                return true;
            case R.id.exit:
                startActivity(new Intent(getBaseContext(),LoginActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

