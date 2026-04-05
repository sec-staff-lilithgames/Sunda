package nh;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ra extends mh.q0 implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public final q0 f76601c;

    public ra(q0 q0Var) {
        this.f76601c = (q0) mh.p1.checkNotNull(q0Var);
    }

    @Override // mh.q0
    public final Object d(Object obj) {
        Object obj2 = this.f76601c.inverse().get(obj);
        mh.p1.checkArgument(obj2 != null, "No non-null mapping present for input: %s", obj);
        return obj2;
    }

    @Override // mh.q0
    public final Object e(Object obj) {
        Object obj2 = this.f76601c.get(obj);
        mh.p1.checkArgument(obj2 != null, "No non-null mapping present for input: %s", obj);
        return obj2;
    }

    @Override // mh.q0, mh.v0
    public boolean equals(Object obj) {
        if (obj instanceof ra) {
            return this.f76601c.equals(((ra) obj).f76601c);
        }
        return false;
    }

    public int hashCode() {
        return this.f76601c.hashCode();
    }

    public String toString() {
        return "Maps.asConverter(" + this.f76601c + ")";
    }
}
