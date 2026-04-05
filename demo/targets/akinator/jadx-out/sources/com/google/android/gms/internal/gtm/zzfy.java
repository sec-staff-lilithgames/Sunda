package com.google.android.gms.internal.gtm;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzfy extends Handler {
    public zzfy() {
        Looper.getMainLooper();
    }

    public zzfy(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }

    public zzfy(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }
}
