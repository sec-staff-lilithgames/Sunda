package bd;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x0 extends z0 {

    /* renamed from: e, reason: collision with root package name */
    public final dd.o f9155e;

    /* renamed from: f, reason: collision with root package name */
    public final dd.o f9156f;

    public x0(Class cls, dd.o oVar) {
        super(cls, 0);
        this.f9155e = oVar;
        this.f9156f = null;
    }

    public static x0 construct(Class<?> cls, dd.o oVar) {
        return new x0(cls, oVar);
    }

    @Override // bd.z0, jc.w
    public void serialize(Object obj, ub.o oVar, jc.u0 u0Var) throws IOException {
        if (u0Var.isEnabled(jc.t0.WRITE_ENUMS_USING_TO_STRING)) {
            oVar.writeFieldName(obj.toString());
            return;
        }
        Enum<?> r22 = (Enum) obj;
        dd.o oVar2 = this.f9156f;
        if (oVar2 != null) {
            oVar.writeFieldName(oVar2.serializedValueFor(r22));
        } else if (u0Var.isEnabled(jc.t0.WRITE_ENUM_KEYS_USING_INDEX)) {
            oVar.writeFieldName(String.valueOf(r22.ordinal()));
        } else {
            oVar.writeFieldName(this.f9155e.serializedValueFor(r22));
        }
    }

    public static x0 construct(Class<?> cls, dd.o oVar, dd.o oVar2) {
        return new x0(cls, oVar, oVar2);
    }

    public x0(Class cls, dd.o oVar, dd.o oVar2) {
        super(cls, 0);
        this.f9155e = oVar;
        this.f9156f = oVar2;
    }
}
