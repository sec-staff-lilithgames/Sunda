package w0;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h implements Iterator, lv.c {

    /* renamed from: b, reason: collision with root package name */
    public final j f90300b;

    public h(d dVar) {
        this.f90300b = new j(dVar.getFirstKey$runtime(), dVar);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f90300b.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        j jVar = this.f90300b;
        jVar.next();
        return jVar.getLastIteratedKey$runtime();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f90300b.remove();
    }
}
