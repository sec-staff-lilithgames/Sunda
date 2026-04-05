package com.iab.omid.library.inmobi.internal;

import android.content.Context;

/* loaded from: classes7.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private static g f30793b = new g();

    /* renamed from: a, reason: collision with root package name */
    private Context f30794a;

    private g() {
    }

    public static g b() {
        return f30793b;
    }

    public Context a() {
        return this.f30794a;
    }

    public void a(Context context) {
        this.f30794a = context != null ? context.getApplicationContext() : null;
    }
}
