package yq;

import br.h0;
import cr.p;
import cr.q;
import dq.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l implements pq.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f94825a;

    public l(o oVar) {
        this.f94825a = oVar;
    }

    @Override // pq.j
    public void a(pq.i iVar) {
        o oVar = this.f94825a;
        p pVar = oVar.f94827b;
        d0.b(pVar, "onAdPhaseLoaded (%s)", iVar);
        if (iVar.a(oVar)) {
            iVar.a(new m(oVar));
            d0.b(pVar, "notifyPlaceholderLoaded", new Object[0]);
            q.onUiThread(new k(oVar, 1));
        }
    }

    @Override // pq.j
    public void a(pq.i iVar, h0 h0Var) {
        d0.a(this.f94825a.f94827b, "onAdPhaseFailToLoad (%s) - %s", iVar, h0Var);
        iVar.a();
    }
}
