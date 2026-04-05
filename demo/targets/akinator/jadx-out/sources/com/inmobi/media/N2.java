package com.inmobi.media;

import android.os.HandlerThread;
import android.os.Looper;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class N2 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public static final N2 f32042a = new N2();

    public N2() {
        super(0);
    }

    @Override // kv.a
    public final Object invoke() {
        LinkedHashMap linkedHashMap = Q2.f32149a;
        HandlerThread handlerThread = new HandlerThread(Q2.b());
        J4.a(handlerThread, Q2.b());
        Looper looper = handlerThread.getLooper();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(looper, "getLooper(...)");
        return new K2(looper);
    }
}
