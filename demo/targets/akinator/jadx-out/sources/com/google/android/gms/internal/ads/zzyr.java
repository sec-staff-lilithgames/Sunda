package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzyr {
    private zzyq zza;
    private zzza zzb;

    public void zzb() {
        this.zza = null;
        this.zzb = null;
    }

    public boolean zzd() {
        throw null;
    }

    public void zze(zzd zzdVar) {
        throw null;
    }

    public zzlo zzg() {
        throw null;
    }

    public abstract void zzp(Object obj);

    public abstract zzys zzq(zzlp[] zzlpVarArr, zzwv zzwvVar, zzuu zzuuVar, zzbf zzbfVar) throws zzib;

    public final void zzr(zzyq zzyqVar, zzza zzzaVar) {
        zzgmd.zzh(this.zza == null);
        this.zza = zzyqVar;
        this.zzb = zzzaVar;
    }

    public final void zzs() {
        zzyq zzyqVar = this.zza;
        if (zzyqVar != null) {
            zzyqVar.zzq();
        }
    }

    public final zzza zzt() {
        zzza zzzaVar = this.zzb;
        zzzaVar.getClass();
        return zzzaVar;
    }
}
