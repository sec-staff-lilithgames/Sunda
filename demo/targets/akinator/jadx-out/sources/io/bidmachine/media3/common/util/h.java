package io.bidmachine.media3.common.util;

import android.util.Pair;
import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f60719a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f60720b = {"", "A", wHkgq.VnMVIeYgEYLegI, "C"};

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f60721c = Pattern.compile("^\\D?(\\d+)$");

    public static String buildAvcCodecString(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static List<byte[]> buildCea708InitializationData(boolean z10) {
        return Collections.singletonList(z10 ? new byte[]{1} : new byte[]{0});
    }

    public static String buildH263CodecString(int i10, int i11) {
        return a1.formatInvariant("s263.%d.%d", Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static String buildHevcCodecString(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        StringBuilder sb2 = new StringBuilder(a1.formatInvariant("hvc1.%s%d.%X.%c%d", f60720b[i10], Integer.valueOf(i11), Integer.valueOf(i12), Character.valueOf(z10 ? 'H' : 'L'), Integer.valueOf(i13)));
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
        System.arraycopy(f60719a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i10, bArr2, 4, i11);
        return bArr2;
    }

    public static b5 buildVp9CodecPrivateInitializationData(byte b10, byte b11, byte b12, byte b13) {
        return b5.of(new byte[]{1, 1, b10, 2, 1, b11, 3, 1, b12, 4, 1, b13});
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> getCodecProfileAndLevel(io.bidmachine.media3.common.b r32) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.common.util.h.getCodecProfileAndLevel(io.bidmachine.media3.common.b):android.util.Pair");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> getHevcProfileAndLevel(java.lang.String r11, java.lang.String[] r12, gn.n r13) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.common.util.h.getHevcProfileAndLevel(java.lang.String, java.lang.String[], gn.n):android.util.Pair");
    }

    public static Pair<Integer, Integer> getVideoResolutionFromMpeg4VideoConfig(byte[] bArr) {
        boolean z10;
        m0 m0Var = new m0(bArr);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i11 + 3;
            if (i12 >= bArr.length) {
                z10 = false;
                break;
            }
            if (m0Var.readUnsignedInt24() == 1 && (bArr[i12] & 240) == 32) {
                z10 = true;
                break;
            }
            m0Var.setPosition(m0Var.getPosition() - 2);
            i11++;
        }
        a.checkArgument(z10, "Invalid input: VOL not found.");
        l0 l0Var = new l0(bArr);
        l0Var.skipBits((i11 + 4) * 8);
        l0Var.skipBits(1);
        l0Var.skipBits(8);
        if (l0Var.readBit()) {
            l0Var.skipBits(4);
            l0Var.skipBits(3);
        }
        if (l0Var.readBits(4) == 15) {
            l0Var.skipBits(8);
            l0Var.skipBits(8);
        }
        if (l0Var.readBit()) {
            l0Var.skipBits(2);
            l0Var.skipBits(1);
            if (l0Var.readBit()) {
                l0Var.skipBits(79);
            }
        }
        a.checkArgument(l0Var.readBits(2) == 0, "Only supports rectangular video object layer shape.");
        a.checkArgument(l0Var.readBit());
        int bits = l0Var.readBits(16);
        a.checkArgument(l0Var.readBit());
        if (l0Var.readBit()) {
            a.checkArgument(bits > 0);
            for (int i13 = bits - 1; i13 > 0; i13 >>= 1) {
                i10++;
            }
            l0Var.skipBits(i10);
        }
        a.checkArgument(l0Var.readBit());
        int bits2 = l0Var.readBits(13);
        a.checkArgument(l0Var.readBit());
        int bits3 = l0Var.readBits(13);
        a.checkArgument(l0Var.readBit());
        l0Var.skipBits(1);
        return Pair.create(Integer.valueOf(bits2), Integer.valueOf(bits3));
    }

    public static Pair<Integer, Integer> parseAlacAudioSpecificConfig(byte[] bArr) {
        m0 m0Var = new m0(bArr);
        m0Var.setPosition(9);
        int unsignedByte = m0Var.readUnsignedByte();
        m0Var.setPosition(20);
        return Pair.create(Integer.valueOf(m0Var.readUnsignedIntToInt()), Integer.valueOf(unsignedByte));
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
            byte[] bArr2 = f60719a;
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
