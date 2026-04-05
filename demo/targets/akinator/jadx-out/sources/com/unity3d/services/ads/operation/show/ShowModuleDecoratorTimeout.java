package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.configuration.ExperimentsReader;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.AdOperationError;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import com.unity3d.services.core.timer.BaseTimer;
import com.unity3d.services.core.timer.ITimerListener;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class ShowModuleDecoratorTimeout extends ShowModuleDecorator {
    private static final String errorMsgTimeout = "[UnityAds] Timeout while trying to show ";
    private final ExperimentsReader _experimentsReader;

    public ShowModuleDecoratorTimeout(IShowModule iShowModule, ExperimentsReader experimentsReader) {
        super(iShowModule);
        this._experimentsReader = experimentsReader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onOperationTimeout(ShowOperationState showOperationState, UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        if (showOperationState != null) {
            getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdShowFailure(AdOperationError.timeout, Long.valueOf(showOperationState.duration())));
            remove(showOperationState.f50739id);
            Utilities.runOnUiThread(new a(showOperationState, unityAdsShowError, str, 0));
        }
    }

    private void releaseOperationTimeoutLock(String str) {
        ShowOperationState showOperationState;
        BaseTimer baseTimer;
        IShowOperation iShowOperation = get(str);
        if (iShowOperation == null || (showOperationState = iShowOperation.getShowOperationState()) == null || (baseTimer = showOperationState.timeoutTimer) == null) {
            return;
        }
        baseTimer.kill();
    }

    private void startShowTimeout(final ShowOperationState showOperationState) {
        if (showOperationState == null) {
            return;
        }
        BaseTimer baseTimer = new BaseTimer(Integer.valueOf(showOperationState.configuration.getShowTimeout()), new ITimerListener() { // from class: com.unity3d.services.ads.operation.show.ShowModuleDecoratorTimeout.1
            @Override // com.unity3d.services.core.timer.ITimerListener
            public void onTimerFinished() {
                ShowModuleDecoratorTimeout.this.onOperationTimeout(showOperationState, UnityAds.UnityAdsShowError.TIMEOUT, "[UnityAds] Timeout while trying to show " + showOperationState.placementId);
            }
        });
        showOperationState.timeoutTimer = baseTimer;
        baseTimer.start(Executors.newSingleThreadScheduledExecutor());
    }

    @Override // com.unity3d.services.ads.operation.show.ShowModuleDecorator, com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowConsent(String str) {
        releaseOperationTimeoutLock(str);
        super.onUnityAdsShowConsent(str);
    }

    @Override // com.unity3d.services.ads.operation.show.ShowModuleDecorator, com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        releaseOperationTimeoutLock(str);
        super.onUnityAdsShowFailure(str, unityAdsShowError, str2);
    }

    @Override // com.unity3d.services.ads.operation.show.ShowModuleDecorator, com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowStart(String str) {
        releaseOperationTimeoutLock(str);
        super.onUnityAdsShowStart(str);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.unity3d.services.ads.operation.show.ShowModuleDecorator, com.unity3d.services.ads.operation.IAdModule
    public void executeAdOperation(IWebViewBridgeInvoker iWebViewBridgeInvoker, ShowOperationState showOperationState) {
        getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdShowStart());
        showOperationState.start();
        if (!this._experimentsReader.getCurrentlyActiveExperiments().isNativeShowTimeoutDisabled()) {
            startShowTimeout(showOperationState);
        }
        super.executeAdOperation(iWebViewBridgeInvoker, showOperationState);
    }
}
