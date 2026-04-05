package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzabr {
    private final Handler zza;
    private final zzabs zzb;

    public zzabr(Handler handler, zzabs zzabsVar) {
        if (zzabsVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.zza = handler;
        this.zzb = zzabsVar;
    }

    public final void zza(final zzhs zzhsVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzk(zzhsVar);
                }
            });
        }
    }

    public final void zzb(final String str, final long j10, final long j11) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabh
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzl(str, j10, j11);
                }
            });
        }
    }

    public final void zzc(final zzv zzvVar, final zzht zzhtVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabi
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzm(zzvVar, zzhtVar);
                }
            });
        }
    }

    public final void zzd(final int i10, final long j10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzn(i10, j10);
                }
            });
        }
    }

    public final void zze(final long j10, final int i10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzo(j10, i10);
                }
            });
        }
    }

    public final void zzf(final zzbv zzbvVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzp(zzbvVar);
                }
            });
        }
    }

    public final void zzg(final Object obj) {
        Handler handler = this.zza;
        if (handler != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzq(obj, jElapsedRealtime);
                }
            });
        }
    }

    public final void zzh(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzr(str);
                }
            });
        }
    }

    public final void zzi(final zzhs zzhsVar) {
        zzhsVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzs(zzhsVar);
                }
            });
        }
    }

    public final void zzj(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzt(exc);
                }
            });
        }
    }

    public final /* synthetic */ void zzk(zzhs zzhsVar) {
        String str = zzep.zza;
        this.zzb.zza(zzhsVar);
    }

    public final /* synthetic */ void zzl(String str, long j10, long j11) {
        String str2 = zzep.zza;
        this.zzb.zzb(str, j10, j11);
    }

    public final /* synthetic */ void zzm(zzv zzvVar, zzht zzhtVar) {
        String str = zzep.zza;
        this.zzb.zzc(zzvVar, zzhtVar);
    }

    public final /* synthetic */ void zzn(int i10, long j10) {
        String str = zzep.zza;
        this.zzb.zzd(i10, j10);
    }

    public final /* synthetic */ void zzo(long j10, int i10) {
        String str = zzep.zza;
        this.zzb.zzi(j10, i10);
    }

    public final /* synthetic */ void zzp(zzbv zzbvVar) {
        String str = zzep.zza;
        this.zzb.zze(zzbvVar);
    }

    public final /* synthetic */ void zzq(Object obj, long j10) {
        String str = zzep.zza;
        this.zzb.zzf(obj, j10);
    }

    public final /* synthetic */ void zzr(String str) {
        String str2 = zzep.zza;
        this.zzb.zzg(str);
    }

    public final /* synthetic */ void zzs(zzhs zzhsVar) {
        zzhsVar.zza();
        String str = zzep.zza;
        this.zzb.zzh(zzhsVar);
    }

    public final /* synthetic */ void zzt(Exception exc) {
        String str = zzep.zza;
        this.zzb.zzj(exc);
    }
}
