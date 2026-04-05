package ds;

import mh.p1;
import wr.e4;
import wr.k4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class s implements wr.q {

    /* renamed from: a, reason: collision with root package name */
    public final e4 f52647a;

    public s(e4 e4Var) {
        this.f52647a = (e4) p1.checkNotNull(e4Var, "extraHeaders");
    }

    @Override // wr.q
    public <ReqT, RespT> wr.p interceptCall(k4 k4Var, wr.i iVar, wr.j jVar) {
        return new r(this, jVar.newCall(k4Var, iVar));
    }
}
