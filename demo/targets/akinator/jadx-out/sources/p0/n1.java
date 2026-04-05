package p0;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n1 implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final s4 f80341b;

    /* renamed from: c, reason: collision with root package name */
    public final int f80342c;

    /* renamed from: e, reason: collision with root package name */
    public int f80343e;

    /* renamed from: f, reason: collision with root package name */
    public final int f80344f;

    public n1(s4 s4Var, int i10, int i11) {
        this.f80341b = s4Var;
        this.f80342c = i11;
        this.f80343e = i10;
        this.f80344f = s4Var.getVersion$runtime();
        if (s4Var.getWriter$runtime()) {
            u4.throwConcurrentModificationException();
        }
    }

    public final int getEnd() {
        return this.f80342c;
    }

    public final s4 getTable() {
        return this.f80341b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f80343e < this.f80342c;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public d1.i next() {
        s4 s4Var = this.f80341b;
        int version$runtime = s4Var.getVersion$runtime();
        int i10 = this.f80344f;
        if (version$runtime != i10) {
            u4.throwConcurrentModificationException();
        }
        int i11 = this.f80343e;
        this.f80343e = u4.access$groupSize(s4Var.getGroups(), i11) + i11;
        return new t4(s4Var, i11, i10);
    }
}
