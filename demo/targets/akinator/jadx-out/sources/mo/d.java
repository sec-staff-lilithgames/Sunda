package mo;

import io.bidmachine.media3.common.util.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final int f74872a;

    /* renamed from: b, reason: collision with root package name */
    public final int f74873b;

    /* renamed from: c, reason: collision with root package name */
    public final int f74874c;

    public d(int i10, int i11, int i12) {
        this.f74872a = i10;
        this.f74873b = i11;
        this.f74874c = i12;
    }

    public static d parseFrom(m0 m0Var) {
        int littleEndianInt = m0Var.readLittleEndianInt();
        m0Var.skipBytes(8);
        int littleEndianInt2 = m0Var.readLittleEndianInt();
        int littleEndianInt3 = m0Var.readLittleEndianInt();
        m0Var.skipBytes(4);
        m0Var.readLittleEndianInt();
        m0Var.skipBytes(12);
        return new d(littleEndianInt, littleEndianInt2, littleEndianInt3);
    }

    @Override // mo.a
    public int getType() {
        return 1751742049;
    }

    public boolean hasIndex() {
        return (this.f74873b & 16) == 16;
    }
}
