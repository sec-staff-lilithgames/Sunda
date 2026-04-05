package nh;

import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class za extends eb implements q0 {

    /* renamed from: i, reason: collision with root package name */
    public final za f76822i;

    public za(q0 q0Var, mh.q1 q1Var) {
        super(q0Var, q1Var);
        this.f76822i = new za(q0Var.inverse(), new j3(q1Var, 1), this);
    }

    @Override // nh.q0
    public Object forcePut(Object obj, Object obj2) {
        mh.p1.checkArgument(c(obj, obj2));
        return ((q0) this.f76530f).forcePut(obj, obj2);
    }

    @Override // nh.q0
    public q0 inverse() {
        return this.f76822i;
    }

    @Override // nh.dc, java.util.AbstractMap, java.util.Map
    public Set<Object> values() {
        return this.f76822i.keySet();
    }

    public za(q0 q0Var, j3 j3Var, za zaVar) {
        super(q0Var, j3Var);
        this.f76822i = zaVar;
    }
}
