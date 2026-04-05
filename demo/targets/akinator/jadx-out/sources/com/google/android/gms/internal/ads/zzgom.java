package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgom extends AbstractCollection {
    final /* synthetic */ zzgon zza;

    public /* synthetic */ zzgom(zzgon zzgonVar, byte[] bArr) {
        Objects.requireNonNull(zzgonVar);
        this.zza = zzgonVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzgon zzgonVar = this.zza;
        Map mapZzc = zzgonVar.zzc();
        return mapZzc != null ? mapZzc.values().iterator() : new zzgoh(zzgonVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}
