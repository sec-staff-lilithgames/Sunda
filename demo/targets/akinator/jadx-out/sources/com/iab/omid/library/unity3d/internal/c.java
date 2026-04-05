package com.iab.omid.library.unity3d.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static c f31304c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.unity3d.adsession.a> f31305a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.unity3d.adsession.a> f31306b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f31304c;
    }

    public Collection<com.iab.omid.library.unity3d.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f31306b);
    }

    public Collection<com.iab.omid.library.unity3d.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f31305a);
    }

    public boolean d() {
        return this.f31306b.size() > 0;
    }

    public void a(com.iab.omid.library.unity3d.adsession.a aVar) {
        this.f31305a.add(aVar);
    }

    public void b(com.iab.omid.library.unity3d.adsession.a aVar) {
        boolean zD = d();
        this.f31305a.remove(aVar);
        this.f31306b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        h.c().e();
    }

    public void c(com.iab.omid.library.unity3d.adsession.a aVar) {
        boolean zD = d();
        this.f31306b.add(aVar);
        if (zD) {
            return;
        }
        h.c().d();
    }
}
