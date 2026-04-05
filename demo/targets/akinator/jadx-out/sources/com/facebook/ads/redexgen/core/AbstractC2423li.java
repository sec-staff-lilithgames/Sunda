package com.facebook.ads.redexgen.core;

import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;

/* renamed from: com.facebook.ads.redexgen.X.li, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2423li extends EK {
    public static String[] A01 = {"LN1kZ6lR3vZBqqrviA4uTSOzBGS9o2bO", "mUQPITaRnEXTrG2Wr7xIAnPzPHhU6DS3", "avW0I4bwWNzzQZleeOInYpLZY9PTle7", "LGUT8ZIo3joumZn9NybI7JCchk0DSCTG", "S4WFRdtC0lcE2afHWARgiwpUU5tNPmtd", "SbOYlLigHNVPkFHrMvYK7wwtNeL", "2fmBOvz22OTh8nUuYBKjoVDFU", "lR30iWlIbuozJgbVtB9O9DOed4NJenPq"};
    public EC A00;

    public abstract Pair<C7G[], InterfaceC2424lj[]> A0d(EC ec2, int[][][] iArr, int[] iArr2, C2461mL c2461mL, Timeline timeline) throws C9Y;

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /* JADX WARN: Incorrect condition in loop: B:7:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A0Y(com.facebook.ads.redexgen.core.C7D[] r8, com.facebook.ads.redexgen.core.C2580oH r9, int[] r10, boolean r11) throws com.facebook.ads.redexgen.core.C9Y {
        /*
            int r6 = r8.length
            r5 = 0
            r7 = 1
            r4 = 0
        L4:
            int r0 = r8.length
            if (r4 >= r0) goto L39
            r3 = r8[r4]
            r2 = 0
            r1 = 0
        Lb:
            int r0 = r9.A01
            if (r1 >= r0) goto L22
            com.facebook.ads.redexgen.X.or r0 = r9.A08(r1)
            int r0 = r3.AJb(r0)
            int r0 = com.facebook.ads.redexgen.core.AnonymousClass76.A03(r0)
            int r2 = java.lang.Math.max(r2, r0)
            int r1 = r1 + 1
            goto Lb
        L22:
            r0 = r10[r4]
            if (r0 != 0) goto L37
            r0 = 1
        L27:
            if (r2 > r5) goto L31
            if (r2 != r5) goto L34
            if (r11 == 0) goto L34
            if (r7 != 0) goto L34
            if (r0 == 0) goto L34
        L31:
            r6 = r4
            r5 = r2
            r7 = r0
        L34:
            int r4 = r4 + 1
            goto L4
        L37:
            r0 = 0
            goto L27
        L39:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC2423li.A0Y(com.facebook.ads.redexgen.X.7D[], com.facebook.ads.redexgen.X.oH, int[], boolean):int");
    }

    public static int[] A0Z(C7D c7d, C2580oH c2580oH) throws C9Y {
        int[] iArr = new int[c2580oH.A01];
        for (int i10 = 0; i10 < c2580oH.A01; i10++) {
            iArr[i10] = c7d.AJb(c2580oH.A08(i10));
        }
        return iArr;
    }

    public static int[] A0a(C7D[] c7dArr) throws C9Y {
        int[] iArr = new int[c7dArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int iAJd = c7dArr[i10].AJd();
            String[] strArr = A01;
            String str = strArr[4];
            String str2 = strArr[1];
            int i11 = str.charAt(23);
            if (i11 == str2.charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "1ViYEGUZxGRCVXLKV1NACncyCaxKGcLE";
            strArr2[1] = "WZkUCc71MckdncxFpAml539B1oxWjr0A";
            iArr[i10] = iAJd;
        }
        return iArr;
    }

    @Override // com.facebook.ads.redexgen.core.EK
    public final EL A0b(C7D[] c7dArr, C2451mA c2451mA, C2461mL c2461mL, Timeline timeline) throws C9Y {
        int[] rendererTrackGroupCounts;
        int[] iArr = new int[c7dArr.length + 1];
        C2580oH[][] c2580oHArr = new C2580oH[c7dArr.length + 1][];
        int[][][] iArr2 = new int[c7dArr.length + 1][][];
        for (int i10 = 0; i10 < c2580oHArr.length; i10++) {
            c2580oHArr[i10] = new C2580oH[c2451mA.A01];
            iArr2[i10] = new int[c2451mA.A01][];
        }
        int[] iArrA0a = A0a(c7dArr);
        for (int i11 = 0; i11 < c2451mA.A01; i11++) {
            C2580oH c2580oHA05 = c2451mA.A05(i11);
            int groupIndex = A0Y(c7dArr, c2580oHA05, iArr, c2580oHA05.A02 == 5);
            if (groupIndex == c7dArr.length) {
                rendererTrackGroupCounts = new int[c2580oHA05.A01];
            } else {
                rendererTrackGroupCounts = A0Z(c7dArr[groupIndex], c2580oHA05);
            }
            int i12 = iArr[groupIndex];
            c2580oHArr[groupIndex][i12] = c2580oHA05;
            iArr2[groupIndex][i12] = rendererTrackGroupCounts;
            iArr[groupIndex] = iArr[groupIndex] + 1;
        }
        C2451mA[] c2451mAArr = new C2451mA[c7dArr.length];
        String[] strArr = new String[c7dArr.length];
        int[] iArr3 = new int[c7dArr.length];
        int i13 = 0;
        while (true) {
            int length = c7dArr.length;
            String[] strArr2 = A01;
            if (strArr2[4].charAt(23) == strArr2[1].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr3 = A01;
            strArr3[4] = "hppY0P6sht5kF7is4RCKyMBKsFUVAoRB";
            strArr3[1] = "XeHPWbHBeoBDFVDQc4DbmKa9NYqMdrJh";
            if (i13 < length) {
                int i14 = iArr[i13];
                c2451mAArr[i13] = new C2451mA((C2580oH[]) AbstractC09264a.A1I(c2580oHArr[i13], i14));
                iArr2[i13] = (int[][]) AbstractC09264a.A1I(iArr2[i13], i14);
                strArr[i13] = c7dArr[i13].getName();
                iArr3[i13] = c7dArr[i13].A9F();
                i13++;
            } else {
                EC ec2 = new EC(strArr, iArr3, c2451mAArr, iArrA0a, iArr2, new C2451mA((C2580oH[]) AbstractC09264a.A1I(c2580oHArr[c7dArr.length], iArr[c7dArr.length])));
                Pair<C7G[], InterfaceC2424lj[]> pairA0d = A0d(ec2, iArr2, iArrA0a, c2461mL, timeline);
                return new EL((C7G[]) pairA0d.first, (InterfaceC2424lj[]) pairA0d.second, EH.A00(ec2, (EE[]) pairA0d.second), ec2);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.EK
    public final void A0c(Object obj) {
        this.A00 = (EC) obj;
    }
}
