package mh;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z2 implements v2, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final v0 f74729b;

    /* renamed from: c, reason: collision with root package name */
    public final v2 f74730c;

    public z2(v0 v0Var, v2 v2Var) {
        this.f74729b = (v0) p1.checkNotNull(v0Var);
        this.f74730c = (v2) p1.checkNotNull(v2Var);
    }

    @Override // mh.v2
    public boolean equals(Object obj) {
        if (obj instanceof z2) {
            z2 z2Var = (z2) obj;
            if (this.f74729b.equals(z2Var.f74729b) && this.f74730c.equals(z2Var.f74730c)) {
                return true;
            }
        }
        return false;
    }

    @Override // mh.v2
    public Object get() {
        return this.f74729b.apply(this.f74730c.get());
    }

    public int hashCode() {
        return Objects.hash(this.f74729b, this.f74730c);
    }

    public String toString() {
        return "Suppliers.compose(" + this.f74729b + ", " + this.f74730c + ")";
    }
}
