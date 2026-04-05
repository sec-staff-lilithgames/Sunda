package bd;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class b0 extends x {
    public b0(Class<?> cls) {
        super(cls, ub.s.f88349b, "integer");
    }

    @Override // bd.z0, jc.w
    public void serialize(Object obj, ub.o oVar, jc.u0 u0Var) throws IOException {
        oVar.writeNumber(((Integer) obj).intValue());
    }

    @Override // bd.y0, jc.w
    public void serializeWithType(Object obj, ub.o oVar, jc.u0 u0Var, wc.j jVar) throws IOException {
        serialize(obj, oVar, u0Var);
    }
}
