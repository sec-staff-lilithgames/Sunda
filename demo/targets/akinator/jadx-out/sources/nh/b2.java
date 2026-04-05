package nh;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class b2 implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public int f76116b;

    /* renamed from: c, reason: collision with root package name */
    public int f76117c;

    /* renamed from: e, reason: collision with root package name */
    public int f76118e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f2 f76119f;

    public b2(f2 f2Var) {
        this.f76119f = f2Var;
        this.f76116b = f2Var.f76242g;
        this.f76117c = f2Var.g();
    }

    public abstract Object a(int i10);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76117c >= 0;
    }

    @Override // java.util.Iterator
    public Object next() {
        f2 f2Var = this.f76119f;
        if (f2Var.f76242g != this.f76116b) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f76117c;
        this.f76118e = i10;
        Object objA = a(i10);
        this.f76117c = f2Var.h(this.f76117c);
        return objA;
    }

    @Override // java.util.Iterator
    public void remove() {
        f2 f2Var = this.f76119f;
        if (f2Var.f76242g != this.f76116b) {
            throw new ConcurrentModificationException();
        }
        jh.i.t(this.f76118e >= 0);
        this.f76116b += 32;
        f2Var.remove(f2Var.r()[this.f76118e]);
        this.f76117c = f2Var.b(this.f76117c, this.f76118e);
        this.f76118e = -1;
    }
}
