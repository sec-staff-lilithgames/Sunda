package com.unity3d.ads;

import android.app.Activity;
import android.content.Context;
import com.unity3d.services.ads.IUnityAds;
import com.unity3d.services.ads.UnityAdsImplementation;
import kotlin.jvm.internal.e0;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class UnityAds {
    public static final UnityAds INSTANCE = new UnityAds();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum UnityAdsInitializationError {
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        AD_BLOCKER_DETECTED
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum UnityAdsLoadError {
        INITIALIZE_FAILED,
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        NO_FILL,
        TIMEOUT
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum UnityAdsShowCompletionState {
        SKIPPED,
        COMPLETED
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum UnityAdsShowError {
        NOT_INITIALIZED,
        NOT_READY,
        VIDEO_PLAYER_ERROR,
        INVALID_ARGUMENT,
        NO_CONNECTION,
        ALREADY_SHOWING,
        INTERNAL_ERROR,
        TIMEOUT
    }

    private UnityAds() {
    }

    public static final boolean getDebugMode() {
        return UnityAdsImplementation.getInstance().getDebugMode();
    }

    public static final String getToken() {
        return UnityAdsImplementation.getInstance().getToken();
    }

    public static final String getVersion() {
        String version = UnityAdsImplementation.getInstance().getVersion();
        e0.checkNotNullExpressionValue(version, "getInstance().version");
        return version;
    }

    public static final void initialize(Context context, String str) {
        UnityAdsImplementation.getInstance().initialize(context, str, false, null);
    }

    public static final boolean isInitialized() {
        return UnityAdsImplementation.getInstance().isInitialized();
    }

    public static final boolean isSupported() {
        return UnityAdsImplementation.getInstance().isSupported();
    }

    @f
    public static final void load(String str) {
        load(str, new IUnityAdsLoadListener() { // from class: com.unity3d.ads.UnityAds.load.1
            @Override // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsAdLoaded(String placementId) {
                e0.checkNotNullParameter(placementId, "placementId");
            }

            @Override // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsFailedToLoad(String placementId, UnityAdsLoadError error, String message) {
                e0.checkNotNullParameter(placementId, "placementId");
                e0.checkNotNullParameter(error, "error");
                e0.checkNotNullParameter(message, "message");
            }
        });
    }

    public static final void setDebugMode(boolean z10) {
        UnityAdsImplementation.getInstance().setDebugMode(z10);
    }

    @f
    public static final void show(Activity activity, String str) {
        UnityAdsImplementation.getInstance().show(activity, str, new UnityAdsShowOptions(), null);
    }

    public static final void getToken(IUnityAdsTokenListener iUnityAdsTokenListener) {
        UnityAdsImplementation.getInstance().getToken(iUnityAdsTokenListener);
    }

    public static final void initialize(Context context, String str, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        UnityAdsImplementation.getInstance().initialize(context, str, false, iUnityAdsInitializationListener);
    }

    public static final void load(String str, IUnityAdsLoadListener iUnityAdsLoadListener) {
        UnityAdsImplementation.getInstance().load(str, new UnityAdsLoadOptions(), iUnityAdsLoadListener);
    }

    public static final void show(Activity activity, String str, IUnityAdsShowListener iUnityAdsShowListener) {
        UnityAdsImplementation.getInstance().show(activity, str, new UnityAdsShowOptions(), iUnityAdsShowListener);
    }

    public static final void getToken(TokenConfiguration configuration, IUnityAdsTokenListener listener) {
        e0.checkNotNullParameter(configuration, "configuration");
        e0.checkNotNullParameter(listener, "listener");
        UnityAdsImplementation.getInstance().getToken(configuration, listener);
    }

    public static final void initialize(Context context, String str, boolean z10) {
        UnityAdsImplementation.getInstance().initialize(context, str, z10, null);
    }

    public static final void load(String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener) {
        IUnityAds unityAdsImplementation = UnityAdsImplementation.getInstance();
        if (unityAdsLoadOptions == null) {
            unityAdsLoadOptions = new UnityAdsLoadOptions();
        }
        unityAdsImplementation.load(str, unityAdsLoadOptions, iUnityAdsLoadListener);
    }

    @f
    public static final void show(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions) {
        UnityAdsImplementation.getInstance().show(activity, str, unityAdsShowOptions, null);
    }

    public static final void initialize(Context context, String str, boolean z10, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        UnityAdsImplementation.getInstance().initialize(context, str, z10, iUnityAdsInitializationListener);
    }

    public static final void show(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions, IUnityAdsShowListener iUnityAdsShowListener) {
        UnityAdsImplementation.getInstance().show(activity, str, unityAdsShowOptions, iUnityAdsShowListener);
    }

    public static /* synthetic */ void getDebugMode$annotations() {
    }

    public static /* synthetic */ void getToken$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static /* synthetic */ void isInitialized$annotations() {
    }

    public static /* synthetic */ void isSupported$annotations() {
    }
}
