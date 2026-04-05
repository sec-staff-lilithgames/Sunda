package com.iab.omid.library.vungle;

import android.content.Context;
import com.iab.omid.library.vungle.internal.i;
import com.iab.omid.library.vungle.internal.j;
import com.iab.omid.library.vungle.utils.e;
import com.iab.omid.library.vungle.utils.g;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f31411a;

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    public String a() {
        return "1.5.3-Vungle";
    }

    public void c() {
        g.a();
        com.iab.omid.library.vungle.internal.a.a().d();
    }

    public void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        i.c().a(context);
        com.iab.omid.library.vungle.internal.b.g().a(context);
        com.iab.omid.library.vungle.utils.a.a(context);
        com.iab.omid.library.vungle.utils.c.a(context);
        e.a(context);
        com.iab.omid.library.vungle.internal.g.b().a(context);
        com.iab.omid.library.vungle.internal.a.a().a(context);
        j.b().a(context);
    }

    public boolean b() {
        return this.f31411a;
    }

    public void a(boolean z10) {
        this.f31411a = z10;
    }
}
