package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
class DynamicLoaderFallback {
    private static final WeakHashMap<Object, AdListener> sApiProxyToAdListenersMap = new WeakHashMap<>();

    private static boolean equalsMethodParams(Method method, Method method2) {
        return Arrays.equals(method.getParameterTypes(), method2.getParameterTypes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean equalsMethods(Method method, Method method2) {
        return method != null && method2 != null && method.getDeclaringClass().equals(method2.getDeclaringClass()) && method.getName().equals(method2.getName()) && equalsMethodParams(method, method2);
    }

    public static DynamicLoader makeFallbackLoader() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        i iVar = new i();
        DynamicLoader dynamicLoader = (DynamicLoader) iVar.mock(DynamicLoader.class);
        dynamicLoader.createInterstitialAd(null, null, null);
        arrayList5.add(iVar.f23010a);
        dynamicLoader.createRewardedVideoAd(null, null, null);
        arrayList5.add(iVar.f23010a);
        dynamicLoader.createAdViewApi((Context) null, (String) null, (AdSize) null, (AdViewParentApi) null, (AdView) null);
        arrayList5.add(iVar.f23010a);
        try {
            dynamicLoader.createAdViewApi((Context) null, (String) null, (String) null, (AdViewParentApi) null, (AdView) null);
        } catch (Exception unused) {
        }
        arrayList5.add(iVar.f23010a);
        dynamicLoader.createNativeAdApi(null, null);
        Method method = iVar.f23010a;
        dynamicLoader.createNativeBannerAdApi(null, null);
        Method method2 = iVar.f23010a;
        NativeAdBaseApi nativeAdBaseApi = (NativeAdBaseApi) iVar.mock(NativeAdBaseApi.class);
        nativeAdBaseApi.loadAd();
        arrayList.add(iVar.f23010a);
        nativeAdBaseApi.loadAd(null);
        arrayList2.add(iVar.f23010a);
        nativeAdBaseApi.buildLoadAdConfig(null);
        arrayList4.add(iVar.f23010a);
        InterstitialAdApi interstitialAdApi = (InterstitialAdApi) iVar.mock(InterstitialAdApi.class);
        interstitialAdApi.loadAd();
        arrayList.add(iVar.f23010a);
        interstitialAdApi.loadAd(null);
        arrayList2.add(iVar.f23010a);
        interstitialAdApi.buildLoadAdConfig();
        arrayList4.add(iVar.f23010a);
        RewardedVideoAdApi rewardedVideoAdApi = (RewardedVideoAdApi) iVar.mock(RewardedVideoAdApi.class);
        rewardedVideoAdApi.loadAd();
        arrayList.add(iVar.f23010a);
        rewardedVideoAdApi.loadAd(null);
        arrayList2.add(iVar.f23010a);
        rewardedVideoAdApi.buildLoadAdConfig();
        arrayList4.add(iVar.f23010a);
        AdViewApi adViewApi = (AdViewApi) iVar.mock(AdViewApi.class);
        adViewApi.loadAd();
        arrayList.add(iVar.f23010a);
        adViewApi.loadAd(null);
        arrayList2.add(iVar.f23010a);
        adViewApi.buildLoadAdConfig();
        arrayList4.add(iVar.f23010a);
        ((AdView.AdViewLoadConfigBuilder) iVar.mock(AdView.AdViewLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(iVar.f23010a);
        ((NativeAdBase.NativeAdLoadConfigBuilder) iVar.mock(NativeAdBase.NativeAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(iVar.f23010a);
        ((InterstitialAd.InterstitialAdLoadConfigBuilder) iVar.mock(InterstitialAd.InterstitialAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(iVar.f23010a);
        ((RewardedVideoAd.RewardedVideoAdLoadConfigBuilder) iVar.mock(RewardedVideoAd.RewardedVideoAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(iVar.f23010a);
        return (DynamicLoader) Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{DynamicLoader.class}, new f(arrayList, map, arrayList2, arrayList3, map2, arrayList4, arrayList5, method, method2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean reportError(Object obj, Map<Object, Ad> map) {
        if (obj == null) {
            return false;
        }
        AdListener adListener = sApiProxyToAdListenersMap.get(obj);
        Ad ad2 = map.get(obj);
        if (adListener == null) {
            return false;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new g(adListener, ad2), 500L);
        return true;
    }
}
