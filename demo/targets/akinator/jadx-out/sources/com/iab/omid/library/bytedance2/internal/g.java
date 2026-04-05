package com.iab.omid.library.bytedance2.internal;

import android.content.Context;

/* loaded from: classes7.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private static g f30527b = new g();

    /* renamed from: a, reason: collision with root package name */
    private Context f30528a;

    private g() {
    }

    public static g b() {
        return f30527b;
    }

    public Context a() {
        return this.f30528a;
    }

    public void a(Context context) {
        this.f30528a = context != null ? context.getApplicationContext() : null;
    }
}
