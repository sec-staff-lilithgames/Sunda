package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zztt extends zztp {
    private final transient zzto zza;
    private final transient Object[] zzb;
    private final transient int zzc = 6;

    public zztt(zzto zztoVar, Object[] objArr, int i10, int i11) {
        this.zza = zztoVar;
        this.zzb = objArr;
    }

    @Override // com.google.android.gms.internal.gtm.zzti, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.gtm.zztp, com.google.android.gms.internal.gtm.zzti, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzg().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzti
    public final int zza(Object[] objArr, int i10) {
        return zzg().zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.gtm.zztp, com.google.android.gms.internal.gtm.zzti
    /* renamed from: zzd */
    public final zzua iterator() {
        return zzg().listIterator(0);
    }

    @Override // com.google.android.gms.internal.gtm.zztp
    public final zztl zzh() {
        return new zzts(this);
    }
}
