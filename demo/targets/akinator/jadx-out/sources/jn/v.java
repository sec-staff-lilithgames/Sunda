package jn;

import io.bidmachine.media3.common.util.l0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f69803a;

    public v(y yVar, x xVar) throws w {
        int i10 = xVar.f69804a;
        ByteBuffer byteBuffer = xVar.f69805b;
        io.bidmachine.media3.common.util.a.checkArgument(i10 == 6 || i10 == 3);
        byte[] bArr = new byte[Math.min(4, byteBuffer.remaining())];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        l0 l0Var = new l0(bArr);
        z.a(yVar.f69806a);
        if (l0Var.readBit()) {
            this.f69803a = false;
            return;
        }
        int bits = l0Var.readBits(2);
        boolean bit = l0Var.readBit();
        z.a(yVar.f69807b);
        if (!bit) {
            this.f69803a = true;
            return;
        }
        boolean bit2 = (bits == 3 || bits == 0) ? true : l0Var.readBit();
        l0Var.skipBit();
        z.a(!yVar.f69809d);
        if (l0Var.readBit()) {
            z.a(!yVar.f69810e);
            l0Var.skipBit();
        }
        z.a(yVar.f69808c);
        if (bits != 3) {
            l0Var.skipBit();
        }
        l0Var.skipBits(yVar.f69811f);
        if (bits != 2 && bits != 0 && !bit2) {
            l0Var.skipBits(3);
        }
        this.f69803a = ((bits == 3 || bits == 0) ? 255 : l0Var.readBits(8)) != 0;
    }

    public static v parse(y yVar, x xVar) {
        try {
            return new v(yVar, xVar);
        } catch (w unused) {
            return null;
        }
    }

    public boolean isDependedOn() {
        return this.f69803a;
    }
}
