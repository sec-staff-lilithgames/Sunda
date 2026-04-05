package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgrj extends zzgrn {
    final /* synthetic */ Set zza;
    final /* synthetic */ Set zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgrj(Set set, Set set2) {
        super(null);
        this.zza = set;
        this.zzb = set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.contains(obj) && this.zzb.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.zza.containsAll(collection) && this.zzb.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.zzb, this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.zza.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.zzb.contains(it.next())) {
                i10++;
            }
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgrn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: zza */
    public final zzgrs iterator() {
        return new zzgri(this, this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgrn
    public final int zzb() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgrn
    public final int zzc() {
        return Math.min(zzgrn.zzd(this.zza), zzgrn.zzd(this.zzb));
    }
}
