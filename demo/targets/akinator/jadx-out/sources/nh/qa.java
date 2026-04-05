package nh;

import java.util.Collection;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class qa extends dc {

    /* renamed from: f, reason: collision with root package name */
    public final Set f76581f;

    /* renamed from: g, reason: collision with root package name */
    public final mh.v0 f76582g;

    public qa(Set set, mh.v0 v0Var) {
        this.f76581f = (Set) mh.p1.checkNotNull(set);
        this.f76582g = (mh.v0) mh.p1.checkNotNull(v0Var);
    }

    @Override // nh.dc
    public final Set a() {
        return new pa(this);
    }

    @Override // nh.dc
    public final Collection b() {
        return y1.transform(this.f76581f, this.f76582g);
    }

    public Set c() {
        return this.f76581f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        c().clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return c().contains(obj);
    }

    @Override // nh.dc
    public Set<Object> createKeySet() {
        return new ia(c());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        boolean zContains;
        Set setC = c();
        mh.p1.checkNotNull(setC);
        try {
            zContains = setC.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f76582g.apply(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        if (c().remove(obj)) {
            return this.f76582g.apply(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return c().size();
    }
}
