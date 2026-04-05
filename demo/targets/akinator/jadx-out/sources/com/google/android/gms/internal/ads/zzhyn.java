package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhyn extends zzhvb {
    final zzhyp zza;
    zzhvd zzb;
    final /* synthetic */ zzhyq zzc;

    public zzhyn(zzhyq zzhyqVar) {
        Objects.requireNonNull(zzhyqVar);
        this.zzc = zzhyqVar;
        this.zza = new zzhyp(zzhyqVar, null);
        this.zzb = zzb();
    }

    private final zzhvd zzb() {
        zzhyp zzhypVar = this.zza;
        if (zzhypVar.hasNext()) {
            return zzhypVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zzhvd
    public final byte zza() {
        zzhvd zzhvdVar = this.zzb;
        if (zzhvdVar == null) {
            throw new NoSuchElementException();
        }
        byte bZza = zzhvdVar.zza();
        if (!this.zzb.hasNext()) {
            this.zzb = zzb();
        }
        return bZza;
    }
}
