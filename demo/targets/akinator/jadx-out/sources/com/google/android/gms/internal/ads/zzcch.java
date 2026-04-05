package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes6.dex */
public class zzcch {
    private final zzcca zza;
    private final AtomicInteger zzb;

    public zzcch() {
        zzcca zzccaVar = new zzcca();
        this.zza = zzccaVar;
        this.zzb = new AtomicInteger(0);
        zzgui.zzr(zzccaVar, new zzccf(this), zzcbv.zzg);
    }

    @Deprecated
    public final void zze(zzcce zzcceVar, zzccc zzcccVar) {
        zzgui.zzr(this.zza, new zzccg(this, zzcceVar, zzcccVar), zzcbv.zzg);
    }

    @Deprecated
    public final void zzf(Object obj) {
        this.zza.zzc(obj);
    }

    @Deprecated
    public final void zzg() {
        this.zza.zzd(new Exception());
    }

    @Deprecated
    public final void zzh(Throwable th2, String str) {
        this.zza.zzd(th2);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzip)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, str);
        }
    }

    @Deprecated
    public final int zzi() {
        return this.zzb.get();
    }

    public final /* synthetic */ AtomicInteger zzj() {
        return this.zzb;
    }
}
