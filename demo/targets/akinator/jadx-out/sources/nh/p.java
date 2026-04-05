package nh;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class p implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f76546b;

    /* renamed from: c, reason: collision with root package name */
    public final Collection f76547c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f76548e;

    public p(q qVar) {
        this.f76548e = qVar;
        Collection collection = qVar.f76572c;
        this.f76547c = collection;
        this.f76546b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public final void a() {
        q qVar = this.f76548e;
        qVar.d();
        if (qVar.f76572c != this.f76547c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        a();
        return this.f76546b.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        a();
        return this.f76546b.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f76546b.remove();
        q qVar = this.f76548e;
        w wVar = qVar.f76575g;
        wVar.f76727i--;
        qVar.e();
    }

    public p(q qVar, Iterator it) {
        this.f76548e = qVar;
        this.f76547c = qVar.f76572c;
        this.f76546b = it;
    }
}
