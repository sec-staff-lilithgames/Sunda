package com.google.android.exoplayer2.util;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f28437a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f28438b = {"", "A", "B", "C"};

    public static String buildAvcCodecString(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static List<byte[]> buildCea708InitializationData(boolean z10) {
        return Collections.singletonList(z10 ? new byte[]{1} : new byte[]{0});
    }

    public static String buildHevcCodecString(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        StringBuilder sb2 = new StringBuilder(n1.formatInvariant("hvc1.%s%d.%X.%c%d", f28438b[i10], Integer.valueOf(i11), Integer.valueOf(i12), Character.valueOf(z10 ? 'H' : 'L'), Integer.valueOf(i13)));
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
        byte[] bArr2 = new byte[i11 + 4];
        System.arraycopy(f28437a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i10, bArr2, 4, i11);
        return bArr2;
    }

    public static Pair<Integer, Integer> getVideoResolutionFromMpeg4VideoConfig(byte[] bArr) {
        boolean z10;
        v0 v0Var = new v0(bArr);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i11 + 3;
            if (i12 >= bArr.length) {
                z10 = false;
                break;
            }
            if (v0Var.readUnsignedInt24() == 1 && (bArr[i12] & 240) == 32) {
                z10 = true;
                break;
            }
            v0Var.setPosition(v0Var.getPosition() - 2);
            i11++;
        }
        a.checkArgument(z10, "Invalid input: VOL not found.");
        u0 u0Var = new u0(bArr);
        u0Var.skipBits((i11 + 4) * 8);
        u0Var.skipBits(1);
        u0Var.skipBits(8);
        if (u0Var.readBit()) {
            u0Var.skipBits(4);
            u0Var.skipBits(3);
        }
        if (u0Var.readBits(4) == 15) {
            u0Var.skipBits(8);
            u0Var.skipBits(8);
        }
        if (u0Var.readBit()) {
            u0Var.skipBits(2);
            u0Var.skipBits(1);
            if (u0Var.readBit()) {
                u0Var.skipBits(79);
            }
        }
        a.checkArgument(u0Var.readBits(2) == 0, "Only supports rectangular video object layer shape.");
        a.checkArgument(u0Var.readBit());
        int bits = u0Var.readBits(16);
        a.checkArgument(u0Var.readBit());
        if (u0Var.readBit()) {
            a.checkArgument(bits > 0);
            for (int i13 = bits - 1; i13 > 0; i13 >>= 1) {
                i10++;
            }
            u0Var.skipBits(i10);
        }
        a.checkArgument(u0Var.readBit());
        int bits2 = u0Var.readBits(13);
        a.checkArgument(u0Var.readBit());
        int bits3 = u0Var.readBits(13);
        a.checkArgument(u0Var.readBit());
        u0Var.skipBits(1);
        return Pair.create(Integer.valueOf(bits2), Integer.valueOf(bits3));
    }

    public static Pair<Integer, Integer> parseAlacAudioSpecificConfig(byte[] bArr) {
        v0 v0Var = new v0(bArr);
        v0Var.setPosition(9);
        int unsignedByte = v0Var.readUnsignedByte();
        v0Var.setPosition(20);
        return Pair.create(Integer.valueOf(v0Var.readUnsignedIntToInt()), Integer.valueOf(unsignedByte));
    }

    public static boolean parseCea708InitializationData(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    public static byte[][] splitNalUnits(byte[] bArr) {
        if (bArr.length <= 4) {
            return null;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f28437a;
            if (i10 >= 4) {
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                do {
                    arrayList.add(Integer.valueOf(i11));
                    i11 += 4;
                    int length = bArr.length - 4;
                    while (true) {
                        if (i11 > length) {
                            i11 = -1;
                            break;
                        }
                        if (bArr.length - i11 > 4) {
                            for (int i12 = 0; i12 < 4; i12++) {
                                if (bArr[i11 + i12] != bArr2[i12]) {
                                    break;
                                }
                            }
                            break;
                        }
                        i11++;
                    }
                } while (i11 != -1);
                byte[][] bArr3 = new byte[arrayList.size()][];
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    int iIntValue = ((Integer) arrayList.get(i13)).intValue();
                    int iIntValue2 = (i13 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i13 + 1)).intValue() : bArr.length) - iIntValue;
                    byte[] bArr4 = new byte[iIntValue2];
                    System.arraycopy(bArr, iIntValue, bArr4, 0, iIntValue2);
                    bArr3[i13] = bArr4;
                    i13++;
                }
                return bArr3;
            }
            if (bArr[i10] != bArr2[i10]) {
                return null;
            }
            i10++;
        }
    }
}
