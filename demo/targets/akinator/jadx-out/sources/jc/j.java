package jc;

import java.io.Serializable;
import java.util.Collection;
import rc.e1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j extends lc.a0 implements Serializable {

    /* renamed from: y, reason: collision with root package name */
    public static final int f69311y = lc.z.collectFeatureDefaults(l.class);

    /* renamed from: p, reason: collision with root package name */
    public final dd.t f69312p;

    /* renamed from: q, reason: collision with root package name */
    public final yc.o f69313q;

    /* renamed from: r, reason: collision with root package name */
    public final lc.e f69314r;

    /* renamed from: s, reason: collision with root package name */
    public final lc.l f69315s;

    /* renamed from: t, reason: collision with root package name */
    public final int f69316t;

    /* renamed from: u, reason: collision with root package name */
    public final int f69317u;

    /* renamed from: v, reason: collision with root package name */
    public final int f69318v;

    /* renamed from: w, reason: collision with root package name */
    public final int f69319w;

    /* renamed from: x, reason: collision with root package name */
    public final int f69320x;

    public j(lc.a aVar, wc.f fVar, e1 e1Var, dd.h0 h0Var, lc.j jVar, lc.e eVar, lc.q qVar) {
        super(aVar, fVar, e1Var, h0Var, jVar, qVar);
        this.f69316t = f69311y;
        this.f69312p = null;
        this.f69313q = yc.o.f94329c;
        this.f69315s = null;
        this.f69314r = eVar;
        this.f69317u = 0;
        this.f69318v = 0;
        this.f69319w = 0;
        this.f69320x = 0;
    }

    @Override // lc.a0
    public final lc.a0 a(lc.q qVar) {
        return new j(this, qVar);
    }

    @Override // lc.a0
    public final lc.a0 b(lc.a aVar) {
        return this.f73176c == aVar ? this : new j(this, aVar);
    }

    @Override // lc.a0
    public final lc.a0 c(long j10) {
        return new j(this, j10, this.f69316t, this.f69317u, this.f69318v, this.f69319w, this.f69320x);
    }

    public final j d(ub.f... fVarArr) {
        ub.r rVarMappedFeature;
        int i10 = this.f69317u;
        int i11 = this.f69318v;
        int i12 = this.f69319w;
        int i13 = this.f69320x;
        int i14 = i10;
        int i15 = i11;
        int i16 = i12;
        int i17 = i13;
        for (ub.f fVar : fVarArr) {
            int mask = fVar.getMask();
            i16 |= mask;
            i17 |= mask;
            if ((fVar instanceof ec.f) && (rVarMappedFeature = ((ec.f) fVar).mappedFeature()) != null) {
                int mask2 = rVarMappedFeature.getMask();
                i14 |= mask2;
                i15 |= mask2;
            }
        }
        return (i12 == i16 && i13 == i17 && i10 == i14 && i11 == i15) ? this : new j(this, this.f73175b, this.f69316t, i14, i15, i16, i17);
    }

    public final j e(ub.f... fVarArr) {
        ub.r rVarMappedFeature;
        int i10 = this.f69317u;
        int i11 = this.f69318v;
        int i12 = this.f69319w;
        int i13 = this.f69320x;
        int i14 = i10;
        int i15 = i11;
        int i16 = i12;
        int i17 = i13;
        for (ub.f fVar : fVarArr) {
            int mask = fVar.getMask();
            i16 &= ~mask;
            i17 |= mask;
            if ((fVar instanceof ec.f) && (rVarMappedFeature = ((ec.f) fVar).mappedFeature()) != null) {
                int mask2 = rVarMappedFeature.getMask();
                i14 &= ~mask2;
                i15 |= mask2;
            }
        }
        return (i12 == i16 && i13 == i17 && i10 == i14 && i11 == i15) ? this : new j(this, this.f73175b, this.f69316t, i14, i15, i16, i17);
    }

    public lc.c findCoercionAction(cd.h hVar, Class<?> cls, lc.f fVar) {
        return this.f69314r.findCoercion(this, hVar, cls, fVar);
    }

    public lc.c findCoercionFromBlankString(cd.h hVar, Class<?> cls, lc.c cVar) {
        return this.f69314r.findCoercionFromBlankString(this, hVar, cls, cVar);
    }

    public wc.g findTypeDeserializer(o oVar) throws r {
        Collection<wc.c> collectionCollectAndResolveSubtypesByTypeId;
        rc.e classInfo = introspectClassAnnotations(oVar.getRawClass()).getClassInfo();
        wc.i iVarFindTypeResolver = getAnnotationIntrospector().findTypeResolver(this, classInfo, oVar);
        if (iVarFindTypeResolver == null) {
            iVarFindTypeResolver = getDefaultTyper(oVar);
            collectionCollectAndResolveSubtypesByTypeId = null;
            if (iVarFindTypeResolver == null) {
                return null;
            }
        } else {
            collectionCollectAndResolveSubtypesByTypeId = getSubtypeResolver().collectAndResolveSubtypesByTypeId(this, classInfo);
        }
        return iVarFindTypeResolver.buildTypeDeserializer(this, oVar, collectionCollectAndResolveSubtypesByTypeId);
    }

    @Override // lc.z
    public lc.l getConstructorDetector() {
        lc.l lVar = this.f69315s;
        return lVar == null ? lc.l.f73130f : lVar;
    }

    public final int getDeserializationFeatures() {
        return this.f69316t;
    }

    public final yc.o getNodeFactory() {
        return this.f69313q;
    }

    public dd.t getProblemHandlers() {
        return this.f69312p;
    }

    public final boolean hasDeserializationFeatures(int i10) {
        return (this.f69316t & i10) == i10;
    }

    public final boolean hasSomeOfFeatures(int i10) {
        return (i10 & this.f69316t) != 0;
    }

    public ub.u initialize(ub.u uVar) {
        int i10 = this.f69318v;
        if (i10 != 0) {
            uVar.overrideStdFeatures(this.f69317u, i10);
        }
        int i11 = this.f69320x;
        if (i11 != 0) {
            uVar.overrideFormatFeatures(this.f69319w, i11);
        }
        return uVar;
    }

    public d introspect(o oVar) {
        return getClassIntrospector().forDeserialization(this, oVar, this);
    }

    public d introspectForBuilder(o oVar, d dVar) {
        return getClassIntrospector().forDeserializationWithBuilder(this, oVar, this, dVar);
    }

    public d introspectForCreation(o oVar) {
        return getClassIntrospector().forCreation(this, oVar, this);
    }

    public final boolean isEnabled(l lVar) {
        return (lVar.getMask() & this.f69316t) != 0;
    }

    public final boolean requiresFullValue() {
        return l.FAIL_ON_TRAILING_TOKENS.enabledIn(this.f69316t);
    }

    @Override // lc.z
    public boolean useRootWrapping() {
        return this.f73079g != null ? !r0.isEmpty() : isEnabled(l.UNWRAP_ROOT_VALUE);
    }

    public j withFeatures(l... lVarArr) {
        int i10 = this.f69316t;
        int mask = i10;
        for (l lVar : lVarArr) {
            mask |= lVar.getMask();
        }
        if (mask == i10) {
            return this;
        }
        return new j(this, this.f73175b, mask, this.f69317u, this.f69318v, this.f69319w, this.f69320x);
    }

    public j withHandler(mc.q qVar) {
        dd.t tVar = this.f69312p;
        return dd.t.contains(tVar, qVar) ? this : new j(this, new dd.t(qVar, tVar));
    }

    public j withNoProblemHandlers() {
        return this.f69312p == null ? this : new j(this, (dd.t) null);
    }

    @Override // lc.a0
    public /* bridge */ /* synthetic */ lc.a0 withView(Class cls) {
        return withView((Class<?>) cls);
    }

    public j without(l lVar) {
        int i10 = ~lVar.getMask();
        int i11 = this.f69316t;
        int i12 = i11 & i10;
        if (i12 == i11) {
            return this;
        }
        return new j(this, this.f73175b, i12, this.f69317u, this.f69318v, this.f69319w, this.f69320x);
    }

    public j withoutFeatures(l... lVarArr) {
        int i10 = this.f69316t;
        int i11 = i10;
        for (l lVar : lVarArr) {
            i11 &= ~lVar.getMask();
        }
        if (i11 == i10) {
            return this;
        }
        return new j(this, this.f73175b, i11, this.f69317u, this.f69318v, this.f69319w, this.f69320x);
    }

    public final boolean isEnabled(ub.r rVar, ub.k kVar) {
        if ((rVar.getMask() & this.f69318v) != 0) {
            return (rVar.getMask() & this.f69317u) != 0;
        }
        return kVar.isEnabled(rVar);
    }

    @Override // lc.a0
    public j withRootName(n0 n0Var) {
        n0 n0Var2 = this.f73079g;
        return (n0Var != null ? !n0Var.equals(n0Var2) : n0Var2 != null) ? new j(this, n0Var) : this;
    }

    @Override // lc.a0
    public j withView(Class<?> cls) {
        return this.f73080h == cls ? this : new j(this, cls);
    }

    @Override // lc.a0
    public j with(wc.f fVar) {
        return this.f73078f == fVar ? this : new j(this, fVar);
    }

    public j without(l lVar, l... lVarArr) {
        int i10 = ~lVar.getMask();
        int i11 = this.f69316t;
        int i12 = i10 & i11;
        for (l lVar2 : lVarArr) {
            i12 &= ~lVar2.getMask();
        }
        if (i12 == i11) {
            return this;
        }
        return new j(this, this.f73175b, i12, this.f69317u, this.f69318v, this.f69319w, this.f69320x);
    }

    @Override // lc.a0
    public j with(lc.n nVar) {
        return nVar == this.f73081i ? this : new j(this, nVar);
    }

    public j withFeatures(ub.r... rVarArr) {
        int i10 = this.f69317u;
        int i11 = this.f69318v;
        int i12 = i10;
        int i13 = i11;
        for (ub.r rVar : rVarArr) {
            int mask = rVar.getMask();
            i12 |= mask;
            i13 |= mask;
        }
        if (i10 == i12 && i11 == i13) {
            return this;
        }
        return new j(this, this.f73175b, this.f69316t, i12, i13, this.f69319w, this.f69320x);
    }

    public j withoutFeatures(ub.r... rVarArr) {
        int i10 = this.f69317u;
        int i11 = this.f69318v;
        int i12 = i10;
        int i13 = i11;
        for (ub.r rVar : rVarArr) {
            int mask = rVar.getMask();
            i12 &= ~mask;
            i13 |= mask;
        }
        if (i10 == i12 && i11 == i13) {
            return this;
        }
        return new j(this, this.f73175b, this.f69316t, i12, i13, this.f69319w, this.f69320x);
    }

    public ub.u initialize(ub.u uVar, ub.g gVar) {
        int i10 = this.f69318v;
        if (i10 != 0) {
            uVar.overrideStdFeatures(this.f69317u, i10);
        }
        int i11 = this.f69320x;
        if (i11 != 0) {
            uVar.overrideFormatFeatures(this.f69319w, i11);
        }
        if (gVar != null) {
            uVar.setSchema(gVar);
        }
        return uVar;
    }

    public j with(l lVar) {
        int mask = lVar.getMask();
        int i10 = this.f69316t;
        int i11 = i10 | mask;
        if (i11 == i10) {
            return this;
        }
        return new j(this, this.f73175b, i11, this.f69317u, this.f69318v, this.f69319w, this.f69320x);
    }

    @Override // lc.z
    public final boolean isEnabled(lc.o oVar) {
        return this.f73084l.isEnabled(oVar);
    }

    public j with(l lVar, l... lVarArr) {
        int mask = lVar.getMask();
        int i10 = this.f69316t;
        int mask2 = mask | i10;
        for (l lVar2 : lVarArr) {
            mask2 |= lVar2.getMask();
        }
        if (mask2 == i10) {
            return this;
        }
        return new j(this, this.f73175b, mask2, this.f69317u, this.f69318v, this.f69319w, this.f69320x);
    }

    public j withFeatures(ub.f... fVarArr) {
        if (fVarArr.length > 0 && (fVarArr[0] instanceof ec.f)) {
            return d(fVarArr);
        }
        int i10 = this.f69320x;
        int i11 = this.f69319w;
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
        return new j(this, this.f73175b, this.f69316t, this.f69317u, this.f69318v, i13, i12);
    }

    public j without(ub.r rVar) {
        int i10 = ~rVar.getMask();
        int i11 = this.f69317u;
        int i12 = i11 & i10;
        int mask = rVar.getMask();
        int i13 = this.f69318v;
        int i14 = i13 | mask;
        if (i11 == i12 && i13 == i14) {
            return this;
        }
        return new j(this, this.f73175b, this.f69316t, i12, i14, this.f69319w, this.f69320x);
    }

    public j withoutFeatures(ub.f... fVarArr) {
        if (fVarArr.length > 0 && (fVarArr[0] instanceof ec.f)) {
            return e(fVarArr);
        }
        int i10 = this.f69320x;
        int i11 = this.f69319w;
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
        return new j(this, this.f73175b, this.f69316t, this.f69317u, this.f69318v, i13, i12);
    }

    public j without(ub.f fVar) {
        if (fVar instanceof ec.f) {
            return e(fVar);
        }
        int i10 = ~fVar.getMask();
        int i11 = this.f69319w;
        int i12 = i11 & i10;
        int mask = fVar.getMask();
        int i13 = this.f69320x;
        int i14 = i13 | mask;
        return (i11 == i12 && i13 == i14) ? this : new j(this, this.f73175b, this.f69316t, this.f69317u, this.f69318v, i12, i14);
    }

    public j(j jVar, wc.f fVar, e1 e1Var, dd.h0 h0Var, lc.j jVar2, lc.e eVar) {
        super(jVar, fVar, e1Var, h0Var, jVar2);
        this.f69316t = jVar.f69316t;
        this.f69312p = jVar.f69312p;
        this.f69313q = jVar.f69313q;
        this.f69315s = jVar.f69315s;
        this.f69314r = eVar;
        this.f69317u = jVar.f69317u;
        this.f69318v = jVar.f69318v;
        this.f69319w = jVar.f69319w;
        this.f69320x = jVar.f69320x;
    }

    public j with(ub.r rVar) {
        int mask = rVar.getMask();
        int i10 = this.f69317u;
        int i11 = i10 | mask;
        int mask2 = rVar.getMask();
        int i12 = this.f69318v;
        int i13 = i12 | mask2;
        if (i10 == i11 && i12 == i13) {
            return this;
        }
        return new j(this, this.f73175b, this.f69316t, i11, i13, this.f69319w, this.f69320x);
    }

    public j with(ub.f fVar) {
        if (fVar instanceof ec.f) {
            return d(fVar);
        }
        int mask = fVar.getMask();
        int i10 = this.f69319w;
        int i11 = i10 | mask;
        int mask2 = fVar.getMask();
        int i12 = this.f69320x;
        int i13 = i12 | mask2;
        return (i10 == i11 && i12 == i13) ? this : new j(this, this.f73175b, this.f69316t, this.f69317u, this.f69318v, i11, i13);
    }

    public j with(yc.o oVar) {
        return this.f69313q == oVar ? this : new j(this, oVar);
    }

    public j(j jVar, long j10, int i10, int i11, int i12, int i13, int i14) {
        super(jVar, j10);
        this.f69316t = i10;
        this.f69312p = jVar.f69312p;
        this.f69313q = jVar.f69313q;
        this.f69314r = jVar.f69314r;
        this.f69315s = jVar.f69315s;
        this.f69317u = i11;
        this.f69318v = i12;
        this.f69319w = i13;
        this.f69320x = i14;
    }

    public j with(lc.l lVar) {
        return this.f69315s == lVar ? this : new j(this, lVar);
    }

    public j(j jVar, wc.f fVar) {
        super(jVar, fVar);
        this.f69316t = jVar.f69316t;
        this.f69312p = jVar.f69312p;
        this.f69313q = jVar.f69313q;
        this.f69314r = jVar.f69314r;
        this.f69315s = jVar.f69315s;
        this.f69317u = jVar.f69317u;
        this.f69318v = jVar.f69318v;
        this.f69319w = jVar.f69319w;
        this.f69320x = jVar.f69320x;
    }

    public j(j jVar, lc.a aVar) {
        super(jVar, aVar);
        this.f69316t = jVar.f69316t;
        this.f69312p = jVar.f69312p;
        this.f69313q = jVar.f69313q;
        this.f69314r = jVar.f69314r;
        this.f69315s = jVar.f69315s;
        this.f69317u = jVar.f69317u;
        this.f69318v = jVar.f69318v;
        this.f69319w = jVar.f69319w;
        this.f69320x = jVar.f69320x;
    }

    public j(j jVar, yc.o oVar) {
        super(jVar);
        this.f69316t = jVar.f69316t;
        this.f69312p = jVar.f69312p;
        this.f69313q = oVar;
        this.f69314r = jVar.f69314r;
        this.f69315s = jVar.f69315s;
        this.f69317u = jVar.f69317u;
        this.f69318v = jVar.f69318v;
        this.f69319w = jVar.f69319w;
        this.f69320x = jVar.f69320x;
    }

    public j(j jVar, lc.l lVar) {
        super(jVar);
        this.f69316t = jVar.f69316t;
        this.f69312p = jVar.f69312p;
        this.f69313q = jVar.f69313q;
        this.f69314r = jVar.f69314r;
        this.f69315s = lVar;
        this.f69317u = jVar.f69317u;
        this.f69318v = jVar.f69318v;
        this.f69319w = jVar.f69319w;
        this.f69320x = jVar.f69320x;
    }

    public j(j jVar, dd.t tVar) {
        super(jVar);
        this.f69316t = jVar.f69316t;
        this.f69312p = tVar;
        this.f69313q = jVar.f69313q;
        this.f69314r = jVar.f69314r;
        this.f69315s = jVar.f69315s;
        this.f69317u = jVar.f69317u;
        this.f69318v = jVar.f69318v;
        this.f69319w = jVar.f69319w;
        this.f69320x = jVar.f69320x;
    }

    public j(j jVar, n0 n0Var) {
        super(jVar, n0Var);
        this.f69316t = jVar.f69316t;
        this.f69312p = jVar.f69312p;
        this.f69313q = jVar.f69313q;
        this.f69314r = jVar.f69314r;
        this.f69315s = jVar.f69315s;
        this.f69317u = jVar.f69317u;
        this.f69318v = jVar.f69318v;
        this.f69319w = jVar.f69319w;
        this.f69320x = jVar.f69320x;
    }

    public j(j jVar, Class cls) {
        super(jVar, cls);
        this.f69316t = jVar.f69316t;
        this.f69312p = jVar.f69312p;
        this.f69313q = jVar.f69313q;
        this.f69314r = jVar.f69314r;
        this.f69315s = jVar.f69315s;
        this.f69317u = jVar.f69317u;
        this.f69318v = jVar.f69318v;
        this.f69319w = jVar.f69319w;
        this.f69320x = jVar.f69320x;
    }

    public j(j jVar, lc.n nVar) {
        super(jVar, nVar);
        this.f69316t = jVar.f69316t;
        this.f69312p = jVar.f69312p;
        this.f69313q = jVar.f69313q;
        this.f69314r = jVar.f69314r;
        this.f69315s = jVar.f69315s;
        this.f69317u = jVar.f69317u;
        this.f69318v = jVar.f69318v;
        this.f69319w = jVar.f69319w;
        this.f69320x = jVar.f69320x;
    }

    public j(j jVar, e1 e1Var) {
        super(jVar, e1Var);
        this.f69316t = jVar.f69316t;
        this.f69312p = jVar.f69312p;
        this.f69313q = jVar.f69313q;
        this.f69314r = jVar.f69314r;
        this.f69315s = jVar.f69315s;
        this.f69317u = jVar.f69317u;
        this.f69318v = jVar.f69318v;
        this.f69319w = jVar.f69319w;
        this.f69320x = jVar.f69320x;
    }

    public j(j jVar, lc.q qVar) {
        super(jVar, qVar);
        this.f69316t = jVar.f69316t;
        this.f69312p = jVar.f69312p;
        this.f69313q = jVar.f69313q;
        this.f69314r = jVar.f69314r;
        this.f69315s = jVar.f69315s;
        this.f69317u = jVar.f69317u;
        this.f69318v = jVar.f69318v;
        this.f69319w = jVar.f69319w;
        this.f69320x = jVar.f69320x;
    }
}
