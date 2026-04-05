package io.odeeo.internal.q0;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f65849a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f65850b = {"", "A", "B", "C"};

    public static int a(byte[] bArr, int i10) {
        int length = bArr.length - f65849a.length;
        while (i10 <= length) {
            if (b(bArr, i10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static boolean b(byte[] bArr, int i10) {
        if (bArr.length - i10 <= f65849a.length) {
            return false;
        }
        int i11 = 0;
        while (true) {
            byte[] bArr2 = f65849a;
            if (i11 >= bArr2.length) {
                return true;
            }
            if (bArr[i10 + i11] != bArr2[i11]) {
                return false;
            }
            i11++;
        }
    }

    public static String buildAvcCodecString(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static List<byte[]> buildCea708InitializationData(boolean z10) {
        return Collections.singletonList(z10 ? new byte[]{1} : new byte[]{0});
    }

    public static String buildHevcCodecString(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        StringBuilder sb2 = new StringBuilder(g0.formatInvariant("hvc1.%s%d.%X.%c%d", f65850b[i10], Integer.valueOf(i11), Integer.valueOf(i12), Character.valueOf(z10 ? 'H' : 'L'), Integer.valueOf(i13)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    public static byte[] buildNalUnit(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = f65849a;
        byte[] bArr3 = new byte[bArr2.length + i11];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, bArr2.length, i11);
        return bArr3;
    }

    public static Pair<Integer, Integer> parseAlacAudioSpecificConfig(byte[] bArr) {
        x xVar = new x(bArr);
        xVar.setPosition(9);
        int unsignedByte = xVar.readUnsignedByte();
        xVar.setPosition(20);
        return Pair.create(Integer.valueOf(xVar.readUnsignedIntToInt()), Integer.valueOf(unsignedByte));
    }

    public static boolean parseCea708InitializationData(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    public static byte[][] splitNalUnits(byte[] bArr) {
        if (!b(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iA = 0;
        do {
            arrayList.add(Integer.valueOf(iA));
            iA = a(bArr, iA + f65849a.length);
        } while (iA != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i10 = 0;
        while (i10 < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i10)).intValue();
            int iIntValue2 = (i10 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i10 + 1)).intValue() : bArr.length) - iIntValue;
            byte[] bArr3 = new byte[iIntValue2];
            System.arraycopy(bArr, iIntValue, bArr3, 0, iIntValue2);
            bArr2[i10] = bArr3;
            i10++;
        }
        return bArr2;
    }
}
