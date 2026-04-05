package p0;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w4 implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public int f80580b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f80581c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v4 f80582e;

    public w4(v4 v4Var, int i10, int i11) {
        this.f80581c = i11;
        this.f80582e = v4Var;
        this.f80580b = i10;
    }

    public final int getCurrent() {
        return this.f80580b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f80580b < this.f80581c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            return null;
        }
        v4 v4Var = this.f80582e;
        Object[] objArr = v4Var.f80543c;
        int i10 = this.f80580b;
        this.f80580b = i10 + 1;
        return objArr[v4Var.c(i10)];
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setCurrent(int i10) {
        this.f80580b = i10;
    }
}
