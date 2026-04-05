package com.inmobi.media;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class U7 implements InterfaceC2779g2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2734d8 f32356a;

    public U7(C2734d8 c2734d8) {
        this.f32356a = c2734d8;
    }

    @Override // com.inmobi.media.InterfaceC2779g2
    public final void a(int i10, int i11, int i12, int i13, int i14) {
    }

    @Override // com.inmobi.media.InterfaceC2779g2
    public final void b() {
        R0 r02 = this.f32356a.f32762w;
        if (r02 != null) {
            r02.d();
        }
    }

    @Override // com.inmobi.media.InterfaceC2779g2
    public final void a(JSONObject jsonObject) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jsonObject, "jsonObject");
    }

    @Override // com.inmobi.media.InterfaceC2779g2
    public final void a(String url, String api, X6 x62) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(api, "api");
    }

    @Override // com.inmobi.media.InterfaceC2779g2
    public final void a(L6 landingPageFunnelState, X6 x62, Integer num) {
        kotlin.jvm.internal.e0.checkNotNullParameter(landingPageFunnelState, "landingPageFunnelState");
        P6.a(landingPageFunnelState, x62, num, 8);
    }

    @Override // com.inmobi.media.InterfaceC2779g2
    public final void a() {
        R0 r02 = this.f32356a.f32762w;
        if (r02 != null) {
            r02.b();
        }
        F5 f52 = this.f32356a.f32749j;
        if (f52 != null) {
            ((G5) f52).a();
        }
    }

    @Override // com.inmobi.media.InterfaceC2779g2
    public final void c() {
    }
}
