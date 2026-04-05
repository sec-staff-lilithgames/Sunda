package com.iab.omid.library.fyber;

import android.content.Context;
import com.iab.omid.library.fyber.internal.i;
import com.iab.omid.library.fyber.internal.j;
import com.iab.omid.library.fyber.utils.e;
import com.iab.omid.library.fyber.utils.g;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f30625a;

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    public String a() {
        return "1.5.4-Fyber";
    }

    public void c() {
        g.a();
        com.iab.omid.library.fyber.internal.a.a().d();
    }

    public void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        i.c().a(context);
        com.iab.omid.library.fyber.internal.b.g().a(context);
        com.iab.omid.library.fyber.utils.a.a(context);
        com.iab.omid.library.fyber.utils.c.a(context);
        e.a(context);
        com.iab.omid.library.fyber.internal.g.b().a(context);
        com.iab.omid.library.fyber.internal.a.a().a(context);
        j.b().a(context);
    }

    public boolean b() {
        return this.f30625a;
    }

    public void a(boolean z10) {
        this.f30625a = z10;
    }
}
