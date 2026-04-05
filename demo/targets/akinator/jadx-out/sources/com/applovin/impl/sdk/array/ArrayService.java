package com.applovin.impl.sdk.array;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import b0.e2;
import com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback;
import com.applovin.array.apphub.aidl.IAppHubService;
import com.applovin.impl.b;
import com.applovin.impl.c2;
import com.applovin.impl.o0;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.t3;
import com.applovin.impl.v2;
import com.applovin.impl.v4;
import com.applovin.sdk.AppLovinSdk;
import com.moloco.sdk.BKC.KerkSviMAy;
import io.bidmachine.protobuf.EventTypeExtended;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class ArrayService extends IAppHubDirectDownloadServiceCallback.Stub {
    public static final String DIRECT_DOWNLOAD_EVENT_APP_DETAILS_DISMISSED = "APP_DETAILS_DISMISSED";
    public static final String DIRECT_DOWNLOAD_EVENT_APP_DETAILS_SHOWN = "APP_DETAILS_SHOWN";
    public static final String KEY_AD_TOKEN = "ad_token";
    private static final int MAX_RECONNECT_RETRY_COUNT = 3;
    private static final String SERVICE_INTENT_CLASS_NAME = "com.applovin.oem.am.android.external.AppHubService";
    private static final String SERVICE_INTENT_FILTER_ACTION = "com.applovin.am.intent.action.APPHUB_SERVICE";
    private static final String TAG = "ArrayService";
    private String appHubPackageName;
    private IAppHubService appHubService;
    private final Intent appHubServiceIntent;
    private long appHubVersionCode = -1;
    private DirectDownloadState currentDownloadState;
    private int currentRetryCount;
    private final ArrayDataCollector dataCollector;
    private Boolean isDirectDownloadEnabled;
    private final o logger;
    private final int minVersionCodeWithGenericEventsSupport;
    private String randomUserToken;
    private final k sdk;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public interface DirectDownloadListener {
        void onEvent(String str, Bundle bundle);

        void onFailure();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class DirectDownloadState {
        private final String adToken;
        private final AtomicBoolean errorCallbackInvoked = new AtomicBoolean();
        private final DirectDownloadListener listener;
        private final Bundle parameters;

        public DirectDownloadState(String str, Bundle bundle, DirectDownloadListener directDownloadListener) {
            this.adToken = str;
            this.parameters = bundle;
            this.listener = directDownloadListener;
        }

        public boolean canEqual(Object obj) {
            return obj instanceof DirectDownloadState;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DirectDownloadState)) {
                return false;
            }
            DirectDownloadState directDownloadState = (DirectDownloadState) obj;
            if (!directDownloadState.canEqual(this)) {
                return false;
            }
            AtomicBoolean errorCallbackInvoked = getErrorCallbackInvoked();
            AtomicBoolean errorCallbackInvoked2 = directDownloadState.getErrorCallbackInvoked();
            if (errorCallbackInvoked != null ? !errorCallbackInvoked.equals(errorCallbackInvoked2) : errorCallbackInvoked2 != null) {
                return false;
            }
            String adToken = getAdToken();
            String adToken2 = directDownloadState.getAdToken();
            if (adToken != null ? !adToken.equals(adToken2) : adToken2 != null) {
                return false;
            }
            Bundle parameters = getParameters();
            Bundle parameters2 = directDownloadState.getParameters();
            if (parameters != null ? !parameters.equals(parameters2) : parameters2 != null) {
                return false;
            }
            DirectDownloadListener listener = getListener();
            DirectDownloadListener listener2 = directDownloadState.getListener();
            return listener != null ? listener.equals(listener2) : listener2 == null;
        }

        public String getAdToken() {
            return this.adToken;
        }

        public AtomicBoolean getErrorCallbackInvoked() {
            return this.errorCallbackInvoked;
        }

        public DirectDownloadListener getListener() {
            return this.listener;
        }

        public Bundle getParameters() {
            return this.parameters;
        }

        public int hashCode() {
            AtomicBoolean errorCallbackInvoked = getErrorCallbackInvoked();
            int iHashCode = errorCallbackInvoked == null ? 43 : errorCallbackInvoked.hashCode();
            String adToken = getAdToken();
            int iHashCode2 = ((iHashCode + 59) * 59) + (adToken == null ? 43 : adToken.hashCode());
            Bundle parameters = getParameters();
            int iHashCode3 = (iHashCode2 * 59) + (parameters == null ? 43 : parameters.hashCode());
            DirectDownloadListener listener = getListener();
            return (iHashCode3 * 59) + (listener != null ? listener.hashCode() : 43);
        }

        public String toString() {
            return "ArrayService.DirectDownloadState(errorCallbackInvoked=" + getErrorCallbackInvoked() + ", adToken=" + getAdToken() + ", parameters=" + getParameters() + ", listener=" + getListener() + ")";
        }
    }

    public ArrayService(final k kVar) {
        this.sdk = kVar;
        this.logger = kVar.O();
        this.dataCollector = new ArrayDataCollector(kVar);
        Intent intentCreateAppHubServiceIntent = createAppHubServiceIntent();
        this.appHubServiceIntent = intentCreateAppHubServiceIntent;
        this.minVersionCodeWithGenericEventsSupport = ((Integer) kVar.a(v4.f15895c0)).intValue();
        if (intentCreateAppHubServiceIntent != null) {
            bindAppHubService();
        }
        kVar.e().a(new b() { // from class: com.applovin.impl.sdk.array.ArrayService.1
            @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                DirectDownloadState directDownloadState = ArrayService.this.currentDownloadState;
                if (ArrayService.this.appHubService == null || directDownloadState == null) {
                    return;
                }
                try {
                    o unused = ArrayService.this.logger;
                    if (o.a()) {
                        ArrayService.this.logger.a(ArrayService.TAG, "Dismissing Direct Download Activity");
                    }
                    ArrayService.this.appHubService.dismissDirectDownloadAppDetails(directDownloadState.adToken);
                    directDownloadState.listener.onEvent(ArrayService.DIRECT_DOWNLOAD_EVENT_APP_DETAILS_DISMISSED, ArrayService.this.createBaseExtras(directDownloadState.adToken));
                    ArrayService.this.currentDownloadState = null;
                } catch (RemoteException e10) {
                    o unused2 = ArrayService.this.logger;
                    if (o.a()) {
                        ArrayService.this.logger.a(ArrayService.TAG, "Failed dismiss Direct Download Activity", e10);
                    }
                    kVar.E().a(ArrayService.TAG, "dismissDirectDownloadActivity", e10, ArrayService.this.getHealthEventExtraParameters());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bindAppHubService() {
        if (this.currentRetryCount > 3) {
            if (o.a()) {
                this.logger.k(TAG, "Exceeded maximum retry count");
                return;
            }
            return;
        }
        if (o.a()) {
            this.logger.a(TAG, "Attempting connection to App Hub service...");
        }
        this.currentRetryCount++;
        try {
            if (k.o().bindService(this.appHubServiceIntent, new ServiceConnection() { // from class: com.applovin.impl.sdk.array.ArrayService.2
                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    o unused = ArrayService.this.logger;
                    if (o.a()) {
                        ArrayService.this.logger.a(ArrayService.TAG, "Connection successful: " + componentName);
                    }
                    ArrayService.this.appHubService = IAppHubService.Stub.asInterface(iBinder);
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                    o unused = ArrayService.this.logger;
                    if (o.a()) {
                        ArrayService.this.logger.b(ArrayService.TAG, "Service disconnected: " + componentName);
                    }
                    ArrayService.this.appHubService = null;
                    o unused2 = ArrayService.this.logger;
                    if (o.a()) {
                        ArrayService.this.logger.b(ArrayService.TAG, "Retrying...");
                    }
                    ArrayService.this.bindAppHubService();
                }
            }, o0.d() ? EventTypeExtended.EVENT_TYPE_EXTENDED_TOKEN_GENERATED_VALUE : 1) || !o.a()) {
                return;
            }
            this.logger.k(TAG, "App Hub not available");
        } catch (Throwable th2) {
            if (o.a()) {
                this.logger.a(TAG, "Failed to bind to service", th2);
            }
            this.sdk.E().a(TAG, "bindAppHubService", th2, getHealthEventExtraParameters());
        }
    }

    private Intent createAppHubServiceIntent() {
        Intent intent = new Intent(SERVICE_INTENT_FILTER_ACTION);
        List<ResolveInfo> listQueryIntentServices = k.o().getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            if (!o.a()) {
                return null;
            }
            this.logger.k(TAG, "App Hub not available");
            return null;
        }
        String str = listQueryIntentServices.get(0).serviceInfo.packageName;
        this.appHubPackageName = str;
        intent.setClassName(str, SERVICE_INTENT_CLASS_NAME);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle createBaseExtras(String str) {
        Bundle bundle = new Bundle();
        BundleUtils.putString(KEY_AD_TOKEN, str, bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getHealthEventExtraParameters() {
        HashMap map = new HashMap(2);
        CollectionUtils.putStringIfValid("array_version_code", String.valueOf(getAppHubVersionCode()), map);
        CollectionUtils.putStringIfValid("array_sdk_package_name", getAppHubPackageName(), map);
        return map;
    }

    private void handleEvent(String str, Bundle bundle) {
        DirectDownloadState directDownloadState = this.currentDownloadState;
        if (directDownloadState == null) {
            return;
        }
        if (directDownloadState.adToken.equalsIgnoreCase(bundle.getString(KEY_AD_TOKEN))) {
            directDownloadState.listener.onEvent(str, bundle);
            if (DIRECT_DOWNLOAD_EVENT_APP_DETAILS_DISMISSED.equals(str)) {
                this.currentDownloadState = null;
                return;
            }
            return;
        }
        String strL = a.b.l("Ignoring event (", str, ") for mismatched token.");
        if (o.a()) {
            this.logger.a(TAG, strL);
        }
        Map<String, String> healthEventExtraParameters = getHealthEventExtraParameters();
        healthEventExtraParameters.put("source", "ArrayService:handleEvent");
        healthEventExtraParameters.put("details", strL);
        this.sdk.E().d(c2.M0, healthEventExtraParameters);
    }

    private boolean shouldUseGenericDirectDownloadEvent() {
        return this.minVersionCodeWithGenericEventsSupport >= 0 && getAppHubVersionCode() >= ((long) this.minVersionCodeWithGenericEventsSupport);
    }

    public void collectAppHubData() {
        if (isAppHubInstalled()) {
            if (o.a()) {
                this.logger.a(TAG, "Collecting data...");
            }
            if (this.isDirectDownloadEnabled == null && ((Boolean) this.sdk.a(v4.Z)).booleanValue()) {
                this.isDirectDownloadEnabled = this.dataCollector.collectDirectDownloadEnabled(this.appHubService);
            }
            if (this.appHubVersionCode == -1 && ((Boolean) this.sdk.a(v4.Y)).booleanValue()) {
                this.appHubVersionCode = this.dataCollector.collectAppHubVersionCode(this.appHubService);
            }
            if (TextUtils.isEmpty(this.randomUserToken) && ((Boolean) this.sdk.a(v4.f15878a0)).booleanValue()) {
                this.randomUserToken = this.dataCollector.collectRandomUserToken(this.appHubService);
            }
        }
    }

    public String getAppHubPackageName() {
        return this.appHubPackageName;
    }

    public long getAppHubVersionCode() {
        return this.appHubVersionCode;
    }

    public Boolean getIsDirectDownloadEnabled() {
        return this.isDirectDownloadEnabled;
    }

    public String getJavaScript(String str, Bundle bundle) {
        return "javascript:al_onDirectDownloadEvent('" + str + "'," + BundleUtils.toJSONObject(bundle) + ");";
    }

    public String getRandomUserToken() {
        return this.randomUserToken;
    }

    public boolean isAppHubInstalled() {
        return this.appHubService != null;
    }

    public void maybeSendAdEvent(v2 v2Var, String str) {
        IAppHubService iAppHubService;
        if (((Boolean) this.sdk.a(v4.f15886b0)).booleanValue() && (iAppHubService = this.appHubService) != null && t3.b(v2Var)) {
            if (o.a()) {
                this.logger.a(TAG, "Sending ad event: " + str + " for ad: " + v2Var);
            }
            Bundle bundle = new Bundle();
            BundleUtils.putString("sdk_version", AppLovinSdk.VERSION, bundle);
            BundleUtils.putString("ad_format", v2Var.getFormat().getLabel(), bundle);
            Bundle bundleB = v2Var.B();
            if (bundleB != null) {
                bundle.putAll(bundleB);
            }
            try {
                iAppHubService.onAdSdkEvent(str, bundle);
            } catch (Throwable th2) {
                if (o.a()) {
                    this.logger.a(TAG, "Failed to send ad event: " + str, th2);
                }
                Map map = CollectionUtils.map("name", str);
                map.putAll(getHealthEventExtraParameters());
                this.sdk.E().a(TAG, "failedToSendAdEvent", th2, map);
            }
        }
    }

    @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
    public void onAppDetailsDismissed(String str) {
        if (o.a()) {
            this.logger.a(TAG, "App details dismissed");
        }
        if (shouldUseGenericDirectDownloadEvent()) {
            return;
        }
        handleEvent(DIRECT_DOWNLOAD_EVENT_APP_DETAILS_DISMISSED, createBaseExtras(str));
    }

    @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
    public void onAppDetailsShown(String str) {
        if (o.a()) {
            this.logger.a(TAG, "App details shown");
        }
        if (shouldUseGenericDirectDownloadEvent()) {
            return;
        }
        handleEvent(DIRECT_DOWNLOAD_EVENT_APP_DETAILS_SHOWN, createBaseExtras(str));
    }

    @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
    public void onDownloadStarted(String str) {
        if (o.a()) {
            this.logger.a(TAG, "Download started");
        }
    }

    @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
    public void onError(String str, String str2) {
        if (o.a()) {
            this.logger.b(TAG, "Encountered error: " + str2);
        }
        Map<String, String> healthEventExtraParameters = getHealthEventExtraParameters();
        CollectionUtils.putStringIfValid("error_message", str2, healthEventExtraParameters);
        this.sdk.E().d(c2.f13742v0, healthEventExtraParameters);
        DirectDownloadState directDownloadState = this.currentDownloadState;
        if (directDownloadState == null) {
            return;
        }
        if (directDownloadState.adToken.equalsIgnoreCase(str)) {
            if (directDownloadState.errorCallbackInvoked.compareAndSet(false, true)) {
                directDownloadState.listener.onFailure();
                this.currentDownloadState = null;
                return;
            }
            return;
        }
        if (o.a()) {
            this.logger.a(TAG, "Ignoring error callback for mismatched token.");
        }
        healthEventExtraParameters.put("details", "Ignoring error callback for mismatched token.");
        this.sdk.E().a(c2.M0, "ArrayService:onError", healthEventExtraParameters);
    }

    @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
    public void onEvent(String str, Bundle bundle) {
        if (o.a()) {
            e2.y("Received event: ", str, this.logger, TAG);
        }
        if (shouldUseGenericDirectDownloadEvent()) {
            handleEvent(str, bundle);
        }
    }

    public void startDirectInstallOrDownloadProcess(ArrayDirectDownloadAd arrayDirectDownloadAd, Bundle bundle, DirectDownloadListener directDownloadListener) {
        if (this.appHubService == null) {
            if (o.a()) {
                this.logger.b(TAG, "Cannot begin Direct Install / Download process - service disconnected");
            }
            directDownloadListener.onFailure();
            return;
        }
        if (!arrayDirectDownloadAd.isDirectDownloadEnabled()) {
            if (o.a()) {
                this.logger.b(TAG, "Cannot begin Direct Install / Download process - missing token");
            }
            directDownloadListener.onFailure();
            return;
        }
        try {
            Bundle directDownloadParameters = arrayDirectDownloadAd.getDirectDownloadParameters();
            if (bundle != null) {
                directDownloadParameters.putAll(bundle);
            }
            this.currentDownloadState = new DirectDownloadState(arrayDirectDownloadAd.getDirectDownloadToken(), directDownloadParameters, directDownloadListener);
            if (o.a()) {
                this.logger.a(TAG, "Starting Direct Download Activity");
            }
            if (this.appHubVersionCode >= 21) {
                this.appHubService.showDirectDownloadAppDetailsWithExtra(this.currentDownloadState.adToken, this.currentDownloadState.parameters, this);
            } else {
                this.appHubService.showDirectDownloadAppDetails(this.currentDownloadState.adToken, this);
            }
            if (o.a()) {
                this.logger.a(TAG, KerkSviMAy.ZiFKM);
            }
        } catch (Throwable th2) {
            if (o.a()) {
                this.logger.a(TAG, "Failed to execute Direct Install / Download process", th2);
            }
            this.sdk.E().a(TAG, "directInstallDownload", th2, getHealthEventExtraParameters());
            this.currentDownloadState = null;
            directDownloadListener.onFailure();
        }
    }
}
