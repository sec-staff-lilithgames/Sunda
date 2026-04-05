package io.odeeo.internal.s;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class g implements b {
    public abstract a a(d dVar, ByteBuffer byteBuffer);

    @Override // io.odeeo.internal.s.b
    public final a decode(d dVar) {
        ByteBuffer byteBuffer = (ByteBuffer) io.odeeo.internal.q0.a.checkNotNull(dVar.f63705c);
        io.odeeo.internal.q0.a.checkArgument(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (dVar.isDecodeOnly()) {
            return null;
        }
        return a(dVar, byteBuffer);
    }
}
