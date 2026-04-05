package jc;

import java.io.Serializable;
import java.text.DateFormat;
import rc.e1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s0 extends lc.a0 implements Serializable {

    /* renamed from: x, reason: collision with root package name */
    public static final ic.f f69409x = new ic.f();

    /* renamed from: y, reason: collision with root package name */
    public static final int f69410y = lc.z.collectFeatureDefaults(t0.class);

    /* renamed from: p, reason: collision with root package name */
    public final zc.m f69411p;

    /* renamed from: q, reason: collision with root package name */
    public final ub.b0 f69412q;

    /* renamed from: r, reason: collision with root package name */
    public final lc.l f69413r;

    /* renamed from: s, reason: collision with root package name */
    public final int f69414s;

    /* renamed from: t, reason: collision with root package name */
    public final int f69415t;

    /* renamed from: u, reason: collision with root package name */
    public final int f69416u;

    /* renamed from: v, reason: collision with root package name */
    public final int f69417v;

    /* renamed from: w, reason: collision with root package name */
    public final int f69418w;

    public s0(lc.a aVar, wc.f fVar, e1 e1Var, dd.h0 h0Var, lc.j jVar, lc.q qVar) {
        super(aVar, fVar, e1Var, h0Var, jVar, qVar);
        this.f69414s = f69410y;
        this.f69411p = null;
        this.f69412q = f69409x;
        this.f69413r = null;
        this.f69415t = 0;
        this.f69416u = 0;
        this.f69417v = 0;
        this.f69418w = 0;
    }

    @Override // lc.a0
    public final lc.a0 a(lc.q qVar) {
        return new s0(this, qVar);
    }

    @Override // lc.a0
    public final lc.a0 b(lc.a aVar) {
        return this.f73176c == aVar ? this : new s0(this, aVar);
    }

    @Override // lc.a0
    public final lc.a0 c(long j10) {
        return new s0(this, j10, this.f69414s, this.f69415t, this.f69416u, this.f69417v, this.f69418w);
    }

    public ub.b0 constructDefaultPrettyPrinter() {
        ub.b0 b0Var = this.f69412q;
        return b0Var instanceof ic.h ? (ub.b0) ((ic.h) b0Var).createInstance() : b0Var;
    }

    public final s0 d(ub.f... fVarArr) {
        ub.n nVarMappedFeature;
        int i10 = this.f69415t;
        int i11 = this.f69416u;
        int i12 = this.f69417v;
        int i13 = this.f69418w;
        int i14 = i10;
        int i15 = i11;
        int i16 = i12;
        int i17 = i13;
        for (ub.f fVar : fVarArr) {
            int mask = fVar.getMask();
            i16 |= mask;
            i17 |= mask;
            if ((fVar instanceof ec.h) && (nVarMappedFeature = ((ec.h) fVar).mappedFeature()) != null) {
                int mask2 = nVarMappedFeature.getMask();
                i14 |= mask2;
                i15 |= mask2;
            }
        }
        return (i12 == i16 && i13 == i17 && i10 == i14 && i11 == i15) ? this : new s0(this, this.f73175b, this.f69414s, i14, i15, i16, i17);
    }

    public final s0 e(ub.f... fVarArr) {
        ub.n nVarMappedFeature;
        int i10 = this.f69415t;
        int i11 = this.f69416u;
        int i12 = this.f69417v;
        int i13 = this.f69418w;
        int i14 = i10;
        int i15 = i11;
        int i16 = i12;
        int i17 = i13;
        for (ub.f fVar : fVarArr) {
            int mask = fVar.getMask();
            i16 &= ~mask;
            i17 |= mask;
            if ((fVar instanceof ec.h) && (nVarMappedFeature = ((ec.h) fVar).mappedFeature()) != null) {
                int mask2 = nVarMappedFeature.getMask();
                i14 &= ~mask2;
                i15 |= mask2;
            }
        }
        return (i12 == i16 && i13 == i17 && i10 == i14 && i11 == i15) ? this : new s0(this, this.f73175b, this.f69414s, i14, i15, i16, i17);
    }

    @Override // lc.z
    public lc.l getConstructorDetector() {
        lc.l lVar = this.f69413r;
        return lVar == null ? lc.l.f73130f : lVar;
    }

    public ub.b0 getDefaultPrettyPrinter() {
        return this.f69412q;
    }

    public zc.m getFilterProvider() {
        return this.f69411p;
    }

    public final int getSerializationFeatures() {
        return this.f69414s;
    }

    @Deprecated
    public tb.c0 getSerializationInclusion() {
        tb.c0 valueInclusion = getDefaultPropertyInclusion().getValueInclusion();
        return valueInclusion == tb.c0.f86699h ? tb.c0.f86694b : valueInclusion;
    }

    public final boolean hasSerializationFeatures(int i10) {
        return (this.f69414s & i10) == i10;
    }

    public void initialize(ub.o oVar) {
        ub.b0 b0VarConstructDefaultPrettyPrinter;
        t0 t0Var = t0.INDENT_OUTPUT;
        int i10 = this.f69414s;
        if (t0Var.enabledIn(i10) && oVar.getPrettyPrinter() == null && (b0VarConstructDefaultPrettyPrinter = constructDefaultPrettyPrinter()) != null) {
            oVar.setPrettyPrinter(b0VarConstructDefaultPrettyPrinter);
        }
        boolean zEnabledIn = t0.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(i10);
        int i11 = this.f69416u;
        if (i11 != 0 || zEnabledIn) {
            int i12 = this.f69415t;
            if (zEnabledIn) {
                int mask = ub.n.WRITE_BIGDECIMAL_AS_PLAIN.getMask();
                i12 |= mask;
                i11 |= mask;
            }
            oVar.overrideStdFeatures(i12, i11);
        }
        int i13 = this.f69418w;
        if (i13 != 0) {
            oVar.overrideFormatFeatures(this.f69417v, i13);
        }
    }

    public d introspect(o oVar) {
        return getClassIntrospector().forSerialization(this, oVar, this);
    }

    public final boolean isEnabled(t0 t0Var) {
        return (t0Var.getMask() & this.f69414s) != 0;
    }

    @Override // lc.z
    public boolean useRootWrapping() {
        return this.f73079g != null ? !r0.isEmpty() : isEnabled(t0.WRAP_ROOT_VALUE);
    }

    public s0 withDefaultPrettyPrinter(ub.b0 b0Var) {
        return this.f69412q == b0Var ? this : new s0(this, b0Var);
    }

    public s0 withFeatures(t0... t0VarArr) {
        int i10 = this.f69414s;
        int mask = i10;
        for (t0 t0Var : t0VarArr) {
            mask |= t0Var.getMask();
        }
        if (mask == i10) {
            return this;
        }
        return new s0(this, this.f73175b, mask, this.f69415t, this.f69416u, this.f69417v, this.f69418w);
    }

    public s0 withFilters(zc.m mVar) {
        return mVar == this.f69411p ? this : new s0(this, mVar);
    }

    @Deprecated
    public s0 withPropertyInclusion(tb.d0 d0Var) {
        this.f73083k.setDefaultInclusion(d0Var);
        return this;
    }

    @Override // lc.a0
    public /* bridge */ /* synthetic */ lc.a0 withView(Class cls) {
        return withView((Class<?>) cls);
    }

    public s0 without(t0 t0Var) {
        int i10 = ~t0Var.getMask();
        int i11 = this.f69414s;
        int i12 = i11 & i10;
        if (i12 == i11) {
            return this;
        }
        return new s0(this, this.f73175b, i12, this.f69415t, this.f69416u, this.f69417v, this.f69418w);
    }

    public s0 withoutFeatures(t0... t0VarArr) {
        int i10 = this.f69414s;
        int i11 = i10;
        for (t0 t0Var : t0VarArr) {
            i11 &= ~t0Var.getMask();
        }
        if (i11 == i10) {
            return this;
        }
        return new s0(this, this.f73175b, i11, this.f69415t, this.f69416u, this.f69417v, this.f69418w);
    }

    public final boolean isEnabled(ub.n nVar, ub.k kVar) {
        if ((nVar.getMask() & this.f69416u) != 0) {
            return (nVar.getMask() & this.f69415t) != 0;
        }
        return kVar.isEnabled(nVar);
    }

    @Override // lc.a0
    public s0 withRootName(n0 n0Var) {
        n0 n0Var2 = this.f73079g;
        return (n0Var != null ? !n0Var.equals(n0Var2) : n0Var2 != null) ? new s0(this, n0Var) : this;
    }

    @Override // lc.a0
    public s0 withView(Class<?> cls) {
        return this.f73080h == cls ? this : new s0(this, cls);
    }

    public s0 without(t0 t0Var, t0... t0VarArr) {
        int i10 = ~t0Var.getMask();
        int i11 = this.f69414s;
        int i12 = i10 & i11;
        for (t0 t0Var2 : t0VarArr) {
            i12 &= ~t0Var2.getMask();
        }
        if (i12 == i11) {
            return this;
        }
        return new s0(this, this.f73175b, i12, this.f69415t, this.f69416u, this.f69417v, this.f69418w);
    }

    @Override // lc.a0
    public s0 with(wc.f fVar) {
        return fVar == this.f73078f ? this : new s0(this, fVar);
    }

    public s0 withFeatures(ub.n... nVarArr) {
        int i10 = this.f69415t;
        int i11 = this.f69416u;
        int i12 = i10;
        int i13 = i11;
        for (ub.n nVar : nVarArr) {
            int mask = nVar.getMask();
            i12 |= mask;
            i13 |= mask;
        }
        if (i10 == i12 && i11 == i13) {
            return this;
        }
        return new s0(this, this.f73175b, this.f69414s, i12, i13, this.f69417v, this.f69418w);
    }

    public s0 withoutFeatures(ub.n... nVarArr) {
        int i10 = this.f69415t;
        int i11 = this.f69416u;
        int i12 = i10;
        int i13 = i11;
        for (ub.n nVar : nVarArr) {
            int mask = nVar.getMask();
            i12 &= ~mask;
            i13 |= mask;
        }
        if (i10 == i12 && i11 == i13) {
            return this;
        }
        return new s0(this, this.f73175b, this.f69414s, i12, i13, this.f69417v, this.f69418w);
    }

    @Override // lc.a0
    public s0 with(lc.n nVar) {
        return nVar == this.f73081i ? this : new s0(this, nVar);
    }

    @Override // lc.z
    public final boolean isEnabled(lc.o oVar) {
        return this.f73084l.isEnabled(oVar);
    }

    @Override // lc.a0
    public s0 with(DateFormat dateFormat) {
        s0 s0Var = (s0) super.with(dateFormat);
        if (dateFormat == null) {
            return s0Var.with(t0.WRITE_DATES_AS_TIMESTAMPS);
        }
        return s0Var.without(t0.WRITE_DATES_AS_TIMESTAMPS);
    }

    public s0 withFeatures(ub.f... fVarArr) {
        if (fVarArr.length > 0 && (fVarArr[0] instanceof ec.h)) {
            return d(fVarArr);
        }
        int i10 = this.f69418w;
        int i11 = this.f69417v;
        int i12 = i10;
        int i13 = i11;
        for (ub.f fVar : fVarArr) {
            int mask = fVar.getMask();
            i13 |= mask;
            i12 |= mask;
        }
        if (i11 == i13 && i10 == i12) {
            return this;
        }
        return new s0(this, this.f73175b, this.f69414s, this.f69415t, this.f69416u, i13, i12);
    }

    public s0 without(ub.n nVar) {
        int i10 = ~nVar.getMask();
        int i11 = this.f69415t;
        int i12 = i11 & i10;
        int mask = nVar.getMask();
        int i13 = this.f69416u;
        int i14 = i13 | mask;
        if (i11 == i12 && i13 == i14) {
            return this;
        }
        return new s0(this, this.f73175b, this.f69414s, i12, i14, this.f69417v, this.f69418w);
    }

    public s0 withoutFeatures(ub.f... fVarArr) {
        if (fVarArr.length > 0 && (fVarArr[0] instanceof ec.h)) {
            return e(fVarArr);
        }
        int i10 = this.f69418w;
        int i11 = this.f69417v;
        int i12 = i10;
        int i13 = i11;
        for (ub.f fVar : fVarArr) {
            int mask = fVar.getMask();
            i13 &= ~mask;
            i12 |= mask;
        }
        if (i11 == i13 && i10 == i12) {
            return this;
        }
        return new s0(this, this.f73175b, this.f69414s, this.f69415t, this.f69416u, i13, i12);
    }

    public s0 with(t0 t0Var) {
        int mask = t0Var.getMask();
        int i10 = this.f69414s;
        int i11 = i10 | mask;
        if (i11 == i10) {
            return this;
        }
        return new s0(this, this.f73175b, i11, this.f69415t, this.f69416u, this.f69417v, this.f69418w);
    }

    @Deprecated
    public s0(lc.a aVar, wc.f fVar, e1 e1Var, dd.h0 h0Var, lc.j jVar) {
        this(aVar, fVar, e1Var, h0Var, jVar, lc.q.defaultFeatures());
    }

    public s0 without(ub.f fVar) {
        if (fVar instanceof ec.h) {
            return e(fVar);
        }
        int i10 = ~fVar.getMask();
        int i11 = this.f69417v;
        int i12 = i11 & i10;
        int mask = fVar.getMask();
        int i13 = this.f69418w;
        int i14 = i13 | mask;
        return (i11 == i12 && i13 == i14) ? this : new s0(this, this.f73175b, this.f69414s, this.f69415t, this.f69416u, i12, i14);
    }

    public s0 with(t0 t0Var, t0... t0VarArr) {
        int mask = t0Var.getMask();
        int i10 = this.f69414s;
        int mask2 = mask | i10;
        for (t0 t0Var2 : t0VarArr) {
            mask2 |= t0Var2.getMask();
        }
        if (mask2 == i10) {
            return this;
        }
        return new s0(this, this.f73175b, mask2, this.f69415t, this.f69416u, this.f69417v, this.f69418w);
    }

    public s0(s0 s0Var, wc.f fVar, e1 e1Var, dd.h0 h0Var, lc.j jVar) {
        super(s0Var, fVar, e1Var, h0Var, jVar);
        this.f69414s = s0Var.f69414s;
        this.f69411p = s0Var.f69411p;
        this.f69412q = s0Var.f69412q;
        this.f69413r = s0Var.f69413r;
        this.f69415t = s0Var.f69415t;
        this.f69416u = s0Var.f69416u;
        this.f69417v = s0Var.f69417v;
        this.f69418w = s0Var.f69418w;
    }

    public s0 with(ub.n nVar) {
        int mask = nVar.getMask();
        int i10 = this.f69415t;
        int i11 = i10 | mask;
        int mask2 = nVar.getMask();
        int i12 = this.f69416u;
        int i13 = i12 | mask2;
        if (i10 == i11 && i12 == i13) {
            return this;
        }
        return new s0(this, this.f73175b, this.f69414s, i11, i13, this.f69417v, this.f69418w);
    }

    public s0 with(ub.f fVar) {
        if (fVar instanceof ec.h) {
            return d(fVar);
        }
        int mask = fVar.getMask();
        int i10 = this.f69417v;
        int i11 = i10 | mask;
        int mask2 = fVar.getMask();
        int i12 = this.f69418w;
        int i13 = i12 | mask2;
        return (i10 == i11 && i12 == i13) ? this : new s0(this, this.f73175b, this.f69414s, this.f69415t, this.f69416u, i11, i13);
    }

    public s0(s0 s0Var, wc.f fVar) {
        super(s0Var, fVar);
        this.f69414s = s0Var.f69414s;
        this.f69411p = s0Var.f69411p;
        this.f69412q = s0Var.f69412q;
        this.f69413r = s0Var.f69413r;
        this.f69415t = s0Var.f69415t;
        this.f69416u = s0Var.f69416u;
        this.f69417v = s0Var.f69417v;
        this.f69418w = s0Var.f69418w;
    }

    public s0 with(lc.l lVar) {
        return this.f69413r == lVar ? this : new s0(this, lVar);
    }

    public s0(s0 s0Var, long j10, int i10, int i11, int i12, int i13, int i14) {
        super(s0Var, j10);
        this.f69414s = i10;
        this.f69411p = s0Var.f69411p;
        this.f69412q = s0Var.f69412q;
        this.f69413r = s0Var.f69413r;
        this.f69415t = i11;
        this.f69416u = i12;
        this.f69417v = i13;
        this.f69418w = i14;
    }

    public s0(s0 s0Var, lc.a aVar) {
        super(s0Var, aVar);
        this.f69414s = s0Var.f69414s;
        this.f69411p = s0Var.f69411p;
        this.f69412q = s0Var.f69412q;
        this.f69413r = s0Var.f69413r;
        this.f69415t = s0Var.f69415t;
        this.f69416u = s0Var.f69416u;
        this.f69417v = s0Var.f69417v;
        this.f69418w = s0Var.f69418w;
    }

    public s0(s0 s0Var, zc.m mVar) {
        super(s0Var);
        this.f69414s = s0Var.f69414s;
        this.f69411p = mVar;
        this.f69412q = s0Var.f69412q;
        this.f69413r = s0Var.f69413r;
        this.f69415t = s0Var.f69415t;
        this.f69416u = s0Var.f69416u;
        this.f69417v = s0Var.f69417v;
        this.f69418w = s0Var.f69418w;
    }

    public s0(s0 s0Var, Class cls) {
        super(s0Var, cls);
        this.f69414s = s0Var.f69414s;
        this.f69411p = s0Var.f69411p;
        this.f69412q = s0Var.f69412q;
        this.f69413r = s0Var.f69413r;
        this.f69415t = s0Var.f69415t;
        this.f69416u = s0Var.f69416u;
        this.f69417v = s0Var.f69417v;
        this.f69418w = s0Var.f69418w;
    }

    public s0(s0 s0Var, n0 n0Var) {
        super(s0Var, n0Var);
        this.f69414s = s0Var.f69414s;
        this.f69411p = s0Var.f69411p;
        this.f69412q = s0Var.f69412q;
        this.f69413r = s0Var.f69413r;
        this.f69415t = s0Var.f69415t;
        this.f69416u = s0Var.f69416u;
        this.f69417v = s0Var.f69417v;
        this.f69418w = s0Var.f69418w;
    }

    public s0(s0 s0Var, lc.n nVar) {
        super(s0Var, nVar);
        this.f69414s = s0Var.f69414s;
        this.f69411p = s0Var.f69411p;
        this.f69412q = s0Var.f69412q;
        this.f69413r = s0Var.f69413r;
        this.f69415t = s0Var.f69415t;
        this.f69416u = s0Var.f69416u;
        this.f69417v = s0Var.f69417v;
        this.f69418w = s0Var.f69418w;
    }

    public s0(s0 s0Var, e1 e1Var) {
        super(s0Var, e1Var);
        this.f69414s = s0Var.f69414s;
        this.f69411p = s0Var.f69411p;
        this.f69412q = s0Var.f69412q;
        this.f69413r = s0Var.f69413r;
        this.f69415t = s0Var.f69415t;
        this.f69416u = s0Var.f69416u;
        this.f69417v = s0Var.f69417v;
        this.f69418w = s0Var.f69418w;
    }

    public s0(s0 s0Var, ub.b0 b0Var) {
        super(s0Var);
        this.f69414s = s0Var.f69414s;
        this.f69411p = s0Var.f69411p;
        this.f69412q = b0Var;
        this.f69413r = s0Var.f69413r;
        this.f69415t = s0Var.f69415t;
        this.f69416u = s0Var.f69416u;
        this.f69417v = s0Var.f69417v;
        this.f69418w = s0Var.f69418w;
    }

    public s0(s0 s0Var, lc.q qVar) {
        super(s0Var, qVar);
        this.f69414s = s0Var.f69414s;
        this.f69411p = s0Var.f69411p;
        this.f69412q = s0Var.f69412q;
        this.f69413r = s0Var.f69413r;
        this.f69415t = s0Var.f69415t;
        this.f69416u = s0Var.f69416u;
        this.f69417v = s0Var.f69417v;
        this.f69418w = s0Var.f69418w;
    }

    public s0(s0 s0Var, lc.l lVar) {
        super(s0Var);
        this.f69414s = s0Var.f69414s;
        this.f69411p = s0Var.f69411p;
        this.f69412q = s0Var.f69412q;
        this.f69413r = lVar;
        this.f69415t = s0Var.f69415t;
        this.f69416u = s0Var.f69416u;
        this.f69417v = s0Var.f69417v;
        this.f69418w = s0Var.f69418w;
    }
}
