package com.inmobi.media;

import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.c8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2717c8 extends Ac {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2734d8 f32707a;

    public C2717c8(C2734d8 c2734d8) {
        this.f32707a = c2734d8;
    }

    @Override // com.inmobi.media.Ac
    public final void a(HashMap params) {
        kotlin.jvm.internal.e0.checkNotNullParameter(params, "params");
        R0 r02 = this.f32707a.f32762w;
        if (r02 != null) {
            r02.a();
        }
    }

    @Override // com.inmobi.media.Ac
    public final void c() {
        R0 r02 = this.f32707a.f32762w;
        if (r02 != null) {
            r02.c();
        }
    }

    @Override // com.inmobi.media.Ac
    public final void d() {
        R0 r02;
        C2734d8 c2734d8 = this.f32707a;
        if (c2734d8.f32740a != 0 || (r02 = c2734d8.f32762w) == null) {
            return;
        }
        r02.e();
    }

    @Override // com.inmobi.media.Ac
    public final void e(GestureDetectorOnGestureListenerC3093yc renderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        R0 r02 = this.f32707a.f32762w;
        if (r02 != null) {
            r02.b();
        }
    }

    @Override // com.inmobi.media.Ac
    public final void f(GestureDetectorOnGestureListenerC3093yc renderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        R0 r02 = this.f32707a.f32762w;
        if (r02 != null) {
            r02.d();
        }
    }

    @Override // com.inmobi.media.Ac, com.inmobi.media.InterfaceC2758ef
    public final void a() {
        R0 r02 = this.f32707a.f32762w;
        if (r02 != null) {
            r02.g();
        }
    }

    @Override // com.inmobi.media.Ac
    public final void a(C3078xe telemetryOnAdImpression) {
        kotlin.jvm.internal.e0.checkNotNullParameter(telemetryOnAdImpression, "telemetryOnAdImpression");
        R0 r02 = this.f32707a.f32762w;
        if (r02 != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter(telemetryOnAdImpression, "telemetryOnAdImpression");
            telemetryOnAdImpression.getClass();
            kotlin.jvm.internal.e0.checkNotNullParameter("nativeBeacon", "<set-?>");
            telemetryOnAdImpression.f33587f = "nativeBeacon";
            if (r02.f32179a.a0()) {
                telemetryOnAdImpression.b();
            } else {
                r02.f32179a.D.a(telemetryOnAdImpression);
            }
        }
    }

    @Override // com.inmobi.media.Ac
    public final void a(String log) {
        kotlin.jvm.internal.e0.checkNotNullParameter(log, "log");
        R0 r02 = this.f32707a.f32762w;
        if (r02 != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter(log, "log");
            F5 f52 = r02.f32179a.f32321j;
            if (f52 != null) {
                String strE = U0.e();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE, "<get-TAG>(...)");
                ((G5) f52).a(strE, "onImraidLog");
            }
            if (r02.f32179a.a0()) {
                return;
            }
            H0 h02 = (H0) r02.f32180b.get();
            if (h02 != null) {
                h02.a(log);
                return;
            }
            F5 f53 = r02.f32179a.f32321j;
            if (f53 != null) {
                String strE2 = U0.e();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE2, "<get-TAG>(...)");
                ((G5) f53).b(strE2, "listener is null");
            }
        }
    }
}
