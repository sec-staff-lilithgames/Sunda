package nh;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class j extends nb {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f76375c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(w wVar, Map map) {
        super(map);
        this.f76375c = wVar;
    }

    @Override // nh.nb, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        Iterator<Object> it = iterator();
        mh.p1.checkNotNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        return this.f76503b.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        return this == obj || this.f76503b.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f76503b.keySet().hashCode();
    }

    @Override // nh.nb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Object> iterator() {
        return new i(this, this.f76503b.entrySet().iterator());
    }

    @Override // nh.nb, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int size;
        Collection collection = (Collection) this.f76503b.remove(obj);
        if (collection != null) {
            size = collection.size();
            collection.clear();
            this.f76375c.f76727i -= size;
        } else {
            size = 0;
        }
        return size > 0;
    }
}
