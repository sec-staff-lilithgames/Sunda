package uu;

import java.util.ListIterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x1 implements ListIterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final ListIterator f88795b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y1 f88796c;

    public x1(y1 y1Var, int i10) {
        this.f88796c = y1Var;
        this.f88795b = y1Var.f88801b.listIterator(w0.access$reversePositionIndex(y1Var, i10));
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final ListIterator<Object> getDelegateIterator() {
        return this.f88795b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f88795b.hasPrevious();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f88795b.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        return this.f88795b.previous();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return w0.access$reverseIteratorIndex(this.f88796c, this.f88795b.previousIndex());
    }

    @Override // java.util.ListIterator
    public Object previous() {
        return this.f88795b.next();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return w0.access$reverseIteratorIndex(this.f88796c, this.f88795b.nextIndex());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
