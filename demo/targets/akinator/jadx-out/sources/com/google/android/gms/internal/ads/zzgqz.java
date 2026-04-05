package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgqz extends zzgpe {
    static final zzgpe zza = new zzgqz(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzgqz(Object[] objArr, int i10) {
        this.zzb = objArr;
        this.zzc = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzgmd.zzm(i10, this.zzc, "index");
        Object obj = this.zzb[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    public final Object[] zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgpe, com.google.android.gms.internal.ads.zzgpa
    public final int zzg(Object[] objArr, int i10) {
        Object[] objArr2 = this.zzb;
        int i11 = this.zzc;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }
}
