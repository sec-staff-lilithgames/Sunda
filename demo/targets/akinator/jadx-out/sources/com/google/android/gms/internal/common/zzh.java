package com.google.android.gms.internal.common;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzh extends Handler {
    private final Looper zza;

    public zzh() {
        this.zza = Looper.getMainLooper();
    }

    public zzh(Looper looper) {
        super(looper);
        this.zza = Looper.getMainLooper();
    }

    public zzh(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.zza = Looper.getMainLooper();
    }
}
