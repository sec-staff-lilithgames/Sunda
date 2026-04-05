package com.moloco.sdk.internal.unity_bridge;

import a1.k;
import android.content.Context;
import ao.q0;
import com.ironsource.C3191e4;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.unity_bridge.internal.b;
import com.moloco.sdk.publisher.Initialization;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.publisher.Moloco;
import com.moloco.sdk.publisher.MolocoInitStatus;
import com.moloco.sdk.publisher.init.MolocoInitParams;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import sv.n0;
import tu.o;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class MolocoUnityPlugin {
    private static final String TAG = "MolocoUnityPlugin";
    public static final MolocoUnityPlugin INSTANCE = new MolocoUnityPlugin();
    private static final MutableStateFlow<Boolean> initState = StateFlowKt.MutableStateFlow(Boolean.FALSE);
    private static final o context$delegate = q.lazy(new k(26));
    private static final o adManager$delegate = q.lazy(new k(27));
    public static final int $stable = 8;

    private MolocoUnityPlugin() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b adManager_delegate$lambda$1() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context context_delegate$lambda$0() {
        return com.moloco.sdk.internal.android_context.b.a(null, 1, null);
    }

    private final b getAdManager() {
        return (b) adManager$delegate.getValue();
    }

    private final Context getContext() {
        return (Context) context$delegate.getValue();
    }

    public static final void initializeSdk(String appKey, String mediationName, MolocoUnityInitCallback callback) {
        e0.checkNotNullParameter(appKey, "appKey");
        e0.checkNotNullParameter(mediationName, "mediationName");
        e0.checkNotNullParameter(callback, "callback");
        Moloco.initialize(new MolocoInitParams(INSTANCE.getContext(), appKey, new MediationInfo(mediationName)), new q0(appKey, 7, mediationName, callback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initializeSdk$lambda$3(String str, String str2, MolocoUnityInitCallback molocoUnityInitCallback, MolocoInitStatus initStatus) {
        e0.checkNotNullParameter(initStatus, "initStatus");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, TAG, "initialized " + str + ' ' + str2 + ' ' + initStatus.getInitialization(), null, false, 12, null);
        boolean z10 = initStatus.getInitialization() == Initialization.SUCCESS;
        initState.setValue(Boolean.valueOf(z10));
        molocoUnityInitCallback.onInitialized(z10);
    }

    public static final void loadInterstitial(String mediation, String adUnitId, String bidResponse, MolocoUnityLoadCallback callback) {
        e0.checkNotNullParameter(mediation, "mediation");
        e0.checkNotNullParameter(adUnitId, "adUnitId");
        e0.checkNotNullParameter(bidResponse, "bidResponse");
        e0.checkNotNullParameter(callback, "callback");
        if (initState.getValue().booleanValue()) {
            INSTANCE.getAdManager().a(n0.trim(mediation).toString(), n0.trim(adUnitId).toString(), bidResponse, callback);
        } else {
            INSTANCE.logUninitializedAccessError(C3191e4.g.E);
        }
    }

    private final void logUninitializedAccessError(String str) {
        MolocoLogger.error$default(MolocoLogger.INSTANCE, TAG, a.b.l("ERROR: Failed to execute ", str, "() - please ensure the Moloco Unity Plugin has been initialized by calling 'MolocoSdk.InitializeSdk();'!"), null, false, 12, null);
    }

    public static final void showInterstitial(String adUnitId, MolocoUnityShowCallback callback) {
        e0.checkNotNullParameter(adUnitId, "adUnitId");
        e0.checkNotNullParameter(callback, "callback");
        if (initState.getValue().booleanValue()) {
            INSTANCE.getAdManager().a(n0.trim(adUnitId).toString(), callback);
        } else {
            INSTANCE.logUninitializedAccessError(C3191e4.g.H);
        }
    }
}
