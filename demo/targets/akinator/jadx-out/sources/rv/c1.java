package rv;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c1 implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f84996b;

    /* renamed from: c, reason: collision with root package name */
    public int f84997c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d1 f84998e;

    public c1(d1 d1Var) {
        this.f84998e = d1Var;
        this.f84996b = d1Var.f85001a.iterator();
    }

    public final int getIndex() {
        return this.f84997c;
    }

    public final Iterator<Object> getIterator() {
        return this.f84996b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f84996b.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        kv.p pVar = this.f84998e.f85002b;
        int i10 = this.f84997c;
        this.f84997c = i10 + 1;
        if (i10 < 0) {
            uu.p0.throwIndexOverflow();
        }
        return pVar.invoke(Integer.valueOf(i10), this.f84996b.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i10) {
        this.f84997c = i10;
    }
}
