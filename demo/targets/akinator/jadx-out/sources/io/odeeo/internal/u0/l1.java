package io.odeeo.internal.u0;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l1<K, V> extends u1<K> {

    /* renamed from: c, reason: collision with root package name */
    public final j1<K, V> f66925c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a<K> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final j1<K, ?> f66926a;

        public a(j1<K, ?> j1Var) {
            this.f66926a = j1Var;
        }

        public Object readResolve() {
            return this.f66926a.keySet();
        }
    }

    public l1(j1<K, V> j1Var) {
        this.f66925c = j1Var;
    }

    @Override // io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f66925c.containsKey(obj);
    }

    @Override // io.odeeo.internal.u0.u1
    public K get(int i10) {
        return this.f66925c.entrySet().asList().get(i10).getKey();
    }

    @Override // io.odeeo.internal.u0.d1
    public boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f66925c.size();
    }

    @Override // io.odeeo.internal.u0.q1, io.odeeo.internal.u0.d1
    public Object writeReplace() {
        return new a(this.f66925c);
    }

    @Override // io.odeeo.internal.u0.u1, io.odeeo.internal.u0.q1, io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public q3<K> iterator() {
        return this.f66925c.f();
    }
}
