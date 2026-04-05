package com.google.android.gms.internal.gtm;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zztr extends zztl {
    static final zztl zza = new zztr(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zztr(Object[] objArr, int i10) {
        this.zzb = objArr;
        this.zzc = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zztd.zza(i10, this.zzc, "index");
        Object obj = this.zzb[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zztl, com.google.android.gms.internal.gtm.zzti
    public final int zza(Object[] objArr, int i10) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzti
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzti
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.gtm.zzti
    public final Object[] zze() {
        return this.zzb;
    }
}
