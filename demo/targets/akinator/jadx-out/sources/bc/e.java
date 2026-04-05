package bc;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f9023a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f9024b;

    /* renamed from: c, reason: collision with root package name */
    public int f9025c;

    public e(long j10) {
        if (j10 <= 0 || j10 >= 2147483647L) {
            throw new IllegalArgumentException(o2.m(j10, "numBits="));
        }
        int i10 = (((int) ((j10 + 63) >>> 6)) + 1) << 1;
        this.f9023a = i10;
        this.f9024b = new int[i10];
        this.f9025c = i10;
    }

    public void add(int i10) {
        if (i10 == 0) {
            return;
        }
        long j10 = i10 & 4294967295L;
        int i11 = this.f9023a;
        while (true) {
            i11--;
            if (j10 == 0) {
                this.f9025c = Math.min(this.f9025c, i11 + 1);
                return;
            }
            long j11 = (r4[i11] & 4294967295L) + j10;
            this.f9024b[i11] = (int) j11;
            j10 = j11 >>> 32;
        }
    }

    public void fma(int i10, int i11) {
        int[] iArr;
        long j10 = i10 & 4294967295L;
        long j11 = i11;
        int i12 = this.f9023a;
        while (true) {
            i12--;
            int i13 = this.f9025c;
            iArr = this.f9024b;
            if (i12 < i13) {
                break;
            }
            long j12 = ((iArr[i12] & 4294967295L) * j10) + j11;
            iArr[i12] = (int) j12;
            j11 = j12 >>> 32;
        }
        if (j11 != 0) {
            iArr[i12] = (int) j11;
            this.f9025c = i12;
        }
    }

    public BigInteger toBigInteger() {
        int[] iArr = this.f9024b;
        byte[] bArr = new byte[iArr.length << 2];
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).asIntBuffer();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            intBufferAsIntBuffer.put(i10, iArr[i10]);
        }
        return new BigInteger(bArr);
    }
}
