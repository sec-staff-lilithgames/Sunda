package yr;

import xr.v8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o implements v8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f94967a;

    public o(t tVar) {
        this.f94967a = tVar;
    }

    @Override // xr.v8
    public int getDefaultPort() {
        t tVar = this.f94967a;
        int iC = b3.h.c(tVar.f95046j);
        if (iC == 0) {
            return 443;
        }
        if (iC == 1) {
            return 80;
        }
        throw new AssertionError(w0.i.i(tVar.f95046j).concat(" not handled"));
    }
}
