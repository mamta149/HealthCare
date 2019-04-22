package e.mamtanegi.healthcare;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Crime extends AppCompatActivity {


    String contenText="hey please help me";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);
    }

    public void doSomething(View view) {
        Intent intent=null,chooser=null;
        //Build the content of Notifaction

        switch (view.getId()){
            case R.id.bshowMapLocation:

                intent=new Intent(android.content.Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://maps.google.com/maps?q=38.897676,-77.03653(Label Point)"));
                chooser=Intent.createChooser(intent,"Open Map  Using..");
                if(intent.resolveActivity(getPackageManager())!=null){
                    startActivity(chooser);
                }else{
                    Toast.makeText(getApplicationContext(),"No apps available",Toast.LENGTH_SHORT).show();
                }
                showNormalViewNotification();
                break;

            case R.id.bsendEmail:

                intent=new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:"));
                intent.setType("message/rfc822");
                String[] send_to={"sonubutola6@gmail.com","negimamta149@gmail.com"};
                intent.putExtra(Intent.EXTRA_EMAIL,send_to);

                intent.putExtra(Intent.EXTRA_SUBJECT,"HEY This is subject");
                intent.putExtra(Intent.EXTRA_TEXT,"Help...!");
                chooser=Intent.createChooser(intent,"select Email App...");
                if(intent.resolveActivity(getPackageManager())!=null){
                    startActivity(chooser);
                }else{
                    Toast.makeText(getApplicationContext(),"No apps available",Toast.LENGTH_SHORT).show();
                }
                showNormalViewNotification();
                break;

            case R.id.bsendMessage:
                intent=new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                //intent.setType("image/*");

                //  intent.putExtra(Intent.EXTRA_TEXT,"hey check image..");
                intent.putExtra(Intent.EXTRA_TEXT,"please help me i m in trouble");
                chooser=Intent.createChooser(intent,"Share Message...");
                if(intent.resolveActivity(getPackageManager())!=null){
                    startActivity(chooser);
                }else{
                    Toast.makeText(getApplicationContext(),"No apps available",Toast.LENGTH_SHORT).show();
                }
                showNormalViewNotification();

                break;

            case R.id.bcall:

                intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+917895149429"));
                if(intent.resolveActivity(getPackageManager())!=null){
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(),"No apps available",Toast.LENGTH_SHORT).show();
                }
                showNormalViewNotification();
                break;

        }

    }

    public void showNormalViewNotification(){

        NotificationCompat.Builder builder =new NotificationCompat.Builder(Crime.this);
        builder.setContentTitle("Normal Regula");
       // builder.setContentText("Hey I want help");
        builder.setContentText(contenText);
        builder.setSmallIcon(R.drawable.notifaction);
        builder.setTicker("hey I want Help..");
        builder.setAutoCancel(true);

        //pass
        Notification notification=builder.build();
        NotificationManager manager=(NotificationManager) this.getSystemService(NOTIFICATION_SERVICE);
        manager.notify(1234,notification);


    }

}
