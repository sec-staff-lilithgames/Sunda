package ds;

import java.util.concurrent.atomic.AtomicReference;
import mh.p1;
import wr.k4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v implements wr.q {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f52650a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f52651b;

    public v(AtomicReference atomicReference, AtomicReference atomicReference2) {
        this.f52650a = (AtomicReference) p1.checkNotNull(atomicReference, "headersCapture");
        this.f52651b = (AtomicReference) p1.checkNotNull(atomicReference2, "trailersCapture");
    }

    @Override // wr.q
    public <ReqT, RespT> wr.p interceptCall(k4 k4Var, wr.i iVar, wr.j jVar) {
        return new u(this, jVar.newCall(k4Var, iVar));
    }
}
