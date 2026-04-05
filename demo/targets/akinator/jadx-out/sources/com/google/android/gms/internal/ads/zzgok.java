package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgok extends AbstractSet {
    final /* synthetic */ zzgon zza;

    public /* synthetic */ zzgok(zzgon zzgonVar, byte[] bArr) {
        Objects.requireNonNull(zzgonVar);
        this.zza = zzgonVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzgon zzgonVar = this.zza;
        Map mapZzc = zzgonVar.zzc();
        return mapZzc != null ? mapZzc.keySet().iterator() : new zzgof(zzgonVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        zzgon zzgonVar = this.zza;
        Map mapZzc = zzgonVar.zzc();
        return mapZzc != null ? mapZzc.keySet().remove(obj) : zzgonVar.zzj(obj) != zzgon.zzd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
