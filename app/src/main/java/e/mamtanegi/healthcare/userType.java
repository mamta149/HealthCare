package e.mamtanegi.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class userType extends AppCompatActivity {
    private RadioButton rbOwner;
    private RadioButton rbUser;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_type);
        init();
        showUI();
        setOnClickListener();
    }

    private void setOnClickListener() {
        btnNext.setOnClickListener((View.OnClickListener) this);

    }

    private void showUI() {

    }

    private void init() {
        rbOwner = (RadioButton) findViewById(R.id.rb_owner);
        rbUser = (RadioButton) findViewById(R.id.rb_user);
        btnNext = (Button) findViewById(R.id.btn_next);

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_next:
                if (rbOwner.isChecked()) {
                    Intent intent = new Intent(userType.this, Adminstrative.class);
                    intent.putExtra("id", 2);
                    startActivity(intent);

                } else if (rbUser.isChecked()) {
                    Intent intent = new Intent(userType.this, Patients.class);
                    intent.putExtra("id", 1);
                    startActivity(intent);

                }
                break;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

    }

}


