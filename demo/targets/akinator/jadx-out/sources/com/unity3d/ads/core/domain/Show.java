package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.ShowEvent;
import kotlinx.coroutines.flow.Flow;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface Show {
    Flow<ShowEvent> invoke(AdObject adObject, UnityAdsShowOptions unityAdsShowOptions);

    Object terminate(AdObject adObject, d<? super x0> dVar);
}
