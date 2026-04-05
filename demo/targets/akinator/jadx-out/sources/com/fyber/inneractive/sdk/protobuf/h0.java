package com.fyber.inneractive.sdk.protobuf;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h0 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile h0 f26391b;

    /* renamed from: c, reason: collision with root package name */
    public static final h0 f26392c = new h0();

    /* renamed from: a, reason: collision with root package name */
    public final Map f26393a = Collections.EMPTY_MAP;

    public static h0 a() {
        h0 h0Var;
        h0 h0Var2 = f26391b;
        if (h0Var2 != null) {
            return h0Var2;
        }
        synchronized (h0.class) {
            h0Var = f26391b;
            if (h0Var == null) {
                Class cls = f0.f26381a;
                h0 h0Var3 = null;
                if (cls != null) {
                    try {
                        h0Var3 = (h0) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                    } catch (Exception unused) {
                    }
                }
                h0Var = h0Var3 != null ? h0Var3 : f26392c;
                f26391b = h0Var;
            }
        }
        return h0Var;
    }

    public final x0 a(int i10, d2 d2Var) {
        return (x0) this.f26393a.get(new g0(i10, d2Var));
    }
}
