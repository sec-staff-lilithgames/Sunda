package ub;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class l0 {

    /* renamed from: k, reason: collision with root package name */
    public static final int f88279k = j.collectDefaults();

    /* renamed from: l, reason: collision with root package name */
    public static final int f88280l = r.collectDefaults();

    /* renamed from: m, reason: collision with root package name */
    public static final int f88281m = n.collectDefaults();

    /* renamed from: a, reason: collision with root package name */
    public int f88282a;

    /* renamed from: b, reason: collision with root package name */
    public int f88283b;

    /* renamed from: c, reason: collision with root package name */
    public int f88284c;

    /* renamed from: d, reason: collision with root package name */
    public ic.f0 f88285d = ic.u.defaultPool();

    /* renamed from: e, reason: collision with root package name */
    public cc.i f88286e = null;

    /* renamed from: f, reason: collision with root package name */
    public cc.o f88287f = null;

    /* renamed from: g, reason: collision with root package name */
    public f0 f88288g = f0.defaults();

    /* renamed from: h, reason: collision with root package name */
    public j0 f88289h = j0.defaults();

    /* renamed from: i, reason: collision with root package name */
    public e f88290i = e.defaults();

    /* renamed from: j, reason: collision with root package name */
    public List f88291j = null;

    public l0(int i10, int i11, int i12) {
        this.f88282a = i10;
        this.f88283b = i11;
        this.f88284c = i12;
    }

    public static void a(Enum r32) {
        throw new IllegalArgumentException("Feature " + r32.getClass().getName() + "#" + r32.toString() + " not supported for non-JSON backend");
    }

    public l0 addDecorator(ic.m mVar) {
        if (this.f88291j == null) {
            this.f88291j = new ArrayList();
        }
        this.f88291j.add(mVar);
        return this;
    }

    public abstract k build();

    public l0 configure(j jVar, boolean z10) {
        return z10 ? enable(jVar) : disable(jVar);
    }

    public l0 disable(j jVar) {
        this.f88282a = (~jVar.getMask()) & this.f88282a;
        return this;
    }

    public l0 enable(j jVar) {
        this.f88282a = jVar.getMask() | this.f88282a;
        return this;
    }

    public l0 errorReportConfiguration(e eVar) {
        Objects.requireNonNull(eVar);
        this.f88290i = eVar;
        return this;
    }

    public int factoryFeaturesMask() {
        return this.f88282a;
    }

    public cc.i inputDecorator() {
        return this.f88286e;
    }

    public cc.o outputDecorator() {
        return this.f88287f;
    }

    public ic.f0 recyclerPool() {
        return this.f88285d;
    }

    public l0 streamReadConstraints(f0 f0Var) {
        Objects.requireNonNull(f0Var);
        this.f88288g = f0Var;
        return this;
    }

    public int streamReadFeatures() {
        return this.f88283b;
    }

    public l0 streamWriteConstraints(j0 j0Var) {
        Objects.requireNonNull(j0Var);
        this.f88289h = j0Var;
        return this;
    }

    public int streamWriteFeatures() {
        return this.f88284c;
    }

    public l0 configure(g0 g0Var, boolean z10) {
        return z10 ? enable(g0Var) : disable(g0Var);
    }

    public l0 disable(g0 g0Var) {
        this.f88283b = (~g0Var.mappedFeature().getMask()) & this.f88283b;
        return this;
    }

    public l0 enable(g0 g0Var) {
        this.f88283b = g0Var.mappedFeature().getMask() | this.f88283b;
        return this;
    }

    public l0 inputDecorator(cc.i iVar) {
        this.f88286e = iVar;
        return this;
    }

    public l0 outputDecorator(cc.o oVar) {
        this.f88287f = oVar;
        return this;
    }

    public l0 recyclerPool(ic.f0 f0Var) {
        Objects.requireNonNull(f0Var);
        this.f88285d = f0Var;
        return this;
    }

    public l0 configure(k0 k0Var, boolean z10) {
        return z10 ? enable(k0Var) : disable(k0Var);
    }

    public l0 disable(g0 g0Var, g0... g0VarArr) {
        this.f88283b = (~g0Var.mappedFeature().getMask()) & this.f88283b;
        for (g0 g0Var2 : g0VarArr) {
            this.f88283b = (~g0Var2.mappedFeature().getMask()) & this.f88283b;
        }
        return this;
    }

    public l0 enable(g0 g0Var, g0... g0VarArr) {
        this.f88283b = g0Var.mappedFeature().getMask() | this.f88283b;
        for (g0 g0Var2 : g0VarArr) {
            this.f88283b = g0Var2.mappedFeature().getMask() | this.f88283b;
        }
        return this;
    }

    public l0 configure(ec.f fVar, boolean z10) {
        a(fVar);
        throw null;
    }

    public l0 configure(ec.h hVar, boolean z10) {
        a(hVar);
        throw null;
    }

    public l0 disable(k0 k0Var) {
        this.f88284c = (~k0Var.mappedFeature().getMask()) & this.f88284c;
        return this;
    }

    public l0 enable(k0 k0Var) {
        this.f88284c = k0Var.mappedFeature().getMask() | this.f88284c;
        return this;
    }

    public l0 disable(k0 k0Var, k0... k0VarArr) {
        this.f88284c = (~k0Var.mappedFeature().getMask()) & this.f88284c;
        for (k0 k0Var2 : k0VarArr) {
            this.f88284c = (~k0Var2.mappedFeature().getMask()) & this.f88284c;
        }
        return this;
    }

    public l0 enable(k0 k0Var, k0... k0VarArr) {
        this.f88284c = k0Var.mappedFeature().getMask() | this.f88284c;
        for (k0 k0Var2 : k0VarArr) {
            this.f88284c = k0Var2.mappedFeature().getMask() | this.f88284c;
        }
        return this;
    }

    public l0 disable(ec.f fVar) {
        a(fVar);
        throw null;
    }

    public l0 enable(ec.f fVar) {
        a(fVar);
        throw null;
    }

    public l0 disable(ec.f fVar, ec.f... fVarArr) {
        a(fVar);
        throw null;
    }

    public l0 enable(ec.f fVar, ec.f... fVarArr) {
        a(fVar);
        throw null;
    }

    public l0 disable(ec.h hVar) {
        a(hVar);
        throw null;
    }

    public l0 enable(ec.h hVar) {
        a(hVar);
        throw null;
    }

    public l0 disable(ec.h hVar, ec.h... hVarArr) {
        a(hVar);
        throw null;
    }

    public l0 enable(ec.h hVar, ec.h... hVarArr) {
        a(hVar);
        throw null;
    }
}
