package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class ShowModuleDecorator implements IShowModule {
    private final IShowModule _showModule;

    public ShowModuleDecorator(IShowModule iShowModule) {
        this._showModule = iShowModule;
    }

    @Override // com.unity3d.services.ads.operation.IAdModule
    public SDKMetricsSender getMetricSender() {
        return this._showModule.getMetricSender();
    }

    @Override // com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowClick(String str) {
        this._showModule.onUnityAdsShowClick(str);
    }

    @Override // com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        this._showModule.onUnityAdsShowComplete(str, unityAdsShowCompletionState);
    }

    @Override // com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowConsent(String str) {
        this._showModule.onUnityAdsShowConsent(str);
    }

    @Override // com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        this._showModule.onUnityAdsShowFailure(str, unityAdsShowError, str2);
    }

    @Override // com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowStart(String str) {
        this._showModule.onUnityAdsShowStart(str);
    }

    @Override // com.unity3d.services.core.webview.bridge.IWebViewBridgeSharedObjectStore
    public void remove(String str) {
        this._showModule.remove(str);
    }

    @Override // com.unity3d.services.ads.operation.IAdModule
    public void executeAdOperation(IWebViewBridgeInvoker iWebViewBridgeInvoker, ShowOperationState showOperationState) {
        this._showModule.executeAdOperation(iWebViewBridgeInvoker, showOperationState);
    }

    @Override // com.unity3d.services.core.webview.bridge.IWebViewBridgeSharedObjectStore
    public IShowOperation get(String str) {
        return (IShowOperation) this._showModule.get(str);
    }

    @Override // com.unity3d.services.core.webview.bridge.IWebViewBridgeSharedObjectStore
    public void set(IShowOperation iShowOperation) {
        this._showModule.set(iShowOperation);
    }
}
