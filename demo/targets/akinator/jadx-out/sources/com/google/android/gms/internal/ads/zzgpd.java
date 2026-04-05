package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgpd extends zzgpe {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzgpe zzc;

    public zzgpd(zzgpe zzgpeVar, int i10, int i11) {
        Objects.requireNonNull(zzgpeVar);
        this.zzc = zzgpeVar;
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzgmd.zzm(i10, this.zzb, "index");
        return this.zzc.get(i10 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    public final Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    public final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgpe, java.util.List
    /* renamed from: zzh */
    public final zzgpe subList(int i10, int i11) {
        zzgmd.zzo(i10, i11, this.zzb);
        int i12 = this.zza;
        return this.zzc.subList(i10 + i12, i11 + i12);
    }
}
