package com.unity3d.services.banners.api;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.load.ILoadOperation;
import com.unity3d.services.ads.operation.load.LoadBannerModule;
import com.unity3d.services.ads.operation.load.LoadBannerOperationState;
import com.unity3d.services.ads.operation.load.LoadOperationState;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.properties.BannerRefreshInfo;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.lang.reflect.InvocationTargetException;
import kl.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class Banner {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.services.banners.api.Banner$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$banners$api$Banner$BannerViewType;

        static {
            int[] iArr = new int[BannerViewType.values().length];
            $SwitchMap$com$unity3d$services$banners$api$Banner$BannerViewType = iArr;
            try {
                iArr[BannerViewType.WEB_PLAYER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$banners$api$Banner$BannerViewType[BannerViewType.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum BannerViewType {
        WEB_PLAYER,
        UNKNOWN;

        public static BannerViewType fromString(String str) {
            try {
                return valueOf(str);
            } catch (IllegalArgumentException unused) {
                return UNKNOWN;
            }
        }
    }

    private static LoadBannerOperationState getBannerOperationState(String str) {
        ILoadOperation iLoadOperation = (ILoadOperation) LoadBannerModule.getInstance().get(str);
        if (iLoadOperation == null || iLoadOperation.getLoadOperationState() == null) {
            LoadBannerModule.getInstance().onUnityAdsFailedToLoad(str, UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "No operation found for requested banner");
            return null;
        }
        LoadOperationState loadOperationState = iLoadOperation.getLoadOperationState();
        if (loadOperationState instanceof LoadBannerOperationState) {
            return (LoadBannerOperationState) loadOperationState;
        }
        LoadBannerModule.getInstance().onUnityAdsFailedToLoad(str, UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "Operation state found is not for banner ad");
        return null;
    }

    @WebViewExposed
    public static void load(String str, Integer num, Integer num2, String str2, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i10 = AnonymousClass1.$SwitchMap$com$unity3d$services$banners$api$Banner$BannerViewType[BannerViewType.fromString(str).ordinal()];
        if (i10 == 1) {
            LoadBannerOperationState bannerOperationState = getBannerOperationState(str2);
            if (bannerOperationState != null) {
                bannerOperationState.setSize(new UnityBannerSize(num.intValue(), num2.intValue()));
                BannerViewCache.getInstance().loadBanner(bannerOperationState);
            }
        } else if (i10 == 2) {
            LoadBannerModule.getInstance().onUnityAdsFailedToLoad(str2, UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "Unknown banner type");
        }
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void loadScar(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LoadBannerOperationState bannerOperationState = getBannerOperationState(str);
        if (bannerOperationState == null) {
            webViewCallback.invoke(new Object[0]);
            return;
        }
        bannerOperationState.setSize(new UnityBannerSize(num.intValue(), num2.intValue()));
        bannerOperationState.setScarAdMetadata(new d(str2, str3, str4, str5, 0));
        BannerViewCache.getInstance().loadBanner(bannerOperationState);
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void setRefreshRate(String str, Integer num, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (str != null && num != null) {
            BannerRefreshInfo.getInstance().setRefreshRate(str, num);
        }
        webViewCallback.invoke(new Object[0]);
    }
}
