package net.rahmony.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Button mBtn_login;
    private EditText mLogin_et_id , mLogin_et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mLogin_et_id = (EditText)findViewById(R.id.login_et_id);
        mLogin_et_password = (EditText)findViewById(R.id.login_et_password);

        mBtn_login = (Button) findViewById(R.id.login_btn_enter);
        mBtn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mLogin_et_id.getText().toString().equalsIgnoreCase("1"))
                {
                    startActivity(new Intent(getBaseContext(),AdminActivity.class));
                }
                else if(mLogin_et_id.getText().toString().equalsIgnoreCase("2"))
                {
                    startActivity(new Intent(getBaseContext(),SupervisorActivity.class));
                }
                else
                    Toast.makeText(getBaseContext(),"ID or Password are Error !!",Toast.LENGTH_LONG).show();

            }
        });

    }
}
