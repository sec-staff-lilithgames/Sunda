package rv;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e1 implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f85007b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1 f85008c;

    public e1(f1 f1Var) {
        this.f85008c = f1Var;
        this.f85007b = f1Var.f85013a.iterator();
    }

    public final Iterator<Object> getIterator() {
        return this.f85007b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f85007b.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        return this.f85008c.f85014b.invoke(this.f85007b.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
