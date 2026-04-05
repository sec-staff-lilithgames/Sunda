package d3;

import e3.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class h extends q {
    public final e3.b D0;
    public final e3.f E0;
    public int F0;
    public e3.c G0;
    public boolean H0;
    public x2.g I0;
    public final x2.f J0;
    public int K0;
    public int L0;
    public int M0;
    public int N0;
    public c[] O0;
    public c[] P0;
    public int Q0;
    public boolean R0;
    public boolean S0;
    public WeakReference T0;
    public WeakReference U0;
    public WeakReference V0;
    public WeakReference W0;
    public final HashSet X0;
    public final b.a Y0;

    public h() {
        this.D0 = new e3.b(this);
        this.E0 = new e3.f(this);
        this.G0 = null;
        this.H0 = false;
        this.J0 = new x2.f();
        this.M0 = 0;
        this.N0 = 0;
        this.O0 = new c[4];
        this.P0 = new c[4];
        this.Q0 = 257;
        this.R0 = false;
        this.S0 = false;
        this.T0 = null;
        this.U0 = null;
        this.V0 = null;
        this.W0 = null;
        this.X0 = new HashSet();
        this.Y0 = new b.a();
    }

    public boolean addChildrenToSolver(x2.f fVar) {
        h hVar;
        x2.f fVar2;
        boolean zOptimizeFor = optimizeFor(64);
        addToSolver(fVar, zOptimizeFor);
        int size = this.C0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) this.C0.get(i10);
            boolean[] zArr = gVar.X;
            zArr[0] = false;
            zArr[1] = false;
            if (gVar instanceof a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                g gVar2 = (g) this.C0.get(i11);
                if (gVar2 instanceof a) {
                    a aVar = (a) gVar2;
                    for (int i12 = 0; i12 < aVar.D0; i12++) {
                        g gVar3 = aVar.C0[i12];
                        if (aVar.F0 || gVar3.allowedInBarrier()) {
                            int i13 = aVar.E0;
                            if (i13 == 0 || i13 == 1) {
                                gVar3.X[0] = true;
                            } else if (i13 == 2 || i13 == 3) {
                                gVar3.X[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet<g> hashSet = this.X0;
        hashSet.clear();
        for (int i14 = 0; i14 < size; i14++) {
            g gVar4 = (g) this.C0.get(i14);
            gVar4.getClass();
            boolean z11 = gVar4 instanceof p;
            if (z11 || (gVar4 instanceof k)) {
                if (z11) {
                    hashSet.add(gVar4);
                } else {
                    gVar4.addToSolver(fVar, zOptimizeFor);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator<g> it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p pVar = (p) it.next();
                if (pVar.contains(hashSet)) {
                    pVar.addToSolver(fVar, zOptimizeFor);
                    hashSet.remove(pVar);
                    break;
                }
            }
            if (size2 == hashSet.size()) {
                Iterator<g> it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    it2.next().addToSolver(fVar, zOptimizeFor);
                }
                hashSet.clear();
            }
        }
        boolean z12 = x2.f.f91477q;
        f fVar3 = f.f51767c;
        if (z12) {
            HashSet<g> hashSet2 = new HashSet<>();
            for (int i15 = 0; i15 < size; i15++) {
                g gVar5 = (g) this.C0.get(i15);
                gVar5.getClass();
                if (!(gVar5 instanceof p) && !(gVar5 instanceof k)) {
                    hashSet2.add(gVar5);
                }
            }
            hVar = this;
            fVar2 = fVar;
            hVar.addChildrenToSolverByDependency(this, fVar2, hashSet2, getHorizontalDimensionBehaviour() == fVar3 ? 0 : 1, false);
            Iterator<g> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                g next = it3.next();
                n.a(this, fVar2, next);
                next.addToSolver(fVar2, zOptimizeFor);
            }
        } else {
            hVar = this;
            fVar2 = fVar;
            for (int i16 = 0; i16 < size; i16++) {
                g gVar6 = (g) hVar.C0.get(i16);
                if (gVar6 instanceof h) {
                    f[] fVarArr = gVar6.Y;
                    f fVar4 = fVarArr[0];
                    f fVar5 = fVarArr[1];
                    f fVar6 = f.f51766b;
                    if (fVar4 == fVar3) {
                        gVar6.setHorizontalDimensionBehaviour(fVar6);
                    }
                    if (fVar5 == fVar3) {
                        gVar6.setVerticalDimensionBehaviour(fVar6);
                    }
                    gVar6.addToSolver(fVar2, zOptimizeFor);
                    if (fVar4 == fVar3) {
                        gVar6.setHorizontalDimensionBehaviour(fVar4);
                    }
                    if (fVar5 == fVar3) {
                        gVar6.setVerticalDimensionBehaviour(fVar5);
                    }
                } else {
                    n.a(this, fVar2, gVar6);
                    if (!(gVar6 instanceof p) && !(gVar6 instanceof k)) {
                        gVar6.addToSolver(fVar2, zOptimizeFor);
                    }
                }
            }
        }
        if (hVar.M0 > 0) {
            b.applyChainConstraints(this, fVar2, null, 0);
        }
        if (hVar.N0 > 0) {
            b.applyChainConstraints(this, fVar2, null, 1);
        }
        return true;
    }

    public void addHorizontalWrapMaxVariable(e eVar) {
        WeakReference weakReference = this.W0;
        if (weakReference == null || weakReference.get() == null || eVar.getFinalValue() > ((e) this.W0.get()).getFinalValue()) {
            this.W0 = new WeakReference(eVar);
        }
    }

    public void addHorizontalWrapMinVariable(e eVar) {
        WeakReference weakReference = this.U0;
        if (weakReference == null || weakReference.get() == null || eVar.getFinalValue() > ((e) this.U0.get()).getFinalValue()) {
            this.U0 = new WeakReference(eVar);
        }
    }

    public void defineTerminalWidgets() {
        this.E0.defineTerminalWidgets(getHorizontalDimensionBehaviour(), getVerticalDimensionBehaviour());
    }

    public boolean directMeasure(boolean z10) {
        return this.E0.directMeasure(z10);
    }

    public boolean directMeasureSetup(boolean z10) {
        return this.E0.directMeasureSetup(z10);
    }

    public boolean directMeasureWithOrientation(boolean z10, int i10) {
        return this.E0.directMeasureWithOrientation(z10, i10);
    }

    public void fillMetrics(x2.g gVar) {
        this.I0 = gVar;
        this.J0.fillMetrics(gVar);
    }

    public ArrayList<k> getHorizontalGuidelines() {
        ArrayList<k> arrayList = new ArrayList<>();
        int size = this.C0.size();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) this.C0.get(i10);
            if (gVar instanceof k) {
                k kVar = (k) gVar;
                if (kVar.getOrientation() == 0) {
                    arrayList.add(kVar);
                }
            }
        }
        return arrayList;
    }

    public e3.c getMeasurer() {
        return this.G0;
    }

    public int getOptimizationLevel() {
        return this.Q0;
    }

    @Override // d3.g
    public void getSceneString(StringBuilder sb2) {
        sb2.append(this.f51793l + ":{\n");
        StringBuilder sb3 = new StringBuilder("  actualWidth:");
        sb3.append(this.f51772a0);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.f51774b0);
        sb2.append("\n");
        Iterator<g> it = getChildren().iterator();
        while (it.hasNext()) {
            it.next().getSceneString(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }

    public x2.f getSystem() {
        return this.J0;
    }

    @Override // d3.g
    public String getType() {
        return "ConstraintLayout";
    }

    public ArrayList<k> getVerticalGuidelines() {
        ArrayList<k> arrayList = new ArrayList<>();
        int size = this.C0.size();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) this.C0.get(i10);
            if (gVar instanceof k) {
                k kVar = (k) gVar;
                if (kVar.getOrientation() == 1) {
                    arrayList.add(kVar);
                }
            }
        }
        return arrayList;
    }

    public boolean handlesInternalConstraints() {
        return false;
    }

    public void invalidateGraph() {
        this.E0.invalidateGraph();
    }

    public void invalidateMeasures() {
        this.E0.invalidateMeasures();
    }

    public boolean isHeightMeasuredTooSmall() {
        return this.S0;
    }

    public boolean isRtl() {
        return this.H0;
    }

    public boolean isWidthMeasuredTooSmall() {
        return this.R0;
    }

    public final void k(g gVar, int i10) {
        if (i10 == 0) {
            int i11 = this.M0 + 1;
            c[] cVarArr = this.P0;
            if (i11 >= cVarArr.length) {
                this.P0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
            }
            this.P0[this.M0] = new c(gVar, 0, isRtl());
            this.M0++;
            return;
        }
        if (i10 == 1) {
            int i12 = this.N0 + 1;
            c[] cVarArr2 = this.O0;
            if (i12 >= cVarArr2.length) {
                this.O0 = (c[]) Arrays.copyOf(cVarArr2, cVarArr2.length * 2);
            }
            this.O0[this.N0] = new c(gVar, 1, isRtl());
            this.N0++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x024a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0331 A[PHI: r20 r21
      0x0331: PHI (r20v4 boolean) = (r20v3 boolean), (r20v6 boolean), (r20v6 boolean), (r20v6 boolean) binds: [B:148:0x02f0, B:157:0x0318, B:158:0x031a, B:160:0x0320] A[DONT_GENERATE, DONT_INLINE]
      0x0331: PHI (r21v7 boolean) = (r21v6 boolean), (r21v8 boolean), (r21v8 boolean), (r21v8 boolean) binds: [B:148:0x02f0, B:157:0x0318, B:158:0x031a, B:160:0x0320] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0339  */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v38 */
    @Override // d3.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void layout() {
        /*
            Method dump skipped, instructions count: 857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.h.layout():void");
    }

    public long measure(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.K0 = i17;
        this.L0 = i18;
        return this.D0.solverMeasure(this, i10, i17, i18, i11, i12, i13, i14, i15, i16);
    }

    public boolean optimizeFor(int i10) {
        return (this.Q0 & i10) == i10;
    }

    @Override // d3.q, d3.g
    public void reset() {
        this.J0.reset();
        this.K0 = 0;
        this.L0 = 0;
        super.reset();
    }

    public void setMeasurer(e3.c cVar) {
        this.G0 = cVar;
        this.E0.setMeasurer(cVar);
    }

    public void setOptimizationLevel(int i10) {
        this.Q0 = i10;
        x2.f.f91477q = optimizeFor(512);
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
        this.K0 = i10;
        this.L0 = i11;
    }

    public void setPass(int i10) {
        this.F0 = i10;
    }

    public void setRtl(boolean z10) {
        this.H0 = z10;
    }

    public boolean updateChildrenFromSolver(x2.f fVar, boolean[] zArr) {
        zArr[2] = false;
        boolean zOptimizeFor = optimizeFor(64);
        updateFromSolver(fVar, zOptimizeFor);
        int size = this.C0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) this.C0.get(i10);
            gVar.updateFromSolver(fVar, zOptimizeFor);
            if (gVar.hasDimensionOverride()) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // d3.g
    public void updateFromRuns(boolean z10, boolean z11) {
        super.updateFromRuns(z10, z11);
        int size = this.C0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((g) this.C0.get(i10)).updateFromRuns(z10, z11);
        }
    }

    public void updateHierarchy() {
        this.D0.updateHierarchy(this);
    }

    public static boolean measure(int i10, g gVar, e3.c cVar, b.a aVar, int i11) {
        int i12;
        int i13;
        if (cVar == null) {
            return false;
        }
        int visibility = gVar.getVisibility();
        int[] iArr = gVar.f51813v;
        if (visibility != 8 && !(gVar instanceof k) && !(gVar instanceof a)) {
            aVar.f53642a = gVar.getHorizontalDimensionBehaviour();
            aVar.f53643b = gVar.getVerticalDimensionBehaviour();
            aVar.f53644c = gVar.getWidth();
            aVar.f53645d = gVar.getHeight();
            aVar.f53650i = false;
            aVar.f53651j = i11;
            f fVar = aVar.f53642a;
            f fVar2 = f.f51768e;
            boolean z10 = fVar == fVar2;
            boolean z11 = aVar.f53643b == fVar2;
            boolean z12 = z10 && gVar.f51776c0 > 0.0f;
            boolean z13 = z11 && gVar.f51776c0 > 0.0f;
            f fVar3 = f.f51767c;
            f fVar4 = f.f51766b;
            if (z10 && gVar.hasDanglingDimension(0) && gVar.f51809t == 0 && !z12) {
                aVar.f53642a = fVar3;
                if (z11 && gVar.f51811u == 0) {
                    aVar.f53642a = fVar4;
                }
                z10 = false;
            }
            if (z11 && gVar.hasDanglingDimension(1) && gVar.f51811u == 0 && !z13) {
                aVar.f53643b = fVar3;
                if (z10 && gVar.f51809t == 0) {
                    aVar.f53643b = fVar4;
                }
                z11 = false;
            }
            if (gVar.isResolvedHorizontally()) {
                aVar.f53642a = fVar4;
                z10 = false;
            }
            if (gVar.isResolvedVertically()) {
                aVar.f53643b = fVar4;
                z11 = false;
            }
            if (z12) {
                if (iArr[0] == 4) {
                    aVar.f53642a = fVar4;
                } else if (!z11) {
                    if (aVar.f53643b == fVar4) {
                        i13 = aVar.f53645d;
                    } else {
                        aVar.f53642a = fVar3;
                        ((androidx.constraintlayout.widget.e) cVar).measure(gVar, aVar);
                        i13 = aVar.f53647f;
                    }
                    aVar.f53642a = fVar4;
                    aVar.f53644c = (int) (gVar.getDimensionRatio() * i13);
                }
            }
            if (z13) {
                if (iArr[1] == 4) {
                    aVar.f53643b = fVar4;
                } else if (!z10) {
                    if (aVar.f53642a == fVar4) {
                        i12 = aVar.f53644c;
                    } else {
                        aVar.f53643b = fVar3;
                        ((androidx.constraintlayout.widget.e) cVar).measure(gVar, aVar);
                        i12 = aVar.f53646e;
                    }
                    aVar.f53643b = fVar4;
                    if (gVar.getDimensionRatioSide() == -1) {
                        aVar.f53645d = (int) (i12 / gVar.getDimensionRatio());
                    } else {
                        aVar.f53645d = (int) (gVar.getDimensionRatio() * i12);
                    }
                }
            }
            ((androidx.constraintlayout.widget.e) cVar).measure(gVar, aVar);
            gVar.setWidth(aVar.f53646e);
            gVar.setHeight(aVar.f53647f);
            gVar.setHasBaseline(aVar.f53649h);
            gVar.setBaselineDistance(aVar.f53648g);
            aVar.f53651j = 0;
            return aVar.f53650i;
        }
        aVar.f53646e = 0;
        aVar.f53647f = 0;
        return false;
    }

    public h(int i10, int i11, int i12, int i13) {
        super(i10, i11, i12, i13);
        this.D0 = new e3.b(this);
        this.E0 = new e3.f(this);
        this.G0 = null;
        this.H0 = false;
        this.J0 = new x2.f();
        this.M0 = 0;
        this.N0 = 0;
        this.O0 = new c[4];
        this.P0 = new c[4];
        this.Q0 = 257;
        this.R0 = false;
        this.S0 = false;
        this.T0 = null;
        this.U0 = null;
        this.V0 = null;
        this.W0 = null;
        this.X0 = new HashSet();
        this.Y0 = new b.a();
    }

    public h(int i10, int i11) {
        super(i10, i11);
        this.D0 = new e3.b(this);
        this.E0 = new e3.f(this);
        this.G0 = null;
        this.H0 = false;
        this.J0 = new x2.f();
        this.M0 = 0;
        this.N0 = 0;
        this.O0 = new c[4];
        this.P0 = new c[4];
        this.Q0 = 257;
        this.R0 = false;
        this.S0 = false;
        this.T0 = null;
        this.U0 = null;
        this.V0 = null;
        this.W0 = null;
        this.X0 = new HashSet();
        this.Y0 = new b.a();
    }

    public h(String str, int i10, int i11) {
        super(i10, i11);
        this.D0 = new e3.b(this);
        this.E0 = new e3.f(this);
        this.G0 = null;
        this.H0 = false;
        this.J0 = new x2.f();
        this.M0 = 0;
        this.N0 = 0;
        this.O0 = new c[4];
        this.P0 = new c[4];
        this.Q0 = 257;
        this.R0 = false;
        this.S0 = false;
        this.T0 = null;
        this.U0 = null;
        this.V0 = null;
        this.W0 = null;
        this.X0 = new HashSet();
        this.Y0 = new b.a();
        setDebugName(str);
    }
}
