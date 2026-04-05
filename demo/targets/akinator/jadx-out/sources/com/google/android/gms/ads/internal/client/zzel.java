package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.LoadAdError;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzel extends zzbc {
    final /* synthetic */ zzen zza;

    public zzel(zzen zzenVar) {
        Objects.requireNonNull(zzenVar);
        this.zza = zzenVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbc, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        zzen zzenVar = this.zza;
        zzenVar.zzE().zza(zzenVar.zzz());
        super.onAdFailedToLoad(loadAdError);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbc, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        zzen zzenVar = this.zza;
        zzenVar.zzE().zza(zzenVar.zzz());
        super.onAdLoaded();
    }
}
