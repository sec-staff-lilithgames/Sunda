package nh;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class t3 extends e0 implements w3 {

    /* renamed from: h, reason: collision with root package name */
    public final fc f76652h;

    /* renamed from: i, reason: collision with root package name */
    public final mh.q1 f76653i;

    public t3(fc fcVar, mh.q1 q1Var) {
        this.f76652h = (fc) mh.p1.checkNotNull(fcVar);
        this.f76653i = (mh.q1) mh.p1.checkNotNull(q1Var);
    }

    @Override // nh.e0
    public final Map a() {
        return ec.filterKeys(this.f76652h.asMap(), this.f76653i);
    }

    @Override // nh.e0
    public Collection b() {
        return new s3(this);
    }

    @Override // nh.e0
    public final Set c() {
        return og.filter(this.f76652h.keySet(), this.f76653i);
    }

    @Override // nh.e0, nh.fc
    public void clear() {
        keySet().clear();
    }

    @Override // nh.e0, nh.fc
    public boolean containsKey(Object obj) {
        if (this.f76652h.containsKey(obj)) {
            return this.f76653i.apply(obj);
        }
        return false;
    }

    @Override // nh.e0
    public final ud d() {
        return le.filter(this.f76652h.keys(), this.f76653i);
    }

    @Override // nh.e0
    public final Collection e() {
        return new x3(this);
    }

    @Override // nh.w3
    public mh.q1 entryPredicate() {
        return mh.g2.compose(this.f76653i, wa.f76739b);
    }

    @Override // nh.e0
    public final Iterator f() {
        throw new AssertionError("should never be called");
    }

    @Override // nh.e0, nh.fc, nh.c8
    public Collection<Object> get(Object obj) {
        boolean zApply = this.f76653i.apply(obj);
        fc fcVar = this.f76652h;
        return zApply ? fcVar.get(obj) : fcVar instanceof sf ? new r3(obj) : new q3(obj);
    }

    @Override // nh.e0, nh.fc, nh.c8
    public Collection<Object> removeAll(Object obj) {
        boolean zContainsKey = containsKey(obj);
        fc fcVar = this.f76652h;
        return zContainsKey ? fcVar.removeAll(obj) : fcVar instanceof sf ? Collections.EMPTY_SET : Collections.EMPTY_LIST;
    }

    @Override // nh.e0, nh.fc
    public int size() {
        Iterator<Collection<Object>> it = asMap().values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    public fc unfiltered() {
        return this.f76652h;
    }
}
