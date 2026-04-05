package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfpv {
    private final zzfrj zza;
    private final String zzb;
    private final zzfpb zzc;
    private final String zzd = "Ad overlay";

    public zzfpv(View view, zzfpb zzfpbVar, String str) {
        this.zza = new zzfrj(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = zzfpbVar;
    }

    public final zzfrj zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final zzfpb zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }
}
