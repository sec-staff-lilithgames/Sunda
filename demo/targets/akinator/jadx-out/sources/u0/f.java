package u0;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class f extends uu.p implements s0.k {

    /* renamed from: b, reason: collision with root package name */
    public d f87485b;

    /* renamed from: c, reason: collision with root package name */
    public y0.e f87486c = new y0.e();

    /* renamed from: e, reason: collision with root package name */
    public t f87487e;

    /* renamed from: f, reason: collision with root package name */
    public Object f87488f;

    /* renamed from: g, reason: collision with root package name */
    public int f87489g;

    /* renamed from: h, reason: collision with root package name */
    public int f87490h;

    public f(d dVar) {
        this.f87485b = dVar;
        this.f87487e = this.f87485b.getNode$runtime();
        this.f87490h = this.f87485b.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        t eMPTY$runtime = t.f87502e.getEMPTY$runtime();
        e0.checkNotNull(eMPTY$runtime, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f87487e = eMPTY$runtime;
        setSize(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f87487e.containsKey(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f87487e.get(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // uu.p
    public Set<Map.Entry<Object, Object>> getEntries() {
        return new h(this);
    }

    @Override // uu.p
    public Set<Object> getKeys() {
        return new j(this);
    }

    public final int getModCount$runtime() {
        return this.f87489g;
    }

    public final t getNode$runtime() {
        return this.f87487e;
    }

    public final Object getOperationResult$runtime() {
        return this.f87488f;
    }

    public final y0.e getOwnership() {
        return this.f87486c;
    }

    @Override // uu.p
    public int getSize() {
        return this.f87490h;
    }

    @Override // uu.p
    public Collection<Object> getValues() {
        return new l(this);
    }

    @Override // uu.p, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        this.f87488f = null;
        this.f87487e = this.f87487e.mutablePut(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f87488f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<Object, Object> map) {
        kotlin.jvm.internal.u uVar = null;
        d dVarBuild = map instanceof d ? (d) map : null;
        if (dVarBuild == null) {
            f fVar = map instanceof f ? (f) map : null;
            dVarBuild = fVar != null ? fVar.build() : null;
        }
        if (dVarBuild == null) {
            super.putAll(map);
            return;
        }
        y0.b bVar = new y0.b(0, 1, uVar);
        int size = size();
        t tVar = this.f87487e;
        t node$runtime = dVarBuild.getNode$runtime();
        e0.checkNotNull(node$runtime, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f87487e = tVar.mutablePutAll(node$runtime, 0, bVar, this);
        int size2 = (dVarBuild.size() + size) - bVar.getCount();
        if (size != size2) {
            setSize(size2);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f87488f = null;
        t tVarMutableRemove = this.f87487e.mutableRemove(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (tVarMutableRemove == null) {
            tVarMutableRemove = t.f87502e.getEMPTY$runtime();
            e0.checkNotNull(tVarMutableRemove, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f87487e = tVarMutableRemove;
        return this.f87488f;
    }

    public final void setModCount$runtime(int i10) {
        this.f87489g = i10;
    }

    public final void setNode$runtime(t tVar) {
        this.f87487e = tVar;
    }

    public final void setOperationResult$runtime(Object obj) {
        this.f87488f = obj;
    }

    public void setSize(int i10) {
        this.f87490h = i10;
        this.f87489g++;
    }

    @Override // s0.k
    public d build() {
        d dVar;
        if (this.f87487e == this.f87485b.getNode$runtime()) {
            dVar = this.f87485b;
        } else {
            this.f87486c = new y0.e();
            dVar = new d(this.f87487e, size());
        }
        this.f87485b = dVar;
        return dVar;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        t tVarMutableRemove = this.f87487e.mutableRemove(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (tVarMutableRemove == null) {
            tVarMutableRemove = t.f87502e.getEMPTY$runtime();
            e0.checkNotNull(tVarMutableRemove, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f87487e = tVarMutableRemove;
        return size != size();
    }
}
