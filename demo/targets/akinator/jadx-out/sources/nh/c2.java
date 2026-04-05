package nh;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c2 extends AbstractSet {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f2 f76148b;

    public c2(f2 f2Var) {
        this.f76148b = f2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f76148b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f76148b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Object> iterator() {
        f2 f2Var = this.f76148b;
        Map mapF = f2Var.f();
        return mapF != null ? mapF.keySet().iterator() : new z1(f2Var, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        f2 f2Var = this.f76148b;
        Map mapF = f2Var.f();
        return mapF != null ? mapF.keySet().remove(obj) : f2Var.p(obj) != f2.f76237l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f76148b.size();
    }
}
