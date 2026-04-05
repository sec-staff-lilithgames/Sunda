package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Y1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Y1 f35721a = new Y1();

    /* renamed from: b, reason: collision with root package name */
    public static final String f35722b = "trials_fail";

    /* renamed from: c, reason: collision with root package name */
    public static final String f35723c = "parsing";

    /* renamed from: d, reason: collision with root package name */
    public static final String f35724d = "other";

    /* renamed from: e, reason: collision with root package name */
    public static final String f35725e = "disabled";

    /* renamed from: f, reason: collision with root package name */
    public static final String f35726f = "-1";

    private Y1() {
    }

    public final String a(boolean z10) {
        return !z10 ? f35726f : p0.o2.m(System.currentTimeMillis(), "fallback_");
    }

    public static /* synthetic */ String a(Y1 y12, boolean z10, Integer num, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        return y12.a(z10, num);
    }

    public final String a(boolean z10, Integer num) {
        if (z10) {
            return (num != null && num.intValue() == 1003) ? f35723c : (num != null && num.intValue() == 1008) ? f35723c : (num != null && num.intValue() == 1002) ? f35723c : (num != null && num.intValue() == 1006) ? f35722b : (num != null && num.intValue() == 1001) ? f35722b : "other";
        }
        return f35725e;
    }
}
