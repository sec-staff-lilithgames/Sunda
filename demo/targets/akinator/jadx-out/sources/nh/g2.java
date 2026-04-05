package nh;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g2 implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public int f76279b;

    /* renamed from: c, reason: collision with root package name */
    public int f76280c;

    /* renamed from: e, reason: collision with root package name */
    public int f76281e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h2 f76282f;

    public g2(h2 h2Var) {
        this.f76282f = h2Var;
        this.f76279b = h2Var.f76318f;
        this.f76280c = h2Var.f();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76280c >= 0;
    }

    @Override // java.util.Iterator
    public Object next() {
        h2 h2Var = this.f76282f;
        if (h2Var.f76318f != this.f76279b) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f76280c;
        this.f76281e = i10;
        Object obj = h2Var.o()[i10];
        this.f76280c = h2Var.g(this.f76280c);
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        h2 h2Var = this.f76282f;
        if (h2Var.f76318f != this.f76279b) {
            throw new ConcurrentModificationException();
        }
        jh.i.t(this.f76281e >= 0);
        this.f76279b += 32;
        h2Var.remove(h2Var.o()[this.f76281e]);
        this.f76280c = h2Var.a(this.f76280c, this.f76281e);
        this.f76281e = -1;
    }
}
