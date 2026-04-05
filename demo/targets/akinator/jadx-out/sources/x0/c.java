package x0;

import java.util.Iterator;
import kotlin.jvm.internal.e0;
import s0.m;
import s0.n;
import u0.f;
import uu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends q implements m {

    /* renamed from: b, reason: collision with root package name */
    public b f91316b;

    /* renamed from: c, reason: collision with root package name */
    public Object f91317c;

    /* renamed from: e, reason: collision with root package name */
    public Object f91318e;

    /* renamed from: f, reason: collision with root package name */
    public final f f91319f;

    public c(b bVar) {
        this.f91316b = bVar;
        this.f91317c = bVar.getFirstElement$runtime();
        this.f91318e = this.f91316b.getLastElement$runtime();
        this.f91319f = this.f91316b.getHashMap$runtime().builder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uu.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        f fVar = this.f91319f;
        if (fVar.containsKey(obj)) {
            return false;
        }
        if (isEmpty()) {
            this.f91317c = obj;
            this.f91318e = obj;
            fVar.put(obj, new a());
            return true;
        }
        V v10 = fVar.get(this.f91318e);
        e0.checkNotNull(v10);
        fVar.put(this.f91318e, ((a) v10).withNext(obj));
        fVar.put(obj, new a(this.f91318e));
        this.f91318e = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f91319f.clear();
        y0.c cVar = y0.c.f93944a;
        this.f91317c = cVar;
        this.f91318e = cVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f91319f.containsKey(obj);
    }

    public final Object getFirstElement$runtime() {
        return this.f91317c;
    }

    public final f getHashMapBuilder$runtime() {
        return this.f91319f;
    }

    @Override // uu.q
    public int getSize() {
        return this.f91319f.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Object> iterator() {
        return new e(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        f fVar = this.f91319f;
        a aVar = (a) fVar.remove(obj);
        if (aVar == null) {
            return false;
        }
        if (aVar.getHasPrevious()) {
            V v10 = fVar.get(aVar.getPrevious());
            e0.checkNotNull(v10);
            fVar.put(aVar.getPrevious(), ((a) v10).withNext(aVar.getNext()));
        } else {
            this.f91317c = aVar.getNext();
        }
        if (!aVar.getHasNext()) {
            this.f91318e = aVar.getPrevious();
            return true;
        }
        V v11 = fVar.get(aVar.getNext());
        e0.checkNotNull(v11);
        fVar.put(aVar.getNext(), ((a) v11).withPrevious(aVar.getPrevious()));
        return true;
    }

    public final void setFirstElement$runtime(Object obj) {
        this.f91317c = obj;
    }

    @Override // s0.m, s0.g
    public n build() {
        b bVar;
        u0.d dVarBuild = this.f91319f.build();
        if (dVarBuild == this.f91316b.getHashMap$runtime()) {
            y0.a.m8013assert(this.f91317c == this.f91316b.getFirstElement$runtime());
            y0.a.m8013assert(this.f91318e == this.f91316b.getLastElement$runtime());
            bVar = this.f91316b;
        } else {
            bVar = new b(this.f91317c, this.f91318e, dVarBuild);
        }
        this.f91316b = bVar;
        return bVar;
    }
}
