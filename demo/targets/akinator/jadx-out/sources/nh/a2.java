package nh;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a2 extends AbstractSet {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f2 f76082b;

    public a2(f2 f2Var) {
        this.f76082b = f2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f76082b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        f2 f2Var = this.f76082b;
        Map mapF = f2Var.f();
        if (mapF != null) {
            return mapF.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iK = f2Var.k(entry.getKey());
            if (iK != -1 && Objects.equals(f2Var.s()[iK], entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<Object, Object>> iterator() {
        f2 f2Var = this.f76082b;
        Map mapF = f2Var.f();
        return mapF != null ? mapF.entrySet().iterator() : new z1(f2Var, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        f2 f2Var = this.f76082b;
        Map mapF = f2Var.f();
        if (mapF != null) {
            return mapF.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (f2Var.o()) {
            return false;
        }
        int i10 = f2Var.i();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object obj2 = f2Var.f76238b;
        Objects.requireNonNull(obj2);
        int iO = kc.p.O(key, value, i10, obj2, f2Var.q(), f2Var.r(), f2Var.s());
        if (iO == -1) {
            return false;
        }
        f2Var.n(iO, i10);
        f2Var.f76243h--;
        f2Var.j();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f76082b.size();
    }
}
