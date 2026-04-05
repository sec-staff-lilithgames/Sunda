package ad;

import bd.z0;
import java.io.IOException;
import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class d0 extends z0 {

    /* renamed from: e, reason: collision with root package name */
    public final jc.o f4258e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4259f;

    public d0(jc.o oVar, String str) {
        super(Object.class);
        this.f4258e = oVar;
        this.f4259f = str;
    }

    @Override // bd.z0, jc.w
    public void serialize(Object obj, ub.o oVar, u0 u0Var) throws IOException {
        u0Var.reportBadDefinition(this.f4258e, this.f4259f);
    }
}
