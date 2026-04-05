package com.google.android.gms.internal.ads;

import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeei {
    private final zzbxd zza;

    public zzeei(zzbxd zzbxdVar) {
        this.zza = zzbxdVar;
    }

    public final void zza() {
        n1 n1VarZza = this.zza.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zziq)).booleanValue()) {
            zzcby.zzb(n1VarZza, "persistFlags");
        } else {
            zzcby.zza(n1VarZza, "persistFlags");
        }
    }
}
