package com.inmobi.media;

import android.content.Context;
import com.ironsource.C3191e4;
import com.unity3d.ads.BuildConfig;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Zb extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public static final Zb f32605a = new Zb();

    public Zb() {
        super(0);
    }

    @Override // kv.a
    public final Object invoke() {
        ConcurrentHashMap concurrentHashMap = I6.f31865b;
        Context contextD = C2925od.d();
        kotlin.jvm.internal.e0.checkNotNull(contextD);
        I6 i6A = H6.a(contextD, BuildConfig.FLAVOR);
        kotlin.jvm.internal.e0.checkNotNullParameter("enableImraidLogs", C3191e4.h.W);
        return Boolean.valueOf(i6A.f31866a.getBoolean("enableImraidLogs", false));
    }
}
