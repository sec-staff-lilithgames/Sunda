package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbp extends zzbr {
    private final zzcj zza;

    public zzbp(zzbu zzbuVar, zzbv zzbvVar) {
        super(zzbuVar);
        Preconditions.checkNotNull(zzbvVar);
        this.zza = new zzcj(zzbuVar, zzbvVar);
    }

    public final long zza(zzbw zzbwVar) {
        zzV();
        Preconditions.checkNotNull(zzbwVar);
        com.google.android.gms.analytics.zzr.zzh();
        long jZzb = this.zza.zzb(zzbwVar, true);
        if (jZzb != 0) {
            return jZzb;
        }
        this.zza.zzk(zzbwVar);
        return 0L;
    }

    public final void zzc() {
        zzV();
        Context contextZzo = zzo();
        if (!zzev.zzb(contextZzo) || !zzfa.zzh(contextZzo)) {
            zze(null);
            return;
        }
        Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent.setComponent(new ComponentName(contextZzo, "com.google.android.gms.analytics.AnalyticsService"));
        contextZzo.startService(intent);
    }

    @Override // com.google.android.gms.internal.gtm.zzbr
    public final void zzd() {
        this.zza.zzW();
    }

    public final void zze(zzcy zzcyVar) {
        zzV();
        zzq().zzi(new zzbn(this, zzcyVar));
    }

    public final void zzf(String str, Runnable runnable) {
        Preconditions.checkNotEmpty(str, "campaign param can't be empty");
        zzq().zzi(new zzbj(this, str, runnable));
    }

    public final void zzg() {
        zzV();
        zzw();
        zzq().zzi(new zzbm(this));
    }

    public final void zzh(zzek zzekVar) {
        Preconditions.checkNotNull(zzekVar);
        zzV();
        zzF("Hit delivery requested", zzekVar);
        zzq().zzi(new zzbl(this, zzekVar));
    }

    public final void zzi() {
        com.google.android.gms.analytics.zzr.zzh();
        this.zza.zzl();
    }

    public final void zzj() {
        com.google.android.gms.analytics.zzr.zzh();
        this.zza.zzm();
    }

    public final void zzk() {
        zzV();
        com.google.android.gms.analytics.zzr.zzh();
        com.google.android.gms.analytics.zzr.zzh();
        zzcj zzcjVar = this.zza;
        zzcjVar.zzV();
        zzcjVar.zzN("Service disconnected");
    }

    public final void zzl(int i10) {
        zzV();
        zzF("setLocalDispatchPeriod (sec)", Integer.valueOf(i10));
        zzq().zzi(new zzbk(this, i10));
    }

    public final void zzm() {
        this.zza.zzZ();
    }

    public final boolean zzn() throws ExecutionException, InterruptedException, TimeoutException {
        zzV();
        try {
            zzq().zzg(new zzbo(this)).get(4L, TimeUnit.SECONDS);
            return true;
        } catch (InterruptedException e10) {
            zzR("syncDispatchLocalHits interrupted", e10);
            return false;
        } catch (ExecutionException e11) {
            zzJ("syncDispatchLocalHits failed", e11);
            return false;
        } catch (TimeoutException e12) {
            zzR("syncDispatchLocalHits timed out", e12);
            return false;
        }
    }
}
