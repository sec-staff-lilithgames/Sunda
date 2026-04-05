package com.inmobi.media;

import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Y4 {

    /* renamed from: k, reason: collision with root package name */
    public static final V4 f32552k = new V4();

    /* renamed from: a, reason: collision with root package name */
    public final byte f32553a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32554b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32555c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32556d;

    /* renamed from: e, reason: collision with root package name */
    public final int f32557e;

    /* renamed from: f, reason: collision with root package name */
    public final F5 f32558f;

    /* renamed from: g, reason: collision with root package name */
    public C2883m5 f32559g;

    /* renamed from: h, reason: collision with root package name */
    public C2731d5 f32560h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f32561i = new LinkedHashMap();

    /* renamed from: j, reason: collision with root package name */
    public final W4 f32562j = new W4(this);

    public Y4(byte b10, String str, int i10, int i11, int i12, F5 f52) {
        this.f32553a = b10;
        this.f32554b = str;
        this.f32555c = i10;
        this.f32556d = i11;
        this.f32557e = i12;
        this.f32558f = f52;
    }

    public final void a(View view) {
        C2883m5 c2883m5;
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        F5 f52 = this.f32558f;
        if (f52 != null) {
            ((G5) f52).c("HtmlAdTracker", "stopTrackingForImpression");
        }
        if (kotlin.jvm.internal.e0.areEqual(this.f32554b, "video") || kotlin.jvm.internal.e0.areEqual(this.f32554b, "audio") || (c2883m5 = this.f32559g) == null) {
            return;
        }
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        c2883m5.f33080a.remove(view);
        c2883m5.f33081b.remove(view);
        c2883m5.f33082c.a(view);
        if (c2883m5.f33080a.isEmpty()) {
            F5 f53 = this.f32558f;
            if (f53 != null) {
                ((G5) f53).a("HtmlAdTracker", "Impression tracker is free, removing it");
            }
            C2883m5 c2883m52 = this.f32559g;
            if (c2883m52 != null) {
                c2883m52.f33080a.clear();
                c2883m52.f33081b.clear();
                c2883m52.f33082c.a();
                c2883m52.f33084e.removeMessages(0);
                c2883m52.f33082c.b();
            }
            this.f32559g = null;
        }
    }

    public final void b(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        F5 f52 = this.f32558f;
        if (f52 != null) {
            ((G5) f52).c("HtmlAdTracker", "stopTrackingForVisibility");
        }
        C2731d5 c2731d5 = this.f32560h;
        if (c2731d5 != null) {
            c2731d5.a(view);
            if (c2731d5.f31967a.isEmpty()) {
                F5 f53 = this.f32558f;
                if (f53 != null) {
                    ((G5) f53).a("HtmlAdTracker", "Visibility tracker is free, removing it");
                }
                C2731d5 c2731d52 = this.f32560h;
                if (c2731d52 != null) {
                    c2731d52.b();
                }
                this.f32560h = null;
            }
        }
        this.f32561i.remove(view);
    }

    public final void a(View view, View token, Df listener, AdConfig.ViewabilityConfig config, boolean z10) {
        int companionVisibilityMinPercentageViewed;
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(token, "token");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        F5 f52 = this.f32558f;
        if (f52 != null) {
            ((G5) f52).c("HtmlAdTracker", "startTrackingForVisibility");
        }
        C2731d5 c2731d5 = this.f32560h;
        if (c2731d5 == null) {
            if (z10) {
                c2731d5 = new F2(config, this.f32558f);
            } else {
                c2731d5 = new C2731d5(config, (byte) 1, this.f32558f);
            }
            this.f32560h = c2731d5;
        }
        X4 x42 = new X4(this);
        F5 f53 = c2731d5.f31971e;
        if (f53 != null) {
            ((G5) f53).c("VisibilityTracker", "setVisibilityTrackerListener logger");
        }
        c2731d5.f31976j = x42;
        this.f32561i.put(view, listener);
        if (z10) {
            companionVisibilityMinPercentageViewed = config.getCompanionVisibilityMinPercentageViewed();
        } else {
            companionVisibilityMinPercentageViewed = this.f32557e;
        }
        c2731d5.a(view, token, companionVisibilityMinPercentageViewed);
    }
}
