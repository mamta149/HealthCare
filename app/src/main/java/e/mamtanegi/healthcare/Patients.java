package e.mamtanegi.healthcare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Patients extends AppCompatActivity {
EditText Username,password,confirm,desese;
Button signin,signup;
FirebaseDatabase db;
DatabaseReference ref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patients);
        Username=findViewById(R.id.username);
        password=findViewById(R.id.et_password);
        desese=findViewById(R.id.disease);
        db=FirebaseDatabase.getInstance();
        ref=db.getReference("Patients");
        signup.findViewById(R.id.btn_signup).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
