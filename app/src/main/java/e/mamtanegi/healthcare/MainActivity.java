package e.mamtanegi.healthcare;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import com.google.firebase.FirebaseApp;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText email1, password1;
    ProgressDialog progressDialog;

    private RadioButton rbOwner;
    private RadioButton rbUser;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rbOwner = (RadioButton) findViewById(R.id.rb_owner);
        rbUser = (RadioButton) findViewById(R.id.rb_user);
        btnNext = (Button) findViewById(R.id.btn_next);

    //    FirebaseApp.initializeApp(this);
        rbOwner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Intent intent = new Intent(MainActivity.this, .class);

               // startActivity(intent);

            }
        });

        rbUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Patients.class);

                startActivity(intent);

            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, bloodbank.class);

                startActivity(intent);

            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();

    }

}


