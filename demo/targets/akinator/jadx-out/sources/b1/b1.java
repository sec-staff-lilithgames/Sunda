package b1;

import java.util.ListIterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b1 implements ListIterator, lv.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.z0 f8576b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1 f8577c;

    public b1(kotlin.jvm.internal.z0 z0Var, c1 c1Var) {
        this.f8576b = z0Var;
        this.f8577c = c1Var;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f8576b.f71866b < this.f8577c.size() - 1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f8576b.f71866b >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        kotlin.jvm.internal.z0 z0Var = this.f8576b;
        int i10 = z0Var.f71866b + 1;
        c1 c1Var = this.f8577c;
        h0.access$validateRange(i10, c1Var.size());
        z0Var.f71866b = i10;
        return c1Var.get(i10);
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f8576b.f71866b + 1;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        kotlin.jvm.internal.z0 z0Var = this.f8576b;
        int i10 = z0Var.f71866b;
        c1 c1Var = this.f8577c;
        h0.access$validateRange(i10, c1Var.size());
        z0Var.f71866b = i10 - 1;
        return c1Var.get(i10);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f8576b.f71866b;
    }

    @Override // java.util.ListIterator
    public Void add(Object obj) {
        h0.access$modificationError();
        throw new tu.k();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Void remove() {
        h0.access$modificationError();
        throw new tu.k();
    }

    @Override // java.util.ListIterator
    public Void set(Object obj) {
        h0.access$modificationError();
        throw new tu.k();
    }
}
