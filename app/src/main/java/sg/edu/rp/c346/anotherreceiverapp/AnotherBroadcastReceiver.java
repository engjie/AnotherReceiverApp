package sg.edu.rp.c346.anotherreceiverapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by 16019641 on 13/8/2018.
 */

public class AnotherBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent){
        Toast.makeText(context,"Received in AnotherBroadcast Receiver",Toast.LENGTH_LONG).show();
    }
}
