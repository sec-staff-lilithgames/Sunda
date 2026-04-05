package bd;

import java.lang.reflect.Type;
import java.math.BigDecimal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class x extends y0 implements zc.j {

    /* renamed from: e, reason: collision with root package name */
    public final String f9153e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f9154f;

    public x(Class cls, ub.s sVar, String str) {
        super(cls);
        this.f9153e = str;
        this.f9154f = sVar == ub.s.f88349b || sVar == ub.s.f88350c || sVar == ub.s.f88351e;
    }

    @Override // bd.y0, bd.z0, jc.w, uc.e
    public void acceptJsonFormatVisitor(uc.h hVar, jc.o oVar) throws jc.r {
        if (this.f9154f) {
            hVar.expectIntegerFormat(oVar);
        } else {
            hVar.expectNumberFormat(oVar);
        }
    }

    @Override // zc.j
    public jc.w createContextual(jc.u0 u0Var, jc.g gVar) throws jc.r {
        tb.t tVarC = z0.c(handledType(), u0Var, gVar);
        return (tVarC == null || tVarC.getShape().ordinal() != 5) ? this : handledType() == BigDecimal.class ? w.bigDecimalAsStringSerializer() : d1.f9070e;
    }

    @Override // bd.y0, bd.z0, vc.c
    @Deprecated
    public jc.t getSchema(jc.u0 u0Var, Type type) {
        return z0.a(this.f9153e);
    }
}
