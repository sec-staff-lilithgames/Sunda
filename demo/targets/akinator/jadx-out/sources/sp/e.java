package sp;

import android.util.Pair;
import e3.g;
import gn.z0;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.b0;
import io.bidmachine.media3.common.util.m0;
import java.io.IOException;
import ko.a0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class e {
    public static d a(int i10, a0 a0Var, m0 m0Var) throws IOException {
        d dVarPeek = d.peek(a0Var, m0Var);
        while (true) {
            int i11 = dVarPeek.f86104a;
            if (i11 == i10) {
                return dVarPeek;
            }
            g.t(i11, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j10 = dVarPeek.f86105b;
            long j11 = 8 + j10;
            if (j10 % 2 != 0) {
                j11 = 9 + j10;
            }
            if (j11 > 2147483647L) {
                throw z0.createForUnsupportedContainerFeature("Chunk is too large (~2GB+) to skip; id: " + i11);
            }
            a0Var.skipFully((int) j11);
            dVarPeek = d.peek(a0Var, m0Var);
        }
    }

    public static boolean checkFileType(a0 a0Var) throws IOException {
        m0 m0Var = new m0(8);
        int i10 = d.peek(a0Var, m0Var).f86104a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        a0Var.peekFully(m0Var.getData(), 0, 4);
        m0Var.setPosition(0);
        int i11 = m0Var.readInt();
        if (i11 == 1463899717) {
            return true;
        }
        b0.e("WavHeaderReader", "Unsupported form type: " + i11);
        return false;
    }

    public static c readFormat(a0 a0Var) throws IOException {
        byte[] bArr;
        m0 m0Var = new m0(16);
        long j10 = a(1718449184, a0Var, m0Var).f86105b;
        io.bidmachine.media3.common.util.a.checkState(j10 >= 16);
        a0Var.peekFully(m0Var.getData(), 0, 16);
        m0Var.setPosition(0);
        int littleEndianUnsignedShort = m0Var.readLittleEndianUnsignedShort();
        int littleEndianUnsignedShort2 = m0Var.readLittleEndianUnsignedShort();
        int littleEndianUnsignedIntToInt = m0Var.readLittleEndianUnsignedIntToInt();
        int littleEndianUnsignedIntToInt2 = m0Var.readLittleEndianUnsignedIntToInt();
        int littleEndianUnsignedShort3 = m0Var.readLittleEndianUnsignedShort();
        int littleEndianUnsignedShort4 = m0Var.readLittleEndianUnsignedShort();
        int i10 = ((int) j10) - 16;
        if (i10 > 0) {
            bArr = new byte[i10];
            a0Var.peekFully(bArr, 0, i10);
        } else {
            bArr = a1.f60681c;
        }
        byte[] bArr2 = bArr;
        a0Var.skipFully((int) (a0Var.getPeekPosition() - a0Var.getPosition()));
        return new c(littleEndianUnsignedShort, littleEndianUnsignedShort2, littleEndianUnsignedIntToInt, littleEndianUnsignedIntToInt2, littleEndianUnsignedShort3, littleEndianUnsignedShort4, bArr2);
    }

    public static long readRf64SampleDataSize(a0 a0Var) throws IOException {
        m0 m0Var = new m0(8);
        d dVarPeek = d.peek(a0Var, m0Var);
        if (dVarPeek.f86104a != 1685272116) {
            a0Var.resetPeekPosition();
            return -1L;
        }
        a0Var.advancePeekPosition(8);
        m0Var.setPosition(0);
        a0Var.peekFully(m0Var.getData(), 0, 8);
        long littleEndianLong = m0Var.readLittleEndianLong();
        a0Var.skipFully(((int) dVarPeek.f86105b) + 8);
        return littleEndianLong;
    }

    public static Pair<Long, Long> skipToSampleData(a0 a0Var) throws IOException {
        a0Var.resetPeekPosition();
        d dVarA = a(1684108385, a0Var, new m0(8));
        a0Var.skipFully(8);
        return Pair.create(Long.valueOf(a0Var.getPosition()), Long.valueOf(dVarA.f86105b));
    }
}
