package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.ironsource.C3191e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzevu implements zzexy {
    public final Bundle zza;

    public zzevu(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzexy
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcxq) obj).zza;
        Bundle bundleZza = zzfhc.zza(bundle, C3191e4.h.G);
        bundleZza.putBundle("android_mem_info", this.zza);
        bundle.putBundle(C3191e4.h.G, bundleZza);
    }
}
