package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgbj implements zzifh {
    private final zzifq zza;

    private zzgbj(zzifq zzifqVar) {
        this.zza = zzifqVar;
    }

    public static zzgbj zza(zzifq zzifqVar) {
        return new zzgbj(zzifqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        DisplayMetrics displayMetrics = ((Context) this.zza.zzb()).getResources().getDisplayMetrics();
        zzifp.zzb(displayMetrics);
        return displayMetrics;
    }
}
