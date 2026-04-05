package w0;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f implements Iterator, lv.c {

    /* renamed from: b, reason: collision with root package name */
    public final j f90298b;

    public f(d dVar) {
        this.f90298b = new j(dVar.getFirstKey$runtime(), dVar);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f90298b.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f90298b.remove();
    }

    @Override // java.util.Iterator
    public Map.Entry<Object, Object> next() {
        j jVar = this.f90298b;
        return new b(jVar.getBuilder$runtime().getHashMapBuilder$runtime(), jVar.getLastIteratedKey$runtime(), jVar.next());
    }
}
