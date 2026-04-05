package u0;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import u0.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class d extends uu.m implements s0.l {

    /* renamed from: g, reason: collision with root package name */
    public static final a f87478g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final d f87479h = new d(t.f87502e.getEMPTY$runtime(), 0);

    /* renamed from: e, reason: collision with root package name */
    public final t f87480e;

    /* renamed from: f, reason: collision with root package name */
    public final int f87481f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final <K, V> d emptyOf$runtime() {
            d dVar = d.f87479h;
            e0.checkNotNull(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return dVar;
        }
    }

    public d(t tVar, int i10) {
        this.f87480e = tVar;
        this.f87481f = i10;
    }

    @Override // java.util.Map, s0.l
    public s0.l clear() {
        return f87478g.emptyOf$runtime();
    }

    @Override // uu.m, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f87480e.containsKey(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // uu.m, java.util.Map
    public final /* bridge */ s0.f entrySet() {
        return getEntries();
    }

    @Override // uu.m, java.util.Map
    public Object get(Object obj) {
        return this.f87480e.get(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // uu.m
    public final Set<Map.Entry<Object, Object>> getEntries() {
        return new n(this);
    }

    public final t getNode$runtime() {
        return this.f87480e;
    }

    @Override // uu.m
    public int getSize() {
        return this.f87481f;
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

    @Override // s0.l
    public f builder() {
        return new f(this);
    }

    @Override // uu.m
    public s0.f getEntries() {
        return new n(this);
    }

    @Override // uu.m
    public s0.f getKeys() {
        return new p(this);
    }

    @Override // uu.m
    public s0.b getValues() {
        return new r(this);
    }

    @Override // uu.m, java.util.Map, s0.l
    public d put(Object obj, Object obj2) {
        t.b bVarPut = this.f87480e.put(obj != null ? obj.hashCode() : 0, obj, obj2, 0);
        if (bVarPut == null) {
            return this;
        }
        return new d(bVarPut.getNode(), bVarPut.getSizeDelta() + size());
    }

    @Override // uu.m, java.util.Map, s0.l
    public d remove(Object obj) {
        int iHashCode = obj != null ? obj.hashCode() : 0;
        t tVar = this.f87480e;
        t tVarRemove = tVar.remove(iHashCode, obj, 0);
        if (tVar == tVarRemove) {
            return this;
        }
        if (tVarRemove == null) {
            return f87478g.emptyOf$runtime();
        }
        return new d(tVarRemove, size() - 1);
    }

    @Override // java.util.Map, s0.l
    public d remove(Object obj, Object obj2) {
        int iHashCode = obj != null ? obj.hashCode() : 0;
        t tVar = this.f87480e;
        t tVarRemove = tVar.remove(iHashCode, obj, obj2, 0);
        if (tVar == tVarRemove) {
            return this;
        }
        if (tVarRemove == null) {
            return f87478g.emptyOf$runtime();
        }
        return new d(tVarRemove, size() - 1);
    }
}
