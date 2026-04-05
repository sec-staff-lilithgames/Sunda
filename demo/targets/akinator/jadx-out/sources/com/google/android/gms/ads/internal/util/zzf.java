package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.zzfuz;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzf extends zzfuz {
    public zzf(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AdMobHandler.handleMessage");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuz
    public final void zza(Message message) {
        try {
            super.zza(message);
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.zzt.zzc();
            zzs.zzQ(com.google.android.gms.ads.internal.zzt.zzh().zzp(), th2);
            throw th2;
        }
    }
}
