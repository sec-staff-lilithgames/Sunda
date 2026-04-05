package bd;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class c extends h0 {
    public c(cd.l lVar, boolean z10, wc.j jVar, jc.w wVar) {
        super(lVar, z10, jVar, wVar);
    }

    @Override // bd.h0
    public final Object f(Object obj) {
        return ((AtomicReference) obj).get();
    }

    @Override // bd.h0
    public final Object g(Object obj) {
        return ((AtomicReference) obj).get();
    }

    @Override // bd.h0
    public final boolean h(Object obj) {
        return ((AtomicReference) obj).get() != null;
    }

    @Override // bd.h0
    public final c i(jc.g gVar, wc.j jVar, jc.w wVar, dd.a0 a0Var) {
        return new c(this, gVar, jVar, wVar, a0Var, this.f9087k, this.f9088l);
    }

    @Override // bd.h0
    public h0 withContentInclusion(Object obj, boolean z10) {
        return new c(this, this.f9082f, this.f9083g, this.f9084h, this.f9085i, obj, z10);
    }
}
