package pe;

import android.util.Pair;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.v0;
import ee.q;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class f {
    public static e a(int i10, q qVar, v0 v0Var) throws IOException {
        e eVarPeek = e.peek(qVar, v0Var);
        while (true) {
            int i11 = eVarPeek.f80989a;
            if (i11 == i10) {
                return eVarPeek;
            }
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.p(i11, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j10 = eVarPeek.f80990b + 8;
            if (j10 > 2147483647L) {
                throw h2.createForUnsupportedContainerFeature("Chunk is too large (~2GB+) to skip; id: " + i11);
            }
            qVar.skipFully((int) j10);
            eVarPeek = e.peek(qVar, v0Var);
        }
    }

    public static boolean checkFileType(q qVar) throws IOException {
        v0 v0Var = new v0(8);
        int i10 = e.peek(qVar, v0Var).f80989a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        qVar.peekFully(v0Var.getData(), 0, 4);
        v0Var.setPosition(0);
        int i11 = v0Var.readInt();
        if (i11 == 1463899717) {
            return true;
        }
        f0.e("WavHeaderReader", "Unsupported form type: " + i11);
        return false;
    }

    public static d readFormat(q qVar) throws IOException {
        byte[] bArr;
        v0 v0Var = new v0(16);
        long j10 = a(1718449184, qVar, v0Var).f80990b;
        com.google.android.exoplayer2.util.a.checkState(j10 >= 16);
        qVar.peekFully(v0Var.getData(), 0, 16);
        v0Var.setPosition(0);
        int littleEndianUnsignedShort = v0Var.readLittleEndianUnsignedShort();
        int littleEndianUnsignedShort2 = v0Var.readLittleEndianUnsignedShort();
        int littleEndianUnsignedIntToInt = v0Var.readLittleEndianUnsignedIntToInt();
        int littleEndianUnsignedIntToInt2 = v0Var.readLittleEndianUnsignedIntToInt();
        int littleEndianUnsignedShort3 = v0Var.readLittleEndianUnsignedShort();
        int littleEndianUnsignedShort4 = v0Var.readLittleEndianUnsignedShort();
        int i10 = ((int) j10) - 16;
        if (i10 > 0) {
            bArr = new byte[i10];
            qVar.peekFully(bArr, 0, i10);
        } else {
            bArr = n1.f28511f;
        }
        byte[] bArr2 = bArr;
        qVar.skipFully((int) (qVar.getPeekPosition() - qVar.getPosition()));
        return new d(littleEndianUnsignedShort, littleEndianUnsignedShort2, littleEndianUnsignedIntToInt, littleEndianUnsignedIntToInt2, littleEndianUnsignedShort3, littleEndianUnsignedShort4, bArr2);
    }

    public static long readRf64SampleDataSize(q qVar) throws IOException {
        v0 v0Var = new v0(8);
        e eVarPeek = e.peek(qVar, v0Var);
        if (eVarPeek.f80989a != 1685272116) {
            qVar.resetPeekPosition();
            return -1L;
        }
        qVar.advancePeekPosition(8);
        v0Var.setPosition(0);
        qVar.peekFully(v0Var.getData(), 0, 8);
        long littleEndianLong = v0Var.readLittleEndianLong();
        qVar.skipFully(((int) eVarPeek.f80990b) + 8);
        return littleEndianLong;
    }

    public static Pair<Long, Long> skipToSampleData(q qVar) throws IOException {
        qVar.resetPeekPosition();
        e eVarA = a(1684108385, qVar, new v0(8));
        qVar.skipFully(8);
        return Pair.create(Long.valueOf(qVar.getPosition()), Long.valueOf(eVarA.f80990b));
    }
}
