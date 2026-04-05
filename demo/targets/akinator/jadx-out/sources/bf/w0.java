package bf;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final qf.c f9463a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9464b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.v0 f9465c;

    /* renamed from: d, reason: collision with root package name */
    public a f9466d;

    /* renamed from: e, reason: collision with root package name */
    public a f9467e;

    /* renamed from: f, reason: collision with root package name */
    public a f9468f;

    /* renamed from: g, reason: collision with root package name */
    public long f9469g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements qf.b {

        /* renamed from: a, reason: collision with root package name */
        public long f9470a;

        /* renamed from: b, reason: collision with root package name */
        public long f9471b;

        /* renamed from: c, reason: collision with root package name */
        public qf.a f9472c;

        /* renamed from: d, reason: collision with root package name */
        public a f9473d;

        public a(long j10, int i10) {
            reset(j10, i10);
        }

        public a clear() {
            this.f9472c = null;
            a aVar = this.f9473d;
            this.f9473d = null;
            return aVar;
        }

        @Override // qf.b
        public qf.a getAllocation() {
            return (qf.a) com.google.android.exoplayer2.util.a.checkNotNull(this.f9472c);
        }

        public void initialize(qf.a aVar, a aVar2) {
            this.f9472c = aVar;
            this.f9473d = aVar2;
        }

        @Override // qf.b
        public qf.b next() {
            a aVar = this.f9473d;
            if (aVar == null || aVar.f9472c == null) {
                return null;
            }
            return aVar;
        }

        public void reset(long j10, int i10) {
            com.google.android.exoplayer2.util.a.checkState(this.f9472c == null);
            this.f9470a = j10;
            this.f9471b = j10 + i10;
        }

        public int translateOffset(long j10) {
            return ((int) (j10 - this.f9470a)) + this.f9472c.f82907b;
        }
    }

    public w0(qf.c cVar) {
        this.f9463a = cVar;
        int individualAllocationLength = cVar.getIndividualAllocationLength();
        this.f9464b = individualAllocationLength;
        this.f9465c = new com.google.android.exoplayer2.util.v0(32);
        a aVar = new a(0L, individualAllocationLength);
        this.f9466d = aVar;
        this.f9467e = aVar;
        this.f9468f = aVar;
    }

    public static a b(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= aVar.f9471b) {
            aVar = aVar.f9473d;
        }
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (aVar.f9471b - j10));
            byteBuffer.put(aVar.f9472c.f82906a, aVar.translateOffset(j10), iMin);
            i10 -= iMin;
            j10 += iMin;
            if (j10 == aVar.f9471b) {
                aVar = aVar.f9473d;
            }
        }
        return aVar;
    }

    public static a c(a aVar, long j10, byte[] bArr, int i10) {
        while (j10 >= aVar.f9471b) {
            aVar = aVar.f9473d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (aVar.f9471b - j10));
            System.arraycopy(aVar.f9472c.f82906a, aVar.translateOffset(j10), bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += iMin;
            if (j10 == aVar.f9471b) {
                aVar = aVar.f9473d;
            }
        }
        return aVar;
    }

    public static a d(a aVar, ce.h hVar, x0 x0Var, com.google.android.exoplayer2.util.v0 v0Var) {
        a aVarC;
        if (hVar.isEncrypted()) {
            long j10 = x0Var.f9484b;
            int unsignedShort = 1;
            v0Var.reset(1);
            a aVarC2 = c(aVar, j10, v0Var.getData(), 1);
            long j11 = j10 + 1;
            byte b10 = v0Var.getData()[0];
            boolean z10 = (b10 & 128) != 0;
            int i10 = b10 & AbstractJsonLexerKt.TC_INVALID;
            ce.d dVar = hVar.f12236c;
            byte[] bArr = dVar.f12214a;
            if (bArr == null) {
                dVar.f12214a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            aVarC = c(aVarC2, j11, dVar.f12214a, i10);
            long j12 = j11 + i10;
            if (z10) {
                v0Var.reset(2);
                aVarC = c(aVarC, j12, v0Var.getData(), 2);
                j12 += 2;
                unsignedShort = v0Var.readUnsignedShort();
            }
            int i11 = unsignedShort;
            int[] iArr = dVar.f12217d;
            if (iArr == null || iArr.length < i11) {
                iArr = new int[i11];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = dVar.f12218e;
            if (iArr3 == null || iArr3.length < i11) {
                iArr3 = new int[i11];
            }
            int[] iArr4 = iArr3;
            if (z10) {
                int i12 = i11 * 6;
                v0Var.reset(i12);
                aVarC = c(aVarC, j12, v0Var.getData(), i12);
                j12 += i12;
                v0Var.setPosition(0);
                for (int i13 = 0; i13 < i11; i13++) {
                    iArr2[i13] = v0Var.readUnsignedShort();
                    iArr4[i13] = v0Var.readUnsignedIntToInt();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = x0Var.f9483a - ((int) (j12 - x0Var.f9484b));
            }
            ee.k0 k0Var = (ee.k0) com.google.android.exoplayer2.util.n1.castNonNull(x0Var.f9485c);
            dVar.set(i11, iArr2, iArr4, k0Var.f54221b, dVar.f12214a, k0Var.f54220a, k0Var.f54222c, k0Var.f54223d);
            long j13 = x0Var.f9484b;
            int i14 = (int) (j12 - j13);
            x0Var.f9484b = j13 + i14;
            x0Var.f9483a -= i14;
        } else {
            aVarC = aVar;
        }
        if (!hVar.hasSupplementalData()) {
            hVar.ensureSpaceForWrite(x0Var.f9483a);
            return b(aVarC, x0Var.f9484b, hVar.f12237e, x0Var.f9483a);
        }
        v0Var.reset(4);
        a aVarC3 = c(aVarC, x0Var.f9484b, v0Var.getData(), 4);
        int unsignedIntToInt = v0Var.readUnsignedIntToInt();
        x0Var.f9484b += 4;
        x0Var.f9483a -= 4;
        hVar.ensureSpaceForWrite(unsignedIntToInt);
        a aVarB = b(aVarC3, x0Var.f9484b, hVar.f12237e, unsignedIntToInt);
        x0Var.f9484b += unsignedIntToInt;
        int i15 = x0Var.f9483a - unsignedIntToInt;
        x0Var.f9483a = i15;
        hVar.resetSupplementalData(i15);
        return b(aVarB, x0Var.f9484b, hVar.f12240h, x0Var.f9483a);
    }

    public final int a(int i10) {
        a aVar = this.f9468f;
        if (aVar.f9472c == null) {
            aVar.initialize(this.f9463a.allocate(), new a(this.f9468f.f9471b, this.f9464b));
        }
        return Math.min(i10, (int) (this.f9468f.f9471b - this.f9469g));
    }

    public void discardDownstreamTo(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f9466d;
            if (j10 < aVar.f9471b) {
                break;
            }
            this.f9463a.release(aVar.f9472c);
            this.f9466d = this.f9466d.clear();
        }
        if (this.f9467e.f9470a < aVar.f9470a) {
            this.f9467e = aVar;
        }
    }

    public void discardUpstreamSampleBytes(long j10) {
        com.google.android.exoplayer2.util.a.checkArgument(j10 <= this.f9469g);
        this.f9469g = j10;
        qf.c cVar = this.f9463a;
        int i10 = this.f9464b;
        if (j10 != 0) {
            a aVar = this.f9466d;
            if (j10 != aVar.f9470a) {
                while (this.f9469g > aVar.f9471b) {
                    aVar = aVar.f9473d;
                }
                a aVar2 = (a) com.google.android.exoplayer2.util.a.checkNotNull(aVar.f9473d);
                if (aVar2.f9472c != null) {
                    cVar.release(aVar2);
                    aVar2.clear();
                }
                a aVar3 = new a(aVar.f9471b, i10);
                aVar.f9473d = aVar3;
                if (this.f9469g == aVar.f9471b) {
                    aVar = aVar3;
                }
                this.f9468f = aVar;
                if (this.f9467e == aVar2) {
                    this.f9467e = aVar3;
                    return;
                }
                return;
            }
        }
        a aVar4 = this.f9466d;
        if (aVar4.f9472c != null) {
            cVar.release(aVar4);
            aVar4.clear();
        }
        a aVar5 = new a(this.f9469g, i10);
        this.f9466d = aVar5;
        this.f9467e = aVar5;
        this.f9468f = aVar5;
    }

    public long getTotalBytesWritten() {
        return this.f9469g;
    }

    public void peekToBuffer(ce.h hVar, x0 x0Var) {
        d(this.f9467e, hVar, x0Var, this.f9465c);
    }

    public void readToBuffer(ce.h hVar, x0 x0Var) {
        this.f9467e = d(this.f9467e, hVar, x0Var, this.f9465c);
    }

    public void reset() {
        a aVar = this.f9466d;
        qf.a aVar2 = aVar.f9472c;
        qf.c cVar = this.f9463a;
        if (aVar2 != null) {
            cVar.release(aVar);
            aVar.clear();
        }
        this.f9466d.reset(0L, this.f9464b);
        a aVar3 = this.f9466d;
        this.f9467e = aVar3;
        this.f9468f = aVar3;
        this.f9469g = 0L;
        cVar.trim();
    }

    public void rewind() {
        this.f9467e = this.f9466d;
    }

    public int sampleData(qf.k kVar, int i10, boolean z10) throws IOException {
        int iA = a(i10);
        a aVar = this.f9468f;
        int i11 = kVar.read(aVar.f9472c.f82906a, aVar.translateOffset(this.f9469g), iA);
        if (i11 == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = this.f9469g + i11;
        this.f9469g = j10;
        a aVar2 = this.f9468f;
        if (j10 == aVar2.f9471b) {
            this.f9468f = aVar2.f9473d;
        }
        return i11;
    }

    public void sampleData(com.google.android.exoplayer2.util.v0 v0Var, int i10) {
        while (i10 > 0) {
            int iA = a(i10);
            a aVar = this.f9468f;
            v0Var.readBytes(aVar.f9472c.f82906a, aVar.translateOffset(this.f9469g), iA);
            i10 -= iA;
            long j10 = this.f9469g + iA;
            this.f9469g = j10;
            a aVar2 = this.f9468f;
            if (j10 == aVar2.f9471b) {
                this.f9468f = aVar2.f9473d;
            }
        }
    }
}
