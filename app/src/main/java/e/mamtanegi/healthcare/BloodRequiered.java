package e.mamtanegi.healthcare;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class BloodRequiered extends AppCompatActivity {
    Button becall;
    Button bemsg;
   String contenText="hey please help me";
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
   /* public void showNormalViewNotification(){

        NotificationCompat.Builder builder =new NotificationCompat.Builder();
        builder.setContentTitle("Normal Regula");
        // builder.setContentText("Hey I want help");
        builder.setContentText(contenText);
        builder.setSmallIcon(R.drawable.notifaction);
        builder.setTicker("hey I want Help..");
        builder.setAutoCancel(true);

        //pass
        Notification notification=builder.build();
        NotificationManager manager=(NotificationManager) this.getSystemService(NOTIFICATION_SERVICE);
        manager.notify(839295,notification);


    }

*/
    //  @Override


    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    //@Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void savelife(View view) {
        Intent intent=null,chooser=null;
        //Build the content of Notifaction

        switch (view.getId()) {
            case R.id.bemsg:
                intent=new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                //intent.setType("image/*");

                //  intent.putExtra(Intent.EXTRA_TEXT,"hey check image..");
                intent.putExtra(Intent.EXTRA_TEXT,"blood needed");
                chooser=Intent.createChooser(intent,"Share Message...");
                if(intent.resolveActivity(getPackageManager())!=null){
                    startActivity(chooser);
                }else{
                    Toast.makeText(getApplicationContext(),"No apps available",Toast.LENGTH_SHORT).show();
                }
                             break;

            case R.id.becall:

                intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+917895149429"));
                intent.setData(Uri.parse("tel:+918392955769"));
                intent.setData(Uri.parse("tel:+919690598340"));
                intent.setData(Uri.parse("tel:+914374365735"));

                if(intent.resolveActivity(getPackageManager())!=null){
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(),"No apps available",Toast.LENGTH_SHORT).show();
                }
                         break;

        }





        }
}

