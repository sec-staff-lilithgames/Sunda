package du;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r1 implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f52834b;

    public r1(Iterator it) {
        this.f52834b = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f52834b.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public mt.l next() {
        return new r2((mt.t0) this.f52834b.next());
    }
}
