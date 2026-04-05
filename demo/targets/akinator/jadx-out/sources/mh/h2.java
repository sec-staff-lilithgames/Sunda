package mh;

import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h2 extends k1 {

    /* renamed from: b, reason: collision with root package name */
    public final Object f74632b;

    public h2(Object obj) {
        this.f74632b = obj;
    }

    @Override // mh.k1
    public Set<Object> asSet() {
        return Collections.singleton(this.f74632b);
    }

    @Override // mh.k1
    public boolean equals(Object obj) {
        if (obj instanceof h2) {
            return this.f74632b.equals(((h2) obj).f74632b);
        }
        return false;
    }

    @Override // mh.k1
    public Object get() {
        return this.f74632b;
    }

    @Override // mh.k1
    public int hashCode() {
        return this.f74632b.hashCode() + 1502476572;
    }

    @Override // mh.k1
    public boolean isPresent() {
        return true;
    }

    @Override // mh.k1
    public Object or(Object obj) {
        p1.checkNotNull(obj, "use Optional.orNull() instead of Optional.or(null)");
        return this.f74632b;
    }

    @Override // mh.k1
    public Object orNull() {
        return this.f74632b;
    }

    @Override // mh.k1
    public String toString() {
        return w0.i.e(new StringBuilder("Optional.of("), this.f74632b, ")");
    }

    @Override // mh.k1
    public <V> k1 transform(v0 v0Var) {
        return new h2(p1.checkNotNull(v0Var.apply(this.f74632b), "the Function passed to Optional.transform() must not return null."));
    }

    @Override // mh.k1
    public k1 or(k1 k1Var) {
        p1.checkNotNull(k1Var);
        return this;
    }

    @Override // mh.k1
    public Object or(v2 v2Var) {
        p1.checkNotNull(v2Var);
        return this.f74632b;
    }
}
