package io.odeeo.internal.u;

import io.odeeo.internal.q0.x;
import io.odeeo.internal.s.d;
import io.odeeo.internal.s.g;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends g {
    @Override // io.odeeo.internal.s.g
    public io.odeeo.internal.s.a a(d dVar, ByteBuffer byteBuffer) {
        return new io.odeeo.internal.s.a(decode(new x(byteBuffer.array(), byteBuffer.limit())));
    }

    public a decode(x xVar) {
        return new a((String) io.odeeo.internal.q0.a.checkNotNull(xVar.readNullTerminatedString()), (String) io.odeeo.internal.q0.a.checkNotNull(xVar.readNullTerminatedString()), xVar.readLong(), xVar.readLong(), Arrays.copyOfRange(xVar.getData(), xVar.getPosition(), xVar.limit()));
    }
}
