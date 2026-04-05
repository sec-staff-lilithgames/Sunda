package com.iab.omid.library.ironsrc.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static c f30916c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.ironsrc.adsession.a> f30917a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.ironsrc.adsession.a> f30918b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f30916c;
    }

    public Collection<com.iab.omid.library.ironsrc.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f30918b);
    }

    public Collection<com.iab.omid.library.ironsrc.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f30917a);
    }

    public boolean d() {
        return this.f30918b.size() > 0;
    }

    public void a(com.iab.omid.library.ironsrc.adsession.a aVar) {
        this.f30917a.add(aVar);
    }

    public void b(com.iab.omid.library.ironsrc.adsession.a aVar) {
        boolean zD = d();
        this.f30917a.remove(aVar);
        this.f30918b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.ironsrc.adsession.a aVar) {
        boolean zD = d();
        this.f30918b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
