package com.google.android.gms.internal.tasks;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zza extends Handler {
    private final Looper zza;

    public zza() {
        this.zza = Looper.getMainLooper();
    }

    public zza(Looper looper) {
        super(looper);
        this.zza = Looper.getMainLooper();
    }
}
