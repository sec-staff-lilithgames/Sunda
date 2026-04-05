package xr;

import java.util.concurrent.Executor;
import wr.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class x4 implements o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u.a f93230a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o1 f93231b;

    public x4(u.a aVar, o1 o1Var) {
        this.f93230a = aVar;
        this.f93231b = o1Var;
    }

    @Override // xr.o1, wr.m2, wr.v2
    public wr.n2 getLogId() {
        return this.f93231b.getLogId();
    }

    @Override // xr.o1, wr.m2
    public sh.n1 getStats() {
        return this.f93231b.getStats();
    }

    @Override // xr.o1
    public k1 newStream(wr.k4 k4Var, wr.e4 e4Var, wr.i iVar, wr.u[] uVarArr) {
        wr.u uVarNewClientStreamTracer = this.f93230a.newClientStreamTracer(wr.w.newBuilder().setCallOptions(iVar).build(), e4Var);
        mh.p1.checkState(uVarArr[uVarArr.length - 1] == c5.f92324s, "lb tracer already assigned");
        uVarArr[uVarArr.length - 1] = uVarNewClientStreamTracer;
        return this.f93231b.newStream(k4Var, e4Var, iVar, uVarArr);
    }

    @Override // xr.o1
    public void ping(n1 n1Var, Executor executor) {
        this.f93231b.ping(n1Var, executor);
    }
}
