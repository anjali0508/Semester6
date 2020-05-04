package com.example.first;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.widget.Toast;

public class AlarmReciever extends BroadcastReceiver {
    private static Ringtone mRingtone;

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Wake up!", Toast.LENGTH_LONG).show();
        Uri alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);
        if (alarmUri == null) {
            alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        }
        mRingtone = RingtoneManager.getRingtone(context, alarmUri);
        mRingtone.play();
    }

    public static void stopRingtone() {
        mRingtone.stop();
    }
}
