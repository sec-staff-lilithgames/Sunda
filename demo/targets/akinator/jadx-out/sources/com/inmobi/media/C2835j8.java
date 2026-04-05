package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.j8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2835j8 {

    /* renamed from: a, reason: collision with root package name */
    public final byte f32964a;

    /* renamed from: b, reason: collision with root package name */
    public final F5 f32965b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32966c = "j8";

    /* renamed from: d, reason: collision with root package name */
    public final WeakHashMap f32967d = new WeakHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f32968e = new WeakHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f32969f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final C2785g8 f32970g = new C2785g8();

    /* renamed from: h, reason: collision with root package name */
    public final C2819i8 f32971h = new C2819i8(this);

    /* renamed from: i, reason: collision with root package name */
    public final C2802h8 f32972i = new C2802h8();

    public C2835j8(byte b10, F5 f52) {
        this.f32964a = b10;
        this.f32965b = f52;
    }

    public final void a(Context context, View view, C2734d8 token, AdConfig.ViewabilityConfig viewabilityConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(token, "token");
        kotlin.jvm.internal.e0.checkNotNullParameter(viewabilityConfig, "viewabilityConfig");
        C2883m5 c2883m5 = (C2883m5) this.f32967d.get(context);
        if (c2883m5 == null) {
            c2883m5 = context instanceof Activity ? new C2883m5(viewabilityConfig, new D3(this.f32972i, (Activity) context, this.f32965b), this.f32970g) : new C2883m5(viewabilityConfig, new C2703bb(this.f32972i, viewabilityConfig, (byte) 1, this.f32965b), this.f32970g);
            this.f32967d.put(context, c2883m5);
        }
        byte b10 = this.f32964a;
        if (b10 == 0) {
            c2883m5.a(view, token, viewabilityConfig.getVideoImpressionMinPercentageViewed(), viewabilityConfig.getVideoImpressionMinTimeViewed());
        } else if (b10 == 1) {
            c2883m5.a(view, token, viewabilityConfig.getImpressionMinPercentageViewed(), viewabilityConfig.getImpressionMinTimeViewed());
        } else {
            c2883m5.a(view, token, viewabilityConfig.getImpressionMinPercentageViewed(), viewabilityConfig.getImpressionMinTimeViewed());
        }
    }

    public final void a(Context context, C2734d8 token) {
        View view;
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(token, "token");
        C2883m5 c2883m5 = (C2883m5) this.f32967d.get(context);
        if (c2883m5 != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter(token, "token");
            Iterator it = c2883m5.f33080a.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    view = null;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (kotlin.jvm.internal.e0.areEqual(((C2849k5) entry.getValue()).f33007a, token)) {
                    view = (View) entry.getKey();
                    break;
                }
            }
            if (view != null) {
                kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
                c2883m5.f33080a.remove(view);
                c2883m5.f33081b.remove(view);
                c2883m5.f33082c.a(view);
            }
            if (c2883m5.f33080a.isEmpty()) {
                F5 f52 = this.f32965b;
                if (f52 != null) {
                    String TAG = this.f32966c;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                    ((G5) f52).a(TAG, "Impression tracker is free, removing it");
                }
                C2883m5 c2883m52 = (C2883m5) this.f32967d.remove(context);
                if (c2883m52 != null) {
                    c2883m52.f33080a.clear();
                    c2883m52.f33081b.clear();
                    c2883m52.f33082c.a();
                    c2883m52.f33084e.removeMessages(0);
                    c2883m52.f33082c.b();
                }
                if (context instanceof Activity) {
                    this.f32967d.isEmpty();
                }
            }
        }
    }

    public final void a(Context context, View view, C2734d8 token) {
        View view2;
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(token, "token");
        Kf kf2 = (Kf) this.f32968e.get(context);
        if (kf2 != null) {
            if (token != null) {
                Iterator it = kf2.f31967a.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        view2 = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (kotlin.jvm.internal.e0.areEqual(((Hf) entry.getValue()).f31859d, token)) {
                        view2 = (View) entry.getKey();
                        break;
                    }
                }
                if (view2 != null) {
                    kf2.a(view2);
                }
            }
            if (kf2.f31967a.isEmpty()) {
                F5 f52 = this.f32965b;
                if (f52 != null) {
                    String TAG = this.f32966c;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                    ((G5) f52).a(TAG, "Impression tracker is free, removing it");
                }
                Kf kf3 = (Kf) this.f32968e.remove(context);
                if (kf3 != null) {
                    kf3.b();
                }
                if (context instanceof Activity) {
                    this.f32968e.isEmpty();
                }
            }
        }
        this.f32969f.remove(view);
    }

    public final void a(Context context, View view, C2734d8 token, Df listener, AdConfig.ViewabilityConfig config) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(token, "token");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        Kf c2703bb = (Kf) this.f32968e.get(context);
        if (c2703bb == null) {
            if (context instanceof Activity) {
                c2703bb = new D3(this.f32972i, (Activity) context, this.f32965b);
            } else {
                c2703bb = new C2703bb(this.f32972i, config, (byte) 1, this.f32965b);
            }
            C2819i8 c2819i8 = this.f32971h;
            F5 f52 = c2703bb.f31971e;
            if (f52 != null) {
                ((G5) f52).c("VisibilityTracker", "setVisibilityTrackerListener logger");
            }
            c2703bb.f31976j = c2819i8;
            this.f32968e.put(context, c2703bb);
        }
        this.f32969f.put(view, listener);
        byte b10 = this.f32964a;
        if (b10 == 0) {
            c2703bb.a(view, token, config.getVideoMinPercentagePlay());
        } else if (b10 == 1) {
            c2703bb.a(view, token, config.getDisplayMinPercentageAnimate());
        } else {
            c2703bb.a(view, token, config.getDisplayMinPercentageAnimate());
        }
    }
}
