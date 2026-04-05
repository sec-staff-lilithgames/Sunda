package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.listeners.BannerAdEventListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class K1 extends J1 {

    /* renamed from: a, reason: collision with root package name */
    public final BannerAdEventListener f31935a;

    public K1(BannerAdEventListener adEventListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adEventListener, "adEventListener");
        this.f31935a = adEventListener;
    }

    @Override // com.inmobi.media.AbstractC3097z
    public final void a(Object obj, Map params) {
        InMobiBanner ad2 = (InMobiBanner) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        kotlin.jvm.internal.e0.checkNotNullParameter(params, "params");
        this.f31935a.onAdClicked(ad2, params);
    }

    @Override // com.inmobi.media.AbstractC3097z
    public final void b(Object obj, AdMetaInfo info) {
        InMobiBanner ad2 = (InMobiBanner) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        this.f31935a.onAdLoadSucceeded(ad2, info);
    }

    @Override // com.inmobi.media.AbstractC3097z
    public final void a(Object obj, AdMetaInfo info) {
        InMobiBanner ad2 = (InMobiBanner) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        this.f31935a.onAdFetchSuccessful(ad2, info);
    }

    @Override // com.inmobi.media.AbstractC3097z
    public final void a(Object obj) {
        InMobiBanner ad2 = (InMobiBanner) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        this.f31935a.onAdImpression(ad2);
    }

    @Override // com.inmobi.media.AbstractC3097z
    public final void a(Object obj, InMobiAdRequestStatus status) {
        InMobiBanner ad2 = (InMobiBanner) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        kotlin.jvm.internal.e0.checkNotNullParameter(status, "status");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("J1", "getSimpleName(...)");
        this.f31935a.onAdLoadFailed(ad2, status);
    }

    @Override // com.inmobi.media.AbstractC3097z
    public final void a(Object obj, String data) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        InMobiBanner ad2 = (InMobiBanner) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
        try {
            Class<?> cls = Class.forName("IMraidLog");
            Method declaredMethod = cls.getDeclaredMethod("imraidLog", BannerAdEventListener.class, InMobiBanner.class, String.class);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(declaredMethod, "getDeclaredMethod(...)");
            declaredMethod.invoke(cls.newInstance(), this.f31935a, ad2, data);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
