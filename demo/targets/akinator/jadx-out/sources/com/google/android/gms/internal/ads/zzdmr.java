package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdmr {
    private final zzdvi zza;

    public zzdmr(zzdvi zzdviVar) {
        this.zza = zzdviVar;
    }

    public final void zza(View view, zzffu zzffuVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zznV)).booleanValue() || view == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzab.zza(view) ? "0" : "1";
        zzdvh zzdvhVarZza = this.zza.zza();
        zzdvhVarZza.zzc("action", "hcp");
        zzdvhVarZza.zzc("hcp", str);
        zzdvhVarZza.zzb(zzffuVar);
        zzdvhVarZza.zzd();
    }
}
