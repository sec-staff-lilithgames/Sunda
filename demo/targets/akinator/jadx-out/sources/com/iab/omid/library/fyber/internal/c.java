package com.iab.omid.library.fyber.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static c f30645c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.fyber.adsession.a> f30646a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.fyber.adsession.a> f30647b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f30645c;
    }

    public Collection<com.iab.omid.library.fyber.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f30647b);
    }

    public Collection<com.iab.omid.library.fyber.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f30646a);
    }

    public boolean d() {
        return this.f30647b.size() > 0;
    }

    public void a(com.iab.omid.library.fyber.adsession.a aVar) {
        this.f30646a.add(aVar);
    }

    public void b(com.iab.omid.library.fyber.adsession.a aVar) {
        boolean zD = d();
        this.f30646a.remove(aVar);
        this.f30647b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.fyber.adsession.a aVar) {
        boolean zD = d();
        this.f30647b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
