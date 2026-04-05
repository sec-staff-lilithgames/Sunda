package com.unity3d.services.banners;

import a2.s;
import android.content.Context;
import android.view.ViewManager;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.services.UnityAdsSDK;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.webplayer.WebPlayerSettingsCache;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.banners.view.BannerWebPlayerContainer;
import com.unity3d.services.banners.view.ScarBannerContainer;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IInitializationListener;
import com.unity3d.services.core.configuration.InitializationNotificationCenter;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
import kl.d;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class BannerView extends RelativeLayout {
    private BannerWebPlayerContainer bannerWebPlayerContainer;
    private final GMAScarAdapterBridge gmaScarAdapterBridge;
    private IInitializationListener initializationListener;
    private IListener listener;
    private String placementId;
    private ScarBannerContainer scarBannerContainer;
    private UnityBannerSize size;
    private String viewId;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface IListener {
        void onBannerClick(BannerView bannerView);

        void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo);

        void onBannerLeftApplication(BannerView bannerView);

        void onBannerLoaded(BannerView bannerView);

        void onBannerShown(BannerView bannerView);
    }

    public BannerView(Context context, String str, UnityBannerSize unityBannerSize) {
        super(context);
        this.gmaScarAdapterBridge = GMA.getInstance().getBridge();
        this.viewId = UUID.randomUUID().toString();
        this.placementId = str;
        this.size = unityBannerSize;
        setupLayoutParams();
        setBackgroundColor(0);
        BannerViewCache.getInstance().addBannerView(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bridgeLoad() {
        BannerBridge.load(this.placementId, this.viewId, this.size, new UnityAdsLoadOptions());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addScarContainer$0() {
        addView(this.scarBannerContainer);
    }

    private void registerInitializeListener() {
        unregisterInitializeListener();
        this.initializationListener = new IInitializationListener() { // from class: com.unity3d.services.banners.BannerView.3
            @Override // com.unity3d.services.core.configuration.IInitializationListener
            public void onSdkInitializationFailed(String str, ErrorState errorState, int i10) {
                this.unregisterInitializeListener();
                if (this.getListener() != null) {
                    this.getListener().onBannerFailedToLoad(this, new BannerErrorInfo("UnityAds sdk initialization failed", BannerErrorCode.NATIVE_ERROR));
                }
            }

            @Override // com.unity3d.services.core.configuration.IInitializationListener
            public void onSdkInitialized() {
                this.unregisterInitializeListener();
                this.bridgeLoad();
            }
        };
        InitializationNotificationCenter.getInstance().addListener(this.initializationListener);
    }

    private void setupLayoutParams() {
        setLayoutParams(new RelativeLayout.LayoutParams(Math.round(ViewUtilities.pxFromDp(getContext(), this.size.getWidth())), Math.round(ViewUtilities.pxFromDp(getContext(), this.size.getHeight()))));
        setGravity(17);
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unregisterInitializeListener() {
        if (this.initializationListener != null) {
            InitializationNotificationCenter.getInstance().removeListener(this.initializationListener);
        }
        this.initializationListener = null;
    }

    public void addScarContainer() {
        this.scarBannerContainer = new ScarBannerContainer(getContext(), this.viewId);
        Utilities.runOnUiThread(new s(this, 29));
    }

    public void destroy() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        UnityAdsSDK unityAdsSDK = new UnityAdsSDK();
        unityAdsSDK.sendBannerDestroyed();
        BannerViewCache.getInstance().removeBannerView(this.viewId);
        unregisterInitializeListener();
        unityAdsSDK.finishOMIDSession(this.viewId);
        BannerBridge.destroy(this.placementId);
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.banners.BannerView.1
            @Override // java.lang.Runnable
            public void run() {
                ViewParent parent = this.getParent();
                if (parent == null || !(parent instanceof ViewManager)) {
                    return;
                }
                ((ViewManager) parent).removeView(this);
            }
        });
        BannerWebPlayerContainer bannerWebPlayerContainer = this.bannerWebPlayerContainer;
        if (bannerWebPlayerContainer != null) {
            bannerWebPlayerContainer.destroy();
        }
        ScarBannerContainer scarBannerContainer = this.scarBannerContainer;
        if (scarBannerContainer != null) {
            scarBannerContainer.destroy();
        }
        DeviceLog.info("Banner [" + this.placementId + "] was destroyed");
        this.viewId = null;
        this.listener = null;
        this.bannerWebPlayerContainer = null;
    }

    public IListener getListener() {
        return this.listener;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    public UnityBannerSize getSize() {
        return this.size;
    }

    public String getViewId() {
        return this.viewId;
    }

    public void load() {
        bridgeLoad();
    }

    public void loadScarPlayer(String str, d dVar, UnityBannerSize unityBannerSize) {
        this.gmaScarAdapterBridge.loadBanner(getContext(), this, str, dVar, unityBannerSize);
    }

    public void loadWebPlayer(final UnityBannerSize unityBannerSize) {
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.banners.BannerView.2
            @Override // java.lang.Runnable
            public void run() {
                JSONObject webSettings = WebPlayerSettingsCache.getInstance().getWebSettings(this.viewId);
                JSONObject webPlayerSettings = WebPlayerSettingsCache.getInstance().getWebPlayerSettings(this.viewId);
                JSONObject webPlayerEventSettings = WebPlayerSettingsCache.getInstance().getWebPlayerEventSettings(this.viewId);
                if (this.bannerWebPlayerContainer != null) {
                    this.bannerWebPlayerContainer.setWebPlayerSettings(webSettings, webPlayerSettings);
                    this.bannerWebPlayerContainer.setWebPlayerEventSettings(webPlayerEventSettings);
                } else {
                    this.bannerWebPlayerContainer = new BannerWebPlayerContainer(this.getContext(), this.viewId, webSettings, webPlayerSettings, webPlayerEventSettings, unityBannerSize);
                    BannerView bannerView = this;
                    bannerView.addView(bannerView.bannerWebPlayerContainer);
                }
            }
        });
    }

    public void setListener(IListener iListener) {
        this.listener = iListener;
    }

    private void bridgeLoad(UnityAdsLoadOptions unityAdsLoadOptions) {
        String objectId;
        if (unityAdsLoadOptions != null && (objectId = unityAdsLoadOptions.getObjectId()) != null) {
            BannerViewCache bannerViewCache = BannerViewCache.getInstance();
            bannerViewCache.removeBannerView(this.viewId);
            this.viewId = objectId;
            bannerViewCache.addBannerView(this);
        }
        BannerBridge.load(this.placementId, this.viewId, this.size, unityAdsLoadOptions);
    }

    public void load(UnityAdsLoadOptions unityAdsLoadOptions) {
        bridgeLoad(unityAdsLoadOptions);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class Listener implements IListener {
        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerClick(BannerView bannerView) {
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerLeftApplication(BannerView bannerView) {
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerLoaded(BannerView bannerView) {
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerShown(BannerView bannerView) {
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
        }
    }
}
