package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgrc extends zzgpo {
    private final transient zzgph zza;
    private final transient zzgpe zzb;

    public zzgrc(zzgph zzgphVar, zzgpe zzgpeVar) {
        this.zza = zzgphVar;
        this.zzb = zzgpeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgpa, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgpo, com.google.android.gms.internal.ads.zzgpa, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgpo, com.google.android.gms.internal.ads.zzgpa
    /* renamed from: zza */
    public final zzgrs iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgpo, com.google.android.gms.internal.ads.zzgpa
    public final zzgpe zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    public final int zzg(Object[] objArr, int i10) {
        return this.zzb.zzg(objArr, i10);
    }
}
