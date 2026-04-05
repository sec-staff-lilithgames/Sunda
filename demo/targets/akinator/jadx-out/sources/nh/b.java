package nh;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class b extends ej {

    /* renamed from: b, reason: collision with root package name */
    public int f76111b = 2;

    /* renamed from: c, reason: collision with root package name */
    public Object f76112c;

    public abstract Object computeNext();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        mh.p1.checkState(this.f76111b != 4);
        int iC = b3.h.c(this.f76111b);
        if (iC == 0) {
            return true;
        }
        if (iC != 2) {
            this.f76111b = 4;
            this.f76112c = computeNext();
            if (this.f76111b != 3) {
                this.f76111b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f76111b = 2;
        Object obj = this.f76112c;
        this.f76112c = null;
        return obj;
    }

    public final Object peek() {
        if (hasNext()) {
            return this.f76112c;
        }
        throw new NoSuchElementException();
    }
}
