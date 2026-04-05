package nh;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t7 implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public Iterator f76657b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f76658c;

    /* renamed from: e, reason: collision with root package name */
    public Iterator f76659e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayDeque f76660f;

    @Override // java.util.Iterator
    public boolean hasNext() {
        Iterator it;
        while (!((Iterator) mh.p1.checkNotNull(this.f76658c)).hasNext()) {
            while (true) {
                Iterator it2 = this.f76659e;
                if (it2 != null && it2.hasNext()) {
                    it = this.f76659e;
                    break;
                }
                ArrayDeque arrayDeque = this.f76660f;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    break;
                }
                this.f76659e = (Iterator) this.f76660f.removeFirst();
            }
            it = null;
            this.f76659e = it;
            if (it == null) {
                return false;
            }
            Iterator it3 = (Iterator) it.next();
            this.f76658c = it3;
            if (it3 instanceof t7) {
                t7 t7Var = (t7) it3;
                this.f76658c = t7Var.f76658c;
                if (this.f76660f == null) {
                    this.f76660f = new ArrayDeque();
                }
                this.f76660f.addFirst(this.f76659e);
                if (t7Var.f76660f != null) {
                    while (!t7Var.f76660f.isEmpty()) {
                        this.f76660f.addFirst((Iterator) t7Var.f76660f.removeLast());
                    }
                }
                this.f76659e = t7Var.f76659e;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Iterator it = this.f76658c;
        this.f76657b = it;
        return it.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        Iterator it = this.f76657b;
        if (it == null) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        it.remove();
        this.f76657b = null;
    }
}
