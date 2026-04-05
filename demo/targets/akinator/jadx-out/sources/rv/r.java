package rv;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f85075b;

    /* renamed from: c, reason: collision with root package name */
    public final Iterator f85076c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f85077e;

    public r(s sVar) {
        this.f85077e = sVar;
        this.f85075b = sVar.f85084a.iterator();
        this.f85076c = sVar.f85085b.iterator();
    }

    public final Iterator<Object> getIterator1() {
        return this.f85075b;
    }

    public final Iterator<Object> getIterator2() {
        return this.f85076c;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f85075b.hasNext() && this.f85076c.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        return this.f85077e.f85086c.invoke(this.f85075b.next(), this.f85076c.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
