package io.odeeo.internal.t0;

import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a<T> extends q<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final a<Object> f66360a = new a<>();
    private static final long serialVersionUID = 0;

    public static <T> q<T> a() {
        return f66360a;
    }

    private Object readResolve() {
        return f66360a;
    }

    @Override // io.odeeo.internal.t0.q
    public Set<T> asSet() {
        return Collections.EMPTY_SET;
    }

    @Override // io.odeeo.internal.t0.q
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // io.odeeo.internal.t0.q
    public T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // io.odeeo.internal.t0.q
    public int hashCode() {
        return 2040732332;
    }

    @Override // io.odeeo.internal.t0.q
    public boolean isPresent() {
        return false;
    }

    @Override // io.odeeo.internal.t0.q
    public T or(T t10) {
        return (T) u.checkNotNull(t10, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // io.odeeo.internal.t0.q
    public T orNull() {
        return null;
    }

    @Override // io.odeeo.internal.t0.q
    public String toString() {
        return "Optional.absent()";
    }

    @Override // io.odeeo.internal.t0.q
    public <V> q<V> transform(k<? super T, V> kVar) {
        u.checkNotNull(kVar);
        return q.absent();
    }

    @Override // io.odeeo.internal.t0.q
    public q<T> or(q<? extends T> qVar) {
        return (q) u.checkNotNull(qVar);
    }

    @Override // io.odeeo.internal.t0.q
    public T or(b0<? extends T> b0Var) {
        return (T) u.checkNotNull(b0Var.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }
}
