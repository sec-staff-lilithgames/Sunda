package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbki {
    private final com.google.android.gms.ads.formats.zze zza;
    private final com.google.android.gms.ads.formats.zzd zzb;
    private zzbjd zzc;

    public zzbki(com.google.android.gms.ads.formats.zze zzeVar, com.google.android.gms.ads.formats.zzd zzdVar) {
        this.zza = zzeVar;
        this.zzb = zzdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final synchronized zzbjd zze(zzbjc zzbjcVar) {
        zzbjd zzbjdVar = this.zzc;
        if (zzbjdVar != null) {
            return zzbjdVar;
        }
        zzbjd zzbjdVar2 = new zzbjd(zzbjcVar);
        this.zzc = zzbjdVar2;
        return zzbjdVar2;
    }

    public final zzbjp zza() {
        return new zzbkh(this, null);
    }

    public final zzbjm zzb() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbkg(this, null);
    }

    public final /* synthetic */ com.google.android.gms.ads.formats.zze zzc() {
        return this.zza;
    }

    public final /* synthetic */ com.google.android.gms.ads.formats.zzd zzd() {
        return this.zzb;
    }
}
