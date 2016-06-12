package net.rahmony.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class UserListActivity extends AppCompatActivity {

    private TextView mUserList_text_add ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);
        mUserList_text_add = (TextView)findViewById(R.id.userList_text_add);
        mUserList_text_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(),AddUserActivity.class));
            }
        });
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_admin, menu);//Menu Resource, Menu
        return true;
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
