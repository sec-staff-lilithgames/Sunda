package nh;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i8 implements ListIterator {

    /* renamed from: b, reason: collision with root package name */
    public boolean f76354b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ListIterator f76355c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j8 f76356e;

    public i8(j8 j8Var, ListIterator listIterator) {
        this.f76355c = listIterator;
        this.f76356e = j8Var;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        ListIterator listIterator = this.f76355c;
        listIterator.add(obj);
        listIterator.previous();
        this.f76354b = false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f76355c.hasPrevious();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f76355c.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f76354b = true;
        return this.f76355c.previous();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        int iNextIndex = this.f76355c.nextIndex();
        int size = this.f76356e.size();
        mh.p1.checkPositionIndex(iNextIndex, size);
        return size - iNextIndex;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f76354b = true;
        return this.f76355c.next();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return nextIndex() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        jh.i.t(this.f76354b);
        this.f76355c.remove();
        this.f76354b = false;
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        mh.p1.checkState(this.f76354b);
        this.f76355c.set(obj);
    }
}
