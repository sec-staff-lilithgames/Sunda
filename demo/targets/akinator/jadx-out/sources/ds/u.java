package ds;

import wr.e4;
import wr.h1;
import wr.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class u extends h1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f52649b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, wr.p pVar) {
        super(pVar);
        this.f52649b = vVar;
    }

    @Override // wr.i1, wr.p
    public void start(p.a aVar, e4 e4Var) {
        v vVar = this.f52649b;
        vVar.f52650a.set(null);
        vVar.f52651b.set(null);
        super.start(new t(this, aVar), e4Var);
    }
}
