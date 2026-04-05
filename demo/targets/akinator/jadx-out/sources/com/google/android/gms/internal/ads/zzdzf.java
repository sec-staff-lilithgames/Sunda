package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzdzf extends AdListener {
    final /* synthetic */ zzdzl zza;

    public zzdzf(zzdzl zzdzlVar) {
        Objects.requireNonNull(zzdzlVar);
        this.zza = zzdzlVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zza.zzg(zzdzl.zzm(loadAdError));
    }
}
