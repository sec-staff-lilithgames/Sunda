package ut;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h0 implements st.o {

    /* renamed from: b, reason: collision with root package name */
    public final TimeUnit f88666b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.m0 f88667c;

    public h0(TimeUnit timeUnit, mt.m0 m0Var) {
        this.f88666b = timeUnit;
        this.f88667c = m0Var;
    }

    @Override // st.o
    public ou.k apply(Object obj) throws Exception {
        mt.m0 m0Var = this.f88667c;
        TimeUnit timeUnit = this.f88666b;
        return new ou.k(obj, m0Var.now(timeUnit), timeUnit);
    }
}
