package bu;

import java.util.concurrent.TimeUnit;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q5 extends mt.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.m0 f10850b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10851c;

    /* renamed from: e, reason: collision with root package name */
    public final long f10852e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeUnit f10853f;

    public q5(long j10, long j11, TimeUnit timeUnit, mt.m0 m0Var) {
        this.f10851c = j10;
        this.f10852e = j11;
        this.f10853f = timeUnit;
        this.f10850b = m0Var;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        p5 p5Var = new p5(i0Var);
        i0Var.onSubscribe(p5Var);
        mt.m0 m0Var = this.f10850b;
        if (!(m0Var instanceof fu.v0)) {
            p5Var.setResource(m0Var.schedulePeriodicallyDirect(p5Var, this.f10851c, this.f10852e, this.f10853f));
        } else {
            m0.a aVarCreateWorker = m0Var.createWorker();
            p5Var.setResource(aVarCreateWorker);
            aVarCreateWorker.schedulePeriodically(p5Var, this.f10851c, this.f10852e, this.f10853f);
        }
    }
}
