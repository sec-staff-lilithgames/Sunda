package ge;

import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    public final int f57578a;

    /* renamed from: b, reason: collision with root package name */
    public final int f57579b;

    /* renamed from: c, reason: collision with root package name */
    public final int f57580c;

    /* renamed from: d, reason: collision with root package name */
    public final int f57581d;

    /* renamed from: e, reason: collision with root package name */
    public final int f57582e;

    public e(int i10, int i11, int i12, int i13, int i14) {
        this.f57578a = i10;
        this.f57579b = i11;
        this.f57580c = i12;
        this.f57581d = i13;
        this.f57582e = i14;
    }

    public static e parseFrom(v0 v0Var) {
        int littleEndianInt = v0Var.readLittleEndianInt();
        v0Var.skipBytes(12);
        v0Var.readLittleEndianInt();
        int littleEndianInt2 = v0Var.readLittleEndianInt();
        int littleEndianInt3 = v0Var.readLittleEndianInt();
        v0Var.skipBytes(4);
        int littleEndianInt4 = v0Var.readLittleEndianInt();
        int littleEndianInt5 = v0Var.readLittleEndianInt();
        v0Var.skipBytes(8);
        return new e(littleEndianInt, littleEndianInt2, littleEndianInt3, littleEndianInt4, littleEndianInt5);
    }

    public long getDurationUs() {
        return n1.scaleLargeTimestamp(this.f57581d, this.f57579b * 1000000, this.f57580c);
    }

    public float getFrameRate() {
        return this.f57580c / this.f57579b;
    }

    public int getTrackType() {
        int i10 = this.f57578a;
        if (i10 == 1935960438) {
            return 2;
        }
        if (i10 == 1935963489) {
            return 1;
        }
        if (i10 == 1937012852) {
            return 3;
        }
        f0.w("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i10));
        return -1;
    }

    @Override // ge.a
    public int getType() {
        return 1752331379;
    }
}
