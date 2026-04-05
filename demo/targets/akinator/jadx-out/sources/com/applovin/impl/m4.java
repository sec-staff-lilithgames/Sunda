package com.applovin.impl;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class m4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f14446a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14447b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f14448c;

    public m4(String str, String str2, Context context) {
        this.f14446a = str.replace("android.permission.", "");
        this.f14447b = str2;
        this.f14448c = o0.a(str, context);
    }

    public String a() {
        return this.f14447b;
    }

    public String b() {
        return this.f14446a;
    }

    public boolean c() {
        return this.f14448c;
    }
}
