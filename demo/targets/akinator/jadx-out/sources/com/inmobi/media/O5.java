package com.inmobi.media;

import com.ironsource.C3191e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class O5 {

    /* renamed from: a, reason: collision with root package name */
    public static final tu.o f32089a;

    /* renamed from: b, reason: collision with root package name */
    public static String f32090b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f32091c;

    static {
        tu.o oVarLazy = tu.q.lazy(N5.f32048a);
        f32089a = oVarLazy;
        f32091c = "O5";
        kotlin.jvm.internal.e0.checkNotNull("O5");
        I6 i62 = (I6) oVarLazy.getValue();
        String string = null;
        if (i62 != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter("cip", C3191e4.h.W);
            string = i62.f31866a.getString("cip", null);
        }
        f32090b = string;
    }

    public static void a() {
        f32090b = null;
        I6 i62 = (I6) f32089a.getValue();
        if (i62 != null) {
            i62.a("cip");
        }
        kotlin.jvm.internal.e0.checkNotNull(f32091c);
    }
}
