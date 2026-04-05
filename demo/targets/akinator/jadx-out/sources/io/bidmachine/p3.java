package io.bidmachine;

import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p3 {

    /* renamed from: c, reason: collision with root package name */
    public static volatile p3 f61973c;

    /* renamed from: a, reason: collision with root package name */
    public final Object f61974a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f61975b = new HashMap();

    public static p3 get() {
        p3 p3Var;
        p3 p3Var2 = f61973c;
        if (p3Var2 != null) {
            return p3Var2;
        }
        synchronized (p3.class) {
            try {
                p3Var = f61973c;
                if (p3Var == null) {
                    p3Var = new p3();
                    f61973c = p3Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return p3Var;
    }

    public void add(String str, nm.d dVar) {
        synchronized (this.f61974a) {
            this.f61975b.put(str, dVar);
        }
    }

    public boolean contains(String str) {
        boolean zContainsKey;
        synchronized (this.f61974a) {
            zContainsKey = this.f61975b.containsKey(str);
        }
        return zContainsKey;
    }

    public nm.d remove(String str) {
        nm.d dVar;
        synchronized (this.f61974a) {
            dVar = (nm.d) this.f61975b.remove(str);
        }
        return dVar;
    }
}
