package ad;

import java.io.IOException;
import java.io.Serializable;
import java.util.Set;
import jc.t0;
import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class g0 extends bd.d implements Serializable {

    /* renamed from: m, reason: collision with root package name */
    public final dd.a0 f4263m;

    public g0(g0 g0Var, l lVar) {
        super(g0Var, lVar);
        this.f4263m = g0Var.f4263m;
    }

    @Override // jc.w
    public boolean isUnwrappingSerializer() {
        return true;
    }

    @Override // bd.d
    public final bd.d l(Set set, Set set2) {
        return new g0(this, set, set2);
    }

    @Override // bd.d
    public final bd.d m(zc.d[] dVarArr, zc.d[] dVarArr2) {
        return new g0(this, dVarArr, dVarArr2);
    }

    @Override // bd.d, bd.z0, jc.w
    public final void serialize(Object obj, ub.o oVar, u0 u0Var) throws IOException {
        oVar.assignCurrentValue(obj);
        if (this.f9067j != null) {
            f(obj, oVar, u0Var, false);
        } else if (this.f9065h != null) {
            k(obj, oVar, u0Var);
        } else {
            j(obj, oVar, u0Var);
        }
    }

    @Override // bd.d, jc.w
    public void serializeWithType(Object obj, ub.o oVar, u0 u0Var, wc.j jVar) throws UnsupportedOperationException, IOException, IllegalArgumentException {
        if (u0Var.isEnabled(t0.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS)) {
            u0Var.reportBadDefinition(handledType(), "Unwrapped property requires use of type information: cannot serialize without disabling `SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS`");
        }
        oVar.assignCurrentValue(obj);
        if (this.f9067j != null) {
            e(obj, oVar, u0Var, jVar);
        } else if (this.f9065h != null) {
            k(obj, oVar, u0Var);
        } else {
            j(obj, oVar, u0Var);
        }
    }

    public String toString() {
        return "UnwrappingBeanSerializer for ".concat(handledType().getName());
    }

    @Override // jc.w
    public jc.w unwrappingSerializer(dd.a0 a0Var) {
        return new g0(this, a0Var);
    }

    @Override // bd.d
    public bd.d withObjectIdWriter(l lVar) {
        return new g0(this, lVar);
    }

    @Override // bd.d, jc.w
    public bd.d withFilterId(Object obj) {
        return new g0(this, this.f9067j, obj);
    }

    public g0(g0 g0Var, l lVar, Object obj) {
        super(g0Var, lVar, obj);
        this.f4263m = g0Var.f4263m;
    }

    public g0(g0 g0Var, Set set, Set set2) {
        super(g0Var, set, set2);
        this.f4263m = g0Var.f4263m;
    }

    public g0(g0 g0Var, zc.d[] dVarArr, zc.d[] dVarArr2) {
        super(g0Var, dVarArr, dVarArr2);
        this.f4263m = g0Var.f4263m;
    }

    public g0(bd.d dVar, dd.a0 a0Var) {
        super(dVar, bd.d.i(dVar.f9063f, a0Var), bd.d.i(dVar.f9064g, a0Var));
        this.f4263m = a0Var;
    }

    @Override // bd.d
    public final bd.d h() {
        return this;
    }
}
