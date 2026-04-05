package nh;

import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w5 extends d6 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y5 f76736g;

    public w5(y5 y5Var) {
        this.f76736g = y5Var;
    }

    @Override // nh.d6, nh.u4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f76736g.containsKey(obj);
    }

    @Override // nh.d6, nh.ud
    public int count(Object obj) {
        Collection collection = (Collection) this.f76736g.f76784h.get(obj);
        if (collection == null) {
            return 0;
        }
        return collection.size();
    }

    @Override // nh.d6
    public final td h(int i10) {
        Map.Entry entry = (Map.Entry) this.f76736g.f76784h.entrySet().asList().get(i10);
        return le.immutableEntry(entry.getKey(), ((Collection) entry.getValue()).size());
    }

    @Override // nh.u4
    public final boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, nh.ud
    public int size() {
        return this.f76736g.size();
    }

    @Override // nh.d6, nh.ud
    public l6 elementSet() {
        return this.f76736g.keySet();
    }
}
