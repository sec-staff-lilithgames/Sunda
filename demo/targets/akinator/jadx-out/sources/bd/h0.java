package bd;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class h0 extends z0 implements zc.j {

    /* renamed from: e, reason: collision with root package name */
    public final jc.o f9081e;

    /* renamed from: f, reason: collision with root package name */
    public final jc.g f9082f;

    /* renamed from: g, reason: collision with root package name */
    public final wc.j f9083g;

    /* renamed from: h, reason: collision with root package name */
    public final jc.w f9084h;

    /* renamed from: i, reason: collision with root package name */
    public final dd.a0 f9085i;

    /* renamed from: j, reason: collision with root package name */
    public transient ad.t f9086j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f9087k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f9088l;

    public h0(cd.l lVar, boolean z10, wc.j jVar, jc.w wVar) {
        super(lVar);
        this.f9081e = lVar.getReferencedType();
        this.f9082f = null;
        this.f9083g = jVar;
        this.f9084h = wVar;
        this.f9085i = null;
        this.f9087k = null;
        this.f9088l = false;
        this.f9086j = ad.t.emptyForProperties();
    }

    @Override // bd.z0, jc.w, uc.e
    public void acceptJsonFormatVisitor(uc.h hVar, jc.o oVar) throws jc.r {
        jc.o oVar2 = this.f9081e;
        jc.w wVarFindPrimaryPropertySerializer = this.f9084h;
        if (wVarFindPrimaryPropertySerializer == null) {
            wVarFindPrimaryPropertySerializer = hVar.getProvider().findPrimaryPropertySerializer(oVar2, this.f9082f);
            dd.a0 a0Var = this.f9085i;
            if (a0Var != null) {
                wVarFindPrimaryPropertySerializer = wVarFindPrimaryPropertySerializer.unwrappingSerializer(a0Var);
            }
        }
        wVarFindPrimaryPropertySerializer.acceptJsonFormatVisitor(hVar, oVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb  */
    @Override // zc.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jc.w createContextual(jc.u0 r10, jc.g r11) throws jc.r {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.h0.createContextual(jc.u0, jc.g):jc.w");
    }

    public final jc.w e(Class cls, jc.u0 u0Var) {
        jc.w wVarSerializerFor = this.f9086j.serializerFor(cls);
        if (wVarSerializerFor != null) {
            return wVarSerializerFor;
        }
        jc.o oVar = this.f9081e;
        boolean zHasGenericTypes = oVar.hasGenericTypes();
        jc.g gVar = this.f9082f;
        jc.w wVarFindPrimaryPropertySerializer = zHasGenericTypes ? u0Var.findPrimaryPropertySerializer(u0Var.constructSpecializedType(oVar, cls), gVar) : u0Var.findPrimaryPropertySerializer((Class<?>) cls, gVar);
        dd.a0 a0Var = this.f9085i;
        if (a0Var != null) {
            wVarFindPrimaryPropertySerializer = wVarFindPrimaryPropertySerializer.unwrappingSerializer(a0Var);
        }
        this.f9086j = this.f9086j.newWith(cls, wVarFindPrimaryPropertySerializer);
        return wVarFindPrimaryPropertySerializer;
    }

    public abstract Object f(Object obj);

    public abstract Object g(Object obj);

    public jc.o getReferredType() {
        return this.f9081e;
    }

    public abstract boolean h(Object obj);

    public abstract c i(jc.g gVar, wc.j jVar, jc.w wVar, dd.a0 a0Var);

    @Override // jc.w
    public boolean isEmpty(jc.u0 u0Var, Object obj) {
        if (!h(obj)) {
            return true;
        }
        Object objF = f(obj);
        if (objF == null) {
            return this.f9088l;
        }
        Object obj2 = this.f9087k;
        if (obj2 == null) {
            return false;
        }
        jc.w wVarE = this.f9084h;
        if (wVarE == null) {
            try {
                wVarE = e(objF.getClass(), u0Var);
            } catch (jc.r e10) {
                throw new jc.q0(e10);
            }
        }
        return obj2 == tb.c0.f86696e ? wVarE.isEmpty(u0Var, objF) : obj2.equals(objF);
    }

    @Override // jc.w
    public boolean isUnwrappingSerializer() {
        return this.f9085i != null;
    }

    @Override // bd.z0, jc.w
    public void serialize(Object obj, ub.o oVar, jc.u0 u0Var) throws IOException {
        Object objG = g(obj);
        if (objG == null) {
            if (this.f9085i == null) {
                u0Var.defaultSerializeNull(oVar);
                return;
            }
            return;
        }
        jc.w wVarE = this.f9084h;
        if (wVarE == null) {
            wVarE = e(objG.getClass(), u0Var);
        }
        wc.j jVar = this.f9083g;
        if (jVar != null) {
            wVarE.serializeWithType(objG, oVar, u0Var, jVar);
        } else {
            wVarE.serialize(objG, oVar, u0Var);
        }
    }

    @Override // jc.w
    public void serializeWithType(Object obj, ub.o oVar, jc.u0 u0Var, wc.j jVar) throws IOException {
        Object objG = g(obj);
        if (objG == null) {
            if (this.f9085i == null) {
                u0Var.defaultSerializeNull(oVar);
            }
        } else {
            jc.w wVarE = this.f9084h;
            if (wVarE == null) {
                wVarE = e(objG.getClass(), u0Var);
            }
            wVarE.serializeWithType(objG, oVar, u0Var, jVar);
        }
    }

    @Override // jc.w
    public jc.w unwrappingSerializer(dd.a0 a0Var) {
        jc.w wVarUnwrappingSerializer;
        jc.w wVar = this.f9084h;
        if (wVar != null) {
            wVarUnwrappingSerializer = wVar.unwrappingSerializer(a0Var);
            if (wVarUnwrappingSerializer != wVar) {
            }
            return this;
        }
        wVarUnwrappingSerializer = wVar;
        dd.a0 a0Var2 = this.f9085i;
        if (a0Var2 != null) {
            a0Var = dd.a0.chainedTransformer(a0Var, a0Var2);
        }
        if (wVar != wVarUnwrappingSerializer || a0Var2 != a0Var) {
            return i(this.f9082f, this.f9083g, wVarUnwrappingSerializer, a0Var);
        }
        return this;
    }

    public abstract h0 withContentInclusion(Object obj, boolean z10);

    public h0(c cVar, jc.g gVar, wc.j jVar, jc.w wVar, dd.a0 a0Var, Object obj, boolean z10) {
        super(cVar);
        this.f9081e = cVar.f9081e;
        this.f9086j = ad.t.emptyForProperties();
        this.f9082f = gVar;
        this.f9083g = jVar;
        this.f9084h = wVar;
        this.f9085i = a0Var;
        this.f9087k = obj;
        this.f9088l = z10;
    }
}
