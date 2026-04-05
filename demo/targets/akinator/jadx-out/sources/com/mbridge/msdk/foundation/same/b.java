package com.mbridge.msdk.foundation.same;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static volatile b f40730b;

    /* renamed from: a, reason: collision with root package name */
    private Boolean f40731a = null;

    private b() {
    }

    public static b b() {
        if (f40730b == null) {
            synchronized (b.class) {
                try {
                    if (f40730b == null) {
                        f40730b = new b();
                    }
                } finally {
                }
            }
        }
        return f40730b;
    }

    public Boolean a() {
        return this.f40731a;
    }
}
