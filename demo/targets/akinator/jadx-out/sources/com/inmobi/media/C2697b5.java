package com.inmobi.media;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.b5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2697b5 extends Q {

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f32677e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC3063x f32678f;

    /* renamed from: g, reason: collision with root package name */
    public final RelativeLayout f32679g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f32680h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2697b5(WeakReference activityRef, InterfaceC3063x adContainer, RelativeLayout adBackgroundView) {
        super(adBackgroundView);
        kotlin.jvm.internal.e0.checkNotNullParameter(activityRef, "activityRef");
        kotlin.jvm.internal.e0.checkNotNullParameter(adContainer, "adContainer");
        kotlin.jvm.internal.e0.checkNotNullParameter(adBackgroundView, "adBackgroundView");
        this.f32677e = activityRef;
        this.f32678f = adContainer;
        this.f32679g = adBackgroundView;
    }

    @Override // com.inmobi.media.Q
    public final void a(EnumC3108za orientation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(orientation, "orientation");
        kotlin.jvm.internal.e0.checkNotNullParameter(orientation, "orientation");
        this.f32143b = orientation;
        InterfaceC3063x interfaceC3063x = this.f32678f;
        kotlin.jvm.internal.e0.checkNotNull(interfaceC3063x, "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView");
        ((GestureDetectorOnGestureListenerC3093yc) interfaceC3063x).getWebViewFactory().a(new C2680a5(orientation));
    }

    @Override // com.inmobi.media.Q
    public final void b() {
        Activity activity = (Activity) this.f32677e.get();
        if (!(activity instanceof InMobiAdActivity) ? false : ((InMobiAdActivity) activity).f31598e) {
            try {
                InterfaceC3046w fullScreenEventsListener = this.f32678f.getFullScreenEventsListener();
                if (fullScreenEventsListener != null) {
                    fullScreenEventsListener.b(null);
                }
            } catch (Exception unused) {
                AbstractC2902n7.a((byte) 2, "InMobi", "SDK encountered unexpected error while finishing fullscreen view");
            }
        } else {
            InterfaceC3063x interfaceC3063x = this.f32678f;
            kotlin.jvm.internal.e0.checkNotNull(interfaceC3063x, "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView");
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = (GestureDetectorOnGestureListenerC3093yc) interfaceC3063x;
            gestureDetectorOnGestureListenerC3093yc.setFullScreenActivityContext(null);
            try {
                gestureDetectorOnGestureListenerC3093yc.i();
            } catch (Exception unused2) {
                AbstractC2902n7.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
            }
            SparseArray sparseArray = InMobiAdActivity.f31591k;
            InterfaceC3063x container = this.f32678f;
            kotlin.jvm.internal.e0.checkNotNullParameter(container, "container");
            InMobiAdActivity.f31591k.remove(container.hashCode());
        }
        this.f32678f.b();
    }

    @Override // com.inmobi.media.Q
    public final void c() {
        if (this.f32680h) {
            return;
        }
        try {
            this.f32680h = true;
            InterfaceC3046w fullScreenEventsListener = this.f32678f.getFullScreenEventsListener();
            if (fullScreenEventsListener != null) {
                fullScreenEventsListener.a(null);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.inmobi.media.Q
    public final void f() {
        this.f32679g.setBackgroundColor(0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        AbstractC3062wf viewableAd = this.f32678f.getViewableAd();
        View viewD = viewableAd != null ? viewableAd.d() : null;
        if (viewD != null) {
            ViewParent parent = viewD.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(viewD);
            }
            this.f32679g.addView(viewD, layoutParams);
        }
    }

    @Override // com.inmobi.media.Q
    public final void g() {
        if (1 == this.f32678f.getPlacementType()) {
            try {
                HashMap map = new HashMap();
                AbstractC3062wf viewableAd = this.f32678f.getViewableAd();
                if (viewableAd != null) {
                    viewableAd.a(map);
                }
            } catch (Exception unused) {
                InterfaceC3046w fullScreenEventsListener = this.f32678f.getFullScreenEventsListener();
                if (fullScreenEventsListener != null) {
                    fullScreenEventsListener.a();
                }
            }
        }
    }

    @Override // com.inmobi.media.Q
    public final void a() {
        InterfaceC3063x interfaceC3063x = this.f32678f;
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = interfaceC3063x instanceof GestureDetectorOnGestureListenerC3093yc ? (GestureDetectorOnGestureListenerC3093yc) interfaceC3063x : null;
        if (gestureDetectorOnGestureListenerC3093yc == null) {
            return;
        }
        gestureDetectorOnGestureListenerC3093yc.getWebViewFactory().a(Z4.f32593a);
        if (gestureDetectorOnGestureListenerC3093yc.I) {
            return;
        }
        try {
            gestureDetectorOnGestureListenerC3093yc.i();
        } catch (Exception unused) {
            AbstractC2902n7.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
        }
    }

    @Override // com.inmobi.media.Q
    public final void d() {
    }
}
