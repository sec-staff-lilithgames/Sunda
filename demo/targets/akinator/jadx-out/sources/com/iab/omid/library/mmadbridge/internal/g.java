package com.iab.omid.library.mmadbridge.internal;

import android.content.Context;

/* loaded from: classes7.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private static g f31063b = new g();

    /* renamed from: a, reason: collision with root package name */
    private Context f31064a;

    private g() {
    }

    public static g b() {
        return f31063b;
    }

    public Context a() {
        return this.f31064a;
    }

    public void a(Context context) {
        this.f31064a = context != null ? context.getApplicationContext() : null;
    }
}
