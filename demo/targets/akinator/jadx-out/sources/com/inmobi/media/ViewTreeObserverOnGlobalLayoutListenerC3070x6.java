package com.inmobi.media;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.x6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3070x6 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f33563a;

    /* renamed from: b, reason: collision with root package name */
    public final F5 f33564b;

    /* renamed from: c, reason: collision with root package name */
    public int f33565c;

    /* renamed from: d, reason: collision with root package name */
    public int f33566d;

    public ViewTreeObserverOnGlobalLayoutListenerC3070x6(FrameLayout view, F5 f52) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        this.f33563a = view;
        this.f33564b = f52;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        try {
            F5 f52 = this.f33564b;
            if (f52 != null) {
                String str = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((G5) f52).a(str, "close called");
            }
            this.f33565c = D2.b(this.f33563a.getWidth() / AbstractC2679a4.b());
            this.f33566d = D2.b(this.f33563a.getHeight() / AbstractC2679a4.b());
            this.f33563a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            Boolean bool = Boolean.FALSE;
            synchronized (bool) {
                bool.notify();
            }
        } catch (Exception e10) {
            F5 f53 = this.f33564b;
            if (f53 != null) {
                String str2 = C6.f31708a;
                ((G5) f53).b(str2, Qf.a(e10, N6.a(str2, "access$getTAG$p(...)", "SDK encountered unexpected error in JavaScriptBridge$1.onGlobalLayout(); ")));
            }
        }
    }
}
