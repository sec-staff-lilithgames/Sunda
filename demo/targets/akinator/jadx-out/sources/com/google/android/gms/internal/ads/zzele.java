package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzele {
    private zzekv zza;

    public zzele() {
    }

    public static zzele zza(zzekv zzekvVar) {
        return new zzele(zzekvVar);
    }

    public final zzekv zzb(Clock clock, zzekx zzekxVar, zzehp zzehpVar, zzfng zzfngVar) {
        zzekv zzekvVar = this.zza;
        return zzekvVar != null ? zzekvVar : new zzekv(clock, zzekxVar, zzehpVar, zzfngVar);
    }

    private zzele(zzekv zzekvVar) {
        this.zza = zzekvVar;
    }
}
