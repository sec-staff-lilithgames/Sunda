package io.bidmachine;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class NetworkAdapter {
    private final int adapterMinDeviceApiVersion;
    private final String adapterVersion;
    private final String compiledNetworkSdkVersion;
    private final String key;
    private String networkSdkVersion;
    private final AdsType[] supportedTypes;
    private final AtomicBoolean isInitializing = new AtomicBoolean(false);
    private final AtomicBoolean isInitialized = new AtomicBoolean(false);
    private final Set<InternalNetworkInitializationCallback> initializeCallbackSet = new CopyOnWriteArraySet();

    public NetworkAdapter(String str, String str2, String str3, int i10, AdsType[] adsTypeArr) {
        this.key = str;
        this.compiledNetworkSdkVersion = str2;
        this.adapterVersion = str3;
        this.adapterMinDeviceApiVersion = i10;
        this.supportedTypes = adsTypeArr;
    }

    public static boolean isSkipInitialization(NetworkConfigParams networkConfigParams) {
        return Boolean.parseBoolean(networkConfigParams.getFromNetworkParams("skip_initialization"));
    }

    public hr.e createBanner() {
        throw new IllegalArgumentException(getKey() + " adapter does not support banner");
    }

    public hr.h createInterstitial() {
        throw new IllegalArgumentException(getKey() + " adapter does not support static interstitial");
    }

    public hr.l createNativeAd() {
        throw new IllegalArgumentException(getKey() + " adapter does not support native ads");
    }

    public hr.h createRewarded() {
        throw new IllegalArgumentException(getKey() + " adapter does not support rewarded interstitial");
    }

    public int getAdapterMinDeviceApiVersion() {
        return this.adapterMinDeviceApiVersion;
    }

    public String getAdapterVersion() {
        return this.adapterVersion;
    }

    public String getKey() {
        return this.key;
    }

    public String getNetworkSdkVersion() throws Throwable {
        return null;
    }

    public AdsType[] getSupportedTypes() {
        return this.supportedTypes;
    }

    public final void initialize(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfigParams networkConfigParams, InternalNetworkInitializationCallback internalNetworkInitializationCallback) throws Throwable {
        if (Build.VERSION.SDK_INT < this.adapterMinDeviceApiVersion) {
            internalNetworkInitializationCallback.onFail(this, "minSdkVersion is " + this.adapterMinDeviceApiVersion);
        } else {
            if (isInitialized(contextProvider)) {
                internalNetworkInitializationCallback.onSuccess(this);
                return;
            }
            if (!isSkipInitialization(networkConfigParams)) {
                this.initializeCallbackSet.add(internalNetworkInitializationCallback);
                if (this.isInitializing.compareAndSet(false, true)) {
                    onNetworkInitialize(contextProvider, initializationParams, networkConfigParams, new f3(this));
                    return;
                }
                return;
            }
            if (!isNetworkInitializationStatusCheckSupported()) {
                nm.a.d(getKey(), "Network initialization status check is not supported, force initialization to true");
                this.isInitialized.set(true);
            }
            nm.a.d(getKey(), "Network initialization is skipped");
            internalNetworkInitializationCallback.onSuccess(this);
        }
    }

    public boolean isAdsTypeSupported(AdsType adsType) {
        for (AdsType adsType2 : this.supportedTypes) {
            if (adsType2 == adsType) {
                return true;
            }
        }
        return false;
    }

    public final boolean isInitialized(Context context) {
        return isInitialized(new SimpleContextProvider(context));
    }

    public final boolean isInitializing() {
        return this.isInitializing.get();
    }

    public abstract boolean isNetworkInitializationStatusCheckSupported();

    public abstract boolean isNetworkInitialized(ContextProvider contextProvider) throws Throwable;

    public final String obtainNetworkSdkVersion() {
        if (!TextUtils.isEmpty(this.networkSdkVersion)) {
            return this.networkSdkVersion;
        }
        try {
            String networkSdkVersion = getNetworkSdkVersion();
            this.networkSdkVersion = networkSdkVersion;
            if (!TextUtils.isEmpty(networkSdkVersion)) {
                return this.networkSdkVersion;
            }
        } catch (Throwable unused) {
        }
        return this.compiledNetworkSdkVersion;
    }

    public abstract void onNetworkInitialize(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfigParams networkConfigParams, NetworkInitializationCallback networkInitializationCallback) throws Throwable;

    public final boolean isInitialized(ContextProvider contextProvider) {
        if (this.isInitialized.get()) {
            return true;
        }
        try {
            boolean zIsNetworkInitialized = isNetworkInitialized(contextProvider);
            this.isInitialized.compareAndSet(false, zIsNetworkInitialized);
            return zIsNetworkInitialized;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void clearAuction(NetworkAdUnit networkAdUnit) throws Throwable {
    }

    public void onLossAuction(NetworkAdUnit networkAdUnit) throws Throwable {
    }

    public void onWinAuction(NetworkAdUnit networkAdUnit) throws Throwable {
    }

    public void setLogging(boolean z10) throws Throwable {
    }
}
