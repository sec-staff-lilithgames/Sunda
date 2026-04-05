package bu;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class nb extends a {

    /* renamed from: c, reason: collision with root package name */
    public final mt.m0 f10709c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f10710e;

    public nb(mt.g0 g0Var, TimeUnit timeUnit, mt.m0 m0Var) {
        super(g0Var);
        this.f10709c = m0Var;
        this.f10710e = timeUnit;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        this.f10053b.subscribe(new mb(i0Var, this.f10710e, this.f10709c));
    }
}
