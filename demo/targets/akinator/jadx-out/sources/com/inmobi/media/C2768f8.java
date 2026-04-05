package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.listeners.NativeAdEventListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.f8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2768f8 extends AbstractC2751e8 {

    /* renamed from: a, reason: collision with root package name */
    public final NativeAdEventListener f32839a;

    public C2768f8(NativeAdEventListener adEventListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adEventListener, "adEventListener");
        this.f32839a = adEventListener;
    }

    @Override // com.inmobi.media.AbstractC3097z
    public final void a(Object obj, AdMetaInfo info) {
        InMobiNative ad2 = (InMobiNative) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        this.f32839a.onAdFetchSuccessful(ad2, info);
    }

    @Override // com.inmobi.media.AbstractC3097z
    public final void b(Object obj, AdMetaInfo info) {
        InMobiNative ad2 = (InMobiNative) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        this.f32839a.onAdLoadSucceeded(ad2, info);
    }

    @Override // com.inmobi.media.AbstractC3097z
    public final void a(Object obj) {
        InMobiNative ad2 = (InMobiNative) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        this.f32839a.onAdImpression(ad2);
    }

    @Override // com.inmobi.media.AbstractC3097z
    public final void a(Object obj, InMobiAdRequestStatus status) {
        InMobiNative ad2 = (InMobiNative) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        kotlin.jvm.internal.e0.checkNotNullParameter(status, "status");
        this.f32839a.onAdLoadFailed(ad2, status);
    }

    @Override // com.inmobi.media.AbstractC3097z
    public final void a(Object obj, String data) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        InMobiNative ad2 = (InMobiNative) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
        try {
            Class<?> cls = Class.forName("IMraidLog");
            Method declaredMethod = cls.getDeclaredMethod("imraidLog", NativeAdEventListener.class, InMobiNative.class, String.class);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(declaredMethod, "getDeclaredMethod(...)");
            declaredMethod.invoke(cls.newInstance(), this.f32839a, ad2, data);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
