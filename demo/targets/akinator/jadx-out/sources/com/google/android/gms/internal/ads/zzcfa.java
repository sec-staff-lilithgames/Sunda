package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import b0.e2;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcfa implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ int zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ zzcfe zzj;

    public zzcfa(zzcfe zzcfeVar, String str, String str2, int i10, int i11, long j10, long j11, boolean z10, int i12, int i13) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = j10;
        this.zzf = j11;
        this.zzg = z10;
        this.zzh = i12;
        this.zzi = i13;
        Objects.requireNonNull(zzcfeVar);
        this.zzj = zzcfeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapS = e2.s(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        mapS.put("src", this.zza);
        mapS.put("cachedSrc", this.zzb);
        mapS.put("bytesLoaded", Integer.toString(this.zzc));
        mapS.put("totalBytes", Integer.toString(this.zzd));
        mapS.put("bufferedDuration", Long.toString(this.zze));
        mapS.put("totalDuration", Long.toString(this.zzf));
        mapS.put("cacheReady", true != this.zzg ? "0" : "1");
        mapS.put("playerCount", Integer.toString(this.zzh));
        mapS.put("playerPreparedCount", Integer.toString(this.zzi));
        this.zzj.zzw("onPrecacheEvent", mapS);
    }
}
