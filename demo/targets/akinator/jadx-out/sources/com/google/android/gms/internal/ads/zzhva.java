package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhva extends zzhvb {
    final /* synthetic */ zzhvi zza;
    private int zzb;
    private final int zzc;

    public zzhva(zzhvi zzhviVar) {
        Objects.requireNonNull(zzhviVar);
        this.zza = zzhviVar;
        this.zzb = 0;
        this.zzc = zzhviVar.zzc();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhvd
    public final byte zza() {
        int i10 = this.zzb;
        if (i10 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i10 + 1;
        return this.zza.zzb(i10);
    }
}
