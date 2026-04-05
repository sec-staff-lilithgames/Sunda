package com.inmobi.media;

import android.os.Message;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.p2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2931p2 implements InterfaceC3032v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HandlerC2964r2 f33245a;

    public C2931p2(HandlerC2964r2 handlerC2964r2) {
        this.f33245a = handlerC2964r2;
    }

    @Override // com.inmobi.media.InterfaceC3032v2
    public final void a(C2897n2 click) {
        kotlin.jvm.internal.e0.checkNotNullParameter(click, "click");
        HandlerC2964r2 handlerC2964r2 = this.f33245a;
        handlerC2964r2.getClass();
        Message messageObtain = Message.obtain();
        messageObtain.what = 4;
        messageObtain.obj = click;
        handlerC2964r2.sendMessage(messageObtain);
    }

    @Override // com.inmobi.media.InterfaceC3032v2
    public final void a(C2897n2 click, EnumC3017u4 errorCode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(click, "click");
        kotlin.jvm.internal.e0.checkNotNullParameter(errorCode, "errorCode");
        F5 f52 = this.f33245a.f33300a;
        if (f52 != null) {
            String strF = C3100z2.f();
            ((G5) f52).b(strF, j1.o2.o(N6.a(strF, "access$getTAG$p(...)", "Pinging click ("), click.f33111b, ") via HTTP failed ..."));
        }
        C3100z2.c(C3100z2.f33672a, click);
        this.f33245a.b(click);
    }
}
