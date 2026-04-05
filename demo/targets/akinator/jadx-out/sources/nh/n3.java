package nh;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class n3 extends e0 implements w3 {

    /* renamed from: h, reason: collision with root package name */
    public final fc f76492h;

    /* renamed from: i, reason: collision with root package name */
    public final mh.q1 f76493i;

    public n3(fc fcVar, mh.q1 q1Var) {
        this.f76492h = (fc) mh.p1.checkNotNull(fcVar);
        this.f76493i = (mh.q1) mh.p1.checkNotNull(q1Var);
    }

    public static Collection g(Collection collection, mh.q1 q1Var) {
        return collection instanceof Set ? og.filter((Set) collection, q1Var) : y1.filter(collection, q1Var);
    }

    @Override // nh.e0
    public final Map a() {
        return new i3(this);
    }

    @Override // nh.e0
    public Collection b() {
        return g(this.f76492h.entries(), this.f76493i);
    }

    @Override // nh.e0
    public final Set c() {
        return asMap().keySet();
    }

    @Override // nh.e0, nh.fc
    public void clear() {
        entries().clear();
    }

    @Override // nh.e0, nh.fc
    public boolean containsKey(Object obj) {
        return asMap().get(obj) != null;
    }

    @Override // nh.e0
    public final ud d() {
        return new l3(this);
    }

    @Override // nh.e0
    public final Collection e() {
        return new x3(this);
    }

    @Override // nh.w3
    public mh.q1 entryPredicate() {
        return this.f76493i;
    }

    @Override // nh.e0
    public final Iterator f() {
        throw new AssertionError("should never be called");
    }

    @Override // nh.e0, nh.fc, nh.c8
    public Collection<Object> get(Object obj) {
        return g(this.f76492h.get(obj), new m3(this, obj));
    }

    public final boolean h(mh.q1 q1Var) {
        Iterator<Map.Entry<Object, Collection<Object>>> it = this.f76492h.asMap().entrySet().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Map.Entry<Object, Collection<Object>> next = it.next();
            Object key = next.getKey();
            Collection collectionG = g(next.getValue(), new m3(this, key));
            if (!collectionG.isEmpty() && q1Var.apply(ec.immutableEntry(key, collectionG))) {
                if (collectionG.size() == next.getValue().size()) {
                    it.remove();
                } else {
                    collectionG.clear();
                }
                z10 = true;
            }
        }
        return z10;
    }

    @Override // nh.e0, nh.fc, nh.c8
    public Collection<Object> removeAll(Object obj) {
        return (Collection) mh.g1.firstNonNull(asMap().remove(obj), this.f76492h instanceof sf ? Collections.EMPTY_SET : Collections.EMPTY_LIST);
    }

    @Override // nh.e0, nh.fc
    public int size() {
        return entries().size();
    }

    @Override // nh.w3
    public fc unfiltered() {
        return this.f76492h;
    }
}
