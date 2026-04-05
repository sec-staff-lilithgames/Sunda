package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcrp implements zzifh {
    private final zzcrn zza;

    private zzcrp(zzcrn zzcrnVar) {
        this.zza = zzcrnVar;
    }

    public static zzcrp zzc(zzcrn zzcrnVar) {
        return new zzcrp(zzcrnVar);
    }

    public static View zzd(zzcrn zzcrnVar) {
        View viewZzb = zzcrnVar.zzb();
        zzifp.zzb(viewZzb);
        return viewZzb;
    }

    public final View zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
