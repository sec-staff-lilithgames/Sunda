package ko;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class s implements a0 {

    /* renamed from: b, reason: collision with root package name */
    public final gn.o f71754b;

    /* renamed from: c, reason: collision with root package name */
    public final long f71755c;

    /* renamed from: d, reason: collision with root package name */
    public long f71756d;

    /* renamed from: f, reason: collision with root package name */
    public int f71758f;

    /* renamed from: g, reason: collision with root package name */
    public int f71759g;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f71757e = new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f71753a = new byte[4096];

    static {
        gn.q0.registerModule("media3.extractor");
    }

    public s(gn.o oVar, long j10, long j11) {
        this.f71754b = oVar;
        this.f71756d = j10;
        this.f71755c = j11;
    }

    public final void a(int i10) {
        int i11 = this.f71758f + i10;
        byte[] bArr = this.f71757e;
        if (i11 > bArr.length) {
            this.f71757e = Arrays.copyOf(this.f71757e, io.bidmachine.media3.common.util.a1.constrainValue(bArr.length * 2, C.DEFAULT_BUFFER_SEGMENT_SIZE + i11, i11 + 524288));
        }
    }

    @Override // ko.a0
    public boolean advancePeekPosition(int i10, boolean z10) throws IOException {
        a(i10);
        int iB = this.f71759g - this.f71758f;
        while (iB < i10) {
            int i11 = i10;
            boolean z11 = z10;
            iB = b(this.f71757e, this.f71758f, i11, iB, z11);
            if (iB == -1) {
                return false;
            }
            this.f71759g = this.f71758f + iB;
            i10 = i11;
            z10 = z11;
        }
        this.f71758f += i10;
        return true;
    }

    public final int b(byte[] bArr, int i10, int i11, int i12, boolean z10) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i13 = this.f71754b.read(bArr, i10 + i12, i11 - i12);
        if (i13 != -1) {
            return i12 + i13;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    public final void c(int i10) {
        int i11 = this.f71759g - i10;
        this.f71759g = i11;
        this.f71758f = 0;
        byte[] bArr = this.f71757e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f71757e = bArr2;
    }

    public gn.o getDataReader() {
        return this.f71754b;
    }

    @Override // ko.a0
    public long getLength() {
        return this.f71755c;
    }

    @Override // ko.a0
    public long getPeekPosition() {
        return this.f71756d + this.f71758f;
    }

    @Override // ko.a0
    public long getPosition() {
        return this.f71756d;
    }

    @Override // ko.a0
    public int peek(byte[] bArr, int i10, int i11) throws IOException {
        s sVar;
        int iMin;
        a(i11);
        int i12 = this.f71759g;
        int i13 = this.f71758f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            sVar = this;
            iMin = sVar.b(this.f71757e, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            sVar.f71759g += iMin;
        } else {
            sVar = this;
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(sVar.f71757e, sVar.f71758f, bArr, i10, iMin);
        sVar.f71758f += iMin;
        return iMin;
    }

    @Override // ko.a0
    public boolean peekFully(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        if (!advancePeekPosition(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f71757e, this.f71758f - i11, bArr, i10, i11);
        return true;
    }

    @Override // ko.a0, gn.o
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        s sVar;
        int i12 = this.f71759g;
        int iB = 0;
        if (i12 != 0) {
            int iMin = Math.min(i12, i11);
            System.arraycopy(this.f71757e, 0, bArr, i10, iMin);
            c(iMin);
            iB = iMin;
        }
        if (iB == 0) {
            sVar = this;
            iB = sVar.b(bArr, i10, i11, 0, true);
        } else {
            sVar = this;
        }
        if (iB != -1) {
            sVar.f71756d += iB;
        }
        return iB;
    }

    @Override // ko.a0
    public void readFully(byte[] bArr, int i10, int i11) throws IOException {
        readFully(bArr, i10, i11, false);
    }

    @Override // ko.a0
    public void resetPeekPosition() {
        this.f71758f = 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Throwable */
    @Override // ko.a0
    public <E extends Throwable> void setRetryPosition(long j10, E e10) throws Throwable {
        io.bidmachine.media3.common.util.a.checkArgument(j10 >= 0);
        this.f71756d = j10;
        throw e10;
    }

    @Override // ko.a0
    public int skip(int i10) throws IOException {
        s sVar;
        int iMin = Math.min(this.f71759g, i10);
        c(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f71753a;
            sVar = this;
            iMin = sVar.b(bArr, 0, Math.min(i10, bArr.length), 0, true);
        } else {
            sVar = this;
        }
        if (iMin != -1) {
            sVar.f71756d += iMin;
        }
        return iMin;
    }

    @Override // ko.a0
    public void skipFully(int i10) throws IOException {
        skipFully(i10, false);
    }

    @Override // ko.a0
    public boolean readFully(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        int iMin;
        int i12 = this.f71759g;
        if (i12 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i12, i11);
            System.arraycopy(this.f71757e, 0, bArr, i10, iMin);
            c(iMin);
        }
        int iB = iMin;
        while (iB < i11 && iB != -1) {
            iB = b(bArr, i10, i11, iB, z10);
        }
        if (iB != -1) {
            this.f71756d += iB;
        }
        return iB != -1;
    }

    @Override // ko.a0
    public boolean skipFully(int i10, boolean z10) throws IOException {
        int iMin = Math.min(this.f71759g, i10);
        c(iMin);
        int iB = iMin;
        while (iB < i10 && iB != -1) {
            byte[] bArr = this.f71753a;
            iB = b(bArr, -iB, Math.min(i10, bArr.length + iB), iB, z10);
        }
        if (iB != -1) {
            this.f71756d += iB;
        }
        return iB != -1;
    }

    @Override // ko.a0
    public void peekFully(byte[] bArr, int i10, int i11) throws IOException {
        peekFully(bArr, i10, i11, false);
    }

    @Override // ko.a0
    public void advancePeekPosition(int i10) throws IOException {
        advancePeekPosition(i10, false);
    }
}
