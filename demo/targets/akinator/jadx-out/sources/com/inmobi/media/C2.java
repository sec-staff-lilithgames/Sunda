package com.inmobi.media;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.unity3d.ads.BuildConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class C2 {

    /* renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3093yc f31700a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f31701b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f31702c;

    /* renamed from: d, reason: collision with root package name */
    public final F5 f31703d;

    public C2(GestureDetectorOnGestureListenerC3093yc renderView, boolean z10, boolean z11, F5 f52) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        this.f31700a = renderView;
        this.f31701b = z10;
        this.f31702c = z11;
        this.f31703d = f52;
    }

    public final void a(ag insets) {
        Handler handler;
        kotlin.jvm.internal.e0.checkNotNullParameter(insets, "insets");
        ViewGroup viewGroup = (ViewGroup) this.f31700a.getRootView().findViewById(65534);
        if (viewGroup == null || (handler = viewGroup.getHandler()) == null) {
            return;
        }
        handler.post(new io.bidmachine.media3.exoplayer.b1(this, 18, viewGroup, insets));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.inmobi.media.C2 r16, android.view.ViewGroup r17, com.inmobi.media.ag r18) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2.a(com.inmobi.media.C2, android.view.ViewGroup, com.inmobi.media.ag):void");
    }

    public final void a(View view) {
        AbstractC3062wf viewableAd;
        Sf webViewFactory = this.f31700a.getWebViewFactory();
        webViewFactory.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(BuildConfig.FLAVOR, "id");
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = (GestureDetectorOnGestureListenerC3093yc) webViewFactory.f32281b.get(BuildConfig.FLAVOR);
        if (gestureDetectorOnGestureListenerC3093yc == null || (viewableAd = gestureDetectorOnGestureListenerC3093yc.getViewableAd()) == null) {
            return;
        }
        viewableAd.a(view, FriendlyObstructionPurpose.CLOSE_AD);
    }

    public final tu.v a() {
        float f10 = AbstractC2679a4.d().f32676c;
        o9.j0 j0Var = new o9.j0(this, 17);
        int i10 = (int) (50 * f10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i10);
        layoutParams.addRule(11);
        return tu.e0.to(j0Var, layoutParams);
    }

    public static final void a(C2 this$0, View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.f31700a.i();
        } catch (Exception unused) {
            AbstractC2902n7.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
        }
    }
}
