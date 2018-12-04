package org.example.ejemploreceptorsms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ReceptorSMS extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i=new Intent(context,SegundaActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }
}
