package ee;

import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.w0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k implements q {

    /* renamed from: b, reason: collision with root package name */
    public final qf.k f54214b;

    /* renamed from: c, reason: collision with root package name */
    public final long f54215c;

    /* renamed from: d, reason: collision with root package name */
    public long f54216d;

    /* renamed from: f, reason: collision with root package name */
    public int f54218f;

    /* renamed from: g, reason: collision with root package name */
    public int f54219g;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f54217e = new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f54213a = new byte[4096];

    static {
        w0.registerModule("goog.exo.extractor");
    }

    public k(qf.k kVar, long j10, long j11) {
        this.f54214b = kVar;
        this.f54216d = j10;
        this.f54215c = j11;
    }

    public final void a(int i10) {
        int i11 = this.f54218f + i10;
        byte[] bArr = this.f54217e;
        if (i11 > bArr.length) {
            this.f54217e = Arrays.copyOf(this.f54217e, n1.constrainValue(bArr.length * 2, C.DEFAULT_BUFFER_SEGMENT_SIZE + i11, i11 + 524288));
        }
    }

    @Override // ee.q
    public boolean advancePeekPosition(int i10, boolean z10) throws IOException {
        a(i10);
        int iB = this.f54219g - this.f54218f;
        while (iB < i10) {
            int i11 = i10;
            boolean z11 = z10;
            iB = b(this.f54217e, this.f54218f, i11, iB, z11);
            if (iB == -1) {
                return false;
            }
            this.f54219g = this.f54218f + iB;
            i10 = i11;
            z10 = z11;
        }
        this.f54218f += i10;
        return true;
    }

    public final int b(byte[] bArr, int i10, int i11, int i12, boolean z10) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i13 = this.f54214b.read(bArr, i10 + i12, i11 - i12);
        if (i13 != -1) {
            return i12 + i13;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    public final void c(int i10) {
        int i11 = this.f54219g - i10;
        this.f54219g = i11;
        this.f54218f = 0;
        byte[] bArr = this.f54217e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f54217e = bArr2;
    }

    @Override // ee.q
    public long getLength() {
        return this.f54215c;
    }

    @Override // ee.q
    public long getPeekPosition() {
        return this.f54216d + this.f54218f;
    }

    @Override // ee.q
    public long getPosition() {
        return this.f54216d;
    }

    @Override // ee.q
    public int peek(byte[] bArr, int i10, int i11) throws IOException {
        k kVar;
        int iMin;
        a(i11);
        int i12 = this.f54219g;
        int i13 = this.f54218f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            kVar = this;
            iMin = kVar.b(this.f54217e, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            kVar.f54219g += iMin;
        } else {
            kVar = this;
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(kVar.f54217e, kVar.f54218f, bArr, i10, iMin);
        kVar.f54218f += iMin;
        return iMin;
    }

    @Override // ee.q
    public boolean peekFully(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        if (!advancePeekPosition(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f54217e, this.f54218f - i11, bArr, i10, i11);
        return true;
    }

    @Override // ee.q, qf.k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        k kVar;
        int i12 = this.f54219g;
        int iB = 0;
        if (i12 != 0) {
            int iMin = Math.min(i12, i11);
            System.arraycopy(this.f54217e, 0, bArr, i10, iMin);
            c(iMin);
            iB = iMin;
        }
        if (iB == 0) {
            kVar = this;
            iB = kVar.b(bArr, i10, i11, 0, true);
        } else {
            kVar = this;
        }
        if (iB != -1) {
            kVar.f54216d += iB;
        }
        return iB;
    }

    @Override // ee.q
    public void readFully(byte[] bArr, int i10, int i11) throws IOException {
        readFully(bArr, i10, i11, false);
    }

    @Override // ee.q
    public void resetPeekPosition() {
        this.f54218f = 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Throwable */
    @Override // ee.q
    public <E extends Throwable> void setRetryPosition(long j10, E e10) throws Throwable {
        com.google.android.exoplayer2.util.a.checkArgument(j10 >= 0);
        this.f54216d = j10;
        throw e10;
    }

    @Override // ee.q
    public int skip(int i10) throws IOException {
        k kVar;
        int iMin = Math.min(this.f54219g, i10);
        c(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f54213a;
            kVar = this;
            iMin = kVar.b(bArr, 0, Math.min(i10, bArr.length), 0, true);
        } else {
            kVar = this;
        }
        if (iMin != -1) {
            kVar.f54216d += iMin;
        }
        return iMin;
    }

    @Override // ee.q
    public void skipFully(int i10) throws IOException {
        skipFully(i10, false);
    }

    @Override // ee.q
    public boolean readFully(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        int iMin;
        int i12 = this.f54219g;
        if (i12 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i12, i11);
            System.arraycopy(this.f54217e, 0, bArr, i10, iMin);
            c(iMin);
        }
        int iB = iMin;
        while (iB < i11 && iB != -1) {
            iB = b(bArr, i10, i11, iB, z10);
        }
        if (iB != -1) {
            this.f54216d += iB;
        }
        return iB != -1;
    }

    @Override // ee.q
    public boolean skipFully(int i10, boolean z10) throws IOException {
        int iMin = Math.min(this.f54219g, i10);
        c(iMin);
        int iB = iMin;
        while (iB < i10 && iB != -1) {
            byte[] bArr = this.f54213a;
            iB = b(bArr, -iB, Math.min(i10, bArr.length + iB), iB, z10);
        }
        if (iB != -1) {
            this.f54216d += iB;
        }
        return iB != -1;
    }

    @Override // ee.q
    public void peekFully(byte[] bArr, int i10, int i11) throws IOException {
        peekFully(bArr, i10, i11, false);
    }

    @Override // ee.q
    public void advancePeekPosition(int i10) throws IOException {
        advancePeekPosition(i10, false);
    }
}
