package lv.livija.spaceshipfactory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button buLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edit1 = findViewById(R.id.username);
        edit2 = findViewById(R.id.password);
        buLogin = findViewById(R.id.buLogin);

        buLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // login
                login();
            }
        });
    }

    public void login() {
        String username = edit1.getText().toString();
        String password = edit2.getText().toString();

        //Validation of username and password
        if (username.equals("") || password.equals("")){
            Toast.makeText(this, "Username or password are empty", Toast.LENGTH_LONG).show();
        }else if (username.equals("Livija") && password.equals("123456")){
            Toast.makeText(this, "Login successfully", Toast.LENGTH_LONG).show();
            Intent welcome = new Intent(LoginActivity.this, WelcomeActivity.class);
            startActivity(welcome);
        }else {
            Toast.makeText(this, "Username or password is incorrect", Toast.LENGTH_LONG).show();
        }
    }
}