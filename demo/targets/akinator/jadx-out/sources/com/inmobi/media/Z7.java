package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Z7 implements InterfaceC3046w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2734d8 f32596a;

    public Z7(C2734d8 c2734d8) {
        this.f32596a = c2734d8;
    }

    @Override // com.inmobi.media.InterfaceC3046w
    public final void a() {
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(this.f32596a.f32752m, "access$getTAG$p(...)");
        R0 r02 = this.f32596a.f32762w;
        if (r02 != null) {
            r02.c();
        }
    }

    @Override // com.inmobi.media.InterfaceC3046w
    public final void b(Object obj) {
        R0 r02 = this.f32596a.f32762w;
        if (r02 != null) {
            r02.b();
        }
        F5 f52 = this.f32596a.f32749j;
        if (f52 != null) {
            ((G5) f52).a();
        }
    }

    @Override // com.inmobi.media.InterfaceC3046w
    public final void a(Object obj) {
        R0 r02;
        if (this.f32596a.f() == null || (r02 = this.f32596a.f32762w) == null) {
            return;
        }
        r02.d();
    }
}
