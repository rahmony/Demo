package net.rahmony.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class CurrentTaskActivity extends AppCompatActivity {

    private TextView mCurrentTask_text_siteName_one ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_task);
        mCurrentTask_text_siteName_one = (TextView)findViewById(R.id.currentTask_text_siteName_one);
        mCurrentTask_text_siteName_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(),EvaluationFormActivity.class));
            }
        });
    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Bundle extras = getIntent().getExtras();
        String type = extras.getString("Type");
        if(type.equalsIgnoreCase("1")) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_admin, menu);//Menu Resource, Menu
            return true;
        }
        else if(type.equalsIgnoreCase("2")) {
            getMenuInflater().inflate(R.menu.menu_supervisor, menu);//Menu Resource, Menu
            return true;
        }
        else
            return false;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Bundle extras = getIntent().getExtras();
        String type = extras.getString("Type");
        switch (item.getItemId()) {
            case R.id.mainPage:
                startActivity(new Intent(getBaseContext(),MainActivity.class).putExtra("Type",type));
                return true;
            case R.id.newTask:
                startActivity(new Intent(getBaseContext(),NewTaskActivity.class).putExtra("Type",type));
                return true;
            case R.id.currentTask:
                startActivity(new Intent(getBaseContext(),CurrentTaskActivity.class).putExtra("Type",type));
                return true;
            case R.id.completedTask:
                startActivity(new Intent(getBaseContext(),CompletedTaskActivity.class).putExtra("Type",type));
                return true;
            case R.id.userList:
                startActivity(new Intent(getBaseContext(),UserListActivity.class).putExtra("Type",type));
                return true;
            case R.id.settings:
                startActivity(new Intent(getBaseContext(),SettingsActivity.class).putExtra("Type",type));
                return true;
            case R.id.exit:
                startActivity(new Intent(getBaseContext(),LoginActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
