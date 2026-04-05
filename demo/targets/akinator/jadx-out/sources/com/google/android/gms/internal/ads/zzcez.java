package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import b0.e2;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcez implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ long zzg;
    final /* synthetic */ boolean zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ int zzj;
    final /* synthetic */ zzcfe zzk;

    public zzcez(zzcfe zzcfeVar, String str, String str2, long j10, long j11, long j12, long j13, long j14, boolean z10, int i10, int i11) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = j12;
        this.zzf = j13;
        this.zzg = j14;
        this.zzh = z10;
        this.zzi = i10;
        this.zzj = i11;
        Objects.requireNonNull(zzcfeVar);
        this.zzk = zzcfeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapS = e2.s(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        mapS.put("src", this.zza);
        mapS.put("cachedSrc", this.zzb);
        mapS.put("bufferedDuration", Long.toString(this.zzc));
        mapS.put("totalDuration", Long.toString(this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzch)).booleanValue()) {
            mapS.put("qoeLoadedBytes", Long.toString(this.zze));
            mapS.put("qoeCachedBytes", Long.toString(this.zzf));
            mapS.put("totalBytes", Long.toString(this.zzg));
            mapS.put("reportTime", Long.toString(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
        }
        mapS.put("cacheReady", true != this.zzh ? "0" : "1");
        mapS.put("playerCount", Integer.toString(this.zzi));
        mapS.put("playerPreparedCount", Integer.toString(this.zzj));
        this.zzk.zzw("onPrecacheEvent", mapS);
    }
}
