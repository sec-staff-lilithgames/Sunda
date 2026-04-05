package com.google.android.gms.internal.ads;

import java.util.AbstractList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhwy extends AbstractList {
    private final zzhww zza;
    private final zzhwx zzb;

    public zzhwy(zzhww zzhwwVar, zzhwx zzhwxVar) {
        this.zza = zzhwwVar;
        this.zzb = zzhwxVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return this.zzb.zzb(this.zza.zzf(i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
