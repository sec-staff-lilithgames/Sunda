package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcdm implements Runnable {
    public zzcdm(zzcdo zzcdoVar) {
        Objects.requireNonNull(zzcdoVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
