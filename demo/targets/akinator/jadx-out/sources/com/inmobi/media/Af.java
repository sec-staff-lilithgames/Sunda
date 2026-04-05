package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Af extends AbstractC3062wf {

    /* renamed from: e, reason: collision with root package name */
    public final C2734d8 f31636e;

    /* renamed from: f, reason: collision with root package name */
    public GestureDetectorOnGestureListenerC3093yc f31637f;

    /* renamed from: g, reason: collision with root package name */
    public final F5 f31638g;

    /* renamed from: h, reason: collision with root package name */
    public final String f31639h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f31640i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Af(C2734d8 mNativeAdContainer, GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc, F5 f52) {
        super(mNativeAdContainer);
        kotlin.jvm.internal.e0.checkNotNullParameter(mNativeAdContainer, "mNativeAdContainer");
        this.f31636e = mNativeAdContainer;
        this.f31637f = gestureDetectorOnGestureListenerC3093yc;
        this.f31638g = f52;
        this.f31639h = "InMobi";
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(byte b10) {
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(Map map) {
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(childView, "childView");
        kotlin.jvm.internal.e0.checkNotNullParameter(obstructionCode, "obstructionCode");
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(Context context, byte b10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(View childView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(childView, "childView");
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final View a(View view, ViewGroup parent, boolean z10) {
        Context contextJ;
        kotlin.jvm.internal.e0.checkNotNullParameter(parent, "parent");
        if (this.f31640i || (contextJ = this.f31636e.j()) == null) {
            return null;
        }
        AdConfig adConfig = this.f33554d;
        C2734d8 c2734d8 = this.f31636e;
        C3106z8 c3106z8 = c2734d8.f32741b;
        kotlin.jvm.internal.e0.checkNotNull(c3106z8, "null cannot be cast to non-null type com.inmobi.ads.modelsv2.NativeDataModel");
        this.f33552b = new H8(contextJ, adConfig, c2734d8, c3106z8, this.f31638g);
        F5 f52 = this.f31638g;
        if (f52 != null) {
            ((G5) f52).b(this.f31639h, "Ad markup loaded into the container will be inflated into a View.");
        }
        H8 h82 = this.f33552b;
        this.f33553c = new WeakReference(h82 != null ? h82.a(view, parent, z10, this.f31637f) : null);
        C2734d8 c2734d82 = this.f31636e;
        c2734d82.getClass();
        J4.a(new T7(c2734d82, c2734d82), "EndCardBuilderTask");
        return b();
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void e() {
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a() {
        if (this.f31640i) {
            return;
        }
        this.f31640i = true;
        H8 h82 = this.f33552b;
        if (h82 != null) {
            N8 n82 = h82.f31846e;
            n82.f32064n = true;
            n82.f32059i.clear();
            n82.f32066p = null;
            V8 v82 = n82.f32060j;
            if (v82 != null) {
                v82.destroy();
            }
            n82.f32060j = null;
            if (!h82.f31842a) {
                h82.f31842a = true;
            }
        }
        this.f33552b = null;
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f31637f;
        if (gestureDetectorOnGestureListenerC3093yc != null) {
            gestureDetectorOnGestureListenerC3093yc.b();
        }
        this.f31637f = null;
        super.a();
    }
}
