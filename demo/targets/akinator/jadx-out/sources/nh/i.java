package nh;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public Map.Entry f76339b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterator f76340c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f76341e;

    public i(j jVar, Iterator it) {
        this.f76340c = it;
        this.f76341e = jVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76340c.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        Map.Entry entry = (Map.Entry) this.f76340c.next();
        this.f76339b = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public void remove() {
        mh.p1.checkState(this.f76339b != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f76339b.getValue();
        this.f76340c.remove();
        this.f76341e.f76375c.f76727i -= collection.size();
        collection.clear();
        this.f76339b = null;
    }
}
