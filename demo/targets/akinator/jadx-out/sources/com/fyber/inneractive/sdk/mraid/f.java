package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.i0;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public String f24171a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f24172b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f24173c;

    /* renamed from: d, reason: collision with root package name */
    public final g1 f24174d;

    public f(Map map, i0 i0Var, g1 g1Var) {
        this.f24172b = map;
        this.f24174d = g1Var;
        this.f24173c = i0Var;
    }

    public final int a(String str) {
        String str2 = (String) this.f24172b.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Integer.parseInt(str2, 10);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public abstract void a();

    public abstract boolean b();
}
