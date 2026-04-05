package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ce {

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f33928b;

    /* renamed from: a, reason: collision with root package name */
    public static final Ce f33927a = new Ce();

    /* renamed from: c, reason: collision with root package name */
    private static Be f33929c = Be.NOT_INIT;

    private Ce() {
    }

    public final synchronized Be a() {
        return f33929c;
    }

    public final Be b() {
        Boolean bool = f33928b;
        if (bool == null ? true : kotlin.jvm.internal.e0.areEqual(bool, Boolean.FALSE)) {
            return Be.NOT_INIT;
        }
        if (kotlin.jvm.internal.e0.areEqual(bool, Boolean.TRUE)) {
            return f33929c;
        }
        throw new tu.t();
    }

    public final synchronized void a(Be be2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(be2, "<set-?>");
        f33929c = be2;
    }

    public final void a(boolean z10) {
        f33928b = Boolean.valueOf(z10);
    }
}
