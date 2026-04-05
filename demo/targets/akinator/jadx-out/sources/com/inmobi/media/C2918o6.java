package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.mbridge.msdk.playercommon.exoplayer2.drm.szH.SFPXhf;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.o6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2918o6 extends AbstractC2901n6 {

    /* renamed from: a, reason: collision with root package name */
    public final InterstitialAdEventListener f33180a;

    @Override // com.inmobi.media.AbstractC3097z
    public final void a(Object obj, Map params) {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        kotlin.jvm.internal.e0.checkNotNullParameter(params, "params");
        this.f33180a.onAdClicked(ad2, params);
    }

    @Override // com.inmobi.media.AbstractC3097z
    public final void b(Object obj, AdMetaInfo info) {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        this.f33180a.onAdLoadSucceeded(ad2, info);
    }

    public C2918o6(InterstitialAdEventListener interstitialAdEventListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(interstitialAdEventListener, SFPXhf.rYsTHTFieeQIsLH);
        this.f33180a = interstitialAdEventListener;
    }

    @Override // com.inmobi.media.AbstractC3097z
    public final void a(Object obj, AdMetaInfo info) {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        this.f33180a.onAdFetchSuccessful(ad2, info);
    }

    @Override // com.inmobi.media.AbstractC3097z
    public final void a(Object obj) {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        this.f33180a.onAdImpression(ad2);
    }

    @Override // com.inmobi.media.AbstractC3097z
    public final void a(Object obj, InMobiAdRequestStatus status) {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        kotlin.jvm.internal.e0.checkNotNullParameter(status, "status");
        this.f33180a.onAdLoadFailed(ad2, status);
    }

    @Override // com.inmobi.media.AbstractC3097z
    public final void a(Object obj, String data) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
        try {
            Class<?> cls = Class.forName("IMraidLog");
            Method declaredMethod = cls.getDeclaredMethod("imraidLog", InterstitialAdEventListener.class, InMobiInterstitial.class, String.class);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(declaredMethod, "getDeclaredMethod(...)");
            declaredMethod.invoke(cls.newInstance(), this.f33180a, ad2, data);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
