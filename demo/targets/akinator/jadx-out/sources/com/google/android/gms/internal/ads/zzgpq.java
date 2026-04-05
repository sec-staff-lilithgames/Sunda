package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgpq extends zzgpo {
    private final transient zzgpr zza;

    public zzgpq(zzgpr zzgprVar) {
        this.zza = zzgprVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgpa, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzgpr zzgprVar = this.zza;
            Object key = entry.getKey();
            Object value = entry.getValue();
            Collection collection = (Collection) zzgprVar.zzu().get(key);
            if (collection != null && collection.contains(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgpo, com.google.android.gms.internal.ads.zzgpa, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgpi(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size;
    }

    @Override // com.google.android.gms.internal.ads.zzgpo, com.google.android.gms.internal.ads.zzgpa
    /* renamed from: zza */
    public final zzgrs iterator() {
        return new zzgpi(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    public final boolean zzf() {
        return false;
    }
}
