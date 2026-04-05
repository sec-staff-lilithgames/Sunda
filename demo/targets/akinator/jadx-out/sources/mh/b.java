package mh;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class b implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public int f74583b = 2;

    /* renamed from: c, reason: collision with root package name */
    public Object f74584c;

    public abstract Object a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        p1.checkState(this.f74583b != 4);
        int iC = b3.h.c(this.f74583b);
        if (iC == 0) {
            return true;
        }
        if (iC != 2) {
            this.f74583b = 4;
            this.f74584c = a();
            if (this.f74583b != 3) {
                this.f74583b = 1;
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
        this.f74583b = 2;
        Object obj = this.f74584c;
        this.f74584c = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
