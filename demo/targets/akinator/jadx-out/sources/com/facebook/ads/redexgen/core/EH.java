package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public abstract class EH {
    public static String[] A00 = {"94gd2lHaz6driogpt3Nl1tWsjXgriMxS", "VA5F17cuoV6wg6So0a0DluDefxsQAbFW", "BZfou2TK48MMfd1yJcRZTZ4JcnnWlmHT", "ilV1kn3efEuJyycOIV0UyN70TAMLymqY", "v19hT7CAJaCb1rntEZC2LQpyBVrX3IkZ", "rkpPVUKbY", "FKwb9S", "XsKsPoEAnPyrLBiotdeURrQ5Q46xoiIz"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C2569o6 A01(EC ec2, List<? extends EE>[] listArr) {
        C08571h c08571h = new C08571h();
        int i10 = 0;
        loop0: while (true) {
            boolean z10 = false;
            if (i10 >= ec2.A02()) {
                C2451mA c2451mAA06 = ec2.A06();
                for (int i11 = 0; i11 < c2451mAA06.A01; i11++) {
                    C2580oH c2580oHA05 = c2451mAA06.A05(i11);
                    int[] iArr = new int[c2580oHA05.A01];
                    Arrays.fill(iArr, 0);
                    c08571h.A04(new C2570o7(c2580oHA05, false, iArr, new boolean[c2580oHA05.A01]));
                }
                return new C2569o6(c08571h.A05());
            }
            C2451mA c2451mAA07 = ec2.A07(i10);
            List<? extends EE> list = listArr[i10];
            int i12 = 0;
            while (i12 < c2451mAA07.A01) {
                C2580oH c2580oHA052 = c2451mAA07.A05(i12);
                int iA05 = ec2.A05(i10, i12, z10);
                String[] strArr = A00;
                if (strArr[7].charAt(11) != strArr[0].charAt(11)) {
                    break loop0;
                }
                String[] strArr2 = A00;
                strArr2[7] = "wVGS7RX5kLdrLFKtRIe7uQsNtd1z6IxW";
                strArr2[0] = "7aERijPLyLRrdgSw5lQfoyda5cW2h3c0";
                boolean z11 = iA05 != 0;
                int[] iArr2 = new int[c2580oHA052.A01];
                boolean[] zArr = new boolean[c2580oHA052.A01];
                for (int i13 = 0; i13 < c2580oHA052.A01; i13++) {
                    iArr2[i13] = ec2.A04(i10, i12, i13);
                    boolean z12 = false;
                    if (A00[5].length() != 9) {
                        break loop0;
                    }
                    String[] strArr3 = A00;
                    strArr3[2] = "3DHxmUKuGZITV4091m9MLUNqu1ZkNm0q";
                    strArr3[3] = "2BQZhu0LL1SbQMNt9wHOkoks63NLimX3";
                    int i14 = 0;
                    while (true) {
                        if (i14 < list.size()) {
                            EE ee2 = list.get(i14);
                            if (ee2.A9D().equals(c2580oHA052) && ee2.A9y(i13) != -1) {
                                z12 = true;
                                break;
                            }
                            i14++;
                        }
                    }
                    zArr[i13] = z12;
                }
                c08571h.A04(new C2570o7(c2580oHA052, z11, iArr2, zArr));
                i12++;
                z10 = false;
            }
            i10++;
        }
        throw new RuntimeException();
    }

    public static C2569o6 A00(EC ec2, EE[] eeArr) {
        List listA01;
        List[] listArr = new List[eeArr.length];
        for (int i10 = 0; i10 < eeArr.length; i10++) {
            EE ee2 = eeArr[i10];
            if (ee2 != null) {
                listA01 = AbstractC1081Am.A04(ee2);
            } else {
                listA01 = MetaExoPlayerCustomizedCollections.A01();
            }
            listArr[i10] = listA01;
        }
        return A01(ec2, listArr);
    }
}
