package w0;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends uu.m implements s0.l {

    /* renamed from: h, reason: collision with root package name */
    public static final a f90288h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final c f90289i;

    /* renamed from: e, reason: collision with root package name */
    public final Object f90290e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f90291f;

    /* renamed from: g, reason: collision with root package name */
    public final u0.d f90292g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final <K, V> c emptyOf$runtime() {
            c cVar = c.f90289i;
            e0.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf>");
            return cVar;
        }
    }

    static {
        u0.d dVarEmptyOf$runtime = u0.d.f87478g.emptyOf$runtime();
        y0.c cVar = y0.c.f93944a;
        f90289i = new c(cVar, cVar, dVarEmptyOf$runtime);
    }

    public c(Object obj, Object obj2, u0.d dVar) {
        this.f90290e = obj;
        this.f90291f = obj2;
        this.f90292g = dVar;
    }

    @Override // s0.l
    public s0.k builder() {
        return new d(this);
    }

    @Override // java.util.Map, s0.l
    public s0.l clear() {
        return f90288h.emptyOf$runtime();
    }

    @Override // uu.m, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f90292g.containsKey(obj);
    }

    @Override // uu.m, java.util.Map
    public final /* bridge */ s0.f entrySet() {
        return getEntries();
    }

    @Override // uu.m, java.util.Map
    public Object get(Object obj) {
        w0.a aVar = (w0.a) this.f90292g.get(obj);
        if (aVar != null) {
            return aVar.getValue();
        }
        return null;
    }

    @Override // uu.m
    public final Set<Map.Entry<Object, Object>> getEntries() {
        return new m(this);
    }

    public final Object getFirstKey$runtime() {
        return this.f90290e;
    }

    public final u0.d getHashMap$runtime() {
        return this.f90292g;
    }

    public final Object getLastKey$runtime() {
        return this.f90291f;
    }

    @Override // uu.m
    public int getSize() {
        return this.f90292g.size();
    }

    @Override // uu.m, java.util.Map
    public final /* bridge */ s0.f keySet() {
        return getKeys();
    }

    @Override // java.util.Map, s0.l
    public s0.l putAll(Map<Object, Object> map) {
        e0.checkNotNull(this, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        s0.k kVarBuilder = builder();
        kVarBuilder.putAll(map);
        return kVarBuilder.build();
    }

    @Override // uu.m, java.util.Map
    public final /* bridge */ s0.b values() {
        return getValues();
    }

    @Override // uu.m
    public s0.f getEntries() {
        return new m(this);
    }

    @Override // uu.m
    public s0.f getKeys() {
        return new o(this);
    }

    @Override // uu.m
    public s0.b getValues() {
        return new r(this);
    }

    @Override // uu.m, java.util.Map, s0.l
    public c put(Object obj, Object obj2) {
        boolean zIsEmpty = isEmpty();
        u0.d dVar = this.f90292g;
        if (zIsEmpty) {
            return new c(obj, obj, dVar.put(obj, (Object) new w0.a(obj2)));
        }
        w0.a aVar = (w0.a) dVar.get(obj);
        Object obj3 = this.f90291f;
        Object obj4 = this.f90290e;
        if (aVar != null) {
            return aVar.getValue() == obj2 ? this : new c(obj4, obj3, dVar.put(obj, (Object) aVar.withValue(obj2)));
        }
        Object obj5 = dVar.get(obj3);
        e0.checkNotNull(obj5);
        return new c(obj4, obj, dVar.put(obj3, (Object) ((w0.a) obj5).withNext(obj)).put(obj, (Object) new w0.a(obj2, obj3)));
    }

    @Override // uu.m, java.util.Map, s0.l
    public c remove(Object obj) {
        u0.d dVar = this.f90292g;
        w0.a aVar = (w0.a) dVar.get(obj);
        if (aVar == null) {
            return this;
        }
        u0.d dVarRemove = dVar.remove(obj);
        if (aVar.getHasPrevious()) {
            Object obj2 = dVarRemove.get(aVar.getPrevious());
            e0.checkNotNull(obj2);
            dVarRemove = dVarRemove.put(aVar.getPrevious(), (Object) ((w0.a) obj2).withNext(aVar.getNext()));
        }
        if (aVar.getHasNext()) {
            Object obj3 = dVarRemove.get(aVar.getNext());
            e0.checkNotNull(obj3);
            dVarRemove = dVarRemove.put(aVar.getNext(), (Object) ((w0.a) obj3).withPrevious(aVar.getPrevious()));
        }
        return new c(!aVar.getHasPrevious() ? aVar.getNext() : this.f90290e, !aVar.getHasNext() ? aVar.getPrevious() : this.f90291f, dVarRemove);
    }

    @Override // java.util.Map, s0.l
    public c remove(Object obj, Object obj2) {
        w0.a aVar = (w0.a) this.f90292g.get(obj);
        return (aVar != null && e0.areEqual(aVar.getValue(), obj2)) ? remove(obj) : this;
    }
}
