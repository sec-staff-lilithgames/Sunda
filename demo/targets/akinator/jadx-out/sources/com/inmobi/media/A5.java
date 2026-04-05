package com.inmobi.media;

import android.view.ViewTreeObserver;
import com.inmobi.ads.InMobiBanner;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class A5 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InMobiBanner f31619a;

    public A5(InMobiBanner inMobiBanner) {
        this.f31619a = inMobiBanner;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        F5 f5P;
        try {
            this.f31619a.f31554i = D2.b(r0.getMeasuredWidth() / AbstractC2679a4.b());
            this.f31619a.f31555j = D2.b(r0.getMeasuredHeight() / AbstractC2679a4.b());
            if (this.f31619a.b()) {
                this.f31619a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        } catch (Exception e10) {
            T1 mAdManager$media_release = this.f31619a.getMAdManager$media_release();
            if (mAdManager$media_release == null || (f5P = mAdManager$media_release.p()) == null) {
                return;
            }
            String strAccess$getTAG$cp = InMobiBanner.access$getTAG$cp();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strAccess$getTAG$cp, "access$getTAG$cp(...)");
            ((G5) f5P).a(strAccess$getTAG$cp, "InMobiBanner$1.onGlobalLayout() handler threw unexpected error: ", e10);
        }
    }
}
