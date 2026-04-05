package bd;

import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class a extends zc.i implements zc.j {

    /* renamed from: e, reason: collision with root package name */
    public final jc.g f9051e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f9052f;

    public a(Class cls) {
        super(cls);
        this.f9051e = null;
        this.f9052f = null;
    }

    public abstract jc.w _withResolved(jc.g gVar, Boolean bool);

    public jc.w createContextual(jc.u0 u0Var, jc.g gVar) throws jc.r {
        tb.t tVarC;
        if (gVar != null && (tVarC = z0.c(handledType(), u0Var, gVar)) != null) {
            Boolean feature = tVarC.getFeature(tb.q.f86758g);
            if (!Objects.equals(feature, this.f9052f)) {
                return _withResolved(gVar, feature);
            }
        }
        return this;
    }

    public final boolean e(jc.u0 u0Var) {
        Boolean bool = this.f9052f;
        return bool == null ? u0Var.isEnabled(jc.t0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) : bool.booleanValue();
    }

    @Override // bd.z0, jc.w
    public void serialize(Object obj, ub.o oVar, jc.u0 u0Var) throws IOException {
        if (e(u0Var) && hasSingleElement(obj)) {
            serializeContents(obj, oVar, u0Var);
            return;
        }
        oVar.writeStartArray(obj);
        serializeContents(obj, oVar, u0Var);
        oVar.writeEndArray();
    }

    public abstract void serializeContents(Object obj, ub.o oVar, jc.u0 u0Var);

    @Override // jc.w
    public final void serializeWithType(Object obj, ub.o oVar, jc.u0 u0Var, wc.j jVar) throws IOException {
        hc.c cVarWriteTypePrefix = jVar.writeTypePrefix(oVar, jVar.typeId(obj, ub.z.START_ARRAY));
        oVar.assignCurrentValue(obj);
        serializeContents(obj, oVar, u0Var);
        jVar.writeTypeSuffix(oVar, cVarWriteTypePrefix);
    }

    public a(f0 f0Var) {
        super(f0Var.f9159b, 0);
        this.f9051e = f0Var.f9051e;
        this.f9052f = f0Var.f9052f;
    }

    public a(a aVar, jc.g gVar, Boolean bool) {
        super(aVar.f9159b, 0);
        this.f9051e = gVar;
        this.f9052f = bool;
    }
}
