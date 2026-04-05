package com.google.android.gms.common;

import android.content.Intent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class UserRecoverableException extends Exception {
    private final Intent zza;

    public UserRecoverableException(String str, Intent intent) {
        super(str);
        this.zza = intent;
    }

    public Intent getIntent() {
        return new Intent(this.zza);
    }
}
