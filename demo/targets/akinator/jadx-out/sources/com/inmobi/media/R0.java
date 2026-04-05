package com.inmobi.media;

import android.os.Handler;
import hr.kNq.ikJMrW;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class R0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U0 f32179a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WeakReference f32180b;

    public R0(U0 u02, WeakReference weakReference) {
        this.f32179a = u02;
        this.f32180b = weakReference;
    }

    public static final void b(U0 this$0, WeakReference listenerWeakReference) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(listenerWeakReference, "$listenerWeakReference");
        F5 f52 = this$0.f32321j;
        if (f52 != null) {
            String strE = U0.e();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE, "<get-TAG>(...)");
            ((G5) f52).a(strE, "callback- onAdDisplayed");
        }
        this$0.b((H0) listenerWeakReference.get());
    }

    public final void a() {
        F5 f52 = this.f32179a.f32321j;
        if (f52 != null) {
            String strE = U0.e();
            StringBuilder sbA = N6.a(strE, "<get-TAG>(...)", "Ad interaction for placement id: ");
            sbA.append(this.f32179a.J());
            ((G5) f52).a(strE, sbA.toString());
        }
        if (this.f32179a.a0()) {
            F5 f53 = this.f32179a.f32321j;
            if (f53 != null) {
                String strE2 = U0.e();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE2, "<get-TAG>(...)");
                ((G5) f53).b(strE2, "ad unit is destroyed");
                return;
            }
            return;
        }
        H0 h02 = (H0) this.f32180b.get();
        if (h02 != null) {
            F5 f54 = this.f32179a.f32321j;
            if (f54 != null) {
                String strE3 = U0.e();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE3, "<get-TAG>(...)");
                ((G5) f54).a(strE3, "callback - onAdInteraction");
            }
            h02.a(new HashMap());
            return;
        }
        F5 f55 = this.f32179a.f32321j;
        if (f55 != null) {
            String strE4 = U0.e();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE4, "<get-TAG>(...)");
            ((G5) f55).b(strE4, "Listener was garbage collected.Unable to give callback");
        }
    }

    public final void c() {
        F5 f52 = this.f32179a.f32321j;
        if (f52 != null) {
            String strE = U0.e();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE, "<get-TAG>(...)");
            ((G5) f52).a(strE, "onAdDisplayFailed native interaction callback");
        }
        if (this.f32179a.a0()) {
            F5 f53 = this.f32179a.f32321j;
            if (f53 != null) {
                String strE2 = U0.e();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE2, "<get-TAG>(...)");
                ((G5) f53).b(strE2, "callback onAdDisplayFailed failed. already destroyed.");
                return;
            }
            return;
        }
        H0 h02 = (H0) this.f32180b.get();
        if (h02 != null) {
            F5 f54 = this.f32179a.f32321j;
            if (f54 != null) {
                String strE3 = U0.e();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE3, "<get-TAG>(...)");
                ((G5) f54).a(strE3, "callback - onAdShowFailed");
            }
            this.f32179a.a(h02, (short) 91);
            return;
        }
        F5 f55 = this.f32179a.f32321j;
        if (f55 != null) {
            String strE4 = U0.e();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE4, "<get-TAG>(...)");
            ((G5) f55).b(strE4, "Listener was garbage collected.Unable to give callback");
        }
    }

    public final void d() {
        F5 f52 = this.f32179a.f32321j;
        if (f52 != null) {
            String strE = U0.e();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE, "<get-TAG>(...)");
            ((G5) f52).c(strE, "onAdDisplay ");
        }
        this.f32179a.b((byte) 4);
        if (!this.f32179a.a0()) {
            Handler handlerE = this.f32179a.E();
            if (handlerE != null) {
                handlerE.post(new zk.x(this.f32179a, this.f32180b, 0));
                return;
            }
            return;
        }
        F5 f53 = this.f32179a.f32321j;
        if (f53 != null) {
            String strE2 = U0.e();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE2, "<get-TAG>(...)");
            ((G5) f53).b(strE2, "onAdDisplay callback failed. adunit destroyed.");
        }
    }

    public final void f() {
        F5 f52 = this.f32179a.f32321j;
        if (f52 != null) {
            String strE = U0.e();
            StringBuilder sbA = N6.a(strE, "<get-TAG>(...)", "Successfully impressed ad for placement id: ");
            sbA.append(this.f32179a.J());
            ((G5) f52).a(strE, sbA.toString());
        }
        if (this.f32179a.a0()) {
            F5 f53 = this.f32179a.f32321j;
            if (f53 != null) {
                String strE2 = U0.e();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE2, "<get-TAG>(...)");
                ((G5) f53).b(strE2, "ad unit is destroyed");
                return;
            }
            return;
        }
        H0 h02 = (H0) this.f32180b.get();
        if (h02 != null) {
            F5 f54 = this.f32179a.f32321j;
            if (f54 != null) {
                String strE3 = U0.e();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE3, "<get-TAG>(...)");
                ((G5) f54).a(strE3, "callback - onAdImpressed");
            }
            h02.c();
            return;
        }
        F5 f55 = this.f32179a.f32321j;
        if (f55 != null) {
            String strE4 = U0.e();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE4, "<get-TAG>(...)");
            ((G5) f55).b(strE4, "Listener was garbage collected.Unable to give callback");
        }
    }

    public final void g() {
        F5 f52 = this.f32179a.f32321j;
        if (f52 != null) {
            String strE = U0.e();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE, "<get-TAG>(...)");
            ((G5) f52).a(strE, "onUserLeftApplication");
        }
        if (this.f32179a.a0()) {
            return;
        }
        H0 h02 = (H0) this.f32180b.get();
        if (h02 != null) {
            h02.h();
            return;
        }
        F5 f53 = this.f32179a.f32321j;
        if (f53 != null) {
            ((G5) f53).b("InMobi", "Listener was garbage collected.Unable to give callback");
        }
    }

    public final void h() {
        F5 f52 = this.f32179a.f32321j;
        if (f52 != null) {
            String strE = U0.e();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE, "<get-TAG>(...)");
            ((G5) f52).a(strE, "onUserSkippedMedia");
        }
        if (this.f32179a.a0()) {
            return;
        }
        H0 h02 = (H0) this.f32180b.get();
        if (h02 != null) {
            h02.i();
            return;
        }
        F5 f53 = this.f32179a.f32321j;
        if (f53 != null) {
            ((G5) f53).b("InMobi", "Listener was garbage collected.Unable to give callback");
        }
    }

    public final void e() {
        F5 f52 = this.f32179a.f32321j;
        if (f52 != null) {
            String strE = U0.e();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE, "<get-TAG>(...)");
            ((G5) f52).c(strE, "onAdFullScreenWillDisplay");
        }
        if (this.f32179a.a0()) {
            F5 f53 = this.f32179a.f32321j;
            if (f53 != null) {
                String strE2 = U0.e();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE2, "<get-TAG>(...)");
                ((G5) f53).a(strE2, ikJMrW.uXgrppmoTMbqjMF);
                return;
            }
            return;
        }
        H0 h02 = (H0) this.f32180b.get();
        if (h02 != null) {
            F5 f54 = this.f32179a.f32321j;
            if (f54 != null) {
                String strE3 = U0.e();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE3, "<get-TAG>(...)");
                ((G5) f54).a(strE3, "callback - onAdScreenWillDisplay");
            }
            h02.e();
            return;
        }
        F5 f55 = this.f32179a.f32321j;
        if (f55 != null) {
            String strE4 = U0.e();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE4, "<get-TAG>(...)");
            ((G5) f55).b(strE4, "Listener was garbage collected.Unable to give callback");
        }
    }

    public final void b() {
        F5 f52 = this.f32179a.f32321j;
        if (f52 != null) {
            String strE = U0.e();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE, "<get-TAG>(...)");
            ((G5) f52).a(strE, "onAdDismissed");
        }
        if (this.f32179a.a0()) {
            return;
        }
        F5 f53 = this.f32179a.f32321j;
        if (f53 != null) {
            ((G5) f53).a("InMobi", "Ad dismissed for placement id: " + this.f32179a.J());
        }
        Handler handlerE = this.f32179a.E();
        if (handlerE != null) {
            handlerE.post(new zk.x(this.f32179a, this.f32180b, 1));
        }
    }

    public static final void a(U0 this$0, WeakReference listenerWeakReference) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(listenerWeakReference, "$listenerWeakReference");
        this$0.a((H0) listenerWeakReference.get());
    }
}
