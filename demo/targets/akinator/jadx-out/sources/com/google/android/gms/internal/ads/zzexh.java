package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzexh implements zzexy {
    private final String zza;
    private final Bundle zzb;
    private final String zzc;

    public zzexh(String str, Bundle bundle, String str2) {
        this.zza = str;
        this.zzb = bundle;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzexy
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcxq) obj).zza;
        bundle.putString("rtb", this.zza);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzeL)).booleanValue()) {
            String str = this.zzc;
            if (!str.isEmpty()) {
                bundle.putString("cld_status", str);
            }
        }
        Bundle bundle2 = this.zzb;
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("adapter_initialization_status", bundle2);
    }
}
