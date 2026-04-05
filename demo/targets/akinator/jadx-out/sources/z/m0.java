package z;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m0 implements Iterator, lv.c {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f96873b;

    /* renamed from: c, reason: collision with root package name */
    public int f96874c = -1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0 f96875e;

    public m0(n0 n0Var) {
        this.f96875e = n0Var;
        this.f96873b = rv.w.iterator(new l0(n0Var, null));
    }

    public final int getCurrent() {
        return this.f96874c;
    }

    public final Iterator<Integer> getIterator() {
        return this.f96873b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f96873b.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        this.f96874c = ((Number) this.f96873b.next()).intValue();
        return this.f96875e.f96883b.f96866b[this.f96874c];
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.f96874c >= 0) {
            this.f96875e.f96883b.removeValueAt(this.f96874c);
            this.f96874c = -1;
        }
    }

    public final void setCurrent(int i10) {
        this.f96874c = i10;
    }
}
