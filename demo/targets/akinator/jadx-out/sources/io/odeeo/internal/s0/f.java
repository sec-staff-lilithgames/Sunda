package io.odeeo.internal.s0;

import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.w;
import io.odeeo.internal.q0.x;
import io.odeeo.internal.s0.e;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f {
    public static int a(int i10) {
        return (-(i10 & 1)) ^ (i10 >> 1);
    }

    public static e.a b(x xVar) {
        int i10 = xVar.readInt();
        e.a aVar = null;
        if (i10 > 10000) {
            return null;
        }
        float[] fArr = new float[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            fArr[i11] = xVar.readFloat();
        }
        int i12 = xVar.readInt();
        if (i12 > 32000) {
            return null;
        }
        double d10 = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(i10 * 2.0d) / dLog);
        w wVar = new w(xVar.getData());
        int i13 = 8;
        wVar.setPosition(xVar.getPosition() * 8);
        float[] fArr2 = new float[i12 * 5];
        int[] iArr = new int[5];
        int i14 = 0;
        int i15 = 0;
        while (i14 < i12) {
            e.a aVar2 = aVar;
            int i16 = 0;
            while (i16 < 5) {
                int iA = a(wVar.readBits(iCeil)) + iArr[i16];
                if (iA >= i10 || iA < 0) {
                    return aVar2;
                }
                fArr2[i15] = fArr[iA];
                iArr[i16] = iA;
                i16++;
                i15++;
            }
            i14++;
            aVar = aVar2;
        }
        e.a aVar3 = aVar;
        wVar.setPosition((wVar.getPosition() + 7) & (-8));
        int i17 = 32;
        int bits = wVar.readBits(32);
        e.b[] bVarArr = new e.b[bits];
        int i18 = 0;
        while (i18 < bits) {
            int bits2 = wVar.readBits(i13);
            int bits3 = wVar.readBits(i13);
            int bits4 = wVar.readBits(i17);
            if (bits4 > 128000) {
                return aVar3;
            }
            int i19 = bits;
            int iCeil2 = (int) Math.ceil(Math.log(i12 * d10) / dLog);
            float[] fArr3 = new float[bits4 * 3];
            float[] fArr4 = new float[bits4 * 2];
            int i20 = 0;
            int i21 = 0;
            while (i20 < bits4) {
                int iA2 = a(wVar.readBits(iCeil2)) + i21;
                if (iA2 < 0 || iA2 >= i12) {
                    return aVar3;
                }
                int i22 = i20 * 3;
                int i23 = iA2 * 5;
                fArr3[i22] = fArr2[i23];
                fArr3[i22 + 1] = fArr2[i23 + 1];
                fArr3[i22 + 2] = fArr2[i23 + 2];
                int i24 = i20 * 2;
                fArr4[i24] = fArr2[i23 + 3];
                fArr4[i24 + 1] = fArr2[i23 + 4];
                i20++;
                i21 = iA2;
            }
            bVarArr[i18] = new e.b(bits2, fArr3, fArr4, bits3);
            i18++;
            bits = i19;
            i17 = 32;
            d10 = 2.0d;
            i13 = 8;
        }
        return new e.a(bVarArr);
    }

    public static ArrayList<e.a> c(x xVar) {
        if (xVar.readUnsignedByte() != 0) {
            return null;
        }
        xVar.skipBytes(7);
        int i10 = xVar.readInt();
        if (i10 == 1684433976) {
            x xVar2 = new x();
            Inflater inflater = new Inflater(true);
            try {
                if (!g0.inflate(xVar, xVar2, inflater)) {
                    return null;
                }
                inflater.end();
                xVar = xVar2;
            } finally {
                inflater.end();
            }
        } else if (i10 != 1918990112) {
            return null;
        }
        return e(xVar);
    }

    public static ArrayList<e.a> d(x xVar) {
        int i10;
        xVar.skipBytes(8);
        int position = xVar.getPosition();
        int iLimit = xVar.limit();
        while (position < iLimit && (i10 = xVar.readInt() + position) > position && i10 <= iLimit) {
            int i11 = xVar.readInt();
            if (i11 == 2037673328 || i11 == 1836279920) {
                xVar.setLimit(i10);
                return c(xVar);
            }
            xVar.setPosition(i10);
            position = i10;
        }
        return null;
    }

    public static e decode(byte[] bArr, int i10) {
        ArrayList<e.a> arrayListD;
        x xVar = new x(bArr);
        try {
            arrayListD = a(xVar) ? d(xVar) : c(xVar);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayListD = null;
        }
        if (arrayListD == null) {
            return null;
        }
        int size = arrayListD.size();
        if (size == 1) {
            return new e(arrayListD.get(0), i10);
        }
        if (size != 2) {
            return null;
        }
        return new e(arrayListD.get(0), arrayListD.get(1), i10);
    }

    public static ArrayList<e.a> e(x xVar) {
        ArrayList<e.a> arrayList = new ArrayList<>();
        int position = xVar.getPosition();
        int iLimit = xVar.limit();
        while (position < iLimit) {
            int i10 = xVar.readInt() + position;
            if (i10 <= position || i10 > iLimit) {
                return null;
            }
            if (xVar.readInt() == 1835365224) {
                e.a aVarB = b(xVar);
                if (aVarB == null) {
                    return null;
                }
                arrayList.add(aVarB);
            }
            xVar.setPosition(i10);
            position = i10;
        }
        return arrayList;
    }

    public static boolean a(x xVar) {
        xVar.skipBytes(4);
        int i10 = xVar.readInt();
        xVar.setPosition(0);
        return i10 == 1886547818;
    }
}
