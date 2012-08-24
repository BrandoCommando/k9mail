package com.fsck.k9.helper;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;

/**
 * Create notifications using the now deprecated {@link Notification} constructor.
 */
public class NotificationBuilderApi1 extends NotificationBuilder {
    private int mSmallIcon;
    private long mWhen;
    private CharSequence mTickerText;
    private CharSequence mContentText;
    private CharSequence mContentTitle;
    private PendingIntent mContentIntent;
    private int mNumber;
    private boolean mOngoing;
    private boolean mAutoCancel;
    private Uri mSoundUri;
    private long[] mVibrationPattern;
    private int mLedColor;
    private int mLedOnMS;
    private int mLedOffMS;
    private boolean mBlinkLed;


    protected NotificationBuilderApi1(Context context) {
        super(context);
    }

    
    public void setSmallIcon(int icon) {
        mSmallIcon = icon;
    }

    
    public void setWhen(long when) {
        mWhen = when;
    }

    
    public void setTicker(CharSequence tickerText) {
        mTickerText = tickerText;
    }

    
    public void setContentTitle(CharSequence title) {
        mContentTitle = title;
    }

    
    public void setContentText(CharSequence text) {
        mContentText = text;
    }

    
    public void setContentIntent(PendingIntent intent) {
        mContentIntent = intent;
    }

    
    public void setNumber(int number) {
        mNumber = number;
    }

    
    public void setOngoing(boolean ongoing) {
        mOngoing = ongoing;
    }

    
    public void setAutoCancel(boolean autoCancel) {
        mAutoCancel = autoCancel;
    }

    
    public void setSound(Uri sound) {
        mSoundUri = sound;
    }

    
    public void setVibrate(long[] pattern) {
        mVibrationPattern = pattern;
    }

    
    public void setLights(int argb, int onMs, int offMs) {
        mBlinkLed = true;
        mLedColor = argb;
        mLedOnMS = onMs;
        mLedOffMS = offMs;
    }

    @SuppressWarnings("deprecation")
    
    public Notification getNotification() {
        Notification notification = new Notification(mSmallIcon, mTickerText, mWhen);
        notification.number = mNumber;
        notification.setLatestEventInfo(mContext, mContentTitle, mContentText, mContentIntent);

        if (mSoundUri != null) {
            notification.sound = mSoundUri;
            notification.audioStreamType = AudioManager.STREAM_NOTIFICATION;
        }

        if (mVibrationPattern != null) {
            notification.vibrate = mVibrationPattern;
        }

        if (mBlinkLed) {
            notification.flags |= Notification.FLAG_SHOW_LIGHTS;
            notification.ledARGB = mLedColor;
            notification.ledOnMS = mLedOnMS;
            notification.ledOffMS = mLedOffMS;
        }

        if (mAutoCancel) {
            notification.flags |= Notification.FLAG_AUTO_CANCEL;
        }

        if (mOngoing) {
            notification.flags |= Notification.FLAG_ONGOING_EVENT;
        }

        return notification;
    }
}
