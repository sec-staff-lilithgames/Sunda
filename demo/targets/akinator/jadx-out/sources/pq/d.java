package pq;

import br.h0;
import dq.d0;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f81627a;

    public d(e eVar) {
        this.f81627a = eVar;
    }

    @Override // pq.j
    public void a(i iVar) {
        e eVar = this.f81627a;
        d0.b(eVar.f81628a, "onAdPhaseLoaded (%s)", iVar);
        Iterator it = eVar.f81634g.iterator();
        while (it.hasNext()) {
            if (!((i) it.next()).b()) {
                return;
            }
        }
        eVar.h();
        if (eVar.f81633f.a(true)) {
            eVar.f81631d.b(eVar);
        }
    }

    @Override // pq.j
    public void a(i iVar, h0 h0Var) {
        e eVar = this.f81627a;
        g gVar = eVar.f81631d;
        xq.h hVar = eVar.f81633f;
        cr.p pVar = eVar.f81628a;
        d0.a(pVar, "onAdPhaseFailToLoad (%s) - %s", iVar, h0Var);
        d0.b(pVar, "removeAndDestroyAdPhaseController (%s)", iVar);
        ir.q.ifNotNull(iVar, new b(eVar, 0));
        eVar.c(iVar);
        if (eVar.l()) {
            if (hVar.d()) {
                ir.q.ifNotNull(new h0("Fail to load after show (CacheType - " + eVar.f81630c.getCacheType() + ") - " + h0Var), new ks.s(18, eVar, iVar));
                eVar.e();
                return;
            }
            if (hVar.k()) {
                gVar.a(eVar);
                return;
            }
            return;
        }
        if (hVar.a(false)) {
            gVar.a(eVar, h0Var);
        }
    }
}
