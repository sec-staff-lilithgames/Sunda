package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import kotlinx.coroutines.flow.Flow;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface OfferwallManager {
    Object getVersion(d<? super String> dVar);

    Object isAdReady(String str, d<? super Boolean> dVar);

    Object isConnected(d<? super Boolean> dVar);

    Object loadAd(String str, d<? super x0> dVar);

    Flow<OfferwallEventData> showAd(String str);
}
