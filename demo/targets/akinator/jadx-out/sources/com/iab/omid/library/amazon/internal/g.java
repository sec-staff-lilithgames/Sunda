package com.iab.omid.library.amazon.internal;

import android.content.Context;

/* loaded from: classes7.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private static g f30127b = new g();

    /* renamed from: a, reason: collision with root package name */
    private Context f30128a;

    private g() {
    }

    public static g b() {
        return f30127b;
    }

    public Context a() {
        return this.f30128a;
    }

    public void a(Context context) {
        this.f30128a = context != null ? context.getApplicationContext() : null;
    }
}
