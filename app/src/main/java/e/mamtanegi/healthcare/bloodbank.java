package e.mamtanegi.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bloodbank extends AppCompatActivity {
    Button doner;
    Button blood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bloodbank2);
        blood =(Button) findViewById(R.id.bloodrequired);
        doner=(Button) findViewById(R.id.login);

        doner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(bloodbank.this,BloodRequiered.class);
                startActivity(intent1);
            }
        });
        blood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(bloodbank.this,BloodRequiered.class);
                startActivity(intent2);
            }
        });
    }
    }

