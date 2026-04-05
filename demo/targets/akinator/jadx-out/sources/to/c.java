package to;

import gn.u0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class c implements a {
    public abstract u0 a(b bVar, ByteBuffer byteBuffer);

    @Override // to.a
    public final u0 decode(b bVar) {
        ByteBuffer byteBuffer = (ByteBuffer) io.bidmachine.media3.common.util.a.checkNotNull(bVar.f77080f);
        io.bidmachine.media3.common.util.a.checkArgument(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return a(bVar, byteBuffer);
    }
}
