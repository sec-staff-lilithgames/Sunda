package com.unity3d.ads.core.domain.offerwall;

import av.e;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import kotlin.jvm.internal.e0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class LoadOfferwallAd {
    private final OfferwallManager offerwallManager;

    public LoadOfferwallAd(OfferwallManager offerwallManager) {
        e0.checkNotNullParameter(offerwallManager, "offerwallManager");
        this.offerwallManager = offerwallManager;
    }

    public final Object invoke(String str, d<? super x0> dVar) {
        Object objLoadAd = this.offerwallManager.loadAd(str, dVar);
        return objLoadAd == e.getCOROUTINE_SUSPENDED() ? objLoadAd : x0.f87415a;
    }
}
