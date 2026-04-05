package fw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b {
    public b(kotlin.jvm.internal.u uVar) {
    }

    public final c fromHttp2(int i10) {
        for (c cVar : c.values()) {
            if (cVar.getHttpCode() == i10) {
                return cVar;
            }
        }
        return null;
    }
}
