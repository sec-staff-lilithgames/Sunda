package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public final s4 f80233a;

    public h2(s4 s4Var) {
        this.f80233a = s4Var;
    }

    public static final void a(v4 v4Var, int i10) {
        while (v4Var.getParent() >= 0 && v4Var.getCurrentGroupEnd() <= i10) {
            v4Var.skipToGroupEnd();
            v4Var.endGroup();
        }
    }

    public final z.l1 extractNestedStates$runtime(d dVar, z.f1 f1Var) {
        s4 s4Var;
        Object[] objArr = f1Var.f96812a;
        int i10 = f1Var.f96813b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            s4Var = this.f80233a;
            int i13 = 1;
            if (i12 >= i10) {
                break;
            }
            if (s4Var.ownsAnchor(((i2) objArr[i12]).getAnchor$runtime())) {
                i12++;
            } else {
                z.t0 t0Var = new z.t0(i11, i13, null);
                Object[] objArr2 = f1Var.f96812a;
                int i14 = f1Var.f96813b;
                for (int i15 = 0; i15 < i14; i15++) {
                    Object obj = objArr2[i15];
                    if (s4Var.ownsAnchor(((i2) obj).getAnchor$runtime())) {
                        t0Var.add(obj);
                    }
                }
                f1Var = t0Var;
            }
        }
        z.f1 f1VarSortedBy = r0.a.sortedBy(f1Var, new g2(this, 0));
        if (f1VarSortedBy.isEmpty()) {
            return z.m1.emptyScatterMap();
        }
        z.u0 u0VarMutableScatterMapOf = z.m1.mutableScatterMapOf();
        v4 v4VarOpenWriter = s4Var.openWriter();
        try {
            Object[] objArr3 = f1VarSortedBy.f96812a;
            int i16 = f1VarSortedBy.f96813b;
            for (int i17 = 0; i17 < i16; i17++) {
                i2 i2Var = (i2) objArr3[i17];
                int iAnchorIndex = v4VarOpenWriter.anchorIndex(i2Var.getAnchor$runtime());
                int iParent = v4VarOpenWriter.parent(iAnchorIndex);
                a(v4VarOpenWriter, iParent);
                a(v4VarOpenWriter, iParent);
                while (v4VarOpenWriter.getCurrentGroup() != iParent && !v4VarOpenWriter.isGroupEnd()) {
                    if (iParent < d0.access$getNextGroup(v4VarOpenWriter)) {
                        v4VarOpenWriter.startGroup();
                    } else {
                        v4VarOpenWriter.skipGroup();
                    }
                }
                if (v4VarOpenWriter.getCurrentGroup() != iParent) {
                    d0.composeImmediateRuntimeError("Unexpected slot table structure");
                }
                v4VarOpenWriter.startGroup();
                v4VarOpenWriter.advanceBy(iAnchorIndex - v4VarOpenWriter.getCurrentGroup());
                u0VarMutableScatterMapOf.set(i2Var, d0.extractMovableContentAtCurrent(i2Var.getComposition$runtime(), i2Var, v4VarOpenWriter, dVar));
            }
            a(v4VarOpenWriter, Integer.MAX_VALUE);
            v4VarOpenWriter.close(true);
            return u0VarMutableScatterMapOf;
        } catch (Throwable th2) {
            v4VarOpenWriter.close(false);
            throw th2;
        }
    }

    public final s4 getSlotTable$runtime() {
        return this.f80233a;
    }
}
