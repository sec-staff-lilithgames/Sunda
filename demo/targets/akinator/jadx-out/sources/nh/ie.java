package nh;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ie implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final h0 f76363b;

    /* renamed from: c, reason: collision with root package name */
    public final Iterator f76364c;

    /* renamed from: e, reason: collision with root package name */
    public td f76365e;

    /* renamed from: f, reason: collision with root package name */
    public int f76366f;

    /* renamed from: g, reason: collision with root package name */
    public int f76367g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f76368h;

    public ie(h0 h0Var, Iterator it) {
        this.f76363b = h0Var;
        this.f76364c = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76366f > 0 || this.f76364c.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        if (this.f76366f == 0) {
            td tdVar = (td) this.f76364c.next();
            this.f76365e = tdVar;
            int count = tdVar.getCount();
            this.f76366f = count;
            this.f76367g = count;
        }
        this.f76366f--;
        this.f76368h = true;
        td tdVar2 = this.f76365e;
        Objects.requireNonNull(tdVar2);
        return tdVar2.getElement();
    }

    @Override // java.util.Iterator
    public void remove() {
        jh.i.t(this.f76368h);
        if (this.f76367g == 1) {
            this.f76364c.remove();
        } else {
            td tdVar = this.f76365e;
            Objects.requireNonNull(tdVar);
            this.f76363b.remove(tdVar.getElement());
        }
        this.f76367g--;
        this.f76368h = false;
    }
}
