package nh;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class h implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f76306b;

    /* renamed from: c, reason: collision with root package name */
    public Object f76307c = null;

    /* renamed from: e, reason: collision with root package name */
    public Collection f76308e = null;

    /* renamed from: f, reason: collision with root package name */
    public Iterator f76309f = u7.f76687b;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w f76310g;

    public h(w wVar) {
        this.f76310g = wVar;
        this.f76306b = wVar.f76726h.entrySet().iterator();
    }

    public abstract Object a(Object obj, Object obj2);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76306b.hasNext() || this.f76309f.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f76309f.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f76306b.next();
            this.f76307c = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f76308e = collection;
            this.f76309f = collection.iterator();
        }
        return a(this.f76307c, this.f76309f.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f76309f.remove();
        Collection collection = this.f76308e;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f76306b.remove();
        }
        w wVar = this.f76310g;
        wVar.f76727i--;
    }
}
