package z;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class m implements Iterator, lv.c {

    /* renamed from: b, reason: collision with root package name */
    public int f96870b;

    /* renamed from: c, reason: collision with root package name */
    public int f96871c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f96872e;

    public m(int i10) {
        this.f96870b = i10;
    }

    public abstract Object a(int i10);

    public abstract void b(int i10);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f96871c < this.f96870b;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a(this.f96871c);
        this.f96871c++;
        this.f96872e = true;
        return objA;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f96872e) {
            a0.d.throwIllegalStateException("Call next() before removing an element.");
        }
        int i10 = this.f96871c - 1;
        this.f96871c = i10;
        b(i10);
        this.f96870b--;
        this.f96872e = false;
    }
}
