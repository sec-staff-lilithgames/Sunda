package com.iab.omid.library.odeeoio.b;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static d f31184a = new d();

    /* renamed from: b, reason: collision with root package name */
    private Context f31185b;

    private d() {
    }

    public static d a() {
        return f31184a;
    }

    public Context b() {
        return this.f31185b;
    }

    public void a(Context context) {
        this.f31185b = context != null ? context.getApplicationContext() : null;
    }
}
