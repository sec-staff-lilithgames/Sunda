package jn;

import io.bidmachine.media3.common.util.l0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f69806a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f69807b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f69808c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f69809d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f69810e;

    /* renamed from: f, reason: collision with root package name */
    public final int f69811f;

    public y(x xVar) throws w {
        int i10 = xVar.f69804a;
        ByteBuffer byteBuffer = xVar.f69805b;
        io.bidmachine.media3.common.util.a.checkArgument(i10 == 1);
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        l0 l0Var = new l0(bArr);
        l0Var.skipBits(4);
        boolean bit = l0Var.readBit();
        this.f69806a = bit;
        z.a(bit);
        if (l0Var.readBit()) {
            l0Var.skipBits(64);
            if (l0Var.readBit()) {
                int i11 = 0;
                while (!l0Var.readBit()) {
                    i11++;
                }
                if (i11 < 32) {
                    l0Var.skipBits(i11);
                }
            }
            boolean bit2 = l0Var.readBit();
            this.f69807b = bit2;
            if (bit2) {
                l0Var.skipBits(47);
            }
        } else {
            this.f69807b = false;
        }
        boolean bit3 = l0Var.readBit();
        int bits = l0Var.readBits(5);
        for (int i12 = 0; i12 <= bits; i12++) {
            l0Var.skipBits(12);
            if (l0Var.readBits(5) > 7) {
                l0Var.skipBit();
            }
            z.a(this.f69807b);
            if (bit3 && l0Var.readBit()) {
                l0Var.skipBits(4);
            }
        }
        int bits2 = l0Var.readBits(4);
        int bits3 = l0Var.readBits(4);
        l0Var.skipBits(bits2 + 1);
        l0Var.skipBits(bits3 + 1);
        boolean bit4 = l0Var.readBit();
        this.f69808c = bit4;
        z.a(bit4);
        l0Var.skipBits(3);
        l0Var.skipBits(4);
        boolean bit5 = l0Var.readBit();
        if (bit5) {
            l0Var.skipBits(2);
        }
        if (l0Var.readBit()) {
            this.f69809d = true;
        } else {
            this.f69809d = l0Var.readBit();
        }
        if (!this.f69809d || l0Var.readBit()) {
            this.f69810e = true;
        } else {
            this.f69810e = l0Var.readBit();
        }
        if (bit5) {
            this.f69811f = l0Var.readBits(3) + 1;
        } else {
            this.f69811f = 0;
        }
    }

    public static y parse(x xVar) {
        try {
            return new y(xVar);
        } catch (w unused) {
            return null;
        }
    }
}
