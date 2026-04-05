package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbuy extends zzbjy {
    private final NativeAd.UnconfirmedClickListener zza;

    public zzbuy(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.zza = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbjz
    public final void zze(String str) {
        this.zza.onUnconfirmedClickReceived(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbjz
    public final void zzf() {
        this.zza.onUnconfirmedClickCancelled();
    }
}
