package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e0 extends l0 {

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f5856e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5857f;

    /* renamed from: g, reason: collision with root package name */
    public int f5858g;

    /* renamed from: h, reason: collision with root package name */
    public int f5859h;

    public e0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i10, 20)];
        this.f5856e = bArr;
        this.f5857f = bArr.length;
    }

    public final void c(int i10) {
        int i11 = this.f5858g;
        int i12 = i11 + 1;
        this.f5858g = i12;
        byte[] bArr = this.f5856e;
        bArr[i11] = (byte) (i10 & 255);
        int i13 = i11 + 2;
        this.f5858g = i13;
        bArr[i12] = (byte) ((i10 >> 8) & 255);
        int i14 = i11 + 3;
        this.f5858g = i14;
        bArr[i13] = (byte) ((i10 >> 16) & 255);
        this.f5858g = i11 + 4;
        bArr[i14] = (byte) ((i10 >> 24) & 255);
        this.f5859h += 4;
    }

    public final void d(long j10) {
        int i10 = this.f5858g;
        int i11 = i10 + 1;
        this.f5858g = i11;
        byte[] bArr = this.f5856e;
        bArr[i10] = (byte) (j10 & 255);
        int i12 = i10 + 2;
        this.f5858g = i12;
        bArr[i11] = (byte) ((j10 >> 8) & 255);
        int i13 = i10 + 3;
        this.f5858g = i13;
        bArr[i12] = (byte) ((j10 >> 16) & 255);
        int i14 = i10 + 4;
        this.f5858g = i14;
        bArr[i13] = (byte) (255 & (j10 >> 24));
        int i15 = i10 + 5;
        this.f5858g = i15;
        bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
        int i16 = i10 + 6;
        this.f5858g = i16;
        bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
        int i17 = i10 + 7;
        this.f5858g = i17;
        bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
        this.f5858g = i10 + 8;
        bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        this.f5859h += 8;
    }

    public final void e(int i10, int i11) {
        f((i10 << 3) | i11);
    }

    public final void f(int i10) {
        boolean z10 = l0.f5948d;
        byte[] bArr = this.f5856e;
        if (!z10) {
            while ((i10 & (-128)) != 0) {
                int i11 = this.f5858g;
                this.f5858g = i11 + 1;
                bArr[i11] = (byte) ((i10 | 128) & 255);
                this.f5859h++;
                i10 >>>= 7;
            }
            int i12 = this.f5858g;
            this.f5858g = i12 + 1;
            bArr[i12] = (byte) i10;
            this.f5859h++;
            return;
        }
        long j10 = this.f5858g;
        while ((i10 & (-128)) != 0) {
            int i13 = this.f5858g;
            this.f5858g = i13 + 1;
            j4.n(bArr, i13, (byte) ((i10 | 128) & 255));
            i10 >>>= 7;
        }
        int i14 = this.f5858g;
        this.f5858g = i14 + 1;
        j4.n(bArr, i14, (byte) i10);
        this.f5859h += (int) (this.f5858g - j10);
    }

    public final void g(long j10) {
        boolean z10 = l0.f5948d;
        byte[] bArr = this.f5856e;
        if (!z10) {
            while ((j10 & (-128)) != 0) {
                int i10 = this.f5858g;
                this.f5858g = i10 + 1;
                bArr[i10] = (byte) ((((int) j10) | 128) & 255);
                this.f5859h++;
                j10 >>>= 7;
            }
            int i11 = this.f5858g;
            this.f5858g = i11 + 1;
            bArr[i11] = (byte) j10;
            this.f5859h++;
            return;
        }
        long j11 = this.f5858g;
        while ((j10 & (-128)) != 0) {
            int i12 = this.f5858g;
            this.f5858g = i12 + 1;
            j4.n(bArr, i12, (byte) ((((int) j10) | 128) & 255));
            j10 >>>= 7;
        }
        int i13 = this.f5858g;
        this.f5858g = i13 + 1;
        j4.n(bArr, i13, (byte) j10);
        this.f5859h += (int) (this.f5858g - j11);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final int getTotalBytesWritten() {
        return this.f5859h;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final int spaceLeft() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
