package com.iab.omid.library.fyber.internal;

import android.content.Context;

/* loaded from: classes7.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private static g f30657b = new g();

    /* renamed from: a, reason: collision with root package name */
    private Context f30658a;

    private g() {
    }

    public static g b() {
        return f30657b;
    }

    public Context a() {
        return this.f30658a;
    }

    public void a(Context context) {
        this.f30658a = context != null ? context.getApplicationContext() : null;
    }
}
