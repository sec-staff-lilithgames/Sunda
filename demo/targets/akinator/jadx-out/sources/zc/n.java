package zc;

import jc.s0;
import tb.c0;
import tb.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f97789a;

    /* renamed from: b, reason: collision with root package name */
    public final jc.d f97790b;

    /* renamed from: c, reason: collision with root package name */
    public final jc.c f97791c;

    /* renamed from: d, reason: collision with root package name */
    public Object f97792d;

    /* renamed from: e, reason: collision with root package name */
    public final d0 f97793e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f97794f;

    public n(s0 s0Var, jc.d dVar) {
        this.f97789a = s0Var;
        this.f97790b = dVar;
        d0 d0VarMerge = d0.merge(dVar.findPropertyInclusion(d0.empty()), s0Var.getDefaultPropertyInclusion(dVar.getBeanClass(), d0.empty()));
        this.f97793e = d0.merge(s0Var.getDefaultPropertyInclusion(), d0VarMerge);
        this.f97794f = d0VarMerge.getValueInclusion() == c0.f86697f;
        this.f97791c = s0Var.getAnnotationIntrospector();
    }

    public final jc.o a(rc.l lVar, boolean z10, jc.o oVar) throws jc.r {
        s0 s0Var = this.f97789a;
        jc.c cVar = this.f97791c;
        jc.o oVarRefineSerializationType = cVar.refineSerializationType(s0Var, lVar, oVar);
        if (oVarRefineSerializationType != oVar) {
            Class<?> rawClass = oVarRefineSerializationType.getRawClass();
            Class<?> rawClass2 = oVar.getRawClass();
            if (!rawClass.isAssignableFrom(rawClass2) && !rawClass2.isAssignableFrom(rawClass)) {
                throw new IllegalArgumentException("Illegal concrete-type annotation for method '" + lVar.getName() + "': class " + rawClass.getName() + " not a super-type of (declared) class " + rawClass2.getName());
            }
            oVar = oVarRefineSerializationType;
            z10 = true;
        }
        kc.k kVarFindSerializationTyping = cVar.findSerializationTyping(lVar);
        if (kVarFindSerializationTyping != null && kVarFindSerializationTyping != kc.k.f70793e) {
            z10 = kVarFindSerializationTyping == kc.k.f70792c;
        }
        if (z10) {
            return oVar.withStaticTyping();
        }
        return null;
    }

    public dd.b getClassAnnotations() {
        return this.f97790b.getClassAnnotations();
    }
}
