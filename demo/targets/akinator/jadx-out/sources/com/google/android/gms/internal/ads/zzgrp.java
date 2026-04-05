package com.google.android.gms.internal.ads;

import com.ironsource.C3191e4;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgrp extends zzgpo {
    final transient Object zza;

    public zzgrp(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgpa, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgpo, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzgpo, com.google.android.gms.internal.ads.zzgpa, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgpw(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.zza.toString();
        return a.b.o(new StringBuilder(String.valueOf(string).length() + 2), C3191e4.i.f36529d, string, C3191e4.i.f36531e);
    }

    @Override // com.google.android.gms.internal.ads.zzgpo, com.google.android.gms.internal.ads.zzgpa
    /* renamed from: zza */
    public final zzgrs iterator() {
        return new zzgpw(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgpo, com.google.android.gms.internal.ads.zzgpa
    public final zzgpe zze() {
        return zzgpe.zzj(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    public final int zzg(Object[] objArr, int i10) {
        objArr[i10] = this.zza;
        return i10 + 1;
    }
}
