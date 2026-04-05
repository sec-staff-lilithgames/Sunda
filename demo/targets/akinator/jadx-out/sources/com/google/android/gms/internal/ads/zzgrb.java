package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgrb extends zzgpo {
    private final transient zzgph zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzgrb(zzgph zzgphVar, Object[] objArr, int i10, int i11) {
        this.zza = zzgphVar;
        this.zzb = objArr;
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzgpa, java.util.AbstractCollection, java.util.Collection
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

    @Override // com.google.android.gms.internal.ads.zzgpo, com.google.android.gms.internal.ads.zzgpa, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zze().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgpo, com.google.android.gms.internal.ads.zzgpa
    /* renamed from: zza */
    public final zzgrs iterator() {
        return zze().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    public final int zzg(Object[] objArr, int i10) {
        return zze().zzg(objArr, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgpo
    public final zzgpe zzr() {
        return new zzgra(this);
    }

    public final /* synthetic */ Object[] zzv() {
        return this.zzb;
    }

    public final /* synthetic */ int zzw() {
        return this.zzc;
    }
}
