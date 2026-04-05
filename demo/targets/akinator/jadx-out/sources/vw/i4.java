package vw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class i4 {

    /* renamed from: a, reason: collision with root package name */
    public final ax.b f89911a = new ax.b();

    /* renamed from: b, reason: collision with root package name */
    public final v4 f89912b;

    public i4(v4 v4Var) {
        this.f89912b = v4Var;
    }

    public h4 getInstance(Class cls) throws Exception {
        ax.b bVar = this.f89911a;
        h4 y3Var = (h4) bVar.fetch(cls);
        if (y3Var == null) {
            v4 v4Var = this.f89912b;
            t0 detail = v4Var.getDetail(cls);
            if (v4Var.isPrimitive(cls)) {
                y3Var = new y3(detail);
            } else {
                h4 f3Var = new f3(detail, v4Var);
                if (f3Var.isPrimitive() && !v4Var.isContainer(cls)) {
                    f3Var = new s0(detail, v4Var);
                }
                y3Var = f3Var;
            }
            bVar.cache(cls, y3Var);
        }
        return y3Var;
    }
}
