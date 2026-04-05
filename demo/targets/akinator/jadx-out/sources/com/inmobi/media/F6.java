package com.inmobi.media;

import android.app.Activity;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import com.amazon.device.ads.DTBMetricReport;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class F6 extends Q {

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f31773e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC3063x f31774f;

    /* renamed from: g, reason: collision with root package name */
    public final RelativeLayout f31775g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f31776h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f31777i;

    /* renamed from: j, reason: collision with root package name */
    public C3039v9 f31778j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F6(WeakReference activityRef, InterfaceC3063x adContainer, RelativeLayout adBackgroundView) {
        super(adBackgroundView);
        kotlin.jvm.internal.e0.checkNotNullParameter(activityRef, "activityRef");
        kotlin.jvm.internal.e0.checkNotNullParameter(adContainer, "adContainer");
        kotlin.jvm.internal.e0.checkNotNullParameter(adBackgroundView, "adBackgroundView");
        this.f31773e = activityRef;
        this.f31774f = adContainer;
        this.f31775g = adBackgroundView;
    }

    public static final void a(F6 this$0, C2887m9 c2887m9) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        if (this$0.f31774f.getPlacementType() == 1) {
            Object obj = c2887m9.f33155t.get("didCompleteQ4");
            kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) obj).booleanValue()) {
                return;
            }
        }
        C3039v9 c3039v9 = this$0.f31778j;
        if (c3039v9 != null) {
            c3039v9.start();
        }
    }

    @Override // com.inmobi.media.Q
    public final void b() {
        C3039v9 c3039v9;
        Activity activity = (Activity) this.f31773e.get();
        if (!(activity instanceof InMobiAdActivity) ? false : ((InMobiAdActivity) activity).f31598e) {
            InterfaceC3063x interfaceC3063x = this.f31774f;
            if (interfaceC3063x instanceof C2853k9) {
                View videoContainerView = ((C2853k9) interfaceC3063x).getVideoContainerView();
                C3056w9 c3056w9 = videoContainerView instanceof C3056w9 ? (C3056w9) videoContainerView : null;
                if (c3056w9 != null) {
                    Object tag = c3056w9.getVideoView().getTag();
                    kotlin.jvm.internal.e0.checkNotNull(tag, "null cannot be cast to non-null type com.inmobi.ads.modelsv2.NativeVideoAsset");
                    a((C2887m9) tag);
                }
            } else if (interfaceC3063x instanceof C2734d8) {
                a((C2887m9) null);
            }
        } else {
            InterfaceC3063x interfaceC3063x2 = this.f31774f;
            if (interfaceC3063x2 instanceof C2853k9) {
                C3039v9 c3039v92 = this.f31778j;
                Object tag2 = c3039v92 != null ? c3039v92.getTag() : null;
                C2887m9 c2887m9 = tag2 instanceof C2887m9 ? (C2887m9) tag2 : null;
                if (c2887m9 != null) {
                    if (1 == ((C2734d8) interfaceC3063x2).f32740a && (c3039v9 = this.f31778j) != null) {
                        c3039v9.f();
                    }
                    a(c2887m9);
                }
            } else if (interfaceC3063x2 instanceof C2734d8) {
                a((C2887m9) null);
            }
            SparseArray sparseArray = InMobiAdActivity.f31591k;
            InterfaceC3063x container = this.f31774f;
            kotlin.jvm.internal.e0.checkNotNullParameter(container, "container");
            InMobiAdActivity.f31591k.remove(container.hashCode());
        }
        this.f31774f.b();
    }

    @Override // com.inmobi.media.Q
    public final void c() {
        InterfaceC3063x interfaceC3063x = this.f31774f;
        if (interfaceC3063x instanceof C2853k9) {
            C3039v9 c3039v9 = this.f31778j;
            Object tag = c3039v9 != null ? c3039v9.getTag() : null;
            C2887m9 c2887m9 = tag instanceof C2887m9 ? (C2887m9) tag : null;
            if (c2887m9 != null && this.f31776h) {
                new Handler(Looper.getMainLooper()).postDelayed(new on.z(29, this, c2887m9), 50L);
            }
            try {
                if (!this.f31777i) {
                    this.f31777i = true;
                    InterfaceC3046w fullScreenEventsListener = this.f31774f.getFullScreenEventsListener();
                    if (fullScreenEventsListener != null) {
                        fullScreenEventsListener.a(c2887m9);
                    }
                }
            } catch (Exception e10) {
                Y5 y52 = Y5.f32563a;
                Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            }
        } else if (interfaceC3063x instanceof C2734d8) {
            try {
                if (!this.f31777i) {
                    this.f31777i = true;
                    InterfaceC3046w fullScreenEventsListener2 = interfaceC3063x.getFullScreenEventsListener();
                    if (fullScreenEventsListener2 != null) {
                        fullScreenEventsListener2.a(null);
                    }
                }
            } catch (Exception e11) {
                Y5 y53 = Y5.f32563a;
                Y5.f32566d.a(C5.a(e11, NotificationCompat.CATEGORY_EVENT));
            }
        }
        this.f31776h = false;
    }

    @Override // com.inmobi.media.Q
    public final void d() {
        this.f31776h = true;
        C3039v9 c3039v9 = this.f31778j;
        if (c3039v9 != null) {
            c3039v9.pause();
        }
    }

    @Override // com.inmobi.media.Q
    public final void f() {
        C2970r8 c2970r8;
        C2920o8 c2920o8;
        byte placementType = this.f31774f.getPlacementType();
        this.f31775g.setBackgroundColor(-16777216);
        Object dataModel = this.f31774f.getDataModel();
        C2967r5 c2967r5 = null;
        C3106z8 c3106z8 = dataModel instanceof C3106z8 ? (C3106z8) dataModel : null;
        Point point = (c3106z8 == null || (c2970r8 = c3106z8.f33704e) == null || (c2920o8 = c2970r8.f33139d) == null) ? null : c2920o8.f33181a;
        AbstractC3062wf viewableAd = this.f31774f.getViewableAd();
        int requestedOrientation = 0;
        View viewA = viewableAd != null ? viewableAd.a(null, this.f31775g, false) : null;
        InterfaceC3063x interfaceC3063x = this.f31774f;
        if (interfaceC3063x instanceof C2853k9) {
            View videoContainerView = ((C2853k9) interfaceC3063x).getVideoContainerView();
            C3056w9 c3056w9 = videoContainerView instanceof C3056w9 ? (C3056w9) videoContainerView : null;
            if (c3056w9 != null) {
                C3039v9 videoView = c3056w9.getVideoView();
                this.f31778j = videoView;
                if (videoView != null) {
                    videoView.requestFocus();
                }
                C3039v9 c3039v9 = this.f31778j;
                Object tag = c3039v9 != null ? c3039v9.getTag() : null;
                kotlin.jvm.internal.e0.checkNotNull(tag, "null cannot be cast to non-null type com.inmobi.ads.modelsv2.NativeVideoAsset");
                C2887m9 c2887m9 = (C2887m9) tag;
                C2903n8 c2903n8 = c2887m9.f33158w;
                if (c2903n8 != null) {
                    kotlin.jvm.internal.e0.checkNotNull(c2903n8, "null cannot be cast to non-null type com.inmobi.ads.modelsv2.NativeVideoAsset");
                    c2887m9.a((C2887m9) c2903n8);
                }
                if (placementType == 0) {
                    c2887m9.f33155t.put("placementType", (byte) 0);
                } else {
                    c2887m9.f33155t.put("placementType", (byte) 1);
                }
            }
        }
        if (viewA != null) {
            kotlin.jvm.internal.e0.checkNotNull(point);
            this.f31775g.addView(viewA, new RelativeLayout.LayoutParams(point.x, point.y));
        }
        Activity activity = (Activity) this.f31773e.get();
        if (activity == null || c3106z8 == null) {
            return;
        }
        byte b10 = c3106z8.f33701b;
        if (b10 == 1) {
            requestedOrientation = 1;
        } else if (b10 != 2) {
            requestedOrientation = activity.getRequestedOrientation();
        }
        if (activity instanceof InMobiAdActivity) {
            C2967r5 c2967r52 = ((InMobiAdActivity) activity).f31594a;
            if (c2967r52 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("orientationHandler");
            } else {
                c2967r5 = c2967r52;
            }
            c2967r5.f33303a.setRequestedOrientation(requestedOrientation);
        }
    }

    @Override // com.inmobi.media.Q
    public final void g() {
        try {
            AdConfig adConfig = this.f31774f.getAdConfig();
            AbstractC3062wf viewableAd = this.f31774f.getViewableAd();
            if ((viewableAd != null ? viewableAd.b() : null) != null) {
                InterfaceC3063x interfaceC3063x = this.f31774f;
                if (!(interfaceC3063x instanceof C2853k9)) {
                    if (interfaceC3063x instanceof C2734d8) {
                        try {
                            viewableAd.a((Map) null);
                            return;
                        } catch (Exception unused) {
                            InterfaceC3046w fullScreenEventsListener = this.f31774f.getFullScreenEventsListener();
                            if (fullScreenEventsListener != null) {
                                fullScreenEventsListener.a();
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                C3039v9 c3039v9 = this.f31778j;
                Object tag = c3039v9 != null ? c3039v9.getTag() : null;
                C2887m9 c2887m9 = tag instanceof C2887m9 ? (C2887m9) tag : null;
                if (c2887m9 != null) {
                    AdConfig.ViewabilityConfig viewability = adConfig.getViewability();
                    int videoImpressionMinTimeViewed = viewability.getVideoImpressionMinTimeViewed();
                    HashMap map = c2887m9.F;
                    Object obj = map != null ? map.get(DTBMetricReport.TIME) : null;
                    if (obj instanceof Integer) {
                        videoImpressionMinTimeViewed = ((Number) obj).intValue();
                    }
                    viewability.setVideoImpressionMinTimeViewed(videoImpressionMinTimeViewed);
                    viewableAd.a((Map) null);
                }
            }
        } catch (Exception e10) {
            InterfaceC3046w fullScreenEventsListener2 = this.f31774f.getFullScreenEventsListener();
            if (fullScreenEventsListener2 != null) {
                fullScreenEventsListener2.a();
            }
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    @Override // com.inmobi.media.Q
    public final void a() {
        if (this.f31774f.c()) {
            return;
        }
        InterfaceC3063x interfaceC3063x = this.f31774f;
        if (interfaceC3063x instanceof C2853k9) {
            if (((C2853k9) interfaceC3063x).f32741b.f33702c) {
                return;
            }
            Activity activity = (Activity) this.f31773e.get();
            if (activity instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity).f31598e = true;
            }
            C3039v9 c3039v9 = this.f31778j;
            if (c3039v9 == null) {
                Activity activity2 = (Activity) this.f31773e.get();
                if (activity2 == null) {
                    return;
                }
                activity2.finish();
                return;
            }
            Object tag = c3039v9.getTag();
            C2887m9 c2887m9 = tag instanceof C2887m9 ? (C2887m9) tag : null;
            if (c2887m9 != null) {
                if (1 == ((C2734d8) interfaceC3063x).f32740a) {
                    c3039v9.f();
                }
                try {
                    Object obj = c2887m9.f33155t.get("isFullScreen");
                    kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
                    if (((Boolean) obj).booleanValue()) {
                        c2887m9.f33155t.put("seekPosition", Integer.valueOf(c3039v9.getCurrentPosition()));
                        ((C2853k9) interfaceC3063x).b(c2887m9);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    AbstractC2902n7.a((byte) 2, "InMobi", "SDK encountered unexpected error in closing video");
                    Y5 y52 = Y5.f32563a;
                    Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
                    return;
                }
            }
            return;
        }
        if (interfaceC3063x instanceof C2734d8) {
            C2734d8 c2734d8 = (C2734d8) interfaceC3063x;
            if (c2734d8.f32741b.f33702c) {
                return;
            }
            c2734d8.a();
            return;
        }
        Activity activity3 = (Activity) this.f31773e.get();
        if (activity3 == null) {
            return;
        }
        activity3.finish();
    }

    public final void a(C2887m9 c2887m9) {
        try {
            InterfaceC3046w fullScreenEventsListener = this.f31774f.getFullScreenEventsListener();
            if (fullScreenEventsListener != null) {
                fullScreenEventsListener.b(c2887m9);
            }
        } catch (Exception e10) {
            AbstractC2902n7.a((byte) 2, "InMobi", "SDK encountered unexpected error while finishing fullscreen view");
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }
}
