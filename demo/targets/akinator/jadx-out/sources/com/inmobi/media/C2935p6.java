package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.p6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2935p6 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2985s6 f33258a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ short f33259b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2935p6(C2985s6 c2985s6, short s10) {
        super(0);
        this.f33258a = c2985s6;
        this.f33259b = s10;
    }

    @Override // kv.a
    public final Object invoke() {
        AbstractC2902n7.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
        F5 f52 = this.f33258a.f32321j;
        if (f52 != null) {
            String strE = C2985s6.e();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE, "access$getTAG$cp(...)");
            ((G5) f52).b(strE, "RenderProcess of the WebView has crashed. Please create another adUnit");
        }
        this.f33258a.a(true, this.f33259b);
        this.f33258a.S = null;
        return tu.x0.f87415a;
    }
}
