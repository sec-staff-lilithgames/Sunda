package uu;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w1 extends o {

    /* renamed from: b, reason: collision with root package name */
    public final List f88793b;

    public w1(List<Object> delegate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(delegate, "delegate");
        this.f88793b = delegate;
    }

    @Override // uu.o, java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        this.f88793b.add(w0.access$reversePositionIndex(this, i10), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f88793b.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        return this.f88793b.get(w0.access$reverseElementIndex(this, i10));
    }

    @Override // uu.o
    public int getSize() {
        return this.f88793b.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<Object> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<Object> listIterator() {
        return listIterator(0);
    }

    @Override // uu.o
    public Object removeAt(int i10) {
        return this.f88793b.remove(w0.access$reverseElementIndex(this, i10));
    }

    @Override // uu.o, java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        return this.f88793b.set(w0.access$reverseElementIndex(this, i10), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<Object> listIterator(int i10) {
        return new v1(this, i10);
    }
}
