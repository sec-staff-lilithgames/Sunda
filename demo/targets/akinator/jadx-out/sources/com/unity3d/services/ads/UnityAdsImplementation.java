package com.unity3d.services.ads;

import a2.s;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.services.UnityAdsSDK;
import com.unity3d.services.UnityServices;
import com.unity3d.services.ads.gmascar.managers.BiddingBaseManager;
import com.unity3d.services.ads.gmascar.managers.BiddingManagerFactory;
import com.unity3d.services.ads.operation.load.LoadModule;
import com.unity3d.services.ads.operation.load.LoadOperationState;
import com.unity3d.services.ads.operation.show.ShowModule;
import com.unity3d.services.ads.operation.show.ShowOperationState;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.bridge.WebViewBridgeInvoker;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class UnityAdsImplementation implements IUnityAds {
    private static Configuration configuration;
    private static IUnityAds instance;
    private static final WebViewBridgeInvoker webViewBridgeInvoker = new WebViewBridgeInvoker();

    public static IUnityAds getInstance() {
        if (instance == null) {
            instance = new UnityAdsImplementation();
        }
        return instance;
    }

    private void handleShowError(IUnityAdsShowListener iUnityAdsShowListener, String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        ((SDKMetricsSender) Utilities.getService(SDKMetricsSender.class)).sendMetricWithInitState(AdOperationMetric.newAdShowFailure(unityAdsShowError, (Long) 0L));
        if (iUnityAdsShowListener == null) {
            return;
        }
        iUnityAdsShowListener.onUnityAdsShowFailure(str, unityAdsShowError, str2);
    }

    private boolean hasInvalidContext(Context context) {
        if (ClientProperties.getApplicationContext() != null) {
            return false;
        }
        if (context == null) {
            return true;
        }
        if (context instanceof Application) {
            ClientProperties.setApplicationContext(context);
            ClientProperties.setApplication((Application) context);
            return false;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.getApplication() != null && activity.getApplicationContext() != null) {
                ClientProperties.setApplicationContext(context.getApplicationContext());
                ClientProperties.setApplication(activity.getApplication());
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initialize$0(IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        iUnityAdsInitializationListener.onInitializationFailed(UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, "Unity Ads SDK failed to initialize due to invalid context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$load$1(IUnityAdsLoadListener iUnityAdsLoadListener, String str) {
        iUnityAdsLoadListener.onUnityAdsFailedToLoad(str, UnityAds.UnityAdsLoadError.INVALID_ARGUMENT, "Unity Ads SDK failed to load due to invalid context");
    }

    public static void setConfiguration(Configuration configuration2) {
        configuration = configuration2;
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public boolean getDebugMode() {
        return UnityServices.getDebugMode();
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public String getToken() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (hasInvalidContext()) {
            DeviceLog.error("No valid Context for getting token");
            return null;
        }
        if (((AlternativeFlowReader) Utilities.getService(AlternativeFlowReader.class)).invoke()) {
            return new UnityAdsSDK().getToken();
        }
        String token = ((TokenStorage) Utilities.getService(TokenStorage.class)).getToken();
        if (token == null || token.isEmpty()) {
            return null;
        }
        Configuration currentConfiguration = configuration;
        if (currentConfiguration == null) {
            currentConfiguration = new ConfigurationReader().getCurrentConfiguration();
        }
        BiddingBaseManager biddingBaseManagerCreateManager = BiddingManagerFactory.getInstance().createManager(null, currentConfiguration.getExperiments());
        biddingBaseManagerCreateManager.start();
        return biddingBaseManagerCreateManager.getFormattedToken(token);
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public String getVersion() {
        return UnityServices.getVersion();
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public void initialize(Context context, String str, boolean z10, IUnityAdsInitializationListener iUnityAdsInitializationListener) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DeviceLog.entered();
        if (!hasInvalidContext(context)) {
            UnityServices.initialize(context, str, z10, iUnityAdsInitializationListener);
            return;
        }
        DeviceLog.error("Error while initializing Unity Services: null context, halting Unity Ads init");
        if (iUnityAdsInitializationListener != null) {
            Utilities.wrapCustomerListener(new a(iUnityAdsInitializationListener, 0));
        }
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public boolean isInitialized() {
        return UnityServices.isInitialized();
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public boolean isSupported() {
        return UnityServices.isSupported();
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public void load(String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (hasInvalidContext()) {
            DeviceLog.error("No valid Context for loading ads");
            if (iUnityAdsLoadListener != null) {
                Utilities.wrapCustomerListener(new com.ironsource.environment.thread.a(5, iUnityAdsLoadListener, str));
                return;
            }
            return;
        }
        if (((AlternativeFlowReader) Utilities.getService(AlternativeFlowReader.class)).invoke()) {
            new UnityAdsSDK().load(str, unityAdsLoadOptions, iUnityAdsLoadListener, null);
            return;
        }
        Configuration configuration2 = configuration;
        if (configuration2 == null) {
            configuration2 = new Configuration();
        }
        LoadModule.getInstance().executeAdOperation(webViewBridgeInvoker, new LoadOperationState(str, iUnityAdsLoadListener, unityAdsLoadOptions, configuration2));
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public void setDebugMode(boolean z10) {
        UnityServices.setDebugMode(z10);
    }

    public void show(Activity activity, String str) {
        show(activity, str, new UnityAdsShowOptions(), null);
    }

    public void show(Activity activity, String str, IUnityAdsShowListener iUnityAdsShowListener) {
        show(activity, str, new UnityAdsShowOptions(), iUnityAdsShowListener);
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public void show(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions, final IUnityAdsShowListener iUnityAdsShowListener) {
        if (activity != null && !hasInvalidContext(activity)) {
            ClientProperties.setActivity(activity);
            if (((AlternativeFlowReader) Utilities.getService(AlternativeFlowReader.class)).invoke()) {
                new UnityAdsSDK().show(str, unityAdsShowOptions, new Listeners() { // from class: com.unity3d.services.ads.UnityAdsImplementation.1
                    @Override // com.unity3d.ads.core.data.model.Listeners
                    public void onClick(String str2) {
                        IUnityAdsShowListener iUnityAdsShowListener2 = iUnityAdsShowListener;
                        if (iUnityAdsShowListener2 != null) {
                            iUnityAdsShowListener2.onUnityAdsShowClick(str2);
                        }
                    }

                    @Override // com.unity3d.ads.core.data.model.Listeners
                    public void onComplete(String str2, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
                        IUnityAdsShowListener iUnityAdsShowListener2 = iUnityAdsShowListener;
                        if (iUnityAdsShowListener2 != null) {
                            iUnityAdsShowListener2.onUnityAdsShowComplete(str2, unityAdsShowCompletionState);
                        }
                    }

                    @Override // com.unity3d.ads.core.data.model.Listeners
                    public void onError(String str2, UnityAds.UnityAdsShowError unityAdsShowError, String str3) {
                        IUnityAdsShowListener iUnityAdsShowListener2 = iUnityAdsShowListener;
                        if (iUnityAdsShowListener2 != null) {
                            iUnityAdsShowListener2.onUnityAdsShowFailure(str2, unityAdsShowError, str3);
                        }
                    }

                    @Override // com.unity3d.ads.core.data.model.Listeners
                    public void onStart(String str2) {
                        IUnityAdsShowListener iUnityAdsShowListener2 = iUnityAdsShowListener;
                        if (iUnityAdsShowListener2 != null) {
                            iUnityAdsShowListener2.onUnityAdsShowStart(str2);
                        }
                    }

                    @Override // com.unity3d.ads.core.data.model.Listeners
                    public void onLeftApplication(String str2) {
                    }
                });
                return;
            }
            if (!isSupported()) {
                handleShowError(iUnityAdsShowListener, str, UnityAds.UnityAdsShowError.NOT_INITIALIZED, "Unity Ads is not supported for this device");
                return;
            }
            if (!isInitialized()) {
                handleShowError(iUnityAdsShowListener, str, UnityAds.UnityAdsShowError.NOT_INITIALIZED, LoadResult.MSG_NOT_INITIALIZED);
                return;
            }
            if (str == null) {
                handleShowError(iUnityAdsShowListener, "", UnityAds.UnityAdsShowError.INVALID_ARGUMENT, LoadResult.MSG_PLACEMENT_NULL);
                return;
            }
            Configuration configuration2 = configuration;
            if (configuration2 == null) {
                configuration2 = new Configuration();
            }
            ShowModule.getInstance().executeAdOperation(WebViewApp.getCurrentApp(), new ShowOperationState(str, iUnityAdsShowListener, activity, unityAdsShowOptions, configuration2));
            return;
        }
        handleShowError(iUnityAdsShowListener, str, UnityAds.UnityAdsShowError.INVALID_ARGUMENT, "Activity must not be null");
    }

    private boolean hasInvalidContext() {
        return hasInvalidContext(null);
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public void getToken(TokenConfiguration tokenConfiguration, IUnityAdsTokenListener iUnityAdsTokenListener) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (hasInvalidContext()) {
            DeviceLog.error("No valid Context for getting token");
            if (iUnityAdsTokenListener != null) {
                iUnityAdsTokenListener.onUnityAdsTokenReady(null);
                return;
            }
            return;
        }
        if (((AlternativeFlowReader) Utilities.getService(AlternativeFlowReader.class)).invoke()) {
            new UnityAdsSDK().getToken(tokenConfiguration, iUnityAdsTokenListener);
            return;
        }
        if (iUnityAdsTokenListener == null) {
            DeviceLog.info("Please provide non-null listener to UnityAds.GetToken method");
            return;
        }
        if (ClientProperties.getApplicationContext() == null) {
            Utilities.wrapCustomerListener(new s(iUnityAdsTokenListener, 26));
            return;
        }
        AsyncTokenStorage asyncTokenStorage = (AsyncTokenStorage) Utilities.getService(AsyncTokenStorage.class);
        Configuration currentConfiguration = configuration;
        if (currentConfiguration == null) {
            currentConfiguration = new ConfigurationReader().getCurrentConfiguration();
        }
        BiddingBaseManager biddingBaseManagerCreateManager = BiddingManagerFactory.getInstance().createManager(iUnityAdsTokenListener, tokenConfiguration, currentConfiguration.getExperiments());
        biddingBaseManagerCreateManager.start();
        asyncTokenStorage.getToken(biddingBaseManagerCreateManager);
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public void getToken(IUnityAdsTokenListener iUnityAdsTokenListener) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        getToken(null, iUnityAdsTokenListener);
    }
}
