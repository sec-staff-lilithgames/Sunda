package nh;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s0 extends we implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final mh.v0 f76615b;

    /* renamed from: c, reason: collision with root package name */
    public final we f76616c;

    public s0(mh.v0 v0Var, we weVar) {
        this.f76615b = (mh.v0) mh.p1.checkNotNull(v0Var);
        this.f76616c = (we) mh.p1.checkNotNull(weVar);
    }

    @Override // nh.we, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        mh.v0 v0Var = this.f76615b;
        return this.f76616c.compare(v0Var.apply(obj), v0Var.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s0) {
            s0 s0Var = (s0) obj;
            if (this.f76615b.equals(s0Var.f76615b) && this.f76616c.equals(s0Var.f76616c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f76615b, this.f76616c);
    }

    public String toString() {
        return this.f76616c + ".onResultOf(" + this.f76615b + ")";
    }
}
