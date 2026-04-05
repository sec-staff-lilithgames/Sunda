package io.odeeo.internal.q;

import android.util.Pair;
import io.odeeo.internal.b.g0;
import io.odeeo.internal.g.i;
import io.odeeo.internal.q0.p;
import io.odeeo.internal.q0.x;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f65826a;

        /* renamed from: b, reason: collision with root package name */
        public final long f65827b;

        public a(int i10, long j10) {
            this.f65826a = i10;
            this.f65827b = j10;
        }

        public static a peek(i iVar, x xVar) throws IOException {
            iVar.peekFully(xVar.getData(), 0, 8);
            xVar.setPosition(0);
            return new a(xVar.readInt(), xVar.readLittleEndianUnsignedInt());
        }
    }

    public static a a(int i10, i iVar, x xVar) throws IOException {
        a aVarPeek = a.peek(iVar, xVar);
        while (aVarPeek.f65826a != i10) {
            p.w("WavHeaderReader", "Ignoring unknown WAV chunk: " + aVarPeek.f65826a);
            long j10 = aVarPeek.f65827b + 8;
            if (j10 > 2147483647L) {
                throw g0.createForUnsupportedContainerFeature("Chunk is too large (~2GB+) to skip; id: " + aVarPeek.f65826a);
            }
            iVar.skipFully((int) j10);
            aVarPeek = a.peek(iVar, xVar);
        }
        return aVarPeek;
    }

    public static boolean checkFileType(i iVar) throws IOException {
        x xVar = new x(8);
        int i10 = a.peek(iVar, xVar).f65826a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        iVar.peekFully(xVar.getData(), 0, 4);
        xVar.setPosition(0);
        int i11 = xVar.readInt();
        if (i11 == 1463899717) {
            return true;
        }
        p.e("WavHeaderReader", "Unsupported form type: " + i11);
        return false;
    }

    public static b readFormat(i iVar) throws IOException {
        byte[] bArr;
        x xVar = new x(16);
        a aVarA = a(1718449184, iVar, xVar);
        io.odeeo.internal.q0.a.checkState(aVarA.f65827b >= 16);
        iVar.peekFully(xVar.getData(), 0, 16);
        xVar.setPosition(0);
        int littleEndianUnsignedShort = xVar.readLittleEndianUnsignedShort();
        int littleEndianUnsignedShort2 = xVar.readLittleEndianUnsignedShort();
        int littleEndianUnsignedIntToInt = xVar.readLittleEndianUnsignedIntToInt();
        int littleEndianUnsignedIntToInt2 = xVar.readLittleEndianUnsignedIntToInt();
        int littleEndianUnsignedShort3 = xVar.readLittleEndianUnsignedShort();
        int littleEndianUnsignedShort4 = xVar.readLittleEndianUnsignedShort();
        int i10 = ((int) aVarA.f65827b) - 16;
        if (i10 > 0) {
            bArr = new byte[i10];
            iVar.peekFully(bArr, 0, i10);
        } else {
            bArr = io.odeeo.internal.q0.g0.f65866f;
        }
        byte[] bArr2 = bArr;
        iVar.skipFully((int) (iVar.getPeekPosition() - iVar.getPosition()));
        return new b(littleEndianUnsignedShort, littleEndianUnsignedShort2, littleEndianUnsignedIntToInt, littleEndianUnsignedIntToInt2, littleEndianUnsignedShort3, littleEndianUnsignedShort4, bArr2);
    }

    public static long readRf64SampleDataSize(i iVar) throws IOException {
        x xVar = new x(8);
        a aVarPeek = a.peek(iVar, xVar);
        if (aVarPeek.f65826a != 1685272116) {
            iVar.resetPeekPosition();
            return -1L;
        }
        iVar.advancePeekPosition(8);
        xVar.setPosition(0);
        iVar.peekFully(xVar.getData(), 0, 8);
        long littleEndianLong = xVar.readLittleEndianLong();
        iVar.skipFully(((int) aVarPeek.f65827b) + 8);
        return littleEndianLong;
    }

    public static Pair<Long, Long> skipToSampleData(i iVar) throws IOException {
        iVar.resetPeekPosition();
        a aVarA = a(1684108385, iVar, new x(8));
        iVar.skipFully(8);
        return Pair.create(Long.valueOf(iVar.getPosition()), Long.valueOf(aVarA.f65827b));
    }
}
