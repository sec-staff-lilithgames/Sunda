package oc;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class j1 extends c1 {
    public j1() {
        super(dd.k0.class);
    }

    @Override // oc.c1, jc.q
    public cd.h logicalType() {
        return cd.h.f12143g;
    }

    @Override // jc.q
    public dd.k0 deserialize(ub.u uVar, jc.k kVar) throws IOException {
        return kVar.bufferForInputBuffering(uVar).deserialize(uVar, kVar);
    }
}
