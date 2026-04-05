package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class N5 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public static final N5 f32048a = new N5();

    public N5() {
        super(0);
    }

    @Override // kv.a
    public final Object invoke() {
        Context contextD = C2925od.d();
        if (contextD == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = I6.f31865b;
        return H6.a(contextD, "inmobi_store");
    }
}
