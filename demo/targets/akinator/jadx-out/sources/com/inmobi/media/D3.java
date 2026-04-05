package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class D3 extends Kf {

    /* renamed from: n, reason: collision with root package name */
    public final F5 f31730n;

    /* renamed from: o, reason: collision with root package name */
    public final String f31731o;

    /* renamed from: p, reason: collision with root package name */
    public final ViewTreeObserver.OnPreDrawListener f31732p;

    /* renamed from: q, reason: collision with root package name */
    public final WeakReference f31733q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D3(Ef visibilityChecker, Activity activity, F5 f52) {
        super(visibilityChecker, (byte) 1, f52);
        kotlin.jvm.internal.e0.checkNotNullParameter(visibilityChecker, "visibilityChecker");
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        this.f31730n = f52;
        this.f31731o = "D3";
        View decorView = activity.getWindow().getDecorView();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        this.f31733q = new WeakReference(decorView);
        ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            com.vungle.ads.internal.a aVar = new com.vungle.ads.internal.a(this, 1);
            this.f31732p = aVar;
            viewTreeObserver.addOnPreDrawListener(aVar);
        } else if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("D3", "TAG");
            ((G5) f52).b("D3", "Visibility Tracker was unable to track views because the  root view tree observer was not alive");
        }
    }

    public static final boolean a(D3 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.g();
        return true;
    }

    @Override // com.inmobi.media.Kf
    public final void b() {
        F5 f52 = this.f31730n;
        if (f52 != null) {
            String TAG = this.f31731o;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "unregisterPreDrawListener");
        }
        View view = (View) this.f31733q.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f31732p);
            }
        }
        super.b();
    }

    @Override // com.inmobi.media.Kf
    public final int c() {
        return 100;
    }

    @Override // com.inmobi.media.Kf
    public final void e() {
        F5 f52 = this.f31730n;
        if (f52 != null) {
            String TAG = this.f31731o;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
        }
        if (this.f31975i.get()) {
            return;
        }
        F5 f53 = this.f31730n;
        if (f53 != null) {
            String TAG2 = this.f31731o;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
            ((G5) f53).c(TAG2, "unregisterPreDrawListener");
        }
        View view = (View) this.f31733q.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f31732p);
            }
        }
        super.e();
    }

    @Override // com.inmobi.media.Kf
    public final void f() {
        F5 f52 = this.f31730n;
        if (f52 != null) {
            String TAG = this.f31731o;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
        }
        if (this.f31975i.get()) {
            View view = (View) this.f31733q.get();
            if (view != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnPreDrawListener(this.f31732p);
                } else {
                    F5 f53 = this.f31730n;
                    if (f53 != null) {
                        String TAG2 = this.f31731o;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                        ((G5) f53).b(TAG2, "Visibility Tracker was unable to track views because the root view tree observer was not alive");
                    }
                }
            }
            super.f();
        }
    }

    @Override // com.inmobi.media.Kf
    public final void d() {
    }
}
