package net.rahmony.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class AdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_admin, menu);//Menu Resource, Menu
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mainPage:
                Toast.makeText(getApplicationContext(),"الصفحة الرئيسية",Toast.LENGTH_LONG).show();
                return true;
            case R.id.newTask:
                Toast.makeText(getApplicationContext(),"اسناد مهمة",Toast.LENGTH_LONG).show();
                return true;
            case R.id.currentTask:
                Toast.makeText(getApplicationContext(),"المهام الحالية",Toast.LENGTH_LONG).show();
                return true;
            case R.id.completedTask:
                Toast.makeText(getApplicationContext(),"المهام المنجزة ",Toast.LENGTH_LONG).show();
                return true;
            case R.id.userList:
                Toast.makeText(getApplicationContext(),"قائمة المشرفين",Toast.LENGTH_LONG).show();
                return true;
            case R.id.settings:
                Toast.makeText(getApplicationContext(),"الإعدادات",Toast.LENGTH_LONG).show();
                return true;
            case R.id.exit:
                System.exit(0);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

