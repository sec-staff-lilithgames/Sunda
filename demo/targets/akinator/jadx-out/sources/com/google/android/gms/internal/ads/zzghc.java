package com.google.android.gms.internal.ads;

import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzghc implements zzifh {
    private final zzifq zza;

    private zzghc(zzifq zzifqVar) {
        this.zza = zzifqVar;
    }

    public static zzghc zza(zzifq zzifqVar) {
        return new zzghc(zzifqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File((File) this.zza.zzb(), "dgd"), "pcopt");
    }
}
