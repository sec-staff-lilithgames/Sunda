package uu;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class b implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public int f88703b;

    /* renamed from: c, reason: collision with root package name */
    public Object f88704c;

    public abstract void a();

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10 = this.f88703b;
        if (i10 == 0) {
            this.f88703b = 3;
            a();
            return this.f88703b == 1;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public Object next() {
        int i10 = this.f88703b;
        if (i10 == 1) {
            this.f88703b = 0;
            return this.f88704c;
        }
        if (i10 != 2) {
            this.f88703b = 3;
            a();
            if (this.f88703b == 1) {
                this.f88703b = 0;
                return this.f88704c;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
