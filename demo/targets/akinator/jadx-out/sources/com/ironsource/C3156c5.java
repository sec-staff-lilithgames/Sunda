package com.ironsource;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.c5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3156c5 {

    /* renamed from: h, reason: collision with root package name */
    private static C3156c5 f36114h;

    /* renamed from: a, reason: collision with root package name */
    private String f36115a;

    /* renamed from: b, reason: collision with root package name */
    private String f36116b;

    /* renamed from: c, reason: collision with root package name */
    private String f36117c;

    /* renamed from: d, reason: collision with root package name */
    private String f36118d;

    /* renamed from: e, reason: collision with root package name */
    private int f36119e;

    /* renamed from: f, reason: collision with root package name */
    private String f36120f;

    /* renamed from: g, reason: collision with root package name */
    private final B7 f36121g;

    private C3156c5(Context context) {
        B7 b7I = Mb.U().i();
        this.f36121g = b7I;
        this.f36115a = b7I.q();
        this.f36116b = b7I.l();
        this.f36117c = b7I.f();
        this.f36118d = b7I.i();
        this.f36119e = b7I.e();
        this.f36120f = b7I.u(context);
    }

    public static C3156c5 b(Context context) {
        if (f36114h == null) {
            f36114h = new C3156c5(context);
        }
        return f36114h;
    }

    public static void g() {
        f36114h = null;
    }

    public int a() {
        return this.f36119e;
    }

    public String c() {
        return this.f36116b;
    }

    public String d() {
        return this.f36115a;
    }

    public String e() {
        return this.f36117c;
    }

    public String f() {
        return this.f36118d;
    }

    public float a(Context context) {
        return this.f36121g.E(context);
    }

    public String b() {
        return this.f36120f;
    }
}
