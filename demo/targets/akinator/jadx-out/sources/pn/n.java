package pn;

import ao.b0;
import go.c0;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n implements go.u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f81542b;

    public n(p pVar) {
        this.f81542b = pVar;
    }

    @Override // go.u
    public void onLoadCompleted(c0 c0Var, long j10, long j11) {
        b0 b0Var = new b0(c0Var.f58295a, c0Var.f58296b, c0Var.getUri(), c0Var.getResponseHeaders(), j10, j11, c0Var.bytesLoaded());
        p pVar = this.f81542b;
        pVar.f81548m.onLoadTaskConcluded(c0Var.f58295a);
        pVar.f81552q.loadCompleted(b0Var, c0Var.f58297c);
        pVar.L = ((Long) c0Var.getResult()).longValue() - j10;
        pVar.j(true);
    }

    @Override // go.u
    public go.v onLoadError(c0 c0Var, long j10, long j11, IOException iOException, int i10) {
        p pVar = this.f81542b;
        pVar.f81552q.loadError(new b0(c0Var.f58295a, c0Var.f58296b, c0Var.getUri(), c0Var.getResponseHeaders(), j10, j11, c0Var.bytesLoaded()), c0Var.f58297c, iOException, true);
        pVar.f81548m.onLoadTaskConcluded(c0Var.f58295a);
        pVar.i(iOException);
        return go.w.f58371e;
    }

    @Override // go.u
    public /* bridge */ /* synthetic */ void onLoadStarted(go.x xVar, long j10, long j11, int i10) {
        super.onLoadStarted(xVar, j10, j11, i10);
    }

    @Override // go.u
    public void onLoadCanceled(c0 c0Var, long j10, long j11, boolean z10) {
        this.f81542b.h(c0Var, j10, j11);
    }
}
