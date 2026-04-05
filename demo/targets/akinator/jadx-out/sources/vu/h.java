package vu;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h extends q implements Set, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final h f89654c;

    /* renamed from: b, reason: collision with root package name */
    public final d f89655b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }
    }

    static {
        new a(null);
        f89654c = new h(d.f89629p.getEmpty$kotlin_stdlib());
    }

    public h(d backing) {
        e0.checkNotNullParameter(backing, "backing");
        this.f89655b = backing;
    }

    @Override // uu.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        return this.f89655b.addKey$kotlin_stdlib(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<Object> elements) {
        e0.checkNotNullParameter(elements, "elements");
        this.f89655b.checkIsMutable$kotlin_stdlib();
        return super.addAll(elements);
    }

    public final Set<Object> build() {
        this.f89655b.build();
        return size() > 0 ? this : f89654c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f89655b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f89655b.containsKey(obj);
    }

    @Override // uu.q
    public int getSize() {
        return this.f89655b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f89655b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Object> iterator() {
        return this.f89655b.keysIterator$kotlin_stdlib();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f89655b.removeKey$kotlin_stdlib(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> elements) {
        e0.checkNotNullParameter(elements, "elements");
        this.f89655b.checkIsMutable$kotlin_stdlib();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> elements) {
        e0.checkNotNullParameter(elements, "elements");
        this.f89655b.checkIsMutable$kotlin_stdlib();
        return super.retainAll(elements);
    }

    public h() {
        this(new d());
    }

    public h(int i10) {
        this(new d(i10));
    }
}
