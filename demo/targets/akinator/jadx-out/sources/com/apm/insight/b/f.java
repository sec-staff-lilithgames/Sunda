package com.apm.insight.b;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static volatile f f12872a;

    /* renamed from: c, reason: collision with root package name */
    private static g f12873c;

    /* renamed from: b, reason: collision with root package name */
    private final b f12874b;

    private f(Context context) {
        this.f12874b = new b(context);
        g gVar = new g();
        f12873c = gVar;
        gVar.a();
    }

    public static f a(Context context) {
        if (f12872a == null) {
            synchronized (f.class) {
                try {
                    if (f12872a == null) {
                        f12872a = new f(context);
                    }
                } finally {
                }
            }
        }
        return f12872a;
    }

    public static g b() {
        return f12873c;
    }

    public final void c() {
        this.f12874b.a();
    }

    public final void d() {
        this.f12874b.b();
    }

    public final b a() {
        return this.f12874b;
    }
}
