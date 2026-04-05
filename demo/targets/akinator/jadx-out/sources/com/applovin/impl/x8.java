package com.applovin.impl;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.inmobi.ads.WatermarkData;
import com.inmobi.media.GestureDetectorOnGestureListenerC3093yc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class x8 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16213b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16214c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16215e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16216f;

    public /* synthetic */ x8(Object obj, int i10, Object obj2, Object obj3) {
        this.f16213b = i10;
        this.f16214c = obj;
        this.f16215e = obj2;
        this.f16216f = obj3;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f16213b) {
            case 0:
                ((d1) this.f16214c).a((View) this.f16215e, (FrameLayout) this.f16216f);
                break;
            default:
                GestureDetectorOnGestureListenerC3093yc.a((GestureDetectorOnGestureListenerC3093yc) this.f16214c, (byte[]) this.f16215e, (WatermarkData) this.f16216f);
                break;
        }
    }
}
