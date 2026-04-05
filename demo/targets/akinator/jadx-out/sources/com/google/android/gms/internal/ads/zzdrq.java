package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdz;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdrq implements zzifh {
    private final zzifq zza;

    private zzdrq(zzifq zzifqVar) {
        this.zza = zzifqVar;
    }

    public static zzdrq zza(zzifq zzifqVar) {
        return new zzdrq(zzifqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbdz.zza.EnumC0159zza enumC0159zza = ((zzcyf) this.zza).zza().zzp.zza == 3 ? zzbdz.zza.EnumC0159zza.REWARDED_INTERSTITIAL : zzbdz.zza.EnumC0159zza.REWARD_BASED_VIDEO_AD;
        zzifp.zzb(enumC0159zza);
        return enumC0159zza;
    }
}
