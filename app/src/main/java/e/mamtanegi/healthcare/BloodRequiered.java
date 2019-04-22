package e.mamtanegi.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class BloodRequiered extends AppCompatActivity {
   // Button btn3;
    //Button btn4;
    String bgroups[]={"select bloodgroup","O-","O+","A-","A+","B-","B+","AB-","AB+"};
    Spinner bgroup;
    Spinner citySpinner;
    String cities[]={"select city","Dehradun","Mussoorie","Rishikesh","Haridwar","Dhanaulti","Nainital","Almora" ,"Bhimtal" ,"Chamoli","Haldwani","Pithoragarh","Kotdwara","Pauri","Tehri","Srinagar"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_requiered);

        bgroup = (Spinner)findViewById(R.id.group) ;
        citySpinner= findViewById(R.id.city);

      //  bgroup.setOnItemSelectedListener(this);
        //citySpinner.setOnItemSelectedListener(this);

        ArrayAdapter arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,bgroups);
        bgroup.setAdapter(arrayAdapter);
        bgroup.setPrompt(bgroups[0]);

        ArrayAdapter cityAdapter=new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,cities);
        citySpinner.setAdapter(cityAdapter);
        citySpinner.setPrompt(cities[0]);

       // btn3.setOnClickListener(new View.OnClickListener() {
         /*   @Override
            public void onClick(View view) {

                Intent intent3 = new Intent(BloodRequiered.this,MainActivity.class);
                startActivity(intent3);
            }
        });

*/
    }

  //  @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    //@Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
    }

