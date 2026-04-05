package yw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class j0 extends ArrayList {

    /* renamed from: b, reason: collision with root package name */
    public final Set f96709b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Iterator {

        /* renamed from: b, reason: collision with root package name */
        public int f96710b;

        public a() {
            this.f96710b = j0.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f96710b > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            j0.this.purge(this.f96710b);
        }

        @Override // java.util.Iterator
        public h0 next() {
            if (!hasNext()) {
                return null;
            }
            int i10 = this.f96710b - 1;
            this.f96710b = i10;
            return (h0) j0.this.get(i10);
        }
    }

    public j0(Set set) {
        this.f96709b = set;
    }

    public h0 bottom() {
        if (size() <= 0) {
            return null;
        }
        return (h0) get(0);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<h0> iterator() {
        return new a();
    }

    public h0 pop() {
        int size = size();
        if (size <= 0) {
            return null;
        }
        return purge(size - 1);
    }

    public h0 purge(int i10) {
        h0 h0Var = (h0) remove(i10);
        if (h0Var != null) {
            this.f96709b.remove(h0Var);
        }
        return h0Var;
    }

    public h0 push(h0 h0Var) {
        this.f96709b.add(h0Var);
        add(h0Var);
        return h0Var;
    }

    public h0 top() {
        int size = size();
        if (size <= 0) {
            return null;
        }
        return (h0) get(size - 1);
    }
}
