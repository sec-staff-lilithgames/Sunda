package com.google.android.gms.internal.gtm;

import java.util.AbstractList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzacm extends AbstractList {
    private final zzack zza;

    public zzacm(zzack zzackVar, zzacl zzaclVar) {
        this.zza = zzackVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        zzam zzamVarZzb = zzam.zzb(this.zza.zze(i10));
        return zzamVarZzb == null ? zzam.ESCAPE_HTML : zzamVarZzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
