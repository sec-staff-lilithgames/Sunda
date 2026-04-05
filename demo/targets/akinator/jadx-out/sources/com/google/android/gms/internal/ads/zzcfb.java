package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import b0.e2;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcfb implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ zzcfe zzd;

    public zzcfb(zzcfe zzcfeVar, String str, String str2, int i10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        Objects.requireNonNull(zzcfeVar);
        this.zzd = zzcfeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapS = e2.s(NotificationCompat.CATEGORY_EVENT, "precacheComplete");
        mapS.put("src", this.zza);
        mapS.put("cachedSrc", this.zzb);
        mapS.put("totalBytes", Integer.toString(this.zzc));
        this.zzd.zzw("onPrecacheEvent", mapS);
    }
}
