package com.inmobi.media;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class H8 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f31842a;

    /* renamed from: b, reason: collision with root package name */
    public final C2734d8 f31843b;

    /* renamed from: c, reason: collision with root package name */
    public final F5 f31844c;

    /* renamed from: d, reason: collision with root package name */
    public final String f31845d;

    /* renamed from: e, reason: collision with root package name */
    public final N8 f31846e;

    public H8(Context context, AdConfig adConfig, C2734d8 mNativeAdContainer, C3106z8 dataModel, F5 f52) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(adConfig, "adConfig");
        kotlin.jvm.internal.e0.checkNotNullParameter(mNativeAdContainer, "mNativeAdContainer");
        kotlin.jvm.internal.e0.checkNotNullParameter(dataModel, "dataModel");
        this.f31843b = mNativeAdContainer;
        this.f31844c = f52;
        this.f31845d = "H8";
        N8 n82 = new N8(context, adConfig, mNativeAdContainer, dataModel, new G8(this), new F8(this), this, f52);
        this.f31846e = n82;
        N9 n9 = n82.f32063m;
        int i10 = mNativeAdContainer.B;
        n9.getClass();
        N9.f32070f = i10;
    }

    public final T8 a(View view, ViewGroup parent, boolean z10, GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc) throws IOException, IllegalArgumentException {
        T8 t8A;
        F5 f52;
        kotlin.jvm.internal.e0.checkNotNullParameter(parent, "parent");
        KeyEvent.Callback callbackFindViewWithTag = view != null ? view.findViewWithTag("InMobiAdView") : null;
        T8 t82 = callbackFindViewWithTag instanceof T8 ? (T8) callbackFindViewWithTag : null;
        if (z10) {
            t8A = this.f31846e.a(t82, parent, gestureDetectorOnGestureListenerC3093yc);
        } else {
            N8 n82 = this.f31846e;
            n82.getClass();
            kotlin.jvm.internal.e0.checkNotNullParameter(parent, "parent");
            n82.f32065o = gestureDetectorOnGestureListenerC3093yc;
            T8 container = n82.a(t82, parent);
            if (!n82.f32064n) {
                C2970r8 root = n82.f32053c.f33704e;
                if (container != null && root != null) {
                    kotlin.jvm.internal.e0.checkNotNullParameter(container, "container");
                    kotlin.jvm.internal.e0.checkNotNullParameter(parent, "parent");
                    kotlin.jvm.internal.e0.checkNotNullParameter(root, "root");
                    n82.b((ViewGroup) container, root);
                }
            }
            t8A = container;
        }
        if (t82 == null && (f52 = this.f31844c) != null) {
            String TAG = this.f31845d;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).b(TAG, "InMobiNative.getPrimaryView called with Non Native View.");
        }
        if (t8A != null) {
            t8A.setNativeStrandAd(this.f31843b);
        }
        if (t8A == null) {
            return t8A;
        }
        t8A.setTag("InMobiAdView");
        return t8A;
    }
}
