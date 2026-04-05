package bd;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class a0 extends x {

    /* renamed from: g, reason: collision with root package name */
    public static final a0 f9053g = new a0();

    public a0() {
        super(Number.class, ub.s.f88349b, "integer");
    }

    @Override // bd.z0, jc.w
    public void serialize(Object obj, ub.o oVar, jc.u0 u0Var) throws IOException {
        oVar.writeNumber(((Number) obj).intValue());
    }
}
