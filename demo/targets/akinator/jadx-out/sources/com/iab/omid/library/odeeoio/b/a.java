package com.iab.omid.library.odeeoio.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static a f31173a = new a();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.odeeoio.adsession.a> f31174b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.odeeoio.adsession.a> f31175c = new ArrayList<>();

    private a() {
    }

    public static a a() {
        return f31173a;
    }

    public Collection<com.iab.omid.library.odeeoio.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f31174b);
    }

    public Collection<com.iab.omid.library.odeeoio.adsession.a> c() {
        return Collections.unmodifiableCollection(this.f31175c);
    }

    public boolean d() {
        return this.f31175c.size() > 0;
    }

    public void a(com.iab.omid.library.odeeoio.adsession.a aVar) {
        this.f31174b.add(aVar);
    }

    public void b(com.iab.omid.library.odeeoio.adsession.a aVar) {
        boolean zD = d();
        this.f31175c.add(aVar);
        if (zD) {
            return;
        }
        f.a().b();
    }

    public void c(com.iab.omid.library.odeeoio.adsession.a aVar) {
        boolean zD = d();
        this.f31174b.remove(aVar);
        this.f31175c.remove(aVar);
        if (!zD || d()) {
            return;
        }
        f.a().c();
    }
}
