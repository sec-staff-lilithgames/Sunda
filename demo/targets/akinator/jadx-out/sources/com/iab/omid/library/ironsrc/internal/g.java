package com.iab.omid.library.ironsrc.internal;

import android.content.Context;

/* loaded from: classes7.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private static g f30928b = new g();

    /* renamed from: a, reason: collision with root package name */
    private Context f30929a;

    private g() {
    }

    public static g b() {
        return f30928b;
    }

    public Context a() {
        return this.f30929a;
    }

    public void a(Context context) {
        this.f30929a = context != null ? context.getApplicationContext() : null;
    }
}
