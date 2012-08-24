package com.fsck.k9.crypto;

import android.app.Activity;
import android.content.Context;

import com.fsck.k9.mail.Message;

/**
 * Dummy CryptoProvider for when cryptography is disabled. It is never "available" and doesn't
 * do anything.
 */
public class None extends CryptoProvider {
    static final long serialVersionUID = 0x21071230;
    public static final String NAME = "";

    public static None createInstance() {
        return new None();
    }

    
    public boolean isAvailable(Context context) {
        return false;
    }

    
    public boolean selectSecretKey(Activity activity, PgpData pgpData) {
        return false;
    }

    
    public boolean selectEncryptionKeys(Activity activity, String emails, PgpData pgpData) {
        return false;
    }

    
    public long[] getSecretKeyIdsFromEmail(Context context, String email) {
        return null;
    }

    
    public long[] getPublicKeyIdsFromEmail(Context context, String email) {
        return null;
    }

    
    public boolean hasSecretKeyForEmail(Context context, String email) {
        return false;
    }

    
    public boolean hasPublicKeyForEmail(Context context, String email) {
        return false;
    }

    
    public String getUserId(Context context, long keyId) {
        return null;
    }

    
    public boolean onActivityResult(Activity activity, int requestCode, int resultCode,
                                    android.content.Intent data, PgpData pgpData) {
        return false;
    }

    
    public boolean encrypt(Activity activity, String data, PgpData pgpData) {
        return false;
    }

    
    public boolean decrypt(Activity activity, String data, PgpData pgpData) {
        return false;
    }

    
    public boolean isEncrypted(Message message) {
        return false;
    }

    
    public boolean isSigned(Message message) {
        return false;
    }

    
    public String getName() {
        return NAME;
    }

    
    public boolean test(Context context) {
        return true;
    }
}
