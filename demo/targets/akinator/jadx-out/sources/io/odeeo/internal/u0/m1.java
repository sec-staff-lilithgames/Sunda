package io.odeeo.internal.u0;

import java.io.Serializable;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m1<K, V> extends d1<V> {

    /* renamed from: b, reason: collision with root package name */
    public final j1<K, V> f66929b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends q3<V> {

        /* renamed from: a, reason: collision with root package name */
        public final q3<Map.Entry<K, V>> f66930a;

        public a() {
            this.f66930a = m1.this.f66929b.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f66930a.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return this.f66930a.next().getValue();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends h1<V> {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h1 f66932c;

        public b(h1 h1Var) {
            this.f66932c = h1Var;
        }

        @Override // java.util.List
        public V get(int i10) {
            return (V) ((Map.Entry) this.f66932c.get(i10)).getValue();
        }

        @Override // io.odeeo.internal.u0.d1
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f66932c.size();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c<V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final j1<?, V> f66934a;

        public c(j1<?, V> j1Var) {
            this.f66934a = j1Var;
        }

        public Object readResolve() {
            return this.f66934a.values();
        }
    }

    public m1(j1<K, V> j1Var) {
        this.f66929b = j1Var;
    }

    @Override // io.odeeo.internal.u0.d1
    public h1<V> asList() {
        return new b(this.f66929b.entrySet().asList());
    }

    @Override // io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return obj != null && w1.contains(iterator(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f66929b.size();
    }

    @Override // io.odeeo.internal.u0.d1
    public Object writeReplace() {
        return new c(this.f66929b);
    }

    @Override // io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public q3<V> iterator() {
        return new a();
    }
}
