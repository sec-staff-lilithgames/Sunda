package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgrf extends zzgpo {
    static final zzgrf zza;
    private static final Object[] zzd;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zzgrf(objArr, 0, objArr, 0, 0);
    }

    public zzgrf(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.zzb = objArr;
        this.zze = i10;
        this.zzc = objArr2;
        this.zzf = i11;
        this.zzg = i12;
    }

    @Override // com.google.android.gms.internal.ads.zzgpa, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.zzc;
            if (objArr.length != 0) {
                int iZzb = zzgox.zzb(obj);
                while (true) {
                    int i10 = iZzb & this.zzf;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iZzb = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgpo, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgpo, com.google.android.gms.internal.ads.zzgpa, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zze().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgpo, com.google.android.gms.internal.ads.zzgpa
    /* renamed from: zza */
    public final zzgrs iterator() {
        return zze().listIterator(0);
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
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    public final int zzg(Object[] objArr, int i10) {
        Object[] objArr2 = this.zzb;
        int i11 = this.zzg;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // com.google.android.gms.internal.ads.zzgpo
    public final boolean zzq() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgpo
    public final zzgpe zzr() {
        return zzgpe.zzt(this.zzb, this.zzg);
    }
}
