package com.google.android.gms.internal.gtm;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zztv extends zztl {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc = 6;

    public zztv(Object[] objArr, int i10, int i11) {
        this.zza = objArr;
        this.zzb = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zztd.zza(i10, this.zzc, "index");
        Object obj = this.zza[i10 + i10 + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
