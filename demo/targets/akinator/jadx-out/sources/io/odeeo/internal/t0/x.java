package io.odeeo.internal.t0;

import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x<T> extends q<T> {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final T f66469a;

    public x(T t10) {
        this.f66469a = t10;
    }

    @Override // io.odeeo.internal.t0.q
    public Set<T> asSet() {
        return Collections.singleton(this.f66469a);
    }

    @Override // io.odeeo.internal.t0.q
    public boolean equals(Object obj) {
        if (obj instanceof x) {
            return this.f66469a.equals(((x) obj).f66469a);
        }
        return false;
    }

    @Override // io.odeeo.internal.t0.q
    public T get() {
        return this.f66469a;
    }

    @Override // io.odeeo.internal.t0.q
    public int hashCode() {
        return this.f66469a.hashCode() + 1502476572;
    }

    @Override // io.odeeo.internal.t0.q
    public boolean isPresent() {
        return true;
    }

    @Override // io.odeeo.internal.t0.q
    public T or(T t10) {
        u.checkNotNull(t10, "use Optional.orNull() instead of Optional.or(null)");
        return this.f66469a;
    }

    @Override // io.odeeo.internal.t0.q
    public T orNull() {
        return this.f66469a;
    }

    @Override // io.odeeo.internal.t0.q
    public String toString() {
        return w0.i.e(new StringBuilder("Optional.of("), this.f66469a, ")");
    }

    @Override // io.odeeo.internal.t0.q
    public <V> q<V> transform(k<? super T, V> kVar) {
        return new x(u.checkNotNull(kVar.apply(this.f66469a), "the Function passed to Optional.transform() must not return null."));
    }

    @Override // io.odeeo.internal.t0.q
    public q<T> or(q<? extends T> qVar) {
        u.checkNotNull(qVar);
        return this;
    }

    @Override // io.odeeo.internal.t0.q
    public T or(b0<? extends T> b0Var) {
        u.checkNotNull(b0Var);
        return this.f66469a;
    }
}
