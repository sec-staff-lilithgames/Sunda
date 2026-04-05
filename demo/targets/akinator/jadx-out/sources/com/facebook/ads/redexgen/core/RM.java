package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.internal.api.NativeAdViewApi;

/* loaded from: assets/audience_network.dex */
public final class RM implements NativeAdViewApi {
    public static View A00(C1937dL c1937dL, NativeAd nativeAd, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        if (nativeAdViewAttributes == null) {
            nativeAdViewAttributes = new NativeAdViewAttributes();
        }
        C1597Ur c1597Ur = (C1597Ur) nativeAdViewAttributes.getInternalAttributes();
        C1480Qc internalNativeAd = C1480Qc.A0L(nativeAd.getInternalNativeAd());
        internalNativeAd.A1a(EnumC1598Us.A00(type.getEnumCode()));
        internalNativeAd.A1Z(c1597Ur);
        C6Q c6q = new C6Q();
        NativeAdLayout mediumRectTemplateLayout = new NativeAdLayout(c1937dL, c6q);
        c6q.A06(mediumRectTemplateLayout, c1937dL, nativeAd, c1597Ur);
        mediumRectTemplateLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) (AbstractC1640Wl.A02 * type.getHeight())));
        return mediumRectTemplateLayout;
    }

    public static View A01(C1937dL c1937dL, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes) {
        if (nativeAdViewAttributes == null) {
            nativeAdViewAttributes = new NativeAdViewAttributes();
        }
        C1480Qc c1480QcA0L = C1480Qc.A0L(nativeAd.getInternalNativeAd());
        C1597Ur c1597Ur = (C1597Ur) nativeAdViewAttributes.getInternalAttributes();
        c1480QcA0L.A1a(EnumC1598Us.A0B);
        c1480QcA0L.A1Z(c1597Ur);
        C6Q c6q = new C6Q();
        NativeAdLayout nativeAdLayout = new NativeAdLayout(c1937dL, c6q);
        c6q.A06(nativeAdLayout, c1937dL, nativeAd, c1597Ur);
        return nativeAdLayout;
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd) {
        return render(context, nativeAd, (NativeAdViewAttributes) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type) {
        return render(context, nativeAd, type, null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        try {
            return A00(RB.A03(context), nativeAd, type, nativeAdViewAttributes);
        } catch (Throwable th2) {
            return YB.A00(RB.A03(context), th2);
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes) {
        C1937dL contextWrapper;
        try {
            if (context instanceof C1937dL) {
                contextWrapper = (C1937dL) context;
            } else {
                contextWrapper = RB.A03(context);
            }
            return A01(contextWrapper, nativeAd, nativeAdViewAttributes);
        } catch (Throwable th2) {
            return YB.A00(RB.A03(context), th2);
        }
    }
}
