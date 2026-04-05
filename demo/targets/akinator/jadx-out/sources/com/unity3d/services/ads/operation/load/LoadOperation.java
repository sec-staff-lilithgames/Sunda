package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.AdOperation;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class LoadOperation extends AdOperation implements ILoadOperation {
    private LoadOperationState _loadOperationState;

    public LoadOperation(LoadOperationState loadOperationState, IWebViewBridgeInvocation iWebViewBridgeInvocation) {
        super(iWebViewBridgeInvocation, "load");
        this._loadOperationState = loadOperationState;
    }

    @Override // com.unity3d.services.core.webview.bridge.IWebViewSharedObject
    public String getId() {
        return this._loadOperationState.f50739id;
    }

    @Override // com.unity3d.services.ads.operation.load.ILoadOperation
    public LoadOperationState getLoadOperationState() {
        return this._loadOperationState;
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public void onUnityAdsAdLoaded(String str) {
        LoadOperationState loadOperationState = this._loadOperationState;
        if (loadOperationState == null || loadOperationState.listener == null || str == null) {
            return;
        }
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.operation.load.LoadOperation.1
            @Override // java.lang.Runnable
            public void run() {
                if (LoadOperation.this._loadOperationState != null) {
                    LoadOperation.this._loadOperationState.onUnityAdsAdLoaded();
                }
            }
        });
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public void onUnityAdsFailedToLoad(String str, final UnityAds.UnityAdsLoadError unityAdsLoadError, final String str2) {
        LoadOperationState loadOperationState = this._loadOperationState;
        if (loadOperationState == null || loadOperationState.listener == null || str == null) {
            return;
        }
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.operation.load.LoadOperation.2
            @Override // java.lang.Runnable
            public void run() {
                if (LoadOperation.this._loadOperationState != null) {
                    LoadOperation.this._loadOperationState.onUnityAdsFailedToLoad(unityAdsLoadError, str2);
                }
            }
        });
    }
}
