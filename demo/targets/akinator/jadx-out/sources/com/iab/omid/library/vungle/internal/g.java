package com.iab.omid.library.vungle.internal;

import android.content.Context;

/* loaded from: classes7.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private static g f31443b = new g();

    /* renamed from: a, reason: collision with root package name */
    private Context f31444a;

    private g() {
    }

    public static g b() {
        return f31443b;
    }

    public Context a() {
        return this.f31444a;
    }

    public void a(Context context) {
        this.f31444a = context != null ? context.getApplicationContext() : null;
    }
}
