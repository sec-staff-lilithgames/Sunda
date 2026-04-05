package oc;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g extends c1 {
    @Override // oc.c1, jc.q
    public cd.h logicalType() {
        return cd.h.f12149m;
    }

    @Override // jc.q
    public ByteBuffer deserialize(ub.u uVar, jc.k kVar) throws IOException {
        return ByteBuffer.wrap(uVar.getBinaryValue());
    }

    @Override // oc.c1, jc.q
    public ByteBuffer deserialize(ub.u uVar, jc.k kVar, ByteBuffer byteBuffer) throws IOException {
        dd.h hVar = new dd.h(byteBuffer);
        uVar.readBinaryValue(kVar.getBase64Variant(), hVar);
        hVar.close();
        return byteBuffer;
    }
}
