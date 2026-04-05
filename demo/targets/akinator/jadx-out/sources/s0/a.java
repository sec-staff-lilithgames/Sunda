package s0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.e0;
import rv.t;
import sv.p0;
import tu.v;
import uu.f0;
import uu.p1;
import uu.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a {
    @tu.f
    public static final <K, V> l immutableHashMapOf(v... vVarArr) {
        return persistentHashMapOf((v[]) Arrays.copyOf(vVarArr, vVarArr.length));
    }

    @tu.f
    public static final <E> n immutableHashSetOf(E... eArr) {
        return persistentHashSetOf(Arrays.copyOf(eArr, eArr.length));
    }

    @tu.f
    public static final <E> j immutableListOf(E... eArr) {
        return persistentListOf(Arrays.copyOf(eArr, eArr.length));
    }

    @tu.f
    public static final <K, V> l immutableMapOf(v... vVarArr) {
        return persistentMapOf((v[]) Arrays.copyOf(vVarArr, vVarArr.length));
    }

    @tu.f
    public static final <E> n immutableSetOf(E... eArr) {
        return persistentSetOf(Arrays.copyOf(eArr, eArr.length));
    }

    public static final <E> n intersect(n nVar, Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return nVar.retainAll((Collection<Object>) iterable);
        }
        m mVarBuilder = nVar.builder();
        v0.retainAll(mVarBuilder, iterable);
        return mVarBuilder.build();
    }

    public static final <E> h minus(h hVar, E e10) {
        return hVar.remove((Object) e10);
    }

    public static final <T> n mutate(n nVar, kv.l lVar) {
        m mVarBuilder = nVar.builder();
        lVar.invoke(mVarBuilder);
        return mVarBuilder.build();
    }

    public static final <K, V> l persistentHashMapOf(v... vVarArr) {
        u0.d dVarEmptyOf$runtime = u0.d.f87478g.emptyOf$runtime();
        e0.checkNotNull(dVarEmptyOf$runtime, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        k kVarBuilder = dVarEmptyOf$runtime.builder();
        p1.putAll(kVarBuilder, vVarArr);
        return kVarBuilder.build();
    }

    public static final <E> n persistentHashSetOf(E... eArr) {
        return v0.a.f88821f.emptyOf$runtime().addAll((Collection<Object>) f0.asList(eArr));
    }

    public static final <E> j persistentListOf(E... eArr) {
        return t0.l.persistentVectorOf().addAll((Collection<Object>) f0.asList(eArr));
    }

    public static final <K, V> l persistentMapOf(v... vVarArr) {
        w0.c cVarEmptyOf$runtime = w0.c.f90288h.emptyOf$runtime();
        e0.checkNotNull(cVarEmptyOf$runtime, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        k kVarBuilder = cVarEmptyOf$runtime.builder();
        p1.putAll(kVarBuilder, vVarArr);
        return kVarBuilder.build();
    }

    public static final <E> n persistentSetOf(E... eArr) {
        return x0.b.f91311g.emptyOf$runtime().addAll((Collection<Object>) f0.asList(eArr));
    }

    public static final <E> h plus(h hVar, E e10) {
        return hVar.add((Object) e10);
    }

    public static final <K, V> l putAll(l lVar, Map<? extends K, ? extends V> map) {
        e0.checkNotNull(lVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.putAll, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.putAll>");
        return lVar.putAll((Map<Object, Object>) map);
    }

    public static final <T> d toImmutableList(Iterable<? extends T> iterable) {
        d dVar = iterable instanceof d ? (d) iterable : null;
        return dVar == null ? toPersistentList(iterable) : dVar;
    }

    public static final <K, V> e toImmutableMap(Map<K, ? extends V> map) {
        e eVar = map instanceof e ? (e) map : null;
        if (eVar != null) {
            return eVar;
        }
        k kVar = map instanceof k ? (k) map : null;
        l lVarBuild = kVar != null ? kVar.build() : null;
        return lVarBuild != null ? lVarBuild : persistentMapOf().putAll((Map<Object, Object>) map);
    }

    public static final <T> f toImmutableSet(Iterable<? extends T> iterable) {
        f fVar = iterable instanceof f ? (f) iterable : null;
        if (fVar != null) {
            return fVar;
        }
        m mVar = iterable instanceof m ? (m) iterable : null;
        n nVarBuild = mVar != null ? mVar.build() : null;
        return nVarBuild != null ? nVarBuild : plus(persistentSetOf(), (Iterable) iterable);
    }

    public static final <K, V> l toPersistentHashMap(Map<K, ? extends V> map) {
        u0.d dVar = map instanceof u0.d ? (u0.d) map : null;
        if (dVar != null) {
            return dVar;
        }
        u0.f fVar = map instanceof u0.f ? (u0.f) map : null;
        u0.d dVarBuild = fVar != null ? fVar.build() : null;
        return dVarBuild != null ? dVarBuild : u0.d.f87478g.emptyOf$runtime().putAll((Map<Object, Object>) map);
    }

    public static final <T> n toPersistentHashSet(Iterable<? extends T> iterable) {
        v0.a aVar = iterable instanceof v0.a ? (v0.a) iterable : null;
        if (aVar != null) {
            return aVar;
        }
        v0.b bVar = iterable instanceof v0.b ? (v0.b) iterable : null;
        v0.a aVarBuild = bVar != null ? bVar.build() : null;
        return aVarBuild != null ? aVarBuild : plus(v0.a.f88821f.emptyOf$runtime(), (Iterable) iterable);
    }

    public static final <T> j toPersistentList(Iterable<? extends T> iterable) {
        j jVar = iterable instanceof j ? (j) iterable : null;
        if (jVar != null) {
            return jVar;
        }
        i iVar = iterable instanceof i ? (i) iterable : null;
        j jVarBuild = iVar != null ? iVar.build() : null;
        return jVarBuild == null ? plus(persistentListOf(), (Iterable) iterable) : jVarBuild;
    }

    public static final <K, V> l toPersistentMap(Map<K, ? extends V> map) {
        w0.c cVar = map instanceof w0.c ? (w0.c) map : null;
        if (cVar != null) {
            return cVar;
        }
        w0.d dVar = map instanceof w0.d ? (w0.d) map : null;
        l lVarBuild = dVar != null ? dVar.build() : null;
        return lVarBuild == null ? w0.c.f90288h.emptyOf$runtime().putAll((Map<Object, Object>) map) : lVarBuild;
    }

    public static final <T> n toPersistentSet(Iterable<? extends T> iterable) {
        x0.b bVar = iterable instanceof x0.b ? (x0.b) iterable : null;
        if (bVar != null) {
            return bVar;
        }
        x0.c cVar = iterable instanceof x0.c ? (x0.c) iterable : null;
        n nVarBuild = cVar != null ? cVar.build() : null;
        return nVarBuild == null ? plus(x0.b.f91311g.emptyOf$runtime(), (Iterable) iterable) : nVarBuild;
    }

    @tu.f
    public static final <E> j immutableListOf() {
        return persistentListOf();
    }

    @tu.f
    public static final <E> n immutableSetOf() {
        return persistentSetOf();
    }

    public static final <E> h minus(h hVar, Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return hVar.removeAll((Collection<Object>) iterable);
        }
        g gVarBuilder = hVar.builder();
        v0.removeAll(gVarBuilder, iterable);
        return gVarBuilder.build();
    }

    public static final <T> j mutate(j jVar, kv.l lVar) {
        i iVarBuilder = jVar.builder();
        lVar.invoke(iVarBuilder);
        return iVarBuilder.build();
    }

    public static final <E> n persistentHashSetOf() {
        return v0.a.f88821f.emptyOf$runtime();
    }

    public static final <E> j persistentListOf() {
        return t0.l.persistentVectorOf();
    }

    public static final <E> n persistentSetOf() {
        return x0.b.f91311g.emptyOf$runtime();
    }

    public static final <E> h plus(h hVar, Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return hVar.addAll((Collection<Object>) iterable);
        }
        g gVarBuilder = hVar.builder();
        v0.addAll(gVarBuilder, iterable);
        return gVarBuilder.build();
    }

    public static final <K, V> l putAll(l lVar, Iterable<? extends v> iterable) {
        e0.checkNotNull(lVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        k kVarBuilder = lVar.builder();
        p1.putAll(kVarBuilder, iterable);
        return kVarBuilder.build();
    }

    public static final <E> h minus(h hVar, E[] eArr) {
        g gVarBuilder = hVar.builder();
        v0.removeAll(gVarBuilder, eArr);
        return gVarBuilder.build();
    }

    public static final <K, V> l mutate(l lVar, kv.l lVar2) {
        e0.checkNotNull(lVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        k kVarBuilder = lVar.builder();
        lVar2.invoke(kVarBuilder);
        return kVarBuilder.build();
    }

    public static final <E> h plus(h hVar, E[] eArr) {
        g gVarBuilder = hVar.builder();
        v0.addAll(gVarBuilder, eArr);
        return gVarBuilder.build();
    }

    public static final <T> d toImmutableList(t tVar) {
        return toPersistentList(tVar);
    }

    public static final <E> h minus(h hVar, t tVar) {
        g gVarBuilder = hVar.builder();
        v0.removeAll(gVarBuilder, tVar);
        return gVarBuilder.build();
    }

    public static final <E> h plus(h hVar, t tVar) {
        g gVarBuilder = hVar.builder();
        v0.addAll(gVarBuilder, tVar);
        return gVarBuilder.build();
    }

    public static final d toImmutableList(CharSequence charSequence) {
        return toPersistentList(charSequence);
    }

    public static final <T> f toImmutableSet(t tVar) {
        return toPersistentSet(tVar);
    }

    public static final <T> n toPersistentHashSet(t tVar) {
        return plus(persistentHashSetOf(), tVar);
    }

    public static final <T> j toPersistentList(t tVar) {
        return plus(persistentListOf(), tVar);
    }

    public static final <T> n toPersistentSet(t tVar) {
        return plus(persistentSetOf(), tVar);
    }

    public static final <E> n intersect(h hVar, Iterable<? extends E> iterable) {
        return intersect(toPersistentSet(hVar), (Iterable) iterable);
    }

    public static final <E> j minus(j jVar, E e10) {
        return jVar.remove((Object) e10);
    }

    public static final <K, V> l persistentHashMapOf() {
        return u0.d.f87478g.emptyOf$runtime();
    }

    public static final <K, V> l persistentMapOf() {
        return w0.c.f90288h.emptyOf$runtime();
    }

    public static final <E> j plus(j jVar, E e10) {
        return jVar.add((Object) e10);
    }

    public static final <K, V> l putAll(l lVar, v[] vVarArr) {
        e0.checkNotNull(lVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        k kVarBuilder = lVar.builder();
        p1.putAll(kVarBuilder, vVarArr);
        return kVarBuilder.build();
    }

    public static final n toImmutableSet(CharSequence charSequence) {
        return toPersistentSet(charSequence);
    }

    public static final n toPersistentHashSet(CharSequence charSequence) {
        m mVarBuilder = persistentHashSetOf().builder();
        p0.toCollection(charSequence, mVarBuilder);
        return mVarBuilder.build();
    }

    public static final j toPersistentList(CharSequence charSequence) {
        i iVarBuilder = persistentListOf().builder();
        p0.toCollection(charSequence, iVarBuilder);
        return iVarBuilder.build();
    }

    public static final n toPersistentSet(CharSequence charSequence) {
        m mVarBuilder = persistentSetOf().builder();
        p0.toCollection(charSequence, mVarBuilder);
        return mVarBuilder.build();
    }

    public static final <E> j minus(j jVar, Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return jVar.removeAll((Collection<Object>) iterable);
        }
        i iVarBuilder = jVar.builder();
        v0.removeAll(iVarBuilder, iterable);
        return iVarBuilder.build();
    }

    public static final <E> j plus(j jVar, Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return jVar.addAll((Collection<Object>) iterable);
        }
        i iVarBuilder = jVar.builder();
        v0.addAll(iVarBuilder, iterable);
        return iVarBuilder.build();
    }

    public static final <K, V> l putAll(l lVar, t tVar) {
        e0.checkNotNull(lVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        k kVarBuilder = lVar.builder();
        p1.putAll(kVarBuilder, tVar);
        return kVarBuilder.build();
    }

    public static final <E> n minus(n nVar, E e10) {
        return nVar.remove((Object) e10);
    }

    public static final <E> n plus(n nVar, E e10) {
        return nVar.add((Object) e10);
    }

    public static final <E> n minus(n nVar, Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return nVar.removeAll((Collection<Object>) iterable);
        }
        m mVarBuilder = nVar.builder();
        v0.removeAll(mVarBuilder, iterable);
        return mVarBuilder.build();
    }

    public static final <E> n plus(n nVar, Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return nVar.addAll((Collection<Object>) iterable);
        }
        m mVarBuilder = nVar.builder();
        v0.addAll(mVarBuilder, iterable);
        return mVarBuilder.build();
    }

    public static final <K, V> l minus(l lVar, K k10) {
        e0.checkNotNull(lVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.minus, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.minus>");
        return lVar.remove((Object) k10);
    }

    public static final <K, V> l plus(l lVar, v vVar) {
        e0.checkNotNull(lVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.plus, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.plus>");
        return lVar.put(vVar.getFirst(), vVar.getSecond());
    }

    public static final <E> j minus(j jVar, E[] eArr) {
        i iVarBuilder = jVar.builder();
        v0.removeAll(iVarBuilder, eArr);
        return iVarBuilder.build();
    }

    public static final <K, V> l plus(l lVar, Iterable<? extends v> iterable) {
        return putAll(lVar, iterable);
    }

    public static final <K, V> l plus(l lVar, v[] vVarArr) {
        return putAll(lVar, vVarArr);
    }

    public static final <K, V> l plus(l lVar, t tVar) {
        return putAll(lVar, tVar);
    }

    public static final <E> j minus(j jVar, t tVar) {
        i iVarBuilder = jVar.builder();
        v0.removeAll(iVarBuilder, tVar);
        return iVarBuilder.build();
    }

    public static final <K, V> l plus(l lVar, Map<? extends K, ? extends V> map) {
        return putAll(lVar, map);
    }

    public static final <E> j plus(j jVar, E[] eArr) {
        i iVarBuilder = jVar.builder();
        v0.addAll(iVarBuilder, eArr);
        return iVarBuilder.build();
    }

    public static final <E> n minus(n nVar, E[] eArr) {
        m mVarBuilder = nVar.builder();
        v0.removeAll(mVarBuilder, eArr);
        return mVarBuilder.build();
    }

    public static final <E> j plus(j jVar, t tVar) {
        i iVarBuilder = jVar.builder();
        v0.addAll(iVarBuilder, tVar);
        return iVarBuilder.build();
    }

    public static final <E> n minus(n nVar, t tVar) {
        m mVarBuilder = nVar.builder();
        v0.removeAll(mVarBuilder, tVar);
        return mVarBuilder.build();
    }

    public static final <E> n plus(n nVar, E[] eArr) {
        m mVarBuilder = nVar.builder();
        v0.addAll(mVarBuilder, eArr);
        return mVarBuilder.build();
    }

    public static final <K, V> l minus(l lVar, Iterable<? extends K> iterable) {
        e0.checkNotNull(lVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        k kVarBuilder = lVar.builder();
        v0.removeAll(kVarBuilder.keySet(), iterable);
        return kVarBuilder.build();
    }

    public static final <E> n plus(n nVar, t tVar) {
        m mVarBuilder = nVar.builder();
        v0.addAll(mVarBuilder, tVar);
        return mVarBuilder.build();
    }

    public static final <K, V> l minus(l lVar, K[] kArr) {
        e0.checkNotNull(lVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        k kVarBuilder = lVar.builder();
        v0.removeAll(kVarBuilder.keySet(), kArr);
        return kVarBuilder.build();
    }

    public static final <K, V> l minus(l lVar, t tVar) {
        e0.checkNotNull(lVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        k kVarBuilder = lVar.builder();
        v0.removeAll(kVarBuilder.keySet(), tVar);
        return kVarBuilder.build();
    }
}
