package l2;

import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface y {
    /* renamed from: resolve-DPcqOEQ$default, reason: not valid java name */
    static /* synthetic */ v5 m5481resolveDPcqOEQ$default(y yVar, x xVar, c1 c1Var, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
        }
        if ((i12 & 1) != 0) {
            xVar = null;
        }
        if ((i12 & 2) != 0) {
            c1Var = c1.f72258c.getNormal();
        }
        if ((i12 & 4) != 0) {
            i10 = y0.f72394b.m5480getNormal_LCdwA();
        }
        if ((i12 & 8) != 0) {
            i11 = a1.f72244b.m5489getAllGVVA2EU();
        }
        return yVar.mo5437resolveDPcqOEQ(xVar, c1Var, i10, i11);
    }

    Object preload(x xVar, zu.d<? super tu.x0> dVar);

    /* renamed from: resolve-DPcqOEQ */
    v5 mo5437resolveDPcqOEQ(x xVar, c1 c1Var, int i10, int i11);
}
