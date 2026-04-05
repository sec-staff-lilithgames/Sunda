package com.iab.omid.library.appodeal.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static c f30380c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.appodeal.adsession.a> f30381a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.appodeal.adsession.a> f30382b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f30380c;
    }

    public Collection<com.iab.omid.library.appodeal.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f30382b);
    }

    public Collection<com.iab.omid.library.appodeal.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f30381a);
    }

    public boolean d() {
        return this.f30382b.size() > 0;
    }

    public void a(com.iab.omid.library.appodeal.adsession.a aVar) {
        this.f30381a.add(aVar);
    }

    public void b(com.iab.omid.library.appodeal.adsession.a aVar) {
        boolean zD = d();
        this.f30381a.remove(aVar);
        this.f30382b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.appodeal.adsession.a aVar) {
        boolean zD = d();
        this.f30382b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
