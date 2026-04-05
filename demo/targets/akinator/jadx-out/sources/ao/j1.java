package ao;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final go.c f7703a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7704b;

    /* renamed from: c, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.m0 f7705c;

    /* renamed from: d, reason: collision with root package name */
    public a f7706d;

    /* renamed from: e, reason: collision with root package name */
    public a f7707e;

    /* renamed from: f, reason: collision with root package name */
    public a f7708f;

    /* renamed from: g, reason: collision with root package name */
    public long f7709g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements go.b {

        /* renamed from: a, reason: collision with root package name */
        public long f7710a;

        /* renamed from: b, reason: collision with root package name */
        public long f7711b;

        /* renamed from: c, reason: collision with root package name */
        public go.a f7712c;

        /* renamed from: d, reason: collision with root package name */
        public a f7713d;

        public a(long j10, int i10) {
            reset(j10, i10);
        }

        public a clear() {
            this.f7712c = null;
            a aVar = this.f7713d;
            this.f7713d = null;
            return aVar;
        }

        @Override // go.b
        public go.a getAllocation() {
            return (go.a) io.bidmachine.media3.common.util.a.checkNotNull(this.f7712c);
        }

        public void initialize(go.a aVar, a aVar2) {
            this.f7712c = aVar;
            this.f7713d = aVar2;
        }

        @Override // go.b
        public go.b next() {
            a aVar = this.f7713d;
            if (aVar == null || aVar.f7712c == null) {
                return null;
            }
            return aVar;
        }

        public void reset(long j10, int i10) {
            io.bidmachine.media3.common.util.a.checkState(this.f7712c == null);
            this.f7710a = j10;
            this.f7711b = j10 + i10;
        }

        public int translateOffset(long j10) {
            return ((int) (j10 - this.f7710a)) + this.f7712c.f58294b;
        }
    }

    public j1(go.c cVar) {
        this.f7703a = cVar;
        int individualAllocationLength = cVar.getIndividualAllocationLength();
        this.f7704b = individualAllocationLength;
        this.f7705c = new io.bidmachine.media3.common.util.m0(32);
        a aVar = new a(0L, individualAllocationLength);
        this.f7706d = aVar;
        this.f7707e = aVar;
        this.f7708f = aVar;
    }

    public static a b(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= aVar.f7711b) {
            aVar = aVar.f7713d;
        }
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (aVar.f7711b - j10));
            byteBuffer.put(aVar.f7712c.f58293a, aVar.translateOffset(j10), iMin);
            i10 -= iMin;
            j10 += iMin;
            if (j10 == aVar.f7711b) {
                aVar = aVar.f7713d;
            }
        }
        return aVar;
    }

    public static a c(a aVar, long j10, byte[] bArr, int i10) {
        while (j10 >= aVar.f7711b) {
            aVar = aVar.f7713d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (aVar.f7711b - j10));
            System.arraycopy(aVar.f7712c.f58293a, aVar.translateOffset(j10), bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += iMin;
            if (j10 == aVar.f7711b) {
                aVar = aVar.f7713d;
            }
        }
        return aVar;
    }

    public static a d(a aVar, nn.g gVar, k1 k1Var, io.bidmachine.media3.common.util.m0 m0Var) {
        a aVarC;
        if (gVar.isEncrypted()) {
            long j10 = k1Var.f7724b;
            int unsignedShort = 1;
            m0Var.reset(1);
            a aVarC2 = c(aVar, j10, m0Var.getData(), 1);
            long j11 = j10 + 1;
            byte b10 = m0Var.getData()[0];
            boolean z10 = (b10 & 128) != 0;
            int i10 = b10 & AbstractJsonLexerKt.TC_INVALID;
            nn.d dVar = gVar.f77079e;
            byte[] bArr = dVar.f77068a;
            if (bArr == null) {
                dVar.f77068a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            aVarC = c(aVarC2, j11, dVar.f77068a, i10);
            long j12 = j11 + i10;
            if (z10) {
                m0Var.reset(2);
                aVarC = c(aVarC, j12, m0Var.getData(), 2);
                j12 += 2;
                unsignedShort = m0Var.readUnsignedShort();
            }
            int i11 = unsignedShort;
            int[] iArr = dVar.f77071d;
            if (iArr == null || iArr.length < i11) {
                iArr = new int[i11];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = dVar.f77072e;
            if (iArr3 == null || iArr3.length < i11) {
                iArr3 = new int[i11];
            }
            int[] iArr4 = iArr3;
            if (z10) {
                int i12 = i11 * 6;
                m0Var.reset(i12);
                aVarC = c(aVarC, j12, m0Var.getData(), i12);
                j12 += i12;
                m0Var.setPosition(0);
                for (int i13 = 0; i13 < i11; i13++) {
                    iArr2[i13] = m0Var.readUnsignedShort();
                    iArr4[i13] = m0Var.readUnsignedIntToInt();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = k1Var.f7723a - ((int) (j12 - k1Var.f7724b));
            }
            ko.d1 d1Var = (ko.d1) io.bidmachine.media3.common.util.a1.castNonNull(k1Var.f7725c);
            dVar.set(i11, iArr2, iArr4, d1Var.f71625b, dVar.f77068a, d1Var.f71624a, d1Var.f71626c, d1Var.f71627d);
            long j13 = k1Var.f7724b;
            int i14 = (int) (j12 - j13);
            k1Var.f7724b = j13 + i14;
            k1Var.f7723a -= i14;
        } else {
            aVarC = aVar;
        }
        if (!gVar.hasSupplementalData()) {
            gVar.ensureSpaceForWrite(k1Var.f7723a);
            return b(aVarC, k1Var.f7724b, gVar.f77080f, k1Var.f7723a);
        }
        m0Var.reset(4);
        a aVarC3 = c(aVarC, k1Var.f7724b, m0Var.getData(), 4);
        int unsignedIntToInt = m0Var.readUnsignedIntToInt();
        k1Var.f7724b += 4;
        k1Var.f7723a -= 4;
        gVar.ensureSpaceForWrite(unsignedIntToInt);
        a aVarB = b(aVarC3, k1Var.f7724b, gVar.f77080f, unsignedIntToInt);
        k1Var.f7724b += unsignedIntToInt;
        int i15 = k1Var.f7723a - unsignedIntToInt;
        k1Var.f7723a = i15;
        gVar.resetSupplementalData(i15);
        return b(aVarB, k1Var.f7724b, gVar.f77083i, k1Var.f7723a);
    }

    public final int a(int i10) {
        a aVar = this.f7708f;
        if (aVar.f7712c == null) {
            aVar.initialize(this.f7703a.allocate(), new a(this.f7708f.f7711b, this.f7704b));
        }
        return Math.min(i10, (int) (this.f7708f.f7711b - this.f7709g));
    }

    public void discardDownstreamTo(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f7706d;
            if (j10 < aVar.f7711b) {
                break;
            }
            this.f7703a.release(aVar.f7712c);
            this.f7706d = this.f7706d.clear();
        }
        if (this.f7707e.f7710a < aVar.f7710a) {
            this.f7707e = aVar;
        }
    }

    public void discardUpstreamSampleBytes(long j10) {
        io.bidmachine.media3.common.util.a.checkArgument(j10 <= this.f7709g);
        this.f7709g = j10;
        go.c cVar = this.f7703a;
        int i10 = this.f7704b;
        if (j10 != 0) {
            a aVar = this.f7706d;
            if (j10 != aVar.f7710a) {
                while (this.f7709g > aVar.f7711b) {
                    aVar = aVar.f7713d;
                }
                a aVar2 = (a) io.bidmachine.media3.common.util.a.checkNotNull(aVar.f7713d);
                if (aVar2.f7712c != null) {
                    cVar.release(aVar2);
                    aVar2.clear();
                }
                a aVar3 = new a(aVar.f7711b, i10);
                aVar.f7713d = aVar3;
                if (this.f7709g == aVar.f7711b) {
                    aVar = aVar3;
                }
                this.f7708f = aVar;
                if (this.f7707e == aVar2) {
                    this.f7707e = aVar3;
                    return;
                }
                return;
            }
        }
        a aVar4 = this.f7706d;
        if (aVar4.f7712c != null) {
            cVar.release(aVar4);
            aVar4.clear();
        }
        a aVar5 = new a(this.f7709g, i10);
        this.f7706d = aVar5;
        this.f7707e = aVar5;
        this.f7708f = aVar5;
    }

    public long getTotalBytesWritten() {
        return this.f7709g;
    }

    public void peekToBuffer(nn.g gVar, k1 k1Var) {
        d(this.f7707e, gVar, k1Var, this.f7705c);
    }

    public void readToBuffer(nn.g gVar, k1 k1Var) {
        this.f7707e = d(this.f7707e, gVar, k1Var, this.f7705c);
    }

    public void reset() {
        a aVar = this.f7706d;
        go.a aVar2 = aVar.f7712c;
        go.c cVar = this.f7703a;
        if (aVar2 != null) {
            cVar.release(aVar);
            aVar.clear();
        }
        this.f7706d.reset(0L, this.f7704b);
        a aVar3 = this.f7706d;
        this.f7707e = aVar3;
        this.f7708f = aVar3;
        this.f7709g = 0L;
        cVar.trim();
    }

    public void rewind() {
        this.f7707e = this.f7706d;
    }

    public int sampleData(gn.o oVar, int i10, boolean z10) throws IOException {
        int iA = a(i10);
        a aVar = this.f7708f;
        int i11 = oVar.read(aVar.f7712c.f58293a, aVar.translateOffset(this.f7709g), iA);
        if (i11 == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = this.f7709g + i11;
        this.f7709g = j10;
        a aVar2 = this.f7708f;
        if (j10 == aVar2.f7711b) {
            this.f7708f = aVar2.f7713d;
        }
        return i11;
    }

    public void sampleData(io.bidmachine.media3.common.util.m0 m0Var, int i10) {
        while (i10 > 0) {
            int iA = a(i10);
            a aVar = this.f7708f;
            m0Var.readBytes(aVar.f7712c.f58293a, aVar.translateOffset(this.f7709g), iA);
            i10 -= iA;
            long j10 = this.f7709g + iA;
            this.f7709g = j10;
            a aVar2 = this.f7708f;
            if (j10 == aVar2.f7711b) {
                this.f7708f = aVar2.f7713d;
            }
        }
    }
}
