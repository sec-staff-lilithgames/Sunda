package l2;

import java.util.List;
import l2.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class t0 {
    public static final tu.v access$firstImmediatelyAvailable(List list, u1 u1Var, o oVar, h1 h1Var, kv.l lVar) {
        Object objM5453unboximpl;
        Object objM7131constructorimpl;
        Object objM5453unboximpl2;
        int size = list.size();
        List listMutableListOf = null;
        for (int i10 = 0; i10 < size; i10++) {
            w wVar = (w) list.get(i10);
            int iMo5432getLoadingStrategyPKNRLFQ = wVar.mo5432getLoadingStrategyPKNRLFQ();
            u0 u0Var = v0.f72378b;
            if (v0.m5471equalsimpl0(iMo5432getLoadingStrategyPKNRLFQ, u0Var.m5461getBlockingPKNRLFQ())) {
                synchronized (oVar.f72336d) {
                    try {
                        o.a aVar = new o.a(wVar, h1Var.getCacheKey());
                        n nVar = (n) oVar.f72334b.get(aVar);
                        if (nVar == null) {
                            nVar = (n) oVar.f72335c.get(aVar);
                        }
                        if (nVar != null) {
                            objM5453unboximpl = nVar.m5453unboximpl();
                        } else {
                            try {
                                Object objLoadBlocking = h1Var.loadBlocking(wVar);
                                o.put$default(oVar, wVar, h1Var, objLoadBlocking, false, 8, null);
                                objM5453unboximpl = objLoadBlocking;
                            } catch (Exception e10) {
                                throw new IllegalStateException("Unable to load font " + wVar, e10);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (objM5453unboximpl != null) {
                    return tu.e0.to(listMutableListOf, b1.m5434synthesizeTypefaceFxwP2eA(u1Var.m5468getFontSynthesisGVVA2EU(), objM5453unboximpl, wVar, u1Var.getFontWeight(), u1Var.m5467getFontStyle_LCdwA()));
                }
                throw new IllegalStateException("Unable to load font " + wVar);
            }
            if (v0.m5471equalsimpl0(iMo5432getLoadingStrategyPKNRLFQ, u0Var.m5462getOptionalLocalPKNRLFQ())) {
                synchronized (oVar.f72336d) {
                    try {
                        o.a aVar2 = new o.a(wVar, h1Var.getCacheKey());
                        n nVar2 = (n) oVar.f72334b.get(aVar2);
                        if (nVar2 == null) {
                            nVar2 = (n) oVar.f72335c.get(aVar2);
                        }
                        if (nVar2 != null) {
                            objM5453unboximpl2 = nVar2.m5453unboximpl();
                        } else {
                            try {
                                int i11 = tu.z.f87419c;
                                objM7131constructorimpl = tu.z.m7131constructorimpl(h1Var.loadBlocking(wVar));
                            } catch (Throwable th3) {
                                int i12 = tu.z.f87419c;
                                objM7131constructorimpl = tu.z.m7131constructorimpl(tu.a0.createFailure(th3));
                            }
                            Object obj = tu.z.m7136isFailureimpl(objM7131constructorimpl) ? null : objM7131constructorimpl;
                            o.put$default(oVar, wVar, h1Var, obj, false, 8, null);
                            objM5453unboximpl2 = obj;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                if (objM5453unboximpl2 != null) {
                    return tu.e0.to(listMutableListOf, b1.m5434synthesizeTypefaceFxwP2eA(u1Var.m5468getFontSynthesisGVVA2EU(), objM5453unboximpl2, wVar, u1Var.getFontWeight(), u1Var.m5467getFontStyle_LCdwA()));
                }
            } else {
                if (!v0.m5471equalsimpl0(iMo5432getLoadingStrategyPKNRLFQ, u0Var.m5460getAsyncPKNRLFQ())) {
                    throw new IllegalStateException("Unknown font type " + wVar);
                }
                n nVarM5454get1ASDuI8 = oVar.m5454get1ASDuI8(wVar, h1Var);
                if (nVarM5454get1ASDuI8 != null) {
                    if (!n.m5451isPermanentFailureimpl(nVarM5454get1ASDuI8.m5453unboximpl()) && nVarM5454get1ASDuI8.m5453unboximpl() != null) {
                        return tu.e0.to(listMutableListOf, b1.m5434synthesizeTypefaceFxwP2eA(u1Var.m5468getFontSynthesisGVVA2EU(), nVarM5454get1ASDuI8.m5453unboximpl(), wVar, u1Var.getFontWeight(), u1Var.m5467getFontStyle_LCdwA()));
                    }
                } else if (listMutableListOf == null) {
                    listMutableListOf = uu.p0.mutableListOf(wVar);
                } else {
                    listMutableListOf.add(wVar);
                }
            }
        }
        return tu.e0.to(listMutableListOf, lVar.invoke(u1Var));
    }
}
