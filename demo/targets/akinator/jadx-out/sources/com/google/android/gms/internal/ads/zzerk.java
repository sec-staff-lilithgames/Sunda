package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final /* synthetic */ class zzerk implements zzgtq {
    static final /* synthetic */ zzerk zza = new zzerk();

    private /* synthetic */ zzerk() {
    }

    @Override // com.google.android.gms.internal.ads.zzgtq
    public final /* synthetic */ n1 zza(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return appSetIdInfo == null ? zzgui.zza(new zzero(null, -1)) : zzgui.zza(new zzero(appSetIdInfo.getId(), appSetIdInfo.getScope()));
    }
}
