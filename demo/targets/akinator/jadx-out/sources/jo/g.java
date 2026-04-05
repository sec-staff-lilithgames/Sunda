package jo;

import io.bidmachine.media3.common.util.m0;
import java.util.ArrayList;
import jo.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class g {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v15, types: [jo.f$a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList a(io.bidmachine.media3.common.util.m0 r30) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jo.g.a(io.bidmachine.media3.common.util.m0):java.util.ArrayList");
    }

    public static f decode(byte[] bArr, int i10) {
        ArrayList arrayListA;
        int i11;
        m0 m0Var = new m0(bArr);
        try {
            m0Var.skipBytes(4);
            i11 = m0Var.readInt();
            m0Var.setPosition(0);
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        if (i11 == 1886547818) {
            m0Var.skipBytes(8);
            int position = m0Var.getPosition();
            int iLimit = m0Var.limit();
            while (position < iLimit) {
                int i12 = m0Var.readInt() + position;
                if (i12 > position && i12 <= iLimit) {
                    int i13 = m0Var.readInt();
                    if (i13 != 2037673328 && i13 != 1836279920) {
                        m0Var.setPosition(i12);
                        position = i12;
                    }
                    m0Var.setLimit(i12);
                    arrayListA = a(m0Var);
                    break;
                }
                break;
            }
            arrayListA = null;
        } else {
            arrayListA = a(m0Var);
        }
        if (arrayListA == null) {
            return null;
        }
        int size = arrayListA.size();
        if (size == 1) {
            return new f((f.a) arrayListA.get(0), i10);
        }
        if (size != 2) {
            return null;
        }
        return new f((f.a) arrayListA.get(0), (f.a) arrayListA.get(1), i10);
    }
}
