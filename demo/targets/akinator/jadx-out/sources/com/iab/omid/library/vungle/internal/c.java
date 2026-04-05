package com.iab.omid.library.vungle.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static c f31431c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.vungle.adsession.a> f31432a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.vungle.adsession.a> f31433b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f31431c;
    }

    public Collection<com.iab.omid.library.vungle.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f31433b);
    }

    public Collection<com.iab.omid.library.vungle.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f31432a);
    }

    public boolean d() {
        return this.f31433b.size() > 0;
    }

    public void a(com.iab.omid.library.vungle.adsession.a aVar) {
        this.f31432a.add(aVar);
    }

    public void b(com.iab.omid.library.vungle.adsession.a aVar) {
        boolean zD = d();
        this.f31432a.remove(aVar);
        this.f31433b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.vungle.adsession.a aVar) {
        boolean zD = d();
        this.f31433b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
