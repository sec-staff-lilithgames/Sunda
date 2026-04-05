package com.iab.omid.library.odeeoio;

import android.content.Context;
import com.iab.omid.library.odeeoio.b.d;
import com.iab.omid.library.odeeoio.b.f;
import com.iab.omid.library.odeeoio.d.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f31172a;

    private void b(Context context) {
        e.a(context, "Application Context cannot be null");
    }

    public String a() {
        return "1.3.26-Odeeoio";
    }

    public void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        f.a().a(context);
        com.iab.omid.library.odeeoio.b.b.a().a(context);
        com.iab.omid.library.odeeoio.d.b.a(context);
        d.a().a(context);
    }

    public boolean b() {
        return this.f31172a;
    }

    public void a(boolean z10) {
        this.f31172a = z10;
    }
}
