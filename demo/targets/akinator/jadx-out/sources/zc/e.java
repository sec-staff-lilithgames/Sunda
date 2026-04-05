package zc;

import ad.g0;
import dd.a0;
import java.io.IOException;
import java.util.Set;
import jc.u0;
import jc.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class e extends bd.d {
    public e(jc.o oVar, f fVar, d[] dVarArr, d[] dVarArr2) {
        super(oVar, fVar, dVarArr, dVarArr2);
    }

    @Deprecated
    public static e createDummy(jc.o oVar) {
        return new e(oVar, null, bd.d.f9061l, null);
    }

    @Override // bd.d
    public final bd.d h() {
        return (this.f9067j == null && this.f9065h == null) ? new ad.b(this) : this;
    }

    @Override // bd.d
    public final bd.d l(Set set, Set set2) {
        return new e(this, set, set2);
    }

    @Override // bd.d
    public final bd.d m(d[] dVarArr, d[] dVarArr2) {
        return new e(this, dVarArr, dVarArr2);
    }

    @Override // bd.d, bd.z0, jc.w
    public void serialize(Object obj, ub.o oVar, u0 u0Var) throws IOException {
        if (this.f9067j != null) {
            oVar.assignCurrentValue(obj);
            f(obj, oVar, u0Var, true);
            return;
        }
        oVar.writeStartObject(obj);
        if (this.f9065h != null) {
            k(obj, oVar, u0Var);
        } else {
            j(obj, oVar, u0Var);
        }
        oVar.writeEndObject();
    }

    public String toString() {
        return "BeanSerializer for ".concat(handledType().getName());
    }

    @Override // jc.w
    public w unwrappingSerializer(a0 a0Var) {
        return new g0(this, a0Var);
    }

    @Override // jc.w
    public w withIgnoredProperties(Set<String> set) {
        return new e(this, set, null);
    }

    @Override // bd.d
    public bd.d withObjectIdWriter(ad.l lVar) {
        return new e(this, lVar, this.f9065h);
    }

    public static e createDummy(jc.o oVar, f fVar) {
        return new e(oVar, fVar, bd.d.f9061l, null);
    }

    @Override // bd.d, jc.w
    public bd.d withFilterId(Object obj) {
        return new e(this, this.f9067j, obj);
    }
}
