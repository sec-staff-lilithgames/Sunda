package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
class zzgnj extends zzgqk {
    final transient Map zza;
    final /* synthetic */ zzgnw zzb;

    public zzgnj(zzgnw zzgnwVar, Map map) {
        Objects.requireNonNull(zzgnwVar);
        this.zzb = zzgnwVar;
        this.zza = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzgnw zzgnwVar = this.zzb;
        if (this.zza == zzgnwVar.zzo()) {
            zzgnwVar.zzf();
        } else {
            zzgpx.zzb(new zzgni(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.zza;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.zza.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) zzgql.zza(this.zza, obj);
        if (collection == null) {
            return null;
        }
        return this.zzb.zzb(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzgqk, java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.zzb.zzs();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.zza.remove(obj);
        if (collection == null) {
            return null;
        }
        zzgnw zzgnwVar = this.zzb;
        Collection collectionZzc = zzgnwVar.zzc();
        collectionZzc.addAll(collection);
        zzgnwVar.zzq(zzgnwVar.zzp() - collection.size());
        collection.clear();
        return collectionZzc;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zza.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgqk
    public final Set zza() {
        return new zzgnh(this);
    }

    public final Map.Entry zzb(Map.Entry entry) {
        Object key = entry.getKey();
        return new AbstractMap.SimpleImmutableEntry(key, this.zzb.zzb(key, (Collection) entry.getValue()));
    }
}
