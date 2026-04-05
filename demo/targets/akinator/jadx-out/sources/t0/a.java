package t0;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a implements ListIterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public int f86217b;

    /* renamed from: c, reason: collision with root package name */
    public int f86218c;

    public a(int i10, int i11) {
        this.f86217b = i10;
        this.f86218c = i11;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void checkHasNext$runtime() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final void checkHasPrevious$runtime() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
    }

    public final int getIndex() {
        return this.f86217b;
    }

    public final int getSize() {
        return this.f86218c;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f86217b < this.f86218c;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f86217b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f86217b;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f86217b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i10) {
        this.f86217b = i10;
    }

    public final void setSize(int i10) {
        this.f86218c = i10;
    }
}
