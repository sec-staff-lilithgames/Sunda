package com.iab.omid.library.inmobi.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static c f30781c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.inmobi.adsession.a> f30782a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.inmobi.adsession.a> f30783b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f30781c;
    }

    public Collection<com.iab.omid.library.inmobi.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f30783b);
    }

    public Collection<com.iab.omid.library.inmobi.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f30782a);
    }

    public boolean d() {
        return this.f30783b.size() > 0;
    }

    public void a(com.iab.omid.library.inmobi.adsession.a aVar) {
        this.f30782a.add(aVar);
    }

    public void b(com.iab.omid.library.inmobi.adsession.a aVar) {
        boolean zD = d();
        this.f30782a.remove(aVar);
        this.f30783b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.inmobi.adsession.a aVar) {
        boolean zD = d();
        this.f30783b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
