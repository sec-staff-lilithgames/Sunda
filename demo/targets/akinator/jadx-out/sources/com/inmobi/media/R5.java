package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.commons.core.configs.AdConfig;
import com.moloco.sdk.BKC.JzVV;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class R5 extends AbstractC3062wf {

    /* renamed from: e, reason: collision with root package name */
    public final C3113zf f32201e;

    /* renamed from: f, reason: collision with root package name */
    public final Y4 f32202f;

    /* renamed from: g, reason: collision with root package name */
    public final F5 f32203g;

    /* renamed from: h, reason: collision with root package name */
    public final String f32204h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R5(GestureDetectorOnGestureListenerC3093yc container, C3113zf mViewableAd, Y4 htmlAdTracker, F5 f52) {
        super(container);
        kotlin.jvm.internal.e0.checkNotNullParameter(container, "container");
        kotlin.jvm.internal.e0.checkNotNullParameter(mViewableAd, "mViewableAd");
        kotlin.jvm.internal.e0.checkNotNullParameter(htmlAdTracker, "htmlAdTracker");
        this.f32201e = mViewableAd;
        this.f32202f = htmlAdTracker;
        this.f32203g = f52;
        this.f32204h = "R5";
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(byte b10) {
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final View b() {
        return this.f32201e.b();
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final H8 c() {
        return this.f32201e.f33552b;
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final View d() {
        return this.f32201e.d();
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void e() {
        F5 f52 = this.f32203g;
        if (f52 != null) {
            String TAG = this.f32204h;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "stopTrackingForImpression");
        }
        View viewB = this.f32201e.b();
        if (viewB != null) {
            this.f32202f.a(viewB);
            this.f32201e.getClass();
        }
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final View a(View view, ViewGroup parent, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(parent, "parent");
        View viewB = this.f32201e.b();
        if (viewB != null) {
            this.f32202f.a(viewB);
            this.f32202f.b(viewB);
        }
        C3113zf c3113zf = this.f32201e;
        c3113zf.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(parent, "parent");
        return c3113zf.d();
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(Map map) {
        F5 f52 = this.f32203g;
        if (f52 != null) {
            String str = this.f32204h;
            StringBuilder sbA = N6.a(str, "TAG", "startTrackingForImpression with ");
            sbA.append(map != null ? Integer.valueOf(map.size()) : null);
            sbA.append(" friendly views");
            ((G5) f52).a(str, sbA.toString());
        }
        View token = this.f32201e.b();
        if (token != null) {
            F5 f53 = this.f32203g;
            if (f53 != null) {
                String TAG = this.f32204h;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f53).a(TAG, "start tracking");
            }
            AdConfig.ViewabilityConfig viewabilityConfig = this.f33554d.getViewability();
            InterfaceC3063x interfaceC3063x = this.f33551a;
            kotlin.jvm.internal.e0.checkNotNull(interfaceC3063x, "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView");
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = (GestureDetectorOnGestureListenerC3093yc) interfaceC3063x;
            gestureDetectorOnGestureListenerC3093yc.setFriendlyViews(map);
            Y4 y42 = this.f32202f;
            y42.getClass();
            kotlin.jvm.internal.e0.checkNotNullParameter(token, "view");
            kotlin.jvm.internal.e0.checkNotNullParameter(token, "token");
            kotlin.jvm.internal.e0.checkNotNullParameter(viewabilityConfig, "viewabilityConfig");
            F5 f54 = y42.f32558f;
            if (f54 != null) {
                ((G5) f54).c("HtmlAdTracker", "startTrackingForImpression");
            }
            if (y42.f32553a == 0) {
                F5 f55 = y42.f32558f;
                if (f55 != null) {
                    ((G5) f55).b("HtmlAdTracker", "impression type is loaded. return");
                }
            } else if (!kotlin.jvm.internal.e0.areEqual(y42.f32554b, "video") && !kotlin.jvm.internal.e0.areEqual(y42.f32554b, "audio")) {
                byte b10 = y42.f32553a;
                C2883m5 c2883m5 = y42.f32559g;
                if (c2883m5 == null) {
                    F5 f56 = y42.f32558f;
                    if (f56 != null) {
                        ((G5) f56).c("HtmlAdTracker", a.b.e(b10, "creating Visibility Tracker for "));
                    }
                    C2731d5 c2731d5 = new C2731d5(viewabilityConfig, b10, y42.f32558f);
                    F5 f57 = y42.f32558f;
                    if (f57 != null) {
                        ((G5) f57).c("HtmlAdTracker", a.b.e(b10, "creating Impression Tracker for "));
                    }
                    C2883m5 c2883m52 = new C2883m5(viewabilityConfig, c2731d5, y42.f32562j);
                    y42.f32559g = c2883m52;
                    c2883m5 = c2883m52;
                }
                F5 f58 = y42.f32558f;
                if (f58 != null) {
                    ((G5) f58).c("HtmlAdTracker", "impression tracker add view");
                }
                c2883m5.a(token, token, y42.f32556d, y42.f32555c);
            } else {
                F5 f59 = y42.f32558f;
                if (f59 != null) {
                    ((G5) f59).b("HtmlAdTracker", "creative type is video and audio. return");
                }
            }
            this.f32202f.a(token, token, gestureDetectorOnGestureListenerC3093yc.getVISIBILITY_CHANGE_LISTENER(), viewabilityConfig, false);
            this.f32201e.getClass();
        }
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(childView, "childView");
        kotlin.jvm.internal.e0.checkNotNullParameter(obstructionCode, "obstructionCode");
        if (childView instanceof Fc) {
            F5 f52 = this.f32203g;
            if (f52 != null) {
                String TAG = this.f32204h;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f52).a(TAG, "Ignoring RenderViewSibling as friendly view");
                return;
            }
            return;
        }
        F5 f53 = this.f32203g;
        if (f53 != null) {
            String str = this.f32204h;
            StringBuilder sbA = N6.a(str, "TAG", "Adding friendly view: ");
            sbA.append(childView.getClass().getSimpleName());
            sbA.append(" with obstruction code: ");
            sbA.append(obstructionCode);
            ((G5) f53).a(str, sbA.toString());
        }
        this.f32201e.a(childView, obstructionCode);
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(View childView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(childView, "childView");
        if (childView instanceof Fc) {
            return;
        }
        this.f32201e.a(childView);
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(Context context, byte b10) {
        C3113zf c3113zf;
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        F5 f52 = this.f32203g;
        if (f52 != null) {
            String str = this.f32204h;
            ((G5) f52).a(str, AbstractC2803h9.a(str, "TAG", "onActivityStateChanged - state - ", b10));
        }
        try {
            try {
                if (b10 == 0) {
                    Y4 y42 = this.f32202f;
                    F5 f53 = y42.f32558f;
                    if (f53 != null) {
                        ((G5) f53).c("HtmlAdTracker", "onActivityStarted");
                    }
                    C2883m5 c2883m5 = y42.f32559g;
                    if (c2883m5 != null) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(c2883m5.f33083d, "TAG");
                        for (Map.Entry entry : c2883m5.f33080a.entrySet()) {
                            View view = (View) entry.getKey();
                            C2849k5 c2849k5 = (C2849k5) entry.getValue();
                            c2883m5.f33082c.a(view, c2849k5.f33007a, c2849k5.f33008b);
                        }
                        if (!c2883m5.f33084e.hasMessages(0)) {
                            c2883m5.f33084e.postDelayed(c2883m5.f33085f, c2883m5.f33086g);
                        }
                        c2883m5.f33082c.f();
                    }
                    C2731d5 c2731d5 = y42.f32560h;
                    if (c2731d5 != null) {
                        c2731d5.f();
                    }
                } else if (b10 == 1) {
                    Y4 y43 = this.f32202f;
                    F5 f54 = y43.f32558f;
                    if (f54 != null) {
                        ((G5) f54).c("HtmlAdTracker", "onActivityStopped");
                    }
                    C2883m5 c2883m52 = y43.f32559g;
                    if (c2883m52 != null) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(c2883m52.f33083d, "TAG");
                        c2883m52.f33082c.a();
                        c2883m52.f33084e.removeCallbacksAndMessages(null);
                        c2883m52.f33081b.clear();
                    }
                    C2731d5 c2731d52 = y43.f32560h;
                    if (c2731d52 != null) {
                        c2731d52.e();
                    }
                } else if (b10 == 2) {
                    Y4 y44 = this.f32202f;
                    F5 f55 = y44.f32558f;
                    if (f55 != null) {
                        ((G5) f55).c("HtmlAdTracker", "onActivityDestroyed");
                    }
                    C2883m5 c2883m53 = y44.f32559g;
                    if (c2883m53 != null) {
                        c2883m53.f33080a.clear();
                        c2883m53.f33081b.clear();
                        c2883m53.f33082c.a();
                        c2883m53.f33084e.removeMessages(0);
                        c2883m53.f33082c.b();
                    }
                    y44.f32559g = null;
                    C2731d5 c2731d53 = y44.f32560h;
                    if (c2731d53 != null) {
                        c2731d53.b();
                    }
                    y44.f32560h = null;
                } else {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(this.f32204h, "TAG");
                }
                c3113zf = this.f32201e;
            } catch (Exception e10) {
                F5 f56 = this.f32203g;
                if (f56 != null) {
                    String TAG = this.f32204h;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                    ((G5) f56).b(TAG, "Exception in onActivityStateChanged with message : " + e10.getMessage());
                }
                Y5 y52 = Y5.f32563a;
                C2796h2 event = new C2796h2(e10);
                kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
                Y5.f32566d.a(event);
                c3113zf = this.f32201e;
            }
            c3113zf.getClass();
            kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        } catch (Throwable th2) {
            this.f32201e.getClass();
            kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
            throw th2;
        }
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a() {
        F5 f52 = this.f32203g;
        if (f52 != null) {
            String str = this.f32204h;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, JzVV.hmmCCkwTay);
            ((G5) f52).a(str, "destroy");
        }
        View viewB = this.f32201e.b();
        if (viewB != null) {
            this.f32202f.a(viewB);
            this.f32202f.b(viewB);
        }
        super.a();
        this.f32201e.a();
    }
}
