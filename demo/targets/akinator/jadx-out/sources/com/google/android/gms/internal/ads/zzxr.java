package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzxr implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzxr(zzv zzvVar, int i10) {
        this.zza = 1 == (zzvVar.zze & 1);
        this.zzb = zzlp.zzaa(i10, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxr zzxrVar) {
        return zzgot.zzg().zzd(this.zzb, zzxrVar.zzb).zzd(this.zza, zzxrVar.zza).zze();
    }
}
