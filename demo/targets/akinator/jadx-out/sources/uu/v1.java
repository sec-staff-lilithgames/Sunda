package uu;

import java.util.ListIterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v1 implements ListIterator, lv.e {

    /* renamed from: b, reason: collision with root package name */
    public final ListIterator f88791b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w1 f88792c;

    public v1(w1 w1Var, int i10) {
        this.f88792c = w1Var;
        this.f88791b = w1Var.f88793b.listIterator(w0.access$reversePositionIndex(w1Var, i10));
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        ListIterator listIterator = this.f88791b;
        listIterator.add(obj);
        listIterator.previous();
    }

    public final ListIterator<Object> getDelegateIterator() {
        return this.f88791b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f88791b.hasPrevious();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f88791b.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        return this.f88791b.previous();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return w0.access$reverseIteratorIndex(this.f88792c, this.f88791b.previousIndex());
    }

    @Override // java.util.ListIterator
    public Object previous() {
        return this.f88791b.next();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return w0.access$reverseIteratorIndex(this.f88792c, this.f88791b.nextIndex());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        this.f88791b.remove();
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        this.f88791b.set(obj);
    }
}
