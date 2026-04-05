package bu;

import java.util.concurrent.TimeUnit;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s5 extends mt.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.m0 f10950b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10951c;

    /* renamed from: e, reason: collision with root package name */
    public final long f10952e;

    /* renamed from: f, reason: collision with root package name */
    public final long f10953f;

    /* renamed from: g, reason: collision with root package name */
    public final long f10954g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeUnit f10955h;

    public s5(long j10, long j11, long j12, long j13, TimeUnit timeUnit, mt.m0 m0Var) {
        this.f10953f = j12;
        this.f10954g = j13;
        this.f10955h = timeUnit;
        this.f10950b = m0Var;
        this.f10951c = j10;
        this.f10952e = j11;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        r5 r5Var = new r5(i0Var, this.f10951c, this.f10952e);
        i0Var.onSubscribe(r5Var);
        mt.m0 m0Var = this.f10950b;
        if (!(m0Var instanceof fu.v0)) {
            r5Var.setResource(m0Var.schedulePeriodicallyDirect(r5Var, this.f10953f, this.f10954g, this.f10955h));
        } else {
            m0.a aVarCreateWorker = m0Var.createWorker();
            r5Var.setResource(aVarCreateWorker);
            aVarCreateWorker.schedulePeriodically(r5Var, this.f10953f, this.f10954g, this.f10955h);
        }
    }
}
