package i0;

import e1.v;
import kotlin.jvm.internal.e0;
import s2.w;
import tu.x0;
import x1.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e defaultParent) {
        super(defaultParent);
        e0.checkNotNullParameter(defaultParent, "defaultParent");
    }

    @Override // i0.b, y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // i0.b, y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    public final Object bringIntoView(i1.j jVar, zu.d<? super x0> dVar) {
        d0 d0Var = this.f59299e;
        if (d0Var == null || !d0Var.isAttached()) {
            d0Var = null;
        }
        if (d0Var != null) {
            if (jVar == null) {
                jVar = i1.p.m4269toRectuvyYCjk(w.m6981toSizeozmzZPI(d0Var.mo7827getSizeYbymL2g()));
            }
            e eVar = this.f59298c;
            if (eVar == null) {
                eVar = this.f59297b;
            }
            Object objBringChildIntoView = eVar.bringChildIntoView(jVar, d0Var, dVar);
            if (objBringChildIntoView == av.e.getCOROUTINE_SUSPENDED()) {
                return objBringChildIntoView;
            }
        }
        return x0.f87415a;
    }

    @Override // i0.b, y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // i0.b, y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    @Override // i0.b, y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ v then(v vVar) {
        return super.then(vVar);
    }
}
