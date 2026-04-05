package nh;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m6 extends u5 {
    @Override // nh.u5
    public final int b(Iterable iterable, int i10) {
        return iterable instanceof Set ? Math.max(i10, ((Set) iterable).size()) : i10;
    }

    @Override // nh.u5
    public final t4 c(int i10) {
        Comparator comparator = this.f76683c;
        return comparator == null ? l6.builderWithExpectedSize(i10) : new t6(comparator, i10);
    }

    @Override // nh.u5
    public /* bridge */ /* synthetic */ u5 orderKeysBy(Comparator comparator) {
        return orderKeysBy((Comparator<Object>) comparator);
    }

    @Override // nh.u5
    public /* bridge */ /* synthetic */ u5 orderValuesBy(Comparator comparator) {
        return orderValuesBy((Comparator<Object>) comparator);
    }

    @Override // nh.u5
    public /* bridge */ /* synthetic */ u5 putAll(Iterable iterable) {
        return putAll((Iterable<? extends Map.Entry<Object, Object>>) iterable);
    }

    @Override // nh.u5
    public o6 build() {
        AbstractMap abstractMap = this.f76681a;
        if (abstractMap == null) {
            return o6.of();
        }
        Collection<Map.Entry> collectionEntrySet = abstractMap.entrySet();
        Comparator comparator = this.f76682b;
        if (comparator != null) {
            collectionEntrySet = we.from(comparator).onResultOf(wa.f76739b).immutableSortedCopy(collectionEntrySet);
        }
        Comparator comparator2 = this.f76683c;
        if (collectionEntrySet.isEmpty()) {
            return o6.of();
        }
        g5 g5Var = new g5(collectionEntrySet.size());
        int size = 0;
        for (Map.Entry entry : collectionEntrySet) {
            Object key = entry.getKey();
            l6 l6VarBuild = ((k6) entry.getValue()).build();
            AbstractCollection abstractCollectionCopyOf = comparator2 == null ? l6.copyOf((Collection) l6VarBuild) : u6.copyOf(comparator2, (Collection) l6VarBuild);
            if (!abstractCollectionCopyOf.isEmpty()) {
                g5Var.put(key, abstractCollectionCopyOf);
                size = abstractCollectionCopyOf.size() + size;
            }
        }
        return new o6(g5Var.buildOrThrow(), size, comparator2);
    }

    @Override // nh.u5
    public m6 expectedValuesPerKey(int i10) {
        super.expectedValuesPerKey(i10);
        return this;
    }

    @Override // nh.u5
    public m6 orderKeysBy(Comparator<Object> comparator) {
        super.orderKeysBy(comparator);
        return this;
    }

    @Override // nh.u5
    public m6 orderValuesBy(Comparator<Object> comparator) {
        super.orderValuesBy(comparator);
        return this;
    }

    @Override // nh.u5
    public /* bridge */ /* synthetic */ u5 put(Map.Entry entry) {
        return put((Map.Entry<Object, Object>) entry);
    }

    @Override // nh.u5
    public /* bridge */ /* synthetic */ u5 putAll(Object obj, Iterable iterable) {
        return putAll(obj, (Iterable<Object>) iterable);
    }

    @Override // nh.u5
    public m6 put(Object obj, Object obj2) {
        super.put(obj, obj2);
        return this;
    }

    @Override // nh.u5
    public m6 put(Map.Entry<Object, Object> entry) {
        super.put(entry);
        return this;
    }

    @Override // nh.u5
    public m6 putAll(Iterable<? extends Map.Entry<Object, Object>> iterable) {
        super.putAll(iterable);
        return this;
    }

    @Override // nh.u5
    public m6 putAll(Object obj, Iterable<Object> iterable) {
        super.putAll(obj, iterable);
        return this;
    }

    @Override // nh.u5
    public m6 putAll(Object obj, Object... objArr) {
        return putAll(obj, (Iterable<Object>) Arrays.asList(objArr));
    }

    @Override // nh.u5
    public m6 putAll(fc fcVar) {
        for (Map.Entry<Object, Collection<Object>> entry : fcVar.asMap().entrySet()) {
            putAll(entry.getKey(), (Iterable<Object>) entry.getValue());
        }
        return this;
    }
}
