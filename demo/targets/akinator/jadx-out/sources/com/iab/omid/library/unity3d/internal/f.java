package com.iab.omid.library.unity3d.internal;

import android.content.Context;

/* loaded from: classes7.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static f f31314b = new f();

    /* renamed from: a, reason: collision with root package name */
    private Context f31315a;

    private f() {
    }

    public static f b() {
        return f31314b;
    }

    public Context a() {
        return this.f31315a;
    }

    public void a(Context context) {
        this.f31315a = context != null ? context.getApplicationContext() : null;
    }
}
