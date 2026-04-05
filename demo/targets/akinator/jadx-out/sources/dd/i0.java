package dd;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i0 extends rc.d0 {

    /* renamed from: c, reason: collision with root package name */
    public final jc.c f52021c;

    /* renamed from: e, reason: collision with root package name */
    public final rc.l f52022e;

    /* renamed from: f, reason: collision with root package name */
    public final jc.m0 f52023f;

    /* renamed from: g, reason: collision with root package name */
    public final jc.n0 f52024g;

    /* renamed from: h, reason: collision with root package name */
    public final tb.d0 f52025h;

    public i0(jc.c cVar, rc.l lVar, jc.n0 n0Var, jc.m0 m0Var, tb.d0 d0Var) {
        this.f52021c = cVar;
        this.f52022e = lVar;
        this.f52024g = n0Var;
        this.f52023f = m0Var == null ? jc.m0.f69372k : m0Var;
        this.f52025h = d0Var;
    }

    public static i0 construct(lc.z zVar, rc.l lVar) {
        return new i0(zVar.getAnnotationIntrospector(), lVar, jc.n0.construct(lVar.getName()), null, rc.d0.f84151b);
    }

    @Override // rc.d0
    public List<jc.n0> findAliases() {
        List<jc.n0> listFindPropertyAliases;
        rc.l primaryMember = getPrimaryMember();
        return (primaryMember == null || (listFindPropertyAliases = this.f52021c.findPropertyAliases(primaryMember)) == null) ? Collections.EMPTY_LIST : listFindPropertyAliases;
    }

    @Override // rc.d0
    public tb.d0 findInclusion() {
        return this.f52025h;
    }

    @Override // rc.d0
    public rc.q getConstructorParameter() {
        rc.l lVar = this.f52022e;
        if (lVar instanceof rc.q) {
            return (rc.q) lVar;
        }
        return null;
    }

    @Override // rc.d0
    public Iterator<rc.q> getConstructorParameters() {
        rc.q constructorParameter = getConstructorParameter();
        return constructorParameter == null ? i.emptyIterator() : Collections.singleton(constructorParameter).iterator();
    }

    @Override // rc.d0
    public rc.i getField() {
        rc.l lVar = this.f52022e;
        if (lVar instanceof rc.i) {
            return (rc.i) lVar;
        }
        return null;
    }

    @Override // rc.d0
    public jc.n0 getFullName() {
        return this.f52024g;
    }

    @Override // rc.d0
    public rc.m getGetter() {
        rc.l lVar = this.f52022e;
        if ((lVar instanceof rc.m) && ((rc.m) lVar).getParameterCount() == 0) {
            return (rc.m) lVar;
        }
        return null;
    }

    @Override // rc.d0
    public String getInternalName() {
        return getName();
    }

    @Override // rc.d0
    public jc.m0 getMetadata() {
        return this.f52023f;
    }

    @Override // rc.d0, dd.b0
    public String getName() {
        return this.f52024g.getSimpleName();
    }

    @Override // rc.d0
    public rc.l getPrimaryMember() {
        return this.f52022e;
    }

    @Override // rc.d0
    public jc.o getPrimaryType() {
        rc.l lVar = this.f52022e;
        return lVar == null ? cd.s.unknownType() : lVar.getType();
    }

    @Override // rc.d0
    public Class<?> getRawPrimaryType() {
        rc.l lVar = this.f52022e;
        return lVar == null ? Object.class : lVar.getRawType();
    }

    @Override // rc.d0
    public rc.m getSetter() {
        rc.l lVar = this.f52022e;
        if ((lVar instanceof rc.m) && ((rc.m) lVar).getParameterCount() == 1) {
            return (rc.m) lVar;
        }
        return null;
    }

    @Override // rc.d0
    public jc.n0 getWrapperName() {
        rc.l lVar;
        jc.c cVar = this.f52021c;
        if (cVar == null || (lVar = this.f52022e) == null) {
            return null;
        }
        return cVar.findWrapperName(lVar);
    }

    @Override // rc.d0
    public boolean hasConstructorParameter() {
        return this.f52022e instanceof rc.q;
    }

    @Override // rc.d0
    public boolean hasField() {
        return this.f52022e instanceof rc.i;
    }

    @Override // rc.d0
    public boolean hasGetter() {
        return getGetter() != null;
    }

    @Override // rc.d0
    public boolean hasName(jc.n0 n0Var) {
        return this.f52024g.equals(n0Var);
    }

    @Override // rc.d0
    public boolean hasSetter() {
        return getSetter() != null;
    }

    @Override // rc.d0
    public boolean isExplicitlyIncluded() {
        return false;
    }

    @Override // rc.d0
    public boolean isExplicitlyNamed() {
        return false;
    }

    public rc.d0 withInclusion(tb.d0 d0Var) {
        if (this.f52025h == d0Var) {
            return this;
        }
        return new i0(this.f52021c, this.f52022e, this.f52024g, this.f52023f, d0Var);
    }

    public rc.d0 withMetadata(jc.m0 m0Var) {
        if (m0Var.equals(this.f52023f)) {
            return this;
        }
        return new i0(this.f52021c, this.f52022e, this.f52024g, m0Var, this.f52025h);
    }

    @Override // rc.d0
    public rc.d0 withName(jc.n0 n0Var) {
        if (this.f52024g.equals(n0Var)) {
            return this;
        }
        return new i0(this.f52021c, this.f52022e, n0Var, this.f52023f, this.f52025h);
    }

    @Override // rc.d0
    public rc.d0 withSimpleName(String str) {
        jc.n0 n0Var = this.f52024g;
        if (n0Var.hasSimpleName(str) && !n0Var.hasNamespace()) {
            return this;
        }
        return new i0(this.f52021c, this.f52022e, new jc.n0(str), this.f52023f, this.f52025h);
    }

    public static i0 construct(lc.z zVar, rc.l lVar, jc.n0 n0Var) {
        return construct(zVar, lVar, n0Var, (jc.m0) null, rc.d0.f84151b);
    }

    public static i0 construct(lc.z zVar, rc.l lVar, jc.n0 n0Var, jc.m0 m0Var, tb.c0 c0Var) {
        tb.d0 d0VarConstruct;
        if (c0Var != null && c0Var != tb.c0.f86699h) {
            d0VarConstruct = tb.d0.construct(c0Var, null);
        } else {
            d0VarConstruct = rc.d0.f84151b;
        }
        return new i0(zVar.getAnnotationIntrospector(), lVar, n0Var, m0Var, d0VarConstruct);
    }

    public static i0 construct(lc.z zVar, rc.l lVar, jc.n0 n0Var, jc.m0 m0Var, tb.d0 d0Var) {
        return new i0(zVar.getAnnotationIntrospector(), lVar, n0Var, m0Var, d0Var);
    }
}
