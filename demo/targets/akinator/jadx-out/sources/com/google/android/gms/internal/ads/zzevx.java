package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzevx implements zzexy {
    public final zzfft zza;

    public zzevx(zzfft zzfftVar) {
        this.zza = zzfftVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexy
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzcxq zzcxqVar = (zzcxq) obj;
        zzfft zzfftVar = this.zza;
        if (zzfftVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzmV)).booleanValue()) {
                return;
            }
            Bundle bundle = zzcxqVar.zza;
            bundle.putBoolean("render_in_browser", zzfftVar.zzb());
            bundle.putBoolean("disable_ml", zzfftVar.zzc());
        }
    }
}
