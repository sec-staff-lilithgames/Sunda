package com.iab.omid.library.appodeal;

import android.content.Context;
import com.iab.omid.library.appodeal.internal.i;
import com.iab.omid.library.appodeal.internal.j;
import com.iab.omid.library.appodeal.utils.e;
import com.iab.omid.library.appodeal.utils.g;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f30359a;

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    public String a() {
        return "1.5.5-Appodeal";
    }

    public void c() {
        g.a();
        com.iab.omid.library.appodeal.internal.a.a().d();
    }

    public void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        i.c().a(context);
        com.iab.omid.library.appodeal.internal.b.g().a(context);
        com.iab.omid.library.appodeal.utils.a.a(context);
        com.iab.omid.library.appodeal.utils.c.a(context);
        e.a(context);
        com.iab.omid.library.appodeal.internal.g.b().a(context);
        com.iab.omid.library.appodeal.internal.a.a().a(context);
        j.b().a(context);
    }

    public boolean b() {
        return this.f30359a;
    }

    public void a(boolean z10) {
        this.f30359a = z10;
    }
}
