package com.iab.omid.library.appodeal.internal;

import android.content.Context;

/* loaded from: classes7.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private static g f30392b = new g();

    /* renamed from: a, reason: collision with root package name */
    private Context f30393a;

    private g() {
    }

    public static g b() {
        return f30392b;
    }

    public Context a() {
        return this.f30393a;
    }

    public void a(Context context) {
        this.f30393a = context != null ? context.getApplicationContext() : null;
    }
}
