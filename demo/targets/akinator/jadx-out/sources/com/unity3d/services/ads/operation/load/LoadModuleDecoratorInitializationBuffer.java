package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IInitializationListener;
import com.unity3d.services.core.configuration.IInitializationNotificationCenter;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class LoadModuleDecoratorInitializationBuffer extends LoadModuleDecorator implements IInitializationListener {
    private static final String errorMsgInitializationFailed = "[UnityAds] SDK Initialization Failed";
    private static final String errorMsgInitializationFailure = "[UnityAds] SDK Initialization Failure";
    private ConcurrentHashMap<LoadOperationState, IWebViewBridgeInvoker> _queuedLoadEvents;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.services.ads.operation.load.LoadModuleDecoratorInitializationBuffer$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState;

        static {
            int[] iArr = new int[SdkProperties.InitializationState.values().length];
            $SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState = iArr;
            try {
                iArr[SdkProperties.InitializationState.INITIALIZED_SUCCESSFULLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState[SdkProperties.InitializationState.INITIALIZED_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public LoadModuleDecoratorInitializationBuffer(ILoadModule iLoadModule, IInitializationNotificationCenter iInitializationNotificationCenter) {
        super(iLoadModule);
        iInitializationNotificationCenter.addListener(this);
        this._queuedLoadEvents = new ConcurrentHashMap<>();
    }

    private void sendOnUnityAdsFailedToLoad(final LoadOperationState loadOperationState, final UnityAds.UnityAdsLoadError unityAdsLoadError, final String str) {
        if (loadOperationState == null || loadOperationState.listener == null) {
            return;
        }
        getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdLoadFailure(unityAdsLoadError, Long.valueOf(loadOperationState.duration()), loadOperationState.isBanner(), loadOperationState.isHeaderBidding()));
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.operation.load.LoadModuleDecoratorInitializationBuffer.1
            @Override // java.lang.Runnable
            public void run() {
                LoadOperationState loadOperationState2 = loadOperationState;
                loadOperationState2.listener.onUnityAdsFailedToLoad(loadOperationState2.placementId, unityAdsLoadError, str);
            }
        });
    }

    @Override // com.unity3d.services.core.configuration.IInitializationListener
    public synchronized void onSdkInitializationFailed(String str, ErrorState errorState, int i10) {
        try {
            Iterator<LoadOperationState> it = this._queuedLoadEvents.keySet().iterator();
            while (it.hasNext()) {
                sendOnUnityAdsFailedToLoad(it.next(), UnityAds.UnityAdsLoadError.INITIALIZE_FAILED, "[UnityAds] SDK Initialization Failure");
            }
            this._queuedLoadEvents.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializationListener
    public synchronized void onSdkInitialized() {
        try {
            for (Map.Entry<LoadOperationState, IWebViewBridgeInvoker> entry : this._queuedLoadEvents.entrySet()) {
                super.executeAdOperation(entry.getValue(), entry.getKey());
            }
            this._queuedLoadEvents.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.unity3d.services.ads.operation.load.LoadModuleDecorator, com.unity3d.services.ads.operation.IAdModule
    public void executeAdOperation(IWebViewBridgeInvoker iWebViewBridgeInvoker, LoadOperationState loadOperationState) {
        if (loadOperationState == null) {
            return;
        }
        int i10 = AnonymousClass2.$SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState[SdkProperties.getCurrentInitializationState().ordinal()];
        if (i10 == 1) {
            super.executeAdOperation(iWebViewBridgeInvoker, loadOperationState);
        } else if (i10 != 2) {
            this._queuedLoadEvents.put(loadOperationState, iWebViewBridgeInvoker);
        } else {
            sendOnUnityAdsFailedToLoad(loadOperationState, UnityAds.UnityAdsLoadError.INITIALIZE_FAILED, "[UnityAds] SDK Initialization Failed");
        }
    }
}
