package e.mamtanegi.healthcare;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class SignUp extends AppCompatActivity {
    EditText name,age,dob,phone,email,address;
    Button btn5;
    Spinner citySpinner;
    Spinner genSpinner;
    Spinner bloodgroupSpinner;
    String genders[]={"select gender","Male","Female","Others"};
    String bloodgroups[]={"select bloodgroup","O-","O+","A-","A+","B-","B+","AB-","AB+"};
    String cities[]={"select city","Dehradun","Mussoorie","Rishikesh","Haridwar","Dhanaulti","Nainital","Almora" ,"Bhimtal" ,"Chamoli","Haldwani","Pithoragarh","Kotdwara","Pauri","Tehri","Srinagar"};
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        btn5 = (Button) findViewById(R.id.save);
        genSpinner = findViewById(R.id.gender);
        bloodgroupSpinner = findViewById(R.id.bloodgroup);
        citySpinner = findViewById(R.id.city);
        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        dob = findViewById(R.id.dob);
        phone = findViewById(R.id.phone);
        email = findViewById(R.id.email);
        address = findViewById(R.id.address);
        genSpinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
        bloodgroupSpinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
        citySpinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);

        ArrayAdapter genAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, genders);
        genSpinner.setAdapter(genAdapter);
        genSpinner.setPrompt(genders[0]);
        ArrayAdapter bgAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, bloodgroups);
        bloodgroupSpinner.setAdapter(bgAdapter);
        bloodgroupSpinner.setPrompt(bloodgroups[0]);
        ArrayAdapter cityAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, cities);
        citySpinner.setAdapter(cityAdapter);
        citySpinner.setPrompt(cities[0]);

        databaseReference = FirebaseDatabase.getInstance().getReference();

        btn5.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                String name1 = name.getText().toString().trim();
                String age1 = age.getText().toString().trim();
                String dob1 = dob.getText().toString().trim();
                String phone1=phone.getText().toString().trim();
                String email1=email.getText().toString().trim();
                String address1=address.getText().toString().trim();

                HashMap<String, Object> hashMap = new HashMap<String, Object>();
                hashMap.put("name", name1);
                hashMap.put("age", age1);
                hashMap.put("dob", dob1);
                hashMap.put("phone", phone1);
                hashMap.put("email", email1);
                hashMap.put("email", address1);
                Toast.makeText(SignUp.this, "Details Saved", Toast.LENGTH_LONG);
                databaseReference.push().setValue(hashMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(SignUp.this, "Details Saved", Toast.LENGTH_LONG);
                        } else {
                            Toast.makeText(SignUp.this, "Details Not Saved", Toast.LENGTH_LONG);
                        }
                    }
                });
            }
        });
    }




    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
    }

