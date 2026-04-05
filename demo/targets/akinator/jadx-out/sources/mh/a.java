package mh;

import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a extends k1 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f74581b = new a();

    @Override // mh.k1
    public Set<Object> asSet() {
        return Collections.EMPTY_SET;
    }

    @Override // mh.k1
    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override // mh.k1
    public Object get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // mh.k1
    public int hashCode() {
        return 2040732332;
    }

    @Override // mh.k1
    public boolean isPresent() {
        return false;
    }

    @Override // mh.k1
    public Object or(Object obj) {
        return p1.checkNotNull(obj, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // mh.k1
    public Object orNull() {
        return null;
    }

    @Override // mh.k1
    public String toString() {
        return "Optional.absent()";
    }

    @Override // mh.k1
    public <V> k1 transform(v0 v0Var) {
        p1.checkNotNull(v0Var);
        return k1.absent();
    }

    @Override // mh.k1
    public k1 or(k1 k1Var) {
        return (k1) p1.checkNotNull(k1Var);
    }

    @Override // mh.k1
    public Object or(v2 v2Var) {
        return p1.checkNotNull(v2Var.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }
}
