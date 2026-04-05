package io.odeeo.internal.g;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.q0.g0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e implements i {

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.p0.g f64119b;

    /* renamed from: c, reason: collision with root package name */
    public final long f64120c;

    /* renamed from: d, reason: collision with root package name */
    public long f64121d;

    /* renamed from: f, reason: collision with root package name */
    public int f64123f;

    /* renamed from: g, reason: collision with root package name */
    public int f64124g;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f64122e = new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f64118a = new byte[4096];

    static {
        io.odeeo.internal.b.r.registerModule("goog.exo.extractor");
    }

    public e(io.odeeo.internal.p0.g gVar, long j10, long j11) {
        this.f64119b = gVar;
        this.f64121d = j10;
        this.f64120c = j11;
    }

    public final int a(byte[] bArr, int i10, int i11) {
        int i12 = this.f64124g;
        if (i12 == 0) {
            return 0;
        }
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f64122e, 0, bArr, i10, iMin);
        d(iMin);
        return iMin;
    }

    @Override // io.odeeo.internal.g.i
    public boolean advancePeekPosition(int i10, boolean z10) throws IOException {
        b(i10);
        int iA = this.f64124g - this.f64123f;
        while (iA < i10) {
            int i11 = i10;
            boolean z11 = z10;
            iA = a(this.f64122e, this.f64123f, i11, iA, z11);
            if (iA == -1) {
                return false;
            }
            this.f64124g = this.f64123f + iA;
            i10 = i11;
            z10 = z11;
        }
        this.f64123f += i10;
        return true;
    }

    public final void b(int i10) {
        int i11 = this.f64123f + i10;
        byte[] bArr = this.f64122e;
        if (i11 > bArr.length) {
            this.f64122e = Arrays.copyOf(this.f64122e, g0.constrainValue(bArr.length * 2, C.DEFAULT_BUFFER_SEGMENT_SIZE + i11, i11 + 524288));
        }
    }

    public final int c(int i10) {
        int iMin = Math.min(this.f64124g, i10);
        d(iMin);
        return iMin;
    }

    public final void d(int i10) {
        int i11 = this.f64124g - i10;
        this.f64124g = i11;
        this.f64123f = 0;
        byte[] bArr = this.f64122e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f64122e = bArr2;
    }

    @Override // io.odeeo.internal.g.i
    public long getLength() {
        return this.f64120c;
    }

    @Override // io.odeeo.internal.g.i
    public long getPeekPosition() {
        return this.f64121d + this.f64123f;
    }

    @Override // io.odeeo.internal.g.i
    public long getPosition() {
        return this.f64121d;
    }

    @Override // io.odeeo.internal.g.i
    public int peek(byte[] bArr, int i10, int i11) throws IOException {
        e eVar;
        int iMin;
        b(i11);
        int i12 = this.f64124g;
        int i13 = this.f64123f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            eVar = this;
            iMin = eVar.a(this.f64122e, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            eVar.f64124g += iMin;
        } else {
            eVar = this;
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(eVar.f64122e, eVar.f64123f, bArr, i10, iMin);
        eVar.f64123f += iMin;
        return iMin;
    }

    @Override // io.odeeo.internal.g.i
    public boolean peekFully(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        if (!advancePeekPosition(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f64122e, this.f64123f - i11, bArr, i10, i11);
        return true;
    }

    @Override // io.odeeo.internal.g.i, io.odeeo.internal.p0.g
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int iA = a(bArr, i10, i11);
        if (iA == 0) {
            iA = a(bArr, i10, i11, 0, true);
        }
        a(iA);
        return iA;
    }

    @Override // io.odeeo.internal.g.i
    public boolean readFully(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        int iA = a(bArr, i10, i11);
        while (iA < i11 && iA != -1) {
            iA = a(bArr, i10, i11, iA, z10);
        }
        a(iA);
        return iA != -1;
    }

    @Override // io.odeeo.internal.g.i
    public void resetPeekPosition() {
        this.f64123f = 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Throwable */
    @Override // io.odeeo.internal.g.i
    public <E extends Throwable> void setRetryPosition(long j10, E e10) throws Throwable {
        io.odeeo.internal.q0.a.checkArgument(j10 >= 0);
        this.f64121d = j10;
        throw e10;
    }

    @Override // io.odeeo.internal.g.i
    public int skip(int i10) throws IOException {
        int iC = c(i10);
        if (iC == 0) {
            byte[] bArr = this.f64118a;
            iC = a(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        a(iC);
        return iC;
    }

    @Override // io.odeeo.internal.g.i
    public boolean skipFully(int i10, boolean z10) throws IOException {
        int iC = c(i10);
        while (iC < i10 && iC != -1) {
            iC = a(this.f64118a, -iC, Math.min(i10, this.f64118a.length + iC), iC, z10);
        }
        a(iC);
        return iC != -1;
    }

    @Override // io.odeeo.internal.g.i
    public void peekFully(byte[] bArr, int i10, int i11) throws IOException {
        peekFully(bArr, i10, i11, false);
    }

    @Override // io.odeeo.internal.g.i
    public void readFully(byte[] bArr, int i10, int i11) throws IOException {
        readFully(bArr, i10, i11, false);
    }

    public final int a(byte[] bArr, int i10, int i11, int i12, boolean z10) throws IOException {
        if (!Thread.interrupted()) {
            int i13 = this.f64119b.read(bArr, i10 + i12, i11 - i12);
            if (i13 != -1) {
                return i12 + i13;
            }
            if (i12 == 0 && z10) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    @Override // io.odeeo.internal.g.i
    public void skipFully(int i10) throws IOException {
        skipFully(i10, false);
    }

    @Override // io.odeeo.internal.g.i
    public void advancePeekPosition(int i10) throws IOException {
        advancePeekPosition(i10, false);
    }

    public final void a(int i10) {
        if (i10 != -1) {
            this.f64121d += i10;
        }
    }
}
