package io.odeeo.internal.z;

import io.odeeo.internal.q0.e0;
import io.odeeo.internal.q0.w;
import io.odeeo.internal.q0.x;
import io.odeeo.internal.s.a;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c extends io.odeeo.internal.s.g {

    /* renamed from: a, reason: collision with root package name */
    public final x f67749a = new x();

    /* renamed from: b, reason: collision with root package name */
    public final w f67750b = new w();

    /* renamed from: c, reason: collision with root package name */
    public e0 f67751c;

    @Override // io.odeeo.internal.s.g
    public io.odeeo.internal.s.a a(io.odeeo.internal.s.d dVar, ByteBuffer byteBuffer) {
        e0 e0Var = this.f67751c;
        if (e0Var == null || dVar.f66249i != e0Var.getTimestampOffsetUs()) {
            e0 e0Var2 = new e0(dVar.f63707e);
            this.f67751c = e0Var2;
            e0Var2.adjustSampleTimestamp(dVar.f63707e - dVar.f66249i);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f67749a.reset(bArrArray, iLimit);
        this.f67750b.reset(bArrArray, iLimit);
        this.f67750b.skipBits(39);
        long bits = (this.f67750b.readBits(1) << 32) | this.f67750b.readBits(32);
        this.f67750b.skipBits(20);
        int bits2 = this.f67750b.readBits(12);
        int bits3 = this.f67750b.readBits(8);
        this.f67749a.skipBytes(14);
        a.b bVarA = bits3 != 0 ? bits3 != 255 ? bits3 != 4 ? bits3 != 5 ? bits3 != 6 ? null : g.a(this.f67749a, bits, this.f67751c) : d.a(this.f67749a, bits, this.f67751c) : f.a(this.f67749a) : a.a(this.f67749a, bits2, bits) : new e();
        return bVarA == null ? new io.odeeo.internal.s.a(new a.b[0]) : new io.odeeo.internal.s.a(bVarA);
    }
}
