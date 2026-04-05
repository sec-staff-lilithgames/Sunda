package com.inmobi.media;

import com.vungle.ads.internal.Constants;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.j9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2836j9 implements InterfaceC3046w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2853k9 f32973a;

    public C2836j9(C2853k9 c2853k9) {
        this.f32973a = c2853k9;
    }

    @Override // com.inmobi.media.InterfaceC3046w
    public final void a() {
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(this.f32973a.X, "access$getTAG$p(...)");
        R0 r02 = this.f32973a.f32762w;
        if (r02 != null) {
            r02.c();
        }
    }

    @Override // com.inmobi.media.InterfaceC3046w
    public final void b(Object obj) {
        AbstractC3062wf viewableAd;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(this.f32973a.X, "access$getTAG$p(...)");
        C2887m9 c2887m9 = obj instanceof C2887m9 ? (C2887m9) obj : null;
        if (c2887m9 != null) {
            HashMap map = c2887m9.f33155t;
            Boolean bool = Boolean.FALSE;
            map.put("didRequestFullScreen", bool);
            map.put("isFullScreen", bool);
            c2887m9.f33158w = null;
            HashMap map2 = c2887m9.f33155t;
            map2.put("didRequestFullScreen", bool);
            map2.put("isFullScreen", bool);
            c2887m9.f33158w = null;
        }
        C2853k9 c2853k9 = this.f32973a;
        if (c2853k9.f32740a == 0) {
            AbstractC3062wf viewableAd2 = c2853k9.getViewableAd();
            if (viewableAd2 != null) {
                viewableAd2.a((byte) 2);
            }
            C2734d8 c2734d8 = this.f32973a.f32761v;
            if (c2734d8 != null && (viewableAd = c2734d8.getViewableAd()) != null) {
                viewableAd.a((byte) 16);
            }
            if (c2887m9 != null) {
                c2887m9.a("exitFullscreen", this.f32973a.j(c2887m9), (V7) null, this.f32973a.W);
            }
        } else {
            AbstractC3062wf viewableAd3 = c2853k9.getViewableAd();
            if (viewableAd3 != null) {
                viewableAd3.a((byte) 3);
            }
        }
        R0 r02 = this.f32973a.f32762w;
        if (r02 != null) {
            r02.b();
        }
        F5 f52 = this.f32973a.W;
        if (f52 != null) {
            ((G5) f52).a();
        }
    }

    @Override // com.inmobi.media.InterfaceC3046w
    public final void a(Object obj) {
        if (this.f32973a.f() == null) {
            return;
        }
        C2887m9 c2887m9 = obj instanceof C2887m9 ? (C2887m9) obj : null;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(this.f32973a.X, "access$getTAG$p(...)");
        if (c2887m9 != null) {
            HashMap map = c2887m9.f33155t;
            Boolean bool = Boolean.TRUE;
            map.put("didRequestFullScreen", bool);
            map.put("isFullScreen", bool);
            map.put("shouldAutoPlay", bool);
            C2903n8 c2903n8 = c2887m9.f33158w;
            if (c2903n8 != null) {
                HashMap map2 = c2903n8.f33155t;
                map2.put("didRequestFullScreen", bool);
                map2.put("isFullScreen", bool);
                map2.put("shouldAutoPlay", bool);
            }
        }
        C2853k9 c2853k9 = this.f32973a;
        if (c2853k9.f32740a == 0) {
            AbstractC3062wf viewableAd = c2853k9.getViewableAd();
            if (viewableAd != null) {
                viewableAd.a((byte) 1);
            }
            if (c2887m9 != null) {
                c2887m9.a(Constants.TEMPLATE_TYPE_FULLSCREEN, this.f32973a.j(c2887m9), (V7) null, this.f32973a.W);
            }
        }
        R0 r02 = this.f32973a.f32762w;
        if (r02 != null) {
            r02.d();
        }
    }
}
