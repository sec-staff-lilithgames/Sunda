package nh;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class jb extends oa {

    /* renamed from: h, reason: collision with root package name */
    public final mh.q1 f76395h;

    public jb(Map map, mh.q1 q1Var, mh.q1 q1Var2) {
        super(map, q1Var2);
        this.f76395h = q1Var;
    }

    @Override // nh.dc
    public final Set a() {
        return og.filter(this.f76530f.entrySet(), this.f76531g);
    }

    @Override // nh.oa, java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f76530f.containsKey(obj) && this.f76395h.apply(obj);
    }

    @Override // nh.dc
    public final Set createKeySet() {
        return og.filter(this.f76530f.keySet(), this.f76395h);
    }
}
