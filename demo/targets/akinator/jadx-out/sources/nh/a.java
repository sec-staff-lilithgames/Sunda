package nh;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class a extends fj {

    /* renamed from: b, reason: collision with root package name */
    public final int f76078b;

    /* renamed from: c, reason: collision with root package name */
    public int f76079c;

    public a(int i10, int i11) {
        mh.p1.checkPositionIndex(i11, i10);
        this.f76078b = i10;
        this.f76079c = i11;
    }

    public abstract Object get(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f76079c < this.f76078b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f76079c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f76079c;
        this.f76079c = i10 + 1;
        return get(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f76079c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f76079c - 1;
        this.f76079c = i10;
        return get(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f76079c - 1;
    }
}
