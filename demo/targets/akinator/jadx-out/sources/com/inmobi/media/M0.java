package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.multipro.xsB.LJjmO;
import com.inmobi.ads.InMobiAdRequestStatus;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class M0 extends Ac {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U0 f32017a;

    public M0(U0 u02) {
        this.f32017a = u02;
    }

    public static final void a(U0 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 43);
    }

    public static final void b(U0 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.f32328q = true;
        this$0.f();
    }

    @Override // com.inmobi.media.Ac
    public final void g(GestureDetectorOnGestureListenerC3093yc renderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        if (2 == this.f32017a.R()) {
            this.f32017a.r0();
        }
    }

    @Override // com.inmobi.media.Ac
    public final void h(GestureDetectorOnGestureListenerC3093yc renderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        new Handler(Looper.getMainLooper()).post(new zk.r(this.f32017a, 0));
    }

    @Override // com.inmobi.media.Ac
    public final void i(GestureDetectorOnGestureListenerC3093yc renderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        if (2 == this.f32017a.R()) {
            new Handler(Looper.getMainLooper()).post(new zk.r(this.f32017a, 1));
        }
    }

    @Override // com.inmobi.media.Ac
    public final void a(C3078xe c3078xe) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c3078xe, LJjmO.rtScCcck);
        this.f32017a.a(c3078xe);
    }
}
