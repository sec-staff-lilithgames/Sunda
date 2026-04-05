package com.unity3d.ads.core.domain.scar;

import av.e;
import com.unity3d.ads.core.data.manager.ScarManager;
import kotlin.jvm.internal.e0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class LoadScarAd {
    private final ScarManager scarManager;

    public LoadScarAd(ScarManager scarManager) {
        e0.checkNotNullParameter(scarManager, "scarManager");
        this.scarManager = scarManager;
    }

    public final Object invoke(String str, String str2, String str3, String str4, String str5, int i10, d<? super x0> dVar) {
        Object objLoadAd;
        boolean zAreEqual = e0.areEqual(str, "banner");
        x0 x0Var = x0.f87415a;
        return (!zAreEqual && (objLoadAd = this.scarManager.loadAd(str, str2, str4, str3, str5, i10, dVar)) == e.getCOROUTINE_SUSPENDED()) ? objLoadAd : x0Var;
    }
}
