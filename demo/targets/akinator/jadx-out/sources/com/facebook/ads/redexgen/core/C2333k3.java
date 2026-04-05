package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.k3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2333k3 implements J7 {
    public static String[] A03 = {"LK8mEMUSnifSCT0YT0fQtLG", "zQWICugnqrmXEq8sMdeIuA9JBPwrta0k", "lKxJonOWK2Axk83UnpUnbJJcLxj", "3DYuz", "CNQNHGpRGAv1E31EB6wcq1FAARNpDgXE", "DpJK", "NUJ585yfBdIWgF7XcRLbZeMVqrhzmgk", "1sPINCYISeoO6PXpnzvAKZkikus6bvvY"};
    public final List<K3> A00;
    public final long[] A01;
    public final long[] A02;

    /* JADX WARN: Incorrect condition in loop: B:4:0x001d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2333k3(java.util.List<com.facebook.ads.redexgen.core.K3> r8) {
        /*
            r7 = this;
            r7.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r7.A00 = r0
            int r0 = r8.size()
            int r0 = r0 * 2
            long[] r0 = new long[r0]
            r7.A01 = r0
            r6 = 0
        L19:
            int r0 = r8.size()
            if (r6 >= r0) goto L38
            java.lang.Object r5 = r8.get(r6)
            com.facebook.ads.redexgen.X.K3 r5 = (com.facebook.ads.redexgen.core.K3) r5
            int r4 = r6 * 2
            long[] r2 = r7.A01
            long r0 = r5.A01
            r2[r4] = r0
            long[] r3 = r7.A01
            int r2 = r4 + 1
            long r0 = r5.A00
            r3[r2] = r0
            int r6 = r6 + 1
            goto L19
        L38:
            long[] r1 = r7.A01
            long[] r0 = r7.A01
            int r0 = r0.length
            long[] r0 = java.util.Arrays.copyOf(r1, r0)
            r7.A02 = r0
            long[] r0 = r7.A02
            java.util.Arrays.sort(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2333k3.<init>(java.util.List):void");
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final List<C2565o2> A7P(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.A00.size(); i10++) {
            if (this.A01[i10 * 2] <= j10) {
                long j11 = this.A01[(i10 * 2) + 1];
                if (A03[2].length() == 27) {
                    A03[5] = "FOcCQTOovqYXamkXPEg";
                    if (j10 < j11) {
                        K3 k32 = this.A00.get(i10);
                        if (k32.A02.A01 == -3.4028235E38f) {
                            arrayList2.add(k32);
                        } else {
                            C2565o2 c2565o2 = k32.A02;
                            String[] strArr = A03;
                            if (strArr[6].length() != strArr[0].length()) {
                                String[] strArr2 = A03;
                                strArr2[4] = "KriihMM2RWcrEfyoWolOk5PIi1Nv3YmO";
                                strArr2[1] = "gocQSZMmm3PjEWFg0RBonPYHqyNHFxQo";
                                arrayList.add(c2565o2);
                            }
                        }
                    } else {
                        continue;
                    }
                }
                throw new RuntimeException();
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.facebook.ads.redexgen.X.KD
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((K3) obj).A01, ((K3) obj2).A01);
            }
        });
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            arrayList.add(((K3) arrayList2.get(i11)).A02.A02().A07((-1) - i11, 1).A0H());
        }
        return arrayList;
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final long A7v(int i10) {
        boolean z10 = true;
        C3M.A07(i10 >= 0);
        if (i10 >= this.A02.length) {
            z10 = false;
        }
        C3M.A07(z10);
        return this.A02[i10];
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final int A7w() {
        return this.A02.length;
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final int A8S(long j10) {
        int iA0K = AbstractC09264a.A0K(this.A02, j10, false, false);
        int index = this.A02.length;
        if (iA0K < index) {
            return iA0K;
        }
        return -1;
    }
}
