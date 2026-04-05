package bu;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ac extends mt.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.m0 f10091b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10092c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f10093e;

    public ac(long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        this.f10092c = j10;
        this.f10093e = timeUnit;
        this.f10091b = m0Var;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        zb zbVar = new zb(i0Var);
        i0Var.onSubscribe(zbVar);
        zbVar.setResource(this.f10091b.scheduleDirect(zbVar, this.f10092c, this.f10093e));
    }
}
