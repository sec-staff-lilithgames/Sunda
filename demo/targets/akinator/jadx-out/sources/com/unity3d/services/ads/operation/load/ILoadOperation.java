package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.services.ads.operation.IAdOperation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface ILoadOperation extends IAdOperation, IUnityAdsLoadListener {
    LoadOperationState getLoadOperationState();
}
