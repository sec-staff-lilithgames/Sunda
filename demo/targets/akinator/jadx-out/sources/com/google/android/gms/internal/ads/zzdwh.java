package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.ironsource.C3191e4;
import com.ironsource.Mf;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdwh implements AppEventListener, zzdbu, com.google.android.gms.ads.internal.client.zza, zzcyo, zzczi, zzczj, zzdac, zzcyr, zzfkt {
    private final List zza;
    private final zzdvv zzb;
    private long zzc;

    public zzdwh(zzdvv zzdvvVar, zzcjn zzcjnVar) {
        this.zzb = zzdvvVar;
        this.zza = Collections.singletonList(zzcjnVar);
    }

    private final void zzi(Class cls, String str, Object... objArr) throws IOException {
        this.zzb.zza(this.zza, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() throws IOException {
        zzi(com.google.android.gms.ads.internal.client.zza.class, Mf.f34998f, new Object[0]);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) throws IOException {
        zzi(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zza(Context context) throws IOException {
        zzi(zzczj.class, C3191e4.h.f36510t0, context);
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzb(Context context) throws IOException {
        zzi(zzczj.class, C3191e4.h.f36512u0, context);
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzc(Context context) throws IOException {
        zzi(zzczj.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzd(zzbxv zzbxvVar, String str, String str2) throws IOException {
        zzi(zzcyo.class, "onRewarded", zzbxvVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcyr
    public final void zzdN(com.google.android.gms.ads.internal.client.zze zzeVar) throws IOException {
        zzi(zzcyr.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzdO() throws IOException {
        zzi(zzcyo.class, Mf.f35003k, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfkt
    public final void zzdP(zzfkm zzfkmVar, String str) throws IOException {
        zzi(zzfkl.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfkt
    public final void zzdQ(zzfkm zzfkmVar, String str) throws IOException {
        zzi(zzfkl.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfkt
    public final void zzdR(zzfkm zzfkmVar, String str, Throwable th2) throws IOException {
        zzi(zzfkl.class, "onTaskFailed", str, th2.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzfkt
    public final void zzdS(zzfkm zzfkmVar, String str) throws IOException {
        zzi(zzfkl.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzdbu
    public final void zzdT(zzbxj zzbxjVar) throws IOException {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        zzi(zzdbu.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzczi
    public final void zzdw() throws IOException {
        zzi(zzczi.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzdx() throws IOException {
        zzi(zzcyo.class, Mf.f34999g, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzdy() throws IOException {
        zzi(zzcyo.class, Mf.f34995c, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zze() throws IOException {
        zzi(zzcyo.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzf() throws IOException {
        zzi(zzcyo.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdac
    public final void zzg() throws IOException {
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzc;
        StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime).length() + 21);
        sb2.append("Ad Request Latency : ");
        sb2.append(jElapsedRealtime);
        com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        zzi(zzdac.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdbu
    public final void zzdU(zzfgf zzfgfVar) {
    }
}
