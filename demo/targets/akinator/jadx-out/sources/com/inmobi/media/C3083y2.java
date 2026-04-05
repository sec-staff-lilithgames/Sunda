package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.y2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3083y2 implements InterfaceC3032v2 {
    @Override // com.inmobi.media.InterfaceC3032v2
    public final void a(C2897n2 click) {
        kotlin.jvm.internal.e0.checkNotNullParameter(click, "click");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(C3100z2.f(), "access$getTAG$p(...)");
        String str = click.f33111b;
        C3100z2.b(C3100z2.f33672a, click);
        C2914o2 c2914o2B = AbstractC2807hd.b();
        c2914o2B.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(click, "click");
        c2914o2B.a("id = ?", new String[]{String.valueOf(click.f33110a)});
    }

    @Override // com.inmobi.media.InterfaceC3032v2
    public final void a(C2897n2 click, EnumC3017u4 errorCode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(click, "click");
        kotlin.jvm.internal.e0.checkNotNullParameter(errorCode, "errorCode");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(C3100z2.f(), "access$getTAG$p(...)");
        String str = click.f33111b;
        if (click.f33115f == 0) {
            C3100z2.f33672a.a(click, errorCode.name());
        }
        C3100z2 c3100z2 = C3100z2.f33672a;
        C3100z2.c(c3100z2, click);
        c3100z2.h();
    }
}
