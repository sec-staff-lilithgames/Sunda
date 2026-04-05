package io.odeeo.internal.a0;

import io.odeeo.internal.a0.c0;
import io.odeeo.internal.g.x;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.p0.b f62231a;

    /* renamed from: b, reason: collision with root package name */
    public final int f62232b;

    /* renamed from: c, reason: collision with root package name */
    public final io.odeeo.internal.q0.x f62233c;

    /* renamed from: d, reason: collision with root package name */
    public a f62234d;

    /* renamed from: e, reason: collision with root package name */
    public a f62235e;

    /* renamed from: f, reason: collision with root package name */
    public a f62236f;

    /* renamed from: g, reason: collision with root package name */
    public long f62237g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f62238a;

        /* renamed from: b, reason: collision with root package name */
        public final long f62239b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f62240c;

        /* renamed from: d, reason: collision with root package name */
        public io.odeeo.internal.p0.a f62241d;

        /* renamed from: e, reason: collision with root package name */
        public a f62242e;

        public a(long j10, int i10) {
            this.f62238a = j10;
            this.f62239b = j10 + i10;
        }

        public a clear() {
            this.f62241d = null;
            a aVar = this.f62242e;
            this.f62242e = null;
            return aVar;
        }

        public void initialize(io.odeeo.internal.p0.a aVar, a aVar2) {
            this.f62241d = aVar;
            this.f62242e = aVar2;
            this.f62240c = true;
        }

        public int translateOffset(long j10) {
            return ((int) (j10 - this.f62238a)) + this.f62241d.f65582b;
        }
    }

    public b0(io.odeeo.internal.p0.b bVar) {
        this.f62231a = bVar;
        int individualAllocationLength = bVar.getIndividualAllocationLength();
        this.f62232b = individualAllocationLength;
        this.f62233c = new io.odeeo.internal.q0.x(32);
        a aVar = new a(0L, individualAllocationLength);
        this.f62234d = aVar;
        this.f62235e = aVar;
        this.f62236f = aVar;
    }

    public final void a(a aVar) {
        if (aVar.f62240c) {
            a aVar2 = this.f62236f;
            int i10 = (((int) (aVar2.f62238a - aVar.f62238a)) / this.f62232b) + (aVar2.f62240c ? 1 : 0);
            io.odeeo.internal.p0.a[] aVarArr = new io.odeeo.internal.p0.a[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                aVarArr[i11] = aVar.f62241d;
                aVar = aVar.clear();
            }
            this.f62231a.release(aVarArr);
        }
    }

    public final int b(int i10) {
        a aVar = this.f62236f;
        if (!aVar.f62240c) {
            aVar.initialize(this.f62231a.allocate(), new a(this.f62236f.f62239b, this.f62232b));
        }
        return Math.min(i10, (int) (this.f62236f.f62239b - this.f62237g));
    }

    public void discardDownstreamTo(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f62234d;
            if (j10 < aVar.f62239b) {
                break;
            }
            this.f62231a.release(aVar.f62241d);
            this.f62234d = this.f62234d.clear();
        }
        if (this.f62235e.f62238a < aVar.f62238a) {
            this.f62235e = aVar;
        }
    }

    public void discardUpstreamSampleBytes(long j10) {
        this.f62237g = j10;
        if (j10 != 0) {
            a aVar = this.f62234d;
            if (j10 != aVar.f62238a) {
                while (this.f62237g > aVar.f62239b) {
                    aVar = aVar.f62242e;
                }
                a aVar2 = aVar.f62242e;
                a(aVar2);
                a aVar3 = new a(aVar.f62239b, this.f62232b);
                aVar.f62242e = aVar3;
                if (this.f62237g == aVar.f62239b) {
                    aVar = aVar3;
                }
                this.f62236f = aVar;
                if (this.f62235e == aVar2) {
                    this.f62235e = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.f62234d);
        a aVar4 = new a(this.f62237g, this.f62232b);
        this.f62234d = aVar4;
        this.f62235e = aVar4;
        this.f62236f = aVar4;
    }

    public long getTotalBytesWritten() {
        return this.f62237g;
    }

    public void peekToBuffer(io.odeeo.internal.e.g gVar, c0.b bVar) {
        b(this.f62235e, gVar, bVar, this.f62233c);
    }

    public void readToBuffer(io.odeeo.internal.e.g gVar, c0.b bVar) {
        this.f62235e = b(this.f62235e, gVar, bVar, this.f62233c);
    }

    public void reset() {
        a(this.f62234d);
        a aVar = new a(0L, this.f62232b);
        this.f62234d = aVar;
        this.f62235e = aVar;
        this.f62236f = aVar;
        this.f62237g = 0L;
        this.f62231a.trim();
    }

    public void rewind() {
        this.f62235e = this.f62234d;
    }

    public int sampleData(io.odeeo.internal.p0.g gVar, int i10, boolean z10) throws IOException {
        int iB = b(i10);
        a aVar = this.f62236f;
        int i11 = gVar.read(aVar.f62241d.f65581a, aVar.translateOffset(this.f62237g), iB);
        if (i11 != -1) {
            a(i11);
            return i11;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public static a b(a aVar, io.odeeo.internal.e.g gVar, c0.b bVar, io.odeeo.internal.q0.x xVar) {
        if (gVar.isEncrypted()) {
            aVar = a(aVar, gVar, bVar, xVar);
        }
        if (gVar.hasSupplementalData()) {
            xVar.reset(4);
            a aVarA = a(aVar, bVar.f62273b, xVar.getData(), 4);
            int unsignedIntToInt = xVar.readUnsignedIntToInt();
            bVar.f62273b += 4;
            bVar.f62272a -= 4;
            gVar.ensureSpaceForWrite(unsignedIntToInt);
            a aVarA2 = a(aVarA, bVar.f62273b, gVar.f63705c, unsignedIntToInt);
            bVar.f62273b += unsignedIntToInt;
            int i10 = bVar.f62272a - unsignedIntToInt;
            bVar.f62272a = i10;
            gVar.resetSupplementalData(i10);
            return a(aVarA2, bVar.f62273b, gVar.f63708f, bVar.f62272a);
        }
        gVar.ensureSpaceForWrite(bVar.f62272a);
        return a(aVar, bVar.f62273b, gVar.f63705c, bVar.f62272a);
    }

    public final void a(int i10) {
        long j10 = this.f62237g + i10;
        this.f62237g = j10;
        a aVar = this.f62236f;
        if (j10 == aVar.f62239b) {
            this.f62236f = aVar.f62242e;
        }
    }

    public void sampleData(io.odeeo.internal.q0.x xVar, int i10) {
        while (i10 > 0) {
            int iB = b(i10);
            a aVar = this.f62236f;
            xVar.readBytes(aVar.f62241d.f65581a, aVar.translateOffset(this.f62237g), iB);
            i10 -= iB;
            a(iB);
        }
    }

    public static a a(a aVar, io.odeeo.internal.e.g gVar, c0.b bVar, io.odeeo.internal.q0.x xVar) {
        long j10 = bVar.f62273b;
        int unsignedShort = 1;
        xVar.reset(1);
        a aVarA = a(aVar, j10, xVar.getData(), 1);
        long j11 = j10 + 1;
        byte b10 = xVar.getData()[0];
        boolean z10 = (b10 & 128) != 0;
        int i10 = b10 & AbstractJsonLexerKt.TC_INVALID;
        io.odeeo.internal.e.c cVar = gVar.f63704b;
        byte[] bArr = cVar.f63681a;
        if (bArr == null) {
            cVar.f63681a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a aVarA2 = a(aVarA, j11, cVar.f63681a, i10);
        long j12 = j11 + i10;
        if (z10) {
            xVar.reset(2);
            aVarA2 = a(aVarA2, j12, xVar.getData(), 2);
            j12 += 2;
            unsignedShort = xVar.readUnsignedShort();
        }
        int i11 = unsignedShort;
        int[] iArr = cVar.f63684d;
        if (iArr == null || iArr.length < i11) {
            iArr = new int[i11];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.f63685e;
        if (iArr3 == null || iArr3.length < i11) {
            iArr3 = new int[i11];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i12 = i11 * 6;
            xVar.reset(i12);
            aVarA2 = a(aVarA2, j12, xVar.getData(), i12);
            j12 += i12;
            xVar.setPosition(0);
            for (int i13 = 0; i13 < i11; i13++) {
                iArr2[i13] = xVar.readUnsignedShort();
                iArr4[i13] = xVar.readUnsignedIntToInt();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f62272a - ((int) (j12 - bVar.f62273b));
        }
        x.a aVar2 = (x.a) io.odeeo.internal.q0.g0.castNonNull(bVar.f62274c);
        cVar.set(i11, iArr2, iArr4, aVar2.f64180b, cVar.f63681a, aVar2.f64179a, aVar2.f64181c, aVar2.f64182d);
        long j13 = bVar.f62273b;
        int i14 = (int) (j12 - j13);
        bVar.f62273b = j13 + i14;
        bVar.f62272a -= i14;
        return aVarA2;
    }

    public static a a(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        a aVarA = a(aVar, j10);
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (aVarA.f62239b - j10));
            byteBuffer.put(aVarA.f62241d.f65581a, aVarA.translateOffset(j10), iMin);
            i10 -= iMin;
            j10 += iMin;
            if (j10 == aVarA.f62239b) {
                aVarA = aVarA.f62242e;
            }
        }
        return aVarA;
    }

    public static a a(a aVar, long j10, byte[] bArr, int i10) {
        a aVarA = a(aVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (aVarA.f62239b - j10));
            System.arraycopy(aVarA.f62241d.f65581a, aVarA.translateOffset(j10), bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += iMin;
            if (j10 == aVarA.f62239b) {
                aVarA = aVarA.f62242e;
            }
        }
        return aVarA;
    }

    public static a a(a aVar, long j10) {
        while (j10 >= aVar.f62239b) {
            aVar = aVar.f62242e;
        }
        return aVar;
    }
}
