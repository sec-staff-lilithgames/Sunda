package vo;

import gn.u0;
import io.bidmachine.media3.common.util.m0;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b extends to.c {
    @Override // to.c
    public final u0 a(to.b bVar, ByteBuffer byteBuffer) {
        return new u0(decode(new m0(byteBuffer.array(), byteBuffer.limit())));
    }

    public a decode(m0 m0Var) {
        return new a((String) io.bidmachine.media3.common.util.a.checkNotNull(m0Var.readNullTerminatedString()), (String) io.bidmachine.media3.common.util.a.checkNotNull(m0Var.readNullTerminatedString()), m0Var.readLong(), m0Var.readLong(), Arrays.copyOfRange(m0Var.getData(), m0Var.getPosition(), m0Var.limit()));
    }
}
