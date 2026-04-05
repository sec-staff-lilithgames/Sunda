package mh;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class q0 implements v0 {

    /* renamed from: b, reason: collision with root package name */
    public transient p0 f74676b;

    public static <A, B> q0 from(v0 v0Var, v0 v0Var2) {
        return new n0(v0Var, v0Var2);
    }

    public static <T> q0 identity() {
        return o0.f74663c;
    }

    public Object a(Object obj) {
        if (obj == null) {
            return null;
        }
        return p1.checkNotNull(d(obj));
    }

    public final <C> q0 andThen(q0 q0Var) {
        return c(q0Var);
    }

    @Override // mh.v0
    @Deprecated
    public final Object apply(Object obj) {
        return convert(obj);
    }

    public Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        return p1.checkNotNull(e(obj));
    }

    public q0 c(q0 q0Var) {
        return new m0(this, (q0) p1.checkNotNull(q0Var));
    }

    public final Object convert(Object obj) {
        return b(obj);
    }

    public Iterable<Object> convertAll(final Iterable<Object> iterable) {
        p1.checkNotNull(iterable, "fromIterable");
        return new Iterable() { // from class: mh.k0
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return new l0(this.f74644b, iterable);
            }
        };
    }

    public abstract Object d(Object obj);

    public abstract Object e(Object obj);

    @Override // mh.v0
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public q0 reverse() {
        p0 p0Var = this.f74676b;
        if (p0Var != null) {
            return p0Var;
        }
        p0 p0Var2 = new p0(this);
        this.f74676b = p0Var2;
        return p0Var2;
    }
}
