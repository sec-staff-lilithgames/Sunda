package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.ironsource.C3191e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzesg implements zzexy {
    private final double zza;
    private final boolean zzb;

    public zzesg(double d10, boolean z10) {
        this.zza = d10;
        this.zzb = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzexy
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcxq) obj).zza;
        Bundle bundleZza = zzfhc.zza(bundle, C3191e4.h.G);
        bundle.putBundle(C3191e4.h.G, bundleZza);
        Bundle bundleZza2 = zzfhc.zza(bundleZza, "battery");
        bundleZza.putBundle("battery", bundleZza2);
        bundleZza2.putBoolean("is_charging", this.zzb);
        bundleZza2.putDouble("battery_level", this.zza);
    }
}
