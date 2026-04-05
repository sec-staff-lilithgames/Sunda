package com.inmobi.media;

import java.util.concurrent.Executors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class A4 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public static final A4 f31618a = new A4();

    public A4() {
        super(0);
    }

    @Override // kv.a
    public final Object invoke() {
        tu.o oVar = B4.f31648a;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("B4", "access$getTAG$p(...)");
        return Executors.newSingleThreadScheduledExecutor(new Q5("B4"));
    }
}
