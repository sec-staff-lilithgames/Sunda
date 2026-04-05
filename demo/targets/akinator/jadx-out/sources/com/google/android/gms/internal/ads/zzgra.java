package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgra extends zzgpe {
    final /* synthetic */ zzgrb zza;

    public zzgra(zzgrb zzgrbVar) {
        Objects.requireNonNull(zzgrbVar);
        this.zza = zzgrbVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        zzgrb zzgrbVar = this.zza;
        zzgmd.zzm(i10, zzgrbVar.zzw(), "index");
        int i11 = i10 + i10;
        Object obj = zzgrbVar.zzv()[i11];
        Objects.requireNonNull(obj);
        Object obj2 = zzgrbVar.zzv()[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    public final boolean zzf() {
        return true;
    }
}
