package z;

import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class d0 implements Map, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final l1 f96787b;

    /* renamed from: c, reason: collision with root package name */
    public l f96788c;

    /* renamed from: e, reason: collision with root package name */
    public t f96789e;

    /* renamed from: f, reason: collision with root package name */
    public x1 f96790f;

    public d0(l1 parent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(parent, "parent");
        this.f96787b = parent;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object compute(Object obj, BiFunction<Object, Object, Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object computeIfAbsent(Object obj, Function<Object, Object> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object computeIfPresent(Object obj, BiFunction<Object, Object, Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f96787b.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f96787b.containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<Object, Object>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.e0.areEqual(this.f96787b, ((d0) obj).f96787b);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f96787b.get(obj);
    }

    public Set<Map.Entry<Object, Object>> getEntries() {
        l lVar = this.f96788c;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this.f96787b);
        this.f96788c = lVar2;
        return lVar2;
    }

    public Set<Object> getKeys() {
        t tVar = this.f96789e;
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(this.f96787b);
        this.f96789e = tVar2;
        return tVar2;
    }

    public int getSize() {
        return this.f96787b.f96869e;
    }

    public Collection<Object> getValues() {
        x1 x1Var = this.f96790f;
        if (x1Var != null) {
            return x1Var;
        }
        x1 x1Var2 = new x1(this.f96787b);
        this.f96790f = x1Var2;
        return x1Var2;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f96787b.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f96787b.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public Object merge(Object obj, Object obj2, BiFunction<Object, Object, Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<Object, Object, Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public String toString() {
        return this.f96787b.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<Object> values() {
        return getValues();
    }

    @Override // java.util.Map
    public void putAll(Map<Object, Object> map) {
        throw new UnsupportedOperationException(KGUkpTlXZlJLy.XvxvyHDLp);
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
