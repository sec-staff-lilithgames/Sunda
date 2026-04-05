package com.unity3d.ads.core.domain.offerwall;

import com.unity3d.ads.core.data.manager.OfferwallManager;
import kotlin.jvm.internal.e0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class GetIsOfferwallAdReady {
    private final OfferwallManager offerwallManager;

    public GetIsOfferwallAdReady(OfferwallManager offerwallManager) {
        e0.checkNotNullParameter(offerwallManager, "offerwallManager");
        this.offerwallManager = offerwallManager;
    }

    public final Object invoke(String str, d<? super Boolean> dVar) {
        return this.offerwallManager.isAdReady(str, dVar);
    }
}
