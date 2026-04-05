package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final /* synthetic */ class zzerm implements zzglu {
    static final /* synthetic */ zzerm zza = new zzerm();

    private /* synthetic */ zzerm() {
    }

    @Override // com.google.android.gms.internal.ads.zzglu
    public final /* synthetic */ Object apply(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return new zzero(appSetIdInfo.getId(), appSetIdInfo.getScope());
    }
}
