package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
class zzgnm extends zzgqi {
    final /* synthetic */ zzgnw zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgnm(zzgnw zzgnwVar, Map map) {
        super(map);
        Objects.requireNonNull(zzgnwVar);
        this.zza = zzgnwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqi, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        zzgpx.zzb(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.zzd.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.zzd.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zzd.keySet().hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzgqi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzgnl(this, this.zzd.entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.ads.zzgqi, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.zzd.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        zzgnw zzgnwVar = this.zza;
        zzgnwVar.zzq(zzgnwVar.zzp() - size);
        return size > 0;
    }
}
