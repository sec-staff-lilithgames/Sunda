package com.unity3d.services.ads.operation.show;

import com.ironsource.C3352n2;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.AdOperation;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class ShowOperation extends AdOperation implements IShowOperation {
    private ShowOperationState showOperationState;

    public ShowOperation(ShowOperationState showOperationState, IWebViewBridgeInvocation iWebViewBridgeInvocation) {
        super(iWebViewBridgeInvocation, C3352n2.f37928v);
        this.showOperationState = showOperationState;
    }

    @Override // com.unity3d.services.core.webview.bridge.IWebViewSharedObject
    public String getId() {
        return this.showOperationState.f50739id;
    }

    @Override // com.unity3d.services.ads.operation.show.IShowOperation
    public ShowOperationState getShowOperationState() {
        return this.showOperationState;
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowClick(String str) {
        if (this.showOperationState == null) {
            return;
        }
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.operation.show.ShowOperation.3
            @Override // java.lang.Runnable
            public void run() {
                if (ShowOperation.this.showOperationState != null) {
                    ShowOperation.this.showOperationState.onUnityAdsShowClick();
                }
            }
        });
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowComplete(String str, final UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        if (this.showOperationState == null) {
            return;
        }
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.operation.show.ShowOperation.4
            @Override // java.lang.Runnable
            public void run() {
                if (ShowOperation.this.showOperationState != null) {
                    ShowOperation.this.showOperationState.onUnityAdsShowComplete(unityAdsShowCompletionState);
                }
            }
        });
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowFailure(String str, final UnityAds.UnityAdsShowError unityAdsShowError, final String str2) {
        ShowOperationState showOperationState = this.showOperationState;
        if (showOperationState == null || showOperationState.listener == null) {
            return;
        }
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.operation.show.ShowOperation.1
            @Override // java.lang.Runnable
            public void run() {
                if (ShowOperation.this.showOperationState != null) {
                    ShowOperation.this.showOperationState.onUnityAdsShowFailure(unityAdsShowError, str2);
                }
            }
        });
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowStart(final String str) {
        if (this.showOperationState == null) {
            return;
        }
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.operation.show.ShowOperation.2
            @Override // java.lang.Runnable
            public void run() {
                if (ShowOperation.this.showOperationState != null) {
                    ShowOperation.this.showOperationState.onUnityAdsShowStart(str);
                }
            }
        });
    }
}
