package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zziff implements zzifh {
    private zzifq zza;

    public static void zza(zzifq zzifqVar, zzifq zzifqVar2) {
        zziff zziffVar = (zziff) zzifqVar;
        if (zziffVar.zza != null) {
            throw new IllegalStateException();
        }
        zziffVar.zza = zzifqVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final Object zzb() {
        zzifq zzifqVar = this.zza;
        if (zzifqVar != null) {
            return zzifqVar.zzb();
        }
        throw new IllegalStateException();
    }
}
