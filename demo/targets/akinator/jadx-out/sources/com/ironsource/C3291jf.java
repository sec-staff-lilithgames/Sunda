package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.jf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3291jf {

    /* renamed from: a, reason: collision with root package name */
    private final String f37042a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37043b;

    public C3291jf(String identifier, String baseConst) {
        kotlin.jvm.internal.e0.checkNotNullParameter(identifier, "identifier");
        kotlin.jvm.internal.e0.checkNotNullParameter(baseConst, "baseConst");
        this.f37042a = identifier;
        this.f37043b = baseConst;
    }

    public final String a() {
        return w0.i.d(this.f37042a, "_", this.f37043b);
    }
}
