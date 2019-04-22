package e.mamtanegi.healthcare;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Admin extends AppCompatActivity {
    String contenText="your appoinment dated on 23/4/2019 ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin2);
    }

    public void appointment(View view) {

    }
    public void showNormalViewNotification(){

        NotificationCompat.Builder builder =new NotificationCompat.Builder(Admin.this);
        builder.setContentTitle("Normal Regula");
        // builder.setContentText("Hey I want help");
        builder.setContentText(contenText);
        builder.setSmallIcon(R.drawable.notifaction);
        builder.setTicker("hey I want Help..");
        builder.setAutoCancel(true);
       /* Intent intent=new Intent(Admin.this,Patients.class);
        TaskStackBuilder stackBuilder=TaskStackBuilder.create(this);
        stackBuilder.addParentStack(Patients.class);
        stackBuilder.addNextIntent(intent);
        PendingIntent pendingIntent=stackBuilder.getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(pendingIntent);
*/
        //pass
        Notification notification=builder.build();
        NotificationManager manager=(NotificationManager) this.getSystemService(NOTIFICATION_SERVICE);
        manager.notify(12894,notification);


    }

}
