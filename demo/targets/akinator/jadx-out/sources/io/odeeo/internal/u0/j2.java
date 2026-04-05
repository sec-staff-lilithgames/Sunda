package io.odeeo.internal.u0;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j2 extends p2<Comparable> implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final j2 f66918c = new j2();
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public transient p2<Comparable> f66919a;

    /* renamed from: b, reason: collision with root package name */
    public transient p2<Comparable> f66920b;

    private Object readResolve() {
        return f66918c;
    }

    @Override // io.odeeo.internal.u0.p2
    public <S extends Comparable> p2<S> nullsFirst() {
        p2<S> p2Var = (p2<S>) this.f66919a;
        if (p2Var != null) {
            return p2Var;
        }
        p2<S> p2VarNullsFirst = super.nullsFirst();
        this.f66919a = p2VarNullsFirst;
        return p2VarNullsFirst;
    }

    @Override // io.odeeo.internal.u0.p2
    public <S extends Comparable> p2<S> nullsLast() {
        p2<S> p2Var = (p2<S>) this.f66920b;
        if (p2Var != null) {
            return p2Var;
        }
        p2<S> p2VarNullsLast = super.nullsLast();
        this.f66920b = p2VarNullsLast;
        return p2VarNullsLast;
    }

    @Override // io.odeeo.internal.u0.p2
    public <S extends Comparable> p2<S> reverse() {
        return a3.f66522a;
    }

    @Override // io.odeeo.internal.u0.p2, java.util.Comparator
    public int compare(Comparable comparable, Comparable comparable2) {
        io.odeeo.internal.t0.u.checkNotNull(comparable);
        io.odeeo.internal.t0.u.checkNotNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return duhsDlGWdBkekB.xPqApjfSJdt;
    }
}
