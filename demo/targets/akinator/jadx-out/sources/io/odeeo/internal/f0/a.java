package io.odeeo.internal.f0;

import io.odeeo.internal.d0.e;
import io.odeeo.internal.d0.f;
import io.odeeo.internal.q0.x;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends e {

    /* renamed from: o, reason: collision with root package name */
    public final b f63952o;

    public a(List<byte[]> list) {
        super("DvbDecoder");
        x xVar = new x(list.get(0));
        this.f63952o = new b(xVar.readUnsignedShort(), xVar.readUnsignedShort());
    }

    @Override // io.odeeo.internal.d0.e
    public f a(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f63952o.reset();
        }
        return new c(this.f63952o.decode(bArr, i10));
    }
}
