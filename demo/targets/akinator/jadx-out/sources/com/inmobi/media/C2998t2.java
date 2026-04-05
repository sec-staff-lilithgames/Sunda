package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.t2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2998t2 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3032v2 f33377a;

    /* renamed from: b, reason: collision with root package name */
    public final F5 f33378b;

    public C2998t2(InterfaceC3032v2 mEventHandler, F5 f52) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mEventHandler, "mEventHandler");
        this.f33377a = mEventHandler;
        this.f33378b = f52;
    }

    public final void a(C2897n2 click) {
        kotlin.jvm.internal.e0.checkNotNullParameter(click, "click");
        click.f33118i.set(false);
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new io.bidmachine.media3.exoplayer.b1(click, 29, this, handler));
    }

    public static final void a(C2897n2 click, C2998t2 this$0, Handler handler) {
        kotlin.jvm.internal.e0.checkNotNullParameter(click, "$click");
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(handler, "$handler");
        X9 x92 = new X9(click.f33111b, this$0.f33378b);
        x92.f32515x = false;
        x92.f32511t = false;
        x92.f32512u = false;
        HashMap mapA = C3100z2.a(C3100z2.f33672a, click);
        if (!mapA.isEmpty()) {
            x92.f32500i.putAll(mapA);
        }
        new Uf(x92, new C2981s2(click, this$0, handler)).a();
    }
}
