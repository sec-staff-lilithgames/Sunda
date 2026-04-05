package z;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a1 implements Iterator, lv.c {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f96769b;

    /* renamed from: c, reason: collision with root package name */
    public int f96770c = -1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b1 f96771e;

    public a1(b1 b1Var) {
        this.f96771e = b1Var;
        this.f96769b = rv.w.iterator(new z0(b1Var, null));
    }

    public final int getCurrent() {
        return this.f96770c;
    }

    public final Iterator<Integer> getIterator() {
        return this.f96769b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f96769b.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        this.f96770c = ((Number) this.f96769b.next()).intValue();
        return this.f96771e.f96774b.f96867c[this.f96770c];
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.f96770c >= 0) {
            this.f96771e.f96774b.removeValueAt(this.f96770c);
            this.f96770c = -1;
        }
    }

    public final void setCurrent(int i10) {
        this.f96770c = i10;
    }
}
