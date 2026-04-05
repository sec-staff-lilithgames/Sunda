package mo;

import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.b0;
import io.bidmachine.media3.common.util.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    public final int f74875a;

    /* renamed from: b, reason: collision with root package name */
    public final int f74876b;

    /* renamed from: c, reason: collision with root package name */
    public final int f74877c;

    /* renamed from: d, reason: collision with root package name */
    public final int f74878d;

    /* renamed from: e, reason: collision with root package name */
    public final int f74879e;

    /* renamed from: f, reason: collision with root package name */
    public final int f74880f;

    public e(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f74875a = i10;
        this.f74876b = i11;
        this.f74877c = i12;
        this.f74878d = i13;
        this.f74879e = i14;
        this.f74880f = i15;
    }

    public static e parseFrom(m0 m0Var) {
        int littleEndianInt = m0Var.readLittleEndianInt();
        m0Var.skipBytes(12);
        m0Var.readLittleEndianInt();
        int littleEndianInt2 = m0Var.readLittleEndianInt();
        int littleEndianInt3 = m0Var.readLittleEndianInt();
        m0Var.skipBytes(4);
        int littleEndianInt4 = m0Var.readLittleEndianInt();
        int littleEndianInt5 = m0Var.readLittleEndianInt();
        m0Var.skipBytes(4);
        return new e(littleEndianInt, littleEndianInt2, littleEndianInt3, littleEndianInt4, littleEndianInt5, m0Var.readLittleEndianInt());
    }

    public long getDurationUs() {
        return a1.scaleLargeTimestamp(this.f74878d, this.f74876b * 1000000, this.f74877c);
    }

    public float getFrameRate() {
        return this.f74877c / this.f74876b;
    }

    public int getTrackType() {
        int i10 = this.f74875a;
        if (i10 == 1935960438) {
            return 2;
        }
        if (i10 == 1935963489) {
            return 1;
        }
        if (i10 == 1937012852) {
            return 3;
        }
        b0.w("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i10));
        return -1;
    }

    @Override // mo.a
    public int getType() {
        return 1752331379;
    }
}
