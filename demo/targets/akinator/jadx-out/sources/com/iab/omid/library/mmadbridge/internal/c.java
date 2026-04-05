package com.iab.omid.library.mmadbridge.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static c f31051c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.mmadbridge.adsession.a> f31052a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.mmadbridge.adsession.a> f31053b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f31051c;
    }

    public Collection<com.iab.omid.library.mmadbridge.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f31053b);
    }

    public Collection<com.iab.omid.library.mmadbridge.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f31052a);
    }

    public boolean d() {
        return this.f31053b.size() > 0;
    }

    public void a(com.iab.omid.library.mmadbridge.adsession.a aVar) {
        this.f31052a.add(aVar);
    }

    public void b(com.iab.omid.library.mmadbridge.adsession.a aVar) {
        boolean zD = d();
        this.f31052a.remove(aVar);
        this.f31053b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.mmadbridge.adsession.a aVar) {
        boolean zD = d();
        this.f31053b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
