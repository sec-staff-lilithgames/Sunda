package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcxz implements zzifh {
    private final zzcxx zza;
    private final zzifq zzb;

    private zzcxz(zzcxx zzcxxVar, zzifq zzifqVar) {
        this.zza = zzcxxVar;
        this.zzb = zzifqVar;
    }

    public static zzcxz zza(zzcxx zzcxxVar, zzifq zzifqVar) {
        return new zzcxz(zzcxxVar, zzifqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZzf = this.zza.zzf(((zzcjv) this.zzb).zza());
        zzifp.zzb(contextZzf);
        return contextZzf;
    }
}
