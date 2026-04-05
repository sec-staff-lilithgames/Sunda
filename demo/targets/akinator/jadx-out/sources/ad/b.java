package ad;

import java.io.IOException;
import java.util.Set;
import jc.t0;
import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class b extends bd.d {

    /* renamed from: m, reason: collision with root package name */
    public final bd.d f4252m;

    public b(bd.d dVar) {
        super(dVar, null);
        this.f4252m = dVar;
    }

    @Override // jc.w
    public boolean isUnwrappingSerializer() {
        return false;
    }

    @Override // bd.d
    public final bd.d l(Set set, Set set2) {
        return new b(this, set, set2);
    }

    public final void n(Object obj, ub.o oVar, u0 u0Var) throws IOException {
        zc.d[] dVarArr = this.f9064g;
        if (dVarArr == null || u0Var.getActiveView() == null) {
            dVarArr = this.f9063f;
        }
        int i10 = 0;
        try {
            int length = dVarArr.length;
            while (i10 < length) {
                zc.d dVar = dVarArr[i10];
                if (dVar == null) {
                    oVar.writeNull();
                } else {
                    dVar.serializeAsElement(obj, oVar, u0Var);
                }
                i10++;
            }
        } catch (Exception e10) {
            wrapAndThrow(u0Var, e10, obj, dVarArr[i10].getName());
        } catch (StackOverflowError e11) {
            jc.r rVarFrom = jc.r.from(oVar, "Infinite recursion (StackOverflowError)", e11);
            rVarFrom.prependPath(obj, dVarArr[i10].getName());
            throw rVarFrom;
        }
    }

    @Override // bd.d, bd.z0, jc.w
    public final void serialize(Object obj, ub.o oVar, u0 u0Var) throws IOException {
        if (u0Var.isEnabled(t0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) {
            zc.d[] dVarArr = this.f9064g;
            if (dVarArr == null || u0Var.getActiveView() == null) {
                dVarArr = this.f9063f;
            }
            if (dVarArr.length == 1) {
                n(obj, oVar, u0Var);
                return;
            }
        }
        oVar.writeStartArray(obj);
        n(obj, oVar, u0Var);
        oVar.writeEndArray();
    }

    @Override // bd.d, jc.w
    public void serializeWithType(Object obj, ub.o oVar, u0 u0Var, wc.j jVar) throws UnsupportedOperationException, IOException, IllegalArgumentException {
        if (this.f9067j != null) {
            e(obj, oVar, u0Var, jVar);
            return;
        }
        hc.c cVarG = g(jVar, obj, ub.z.START_ARRAY);
        jVar.writeTypePrefix(oVar, cVarG);
        oVar.assignCurrentValue(obj);
        n(obj, oVar, u0Var);
        jVar.writeTypeSuffix(oVar, cVarG);
    }

    public String toString() {
        return "BeanAsArraySerializer for ".concat(handledType().getName());
    }

    @Override // jc.w
    public jc.w unwrappingSerializer(dd.a0 a0Var) {
        return this.f4252m.unwrappingSerializer(a0Var);
    }

    @Override // bd.d
    public bd.d withObjectIdWriter(l lVar) {
        return this.f4252m.withObjectIdWriter(lVar);
    }

    @Override // bd.d, jc.w
    public bd.d withFilterId(Object obj) {
        return new b(this, this.f9067j, obj);
    }

    public b(b bVar, Set set, Set set2) {
        super(bVar, set, set2);
        this.f4252m = bVar;
    }

    public b(b bVar, l lVar, Object obj) {
        super(bVar, lVar, obj);
        this.f4252m = bVar;
    }

    @Override // bd.d
    public final bd.d h() {
        return this;
    }

    @Override // bd.d
    public final bd.d m(zc.d[] dVarArr, zc.d[] dVarArr2) {
        return this;
    }
}
