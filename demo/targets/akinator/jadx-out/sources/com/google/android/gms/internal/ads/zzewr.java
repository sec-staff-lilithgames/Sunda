package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzewr implements zzexy {
    private final Bundle zza;

    public zzewr(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzexy
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = this.zza;
        zzcxq zzcxqVar = (zzcxq) obj;
        if (bundle != null) {
            zzcxqVar.zza.putAll(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzexy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = this.zza;
        zzcxq zzcxqVar = (zzcxq) obj;
        if (bundle != null) {
            zzcxqVar.zzb.putAll(bundle);
        }
    }
}
