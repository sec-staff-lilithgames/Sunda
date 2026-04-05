package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzifs {
    private final List zza;
    private final List zzb;

    public /* synthetic */ zzifs(int i10, int i11, zzifr zzifrVar) {
        this.zza = zzife.zza(i10);
        this.zzb = zzife.zza(i11);
    }

    public final zzifs zza(zzifq zzifqVar) {
        this.zza.add(zzifqVar);
        return this;
    }

    public final zzifs zzb(zzifq zzifqVar) {
        this.zzb.add(zzifqVar);
        return this;
    }

    public final zzift zzc() {
        return new zzift(this.zza, this.zzb, null);
    }
}
