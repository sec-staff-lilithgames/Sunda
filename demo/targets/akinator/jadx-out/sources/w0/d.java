package w0;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d extends uu.p implements s0.k {

    /* renamed from: b, reason: collision with root package name */
    public c f90293b;

    /* renamed from: c, reason: collision with root package name */
    public Object f90294c;

    /* renamed from: e, reason: collision with root package name */
    public Object f90295e;

    /* renamed from: f, reason: collision with root package name */
    public final u0.f f90296f;

    public d(c cVar) {
        this.f90293b = cVar;
        this.f90294c = cVar.getFirstKey$runtime();
        this.f90295e = this.f90293b.getLastKey$runtime();
        this.f90296f = this.f90293b.getHashMap$runtime().builder();
    }

    @Override // s0.k
    public s0.l build() {
        c cVar;
        u0.d dVarBuild = this.f90296f.build();
        if (dVarBuild == this.f90293b.getHashMap$runtime()) {
            y0.a.m8013assert(this.f90294c == this.f90293b.getFirstKey$runtime());
            y0.a.m8013assert(this.f90295e == this.f90293b.getLastKey$runtime());
            cVar = this.f90293b;
        } else {
            cVar = new c(this.f90294c, this.f90295e, dVarBuild);
        }
        this.f90293b = cVar;
        return cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f90296f.clear();
        y0.c cVar = y0.c.f93944a;
        this.f90294c = cVar;
        this.f90295e = cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f90296f.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        a aVar = (a) this.f90296f.get(obj);
        if (aVar != null) {
            return aVar.getValue();
        }
        return null;
    }

    @Override // uu.p
    public Set<Map.Entry<Object, Object>> getEntries() {
        return new e(this);
    }

    public final Object getFirstKey$runtime() {
        return this.f90294c;
    }

    public final u0.f getHashMapBuilder$runtime() {
        return this.f90296f;
    }

    @Override // uu.p
    public Set<Object> getKeys() {
        return new g(this);
    }

    @Override // uu.p
    public int getSize() {
        return this.f90296f.size();
    }

    @Override // uu.p
    public Collection<Object> getValues() {
        return new k(this);
    }

    @Override // uu.p, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        u0.f fVar = this.f90296f;
        a aVar = (a) fVar.get(obj);
        if (aVar != null) {
            if (aVar.getValue() == obj2) {
                return obj2;
            }
            fVar.put(obj, aVar.withValue(obj2));
            return aVar.getValue();
        }
        if (isEmpty()) {
            this.f90294c = obj;
            this.f90295e = obj;
            fVar.put(obj, new a(obj2));
            return null;
        }
        Object obj3 = this.f90295e;
        Object obj4 = fVar.get(obj3);
        e0.checkNotNull(obj4);
        y0.a.m8013assert(!r3.getHasNext());
        fVar.put(obj3, ((a) obj4).withNext(obj));
        fVar.put(obj, new a(obj2, obj3));
        this.f90295e = obj;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        u0.f fVar = this.f90296f;
        a aVar = (a) fVar.remove(obj);
        if (aVar == null) {
            return null;
        }
        if (aVar.getHasPrevious()) {
            V v10 = fVar.get(aVar.getPrevious());
            e0.checkNotNull(v10);
            fVar.put(aVar.getPrevious(), ((a) v10).withNext(aVar.getNext()));
        } else {
            this.f90294c = aVar.getNext();
        }
        if (aVar.getHasNext()) {
            V v11 = fVar.get(aVar.getNext());
            e0.checkNotNull(v11);
            fVar.put(aVar.getNext(), ((a) v11).withPrevious(aVar.getPrevious()));
        } else {
            this.f90295e = aVar.getPrevious();
        }
        return aVar.getValue();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        a aVar = (a) this.f90296f.get(obj);
        if (aVar == null || !e0.areEqual(aVar.getValue(), obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
