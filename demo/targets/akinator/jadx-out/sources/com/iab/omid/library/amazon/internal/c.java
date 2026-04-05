package com.iab.omid.library.amazon.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static c f30115c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.amazon.adsession.a> f30116a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.amazon.adsession.a> f30117b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f30115c;
    }

    public Collection<com.iab.omid.library.amazon.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f30117b);
    }

    public Collection<com.iab.omid.library.amazon.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f30116a);
    }

    public boolean d() {
        return this.f30117b.size() > 0;
    }

    public void a(com.iab.omid.library.amazon.adsession.a aVar) {
        this.f30116a.add(aVar);
    }

    public void b(com.iab.omid.library.amazon.adsession.a aVar) {
        boolean zD = d();
        this.f30116a.remove(aVar);
        this.f30117b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.amazon.adsession.a aVar) {
        boolean zD = d();
        this.f30117b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
