package bd;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class g extends y0 {
    public g() {
        super(ByteBuffer.class);
    }

    @Override // bd.y0, bd.z0, jc.w, uc.e
    public void acceptJsonFormatVisitor(uc.h hVar, jc.o oVar) throws jc.r {
        hVar.expectArrayFormat(oVar);
    }

    @Override // bd.z0, jc.w
    public void serialize(ByteBuffer byteBuffer, ub.o oVar, jc.u0 u0Var) throws IOException {
        if (byteBuffer.hasArray()) {
            int iPosition = byteBuffer.position();
            oVar.writeBinary(byteBuffer.array(), byteBuffer.arrayOffset() + iPosition, byteBuffer.limit() - iPosition);
        } else {
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            dd.g gVar = new dd.g(byteBufferAsReadOnlyBuffer);
            oVar.writeBinary(gVar, byteBufferAsReadOnlyBuffer.remaining());
            gVar.close();
        }
    }
}
