package xr;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v1 implements x1 {
    @Override // xr.x1, xr.y1
    public int read(ab abVar, int i10, ByteBuffer byteBuffer, int i11) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + i10);
        abVar.readBytes(byteBuffer);
        byteBuffer.limit(iLimit);
        return 0;
    }
}
