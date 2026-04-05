package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgnh extends zzgqh {
    final /* synthetic */ zzgnj zza;

    public zzgnh(zzgnj zzgnjVar) {
        Objects.requireNonNull(zzgnjVar);
        this.zza = zzgnjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return zzgoe.zza(this.zza.zza.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzgni(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgqh, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        zzgnj zzgnjVar = this.zza;
        zzgnjVar.zzb.zzn(entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final Map zza() {
        return this.zza;
    }
}
