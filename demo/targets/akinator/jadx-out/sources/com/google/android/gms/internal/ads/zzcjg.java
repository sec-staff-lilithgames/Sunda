package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcjg {
    private final zzcix zza;
    private final zzdvi zzb;

    public zzcjg(zzcix zzcixVar, zzdvi zzdviVar) {
        this.zza = zzcixVar;
        this.zzb = zzdviVar;
    }

    public final void zza(final Context context, final VersionInfoParcel versionInfoParcel) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoI)).booleanValue()) {
            Executor threadPoolExecutor = zzcbv.zza;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoK)).booleanValue()) {
                zzcjf zzcjfVar = new zzcjf(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoM)).intValue(), null);
                int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoL)).intValue();
                threadPoolExecutor = new ThreadPoolExecutor(iIntValue, iIntValue, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzcjfVar);
            }
            threadPoolExecutor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb(context, versionInfoParcel);
                }
            });
        }
    }

    public final /* synthetic */ void zzb(Context context, VersionInfoParcel versionInfoParcel) {
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        com.google.android.gms.ads.internal.zzt.zzc().zze(context, versionInfoParcel.afmaVersion);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoJ)).booleanValue()) {
            long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
            zzdvh zzdvhVarZza = this.zzb.zza();
            zzdvhVarZza.zzc("action", "webview_startup_l");
            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime2).length());
            sb2.append(jElapsedRealtime2);
            zzdvhVarZza.zzc("webview_startup_l", sb2.toString());
            zzdvhVarZza.zzd();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoP)).booleanValue()) {
            zzcbv.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc();
                }
            });
        }
    }

    public final /* synthetic */ void zzc() {
        this.zza.zzb(new zzcjb(this, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime()));
    }

    public final /* synthetic */ zzdvi zzd() {
        return this.zzb;
    }
}
