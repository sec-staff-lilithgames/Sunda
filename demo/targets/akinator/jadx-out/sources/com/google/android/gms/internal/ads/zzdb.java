package com.google.android.gms.internal.ads;

import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdb {
    private final zzdm zza;
    private final zzdm zzb;
    private final zzda zzc;
    private Object zzd;
    private Object zze;
    private int zzf;

    public zzdb(Object obj, Looper looper, Looper looper2, zzdc zzdcVar, zzda zzdaVar) {
        this.zza = zzdcVar.zzd(looper, null);
        this.zzb = zzdcVar.zzd(looper2, null);
        this.zzd = obj;
        this.zze = obj;
        this.zzc = zzdaVar;
    }

    private final void zzg(Runnable runnable) {
        zzdm zzdmVar = this.zzb;
        if (zzdmVar.zza().getThread().isAlive()) {
            zzdmVar.zzm(runnable);
        }
    }

    private final void zzh(Object obj) {
        Object obj2 = this.zzd;
        this.zzd = obj;
        if (obj2.equals(obj)) {
            return;
        }
        this.zzc.zza(obj2, obj);
    }

    public final void zza(zzglu zzgluVar, final zzglu zzgluVar2) {
        zzgmd.zzh(Looper.myLooper() == this.zzb.zza());
        this.zzf++;
        zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd(zzgluVar2);
            }
        });
        zzh(zzgluVar.apply(this.zzd));
    }

    public final void zzb(final Object obj) {
        this.zze = obj;
        zzg(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze(obj);
            }
        });
    }

    public final void zzc(Runnable runnable) {
        zzdm zzdmVar = this.zza;
        if (zzdmVar.zza().getThread().isAlive()) {
            zzdmVar.zzm(runnable);
        }
    }

    public final /* synthetic */ void zzd(zzglu zzgluVar) {
        final Object objApply = zzgluVar.apply(this.zze);
        this.zze = objApply;
        zzg(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf(objApply);
            }
        });
    }

    public final /* synthetic */ void zze(Object obj) {
        if (this.zzf == 0) {
            zzh(obj);
        }
    }

    public final /* synthetic */ void zzf(Object obj) {
        int i10 = this.zzf - 1;
        this.zzf = i10;
        if (i10 == 0) {
            zzh(obj);
        }
    }
}
