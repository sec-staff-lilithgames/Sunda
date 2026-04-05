package com.google.android.gms.internal.gtm;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zztu extends zztp {
    private final transient zzto zza;
    private final transient zztl zzb;

    public zztu(zzto zztoVar, zztl zztlVar) {
        this.zza = zztoVar;
        this.zzb = zztlVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzti, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.gtm.zztp, com.google.android.gms.internal.gtm.zzti, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 6;
    }

    @Override // com.google.android.gms.internal.gtm.zzti
    public final int zza(Object[] objArr, int i10) {
        return this.zzb.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.gtm.zztp, com.google.android.gms.internal.gtm.zzti
    /* renamed from: zzd */
    public final zzua iterator() {
        return this.zzb.listIterator(0);
    }
}
