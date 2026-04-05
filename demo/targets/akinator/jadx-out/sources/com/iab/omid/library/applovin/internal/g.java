package com.iab.omid.library.applovin.internal;

import android.content.Context;

/* loaded from: classes7.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private static g f30256b = new g();

    /* renamed from: a, reason: collision with root package name */
    private Context f30257a;

    private g() {
    }

    public static g b() {
        return f30256b;
    }

    public Context a() {
        return this.f30257a;
    }

    public void a(Context context) {
        this.f30257a = context != null ? context.getApplicationContext() : null;
    }
}
