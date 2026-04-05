package z;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x0 implements Iterator, lv.c {

    /* renamed from: b, reason: collision with root package name */
    public int f96986b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final Iterator f96987c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y0 f96988e;

    public x0(y0 y0Var) {
        this.f96988e = y0Var;
        this.f96987c = rv.w.iterator(new w0(y0Var, this, null));
    }

    public final int getCurrent() {
        return this.f96986b;
    }

    public final Iterator<Object> getIterator() {
        return this.f96987c;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f96987c.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        return this.f96987c.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.f96986b != -1) {
            this.f96988e.f96992c.removeElementAt(this.f96986b);
            this.f96986b = -1;
        }
    }

    public final void setCurrent(int i10) {
        this.f96986b = i10;
    }
}
