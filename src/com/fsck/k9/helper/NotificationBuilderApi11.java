package com.fsck.k9.helper;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;

/**
 * Create notifications using the new {@link android.app.Notification.Builder} class.
 */
@TargetApi(11)
public class NotificationBuilderApi11 extends NotificationBuilder {
    private Notification.Builder mBuilder;


    protected NotificationBuilderApi11(Context context) {
        super(context);
        mBuilder = new Notification.Builder(context);
    }

    
    public void setSmallIcon(int icon) {
        mBuilder.setSmallIcon(icon);
    }

    
    public void setWhen(long when) {
        mBuilder.setWhen(when);
    }

    
    public void setTicker(CharSequence tickerText) {
        mBuilder.setTicker(tickerText);
    }

    
    public void setContentTitle(CharSequence title) {
        mBuilder.setContentTitle(title);
    }

    
    public void setContentText(CharSequence text) {
        mBuilder.setContentText(text);
    }

    
    public void setContentIntent(PendingIntent intent) {
        mBuilder.setContentIntent(intent);
    }

    
    public void setNumber(int number) {
        mBuilder.setNumber(number);
        mBuilder.setContentInfo("" + number);
    }

    
    public void setOngoing(boolean ongoing) {
        mBuilder.setOngoing(ongoing);
    }

    
    public void setAutoCancel(boolean autoCancel) {
        mBuilder.setAutoCancel(autoCancel);
    }

    
    public void setSound(Uri sound) {
        mBuilder.setSound(sound, AudioManager.STREAM_NOTIFICATION);
    }

    
    public void setVibrate(long[] pattern) {
        mBuilder.setVibrate(pattern);
    }

    
    public void setLights(int argb, int onMs, int offMs) {
        mBuilder.setLights(argb, onMs, offMs);
    }

    
    public Notification getNotification() {
        return mBuilder.getNotification();
    }
}
