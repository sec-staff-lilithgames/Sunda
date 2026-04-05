package mh;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n0 extends q0 implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public final v0 f74658c;

    /* renamed from: e, reason: collision with root package name */
    public final v0 f74659e;

    public n0(v0 v0Var, v0 v0Var2) {
        this.f74658c = (v0) p1.checkNotNull(v0Var);
        this.f74659e = (v0) p1.checkNotNull(v0Var2);
    }

    @Override // mh.q0
    public final Object d(Object obj) {
        return this.f74659e.apply(obj);
    }

    @Override // mh.q0
    public final Object e(Object obj) {
        return this.f74658c.apply(obj);
    }

    @Override // mh.q0, mh.v0
    public boolean equals(Object obj) {
        if (obj instanceof n0) {
            n0 n0Var = (n0) obj;
            if (this.f74658c.equals(n0Var.f74658c) && this.f74659e.equals(n0Var.f74659e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f74659e.hashCode() + (this.f74658c.hashCode() * 31);
    }

    public String toString() {
        return "Converter.from(" + this.f74658c + ", " + this.f74659e + ")";
    }
}
