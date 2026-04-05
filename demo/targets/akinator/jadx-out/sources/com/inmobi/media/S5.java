package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class S5 extends AbstractC3045vf {

    /* renamed from: e, reason: collision with root package name */
    public final C2734d8 f32250e;

    /* renamed from: f, reason: collision with root package name */
    public final Af f32251f;

    /* renamed from: g, reason: collision with root package name */
    public final F5 f32252g;

    /* renamed from: h, reason: collision with root package name */
    public final String f32253h;

    /* renamed from: i, reason: collision with root package name */
    public final WeakReference f32254i;

    /* renamed from: j, reason: collision with root package name */
    public final C2835j8 f32255j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S5(Context context, C2734d8 mAdContainer, Af mViewableAd, F5 f52) {
        super(mAdContainer);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(mAdContainer, "mAdContainer");
        kotlin.jvm.internal.e0.checkNotNullParameter(mViewableAd, "mViewableAd");
        this.f32250e = mAdContainer;
        this.f32251f = mViewableAd;
        this.f32252g = f52;
        this.f32253h = "S5";
        this.f32254i = new WeakReference(context);
        this.f32255j = new C2835j8((byte) 1, f52);
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final View a(View view, ViewGroup parent, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(parent, "parent");
        F5 f52 = this.f32252g;
        if (f52 != null) {
            String TAG = this.f32253h;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "inflate view - deferred - " + z10);
        }
        View viewB = this.f32251f.b();
        Context context = (Context) this.f32250e.f32763x.get();
        if (viewB != null && context != null) {
            this.f32255j.a(context, viewB, this.f32250e);
        }
        return this.f32251f.a(view, parent, z10);
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final View b() {
        return this.f32251f.b();
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final H8 c() {
        return this.f32251f.f33552b;
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void e() {
        F5 f52 = this.f32252g;
        if (f52 != null) {
            String TAG = this.f32253h;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "stopTrackingForImpression");
        }
        try {
            try {
                Context context = (Context) this.f32254i.get();
                if (context != null) {
                    F5 f53 = this.f32252g;
                    if (f53 != null) {
                        String TAG2 = this.f32253h;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                        ((G5) f53).a(TAG2, "stop tracking");
                    }
                    this.f32255j.a(context, this.f32250e);
                }
                this.f32251f.getClass();
            } catch (Exception e10) {
                F5 f54 = this.f32252g;
                if (f54 != null) {
                    String TAG3 = this.f32253h;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG3, "TAG");
                    ((G5) f54).b(TAG3, "Exception in stopTrackingForImpression with message : " + e10.getMessage());
                }
                Y5 y52 = Y5.f32563a;
                C2796h2 event = new C2796h2(e10);
                kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
                Y5.f32566d.a(event);
                this.f32251f.getClass();
            }
        } catch (Throwable th2) {
            this.f32251f.getClass();
            throw th2;
        }
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(childView, "childView");
        kotlin.jvm.internal.e0.checkNotNullParameter(obstructionCode, "obstructionCode");
        this.f32251f.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(childView, "childView");
        kotlin.jvm.internal.e0.checkNotNullParameter(obstructionCode, "obstructionCode");
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(View childView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(childView, "childView");
        this.f32251f.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(childView, "childView");
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(Map map) {
        F5 f52 = this.f32252g;
        if (f52 != null) {
            String str = this.f32253h;
            StringBuilder sbA = N6.a(str, "TAG", "start tracking impression with ");
            sbA.append(map != null ? Integer.valueOf(map.size()) : null);
            sbA.append(" friendlyViews");
            ((G5) f52).a(str, sbA.toString());
        }
        try {
            try {
                Context context = (Context) this.f32254i.get();
                View viewB = this.f32251f.b();
                if (context != null && viewB != null && !this.f32250e.f32759t) {
                    F5 f53 = this.f32252g;
                    if (f53 != null) {
                        String TAG = this.f32253h;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                        ((G5) f53).a(TAG, "start tracking");
                    }
                    this.f32255j.a(context, viewB, this.f32250e, this.f33554d.getViewability());
                    C2835j8 c2835j8 = this.f32255j;
                    C2734d8 c2734d8 = this.f32250e;
                    c2835j8.a(context, viewB, c2734d8, c2734d8.i(), this.f33554d.getViewability());
                }
                this.f32251f.getClass();
            } catch (Exception e10) {
                F5 f54 = this.f32252g;
                if (f54 != null) {
                    String TAG2 = this.f32253h;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                    ((G5) f54).b(TAG2, "Exception in startTrackingForImpression with message : " + e10.getMessage());
                }
                Y5 y52 = Y5.f32563a;
                C2796h2 event = new C2796h2(e10);
                kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
                Y5.f32566d.a(event);
                this.f32251f.getClass();
            }
        } catch (Throwable th2) {
            this.f32251f.getClass();
            throw th2;
        }
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(byte b10) {
        F5 f52 = this.f32252g;
        if (f52 != null) {
            String str = this.f32253h;
            ((G5) f52).a(str, AbstractC2803h9.a(str, "TAG", "onAdEvent - ", b10));
        }
        this.f32251f.getClass();
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(Context context, byte b10) {
        Af af2;
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        F5 f52 = this.f32252g;
        if (f52 != null) {
            String str = this.f32253h;
            ((G5) f52).a(str, AbstractC2803h9.a(str, "TAG", "onActivityStateChanged - ", b10));
        }
        try {
            try {
                if (b10 == 0) {
                    C2835j8 c2835j8 = this.f32255j;
                    c2835j8.getClass();
                    kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
                    C2883m5 c2883m5 = (C2883m5) c2835j8.f32967d.get(context);
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
                } else if (b10 == 1) {
                    C2835j8 c2835j82 = this.f32255j;
                    c2835j82.getClass();
                    kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
                    C2883m5 c2883m52 = (C2883m5) c2835j82.f32967d.get(context);
                    if (c2883m52 != null) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(c2883m52.f33083d, "TAG");
                        c2883m52.f33082c.a();
                        c2883m52.f33084e.removeCallbacksAndMessages(null);
                        c2883m52.f33081b.clear();
                    }
                } else if (b10 == 2) {
                    C2835j8 c2835j83 = this.f32255j;
                    c2835j83.getClass();
                    kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
                    F5 f53 = c2835j83.f32965b;
                    if (f53 != null) {
                        String TAG = c2835j83.f32966c;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                        ((G5) f53).a(TAG, "Activity destroyed, removing impression tracker");
                    }
                    C2883m5 c2883m53 = (C2883m5) c2835j83.f32967d.remove(context);
                    if (c2883m53 != null) {
                        c2883m53.f33080a.clear();
                        c2883m53.f33081b.clear();
                        c2883m53.f33082c.a();
                        c2883m53.f33084e.removeMessages(0);
                        c2883m53.f33082c.b();
                    }
                    if (context instanceof Activity) {
                        c2835j83.f32967d.isEmpty();
                    }
                } else {
                    F5 f54 = this.f32252g;
                    if (f54 != null) {
                        String TAG2 = this.f32253h;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                        ((G5) f54).b(TAG2, "UnHandled sate ( " + ((int) b10) + " ) received in onActivityStateChanged()");
                    }
                }
                af2 = this.f32251f;
            } catch (Exception e10) {
                F5 f55 = this.f32252g;
                if (f55 != null) {
                    String TAG3 = this.f32253h;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG3, "TAG");
                    ((G5) f55).b(TAG3, "Exception in onActivityStateChanged with message : " + e10.getMessage());
                }
                Y5 y52 = Y5.f32563a;
                C2796h2 event = new C2796h2(e10);
                kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
                Y5.f32566d.a(event);
                af2 = this.f32251f;
            }
            af2.getClass();
            kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        } catch (Throwable th2) {
            this.f32251f.getClass();
            kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
            throw th2;
        }
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a() {
        F5 f52 = this.f32252g;
        if (f52 != null) {
            String TAG = this.f32253h;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "destroy");
        }
        Context context = (Context) this.f32250e.f32763x.get();
        View viewB = this.f32251f.b();
        if (context != null && viewB != null) {
            this.f32255j.a(context, viewB, this.f32250e);
        }
        super.a();
        this.f32254i.clear();
        this.f32251f.a();
    }
}
