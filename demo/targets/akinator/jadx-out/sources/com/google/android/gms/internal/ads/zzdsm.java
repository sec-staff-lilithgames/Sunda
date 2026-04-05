package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdsm implements zzczj {
    private final zzcgy zza;

    public zzdsm(zzcgy zzcgyVar) {
        this.zza = zzcgyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zza(Context context) {
        zzcgy zzcgyVar = this.zza;
        if (zzcgyVar != null) {
            zzcgyVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzb(Context context) {
        zzcgy zzcgyVar = this.zza;
        if (zzcgyVar != null) {
            zzcgyVar.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzc(Context context) {
        zzcgy zzcgyVar = this.zza;
        if (zzcgyVar != null) {
            zzcgyVar.destroy();
        }
    }
}
