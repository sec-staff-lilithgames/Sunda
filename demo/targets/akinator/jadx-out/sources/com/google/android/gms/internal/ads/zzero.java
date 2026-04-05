package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzero implements zzexy {
    final String zza;
    final int zzb;

    public zzero(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzexy
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i10;
        Bundle bundle = ((zzcxq) obj).zza;
        String str = this.zza;
        if (TextUtils.isEmpty(str) || (i10 = this.zzb) == -1) {
            return;
        }
        Bundle bundleZza = zzfhc.zza(bundle, "pii");
        bundle.putBundle("pii", bundleZza);
        bundleZza.putString("pvid", str);
        bundleZza.putInt("pvid_s", i10);
    }
}
