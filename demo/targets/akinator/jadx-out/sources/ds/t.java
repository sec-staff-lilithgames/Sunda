package ds;

import wr.e4;
import wr.j1;
import wr.m6;
import wr.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class t extends j1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f52648b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, p.a aVar) {
        super(aVar);
        this.f52648b = uVar;
    }

    @Override // wr.j1, wr.k1, wr.y4, wr.p.a
    public void onClose(m6 m6Var, e4 e4Var) {
        this.f52648b.f52649b.f52651b.set(e4Var);
        super.onClose(m6Var, e4Var);
    }

    @Override // wr.j1, wr.k1, wr.y4, wr.p.a
    public void onHeaders(e4 e4Var) {
        this.f52648b.f52649b.f52650a.set(e4Var);
        super.onHeaders(e4Var);
    }
}
