package nh;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f76232b;

    /* renamed from: c, reason: collision with root package name */
    public Collection f76233c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f76234e;

    public f(g gVar) {
        this.f76234e = gVar;
        this.f76232b = gVar.f76274f.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76232b.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        mh.p1.checkState(this.f76233c != null, "no calls to next() since the last call to remove()");
        this.f76232b.remove();
        this.f76234e.f76275g.f76727i -= this.f76233c.size();
        this.f76233c.clear();
        this.f76233c = null;
    }

    @Override // java.util.Iterator
    public Map.Entry<Object, Collection<Object>> next() {
        Map.Entry entry = (Map.Entry) this.f76232b.next();
        this.f76233c = (Collection) entry.getValue();
        return this.f76234e.c(entry);
    }
}
