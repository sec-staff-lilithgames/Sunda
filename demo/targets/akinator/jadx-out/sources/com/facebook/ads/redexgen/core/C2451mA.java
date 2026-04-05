package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.mA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2451mA implements C1S {
    public static byte[] A03;
    public static String[] A04 = {"kjXOolT", "y1uosoppcQ2KAnagmdUHUDs2pqKkNOP", "9S5fCrLfVI6Z6wWSlA", "LW4KLvv", "ESAoxwChDjEBJ2YD38hEjiU5IsN", "MD8cz6uZEkXt7x64XO0blzPRBkN5Dhm8", "wv8vTraLOdvtLK52tGc0aCYgNtDO0cFF", "ftZS2reRIxcEfCn6parOlN78mV3R9Y2K"};
    public static final C1R<C2451mA> A05;
    public static final C2451mA A06;
    public static final String A07;
    public int A00;
    public final int A01;
    public final AbstractC1081Am<C2580oH> A02;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 95);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        byte[] bArr = {119, 79, 86, 78, 83, 74, 86, 95, 26, 83, 94, 95, 84, 78, 83, 89, 91, 86, 26, 110, 72, 91, 89, 81, 125, 72, 85, 79, 74, 73, 26, 91, 94, 94, 95, 94, 26, 78, 85, 26, 85, 84, 95, 26, 110, 72, 91, 89, 81, 125, 72, 85, 79, 74, 123, 72, 72, 91, 67, 20, 81, 119, 100, 102, 110, 66, 119, 106, 112, 117, 68, 119, 119, 100, 124};
        if (A04[5].charAt(31) == 'Q') {
            throw new RuntimeException();
        }
        A04[4] = "LoVxB454";
        A03 = bArr;
    }

    static {
        A03();
        A06 = new C2451mA(new C2580oH[0]);
        A07 = AbstractC09264a.A0h(0);
        A05 = new C1R() { // from class: com.facebook.ads.redexgen.X.mB
            @Override // com.facebook.ads.redexgen.core.C1R
            public final C1S A6X(Bundle bundle) {
                return C2451mA.A00(bundle);
            }
        };
    }

    public C2451mA(C2580oH... c2580oHArr) {
        this.A02 = AbstractC1081Am.A07(c2580oHArr);
        this.A01 = c2580oHArr.length;
        A02();
    }

    public static /* synthetic */ C2451mA A00(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A07);
        if (parcelableArrayList == null) {
            return new C2451mA(new C2580oH[0]);
        }
        return new C2451mA((C2580oH[]) C3S.A01(C2580oH.A06, parcelableArrayList).toArray(new C2580oH[0]));
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0011 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A02() {
        /*
            r7 = this;
            r6 = 0
        L1:
            com.facebook.ads.redexgen.X.Am<com.facebook.ads.redexgen.X.oH> r0 = r7.A02
            int r0 = r0.size()
            if (r6 >= r0) goto L50
            int r5 = r6 + 1
        Lb:
            com.facebook.ads.redexgen.X.Am<com.facebook.ads.redexgen.X.oH> r0 = r7.A02
            int r0 = r0.size()
            if (r5 >= r0) goto L4d
            com.facebook.ads.redexgen.X.Am<com.facebook.ads.redexgen.X.oH> r0 = r7.A02
            java.lang.Object r1 = r0.get(r6)
            com.facebook.ads.redexgen.X.oH r1 = (com.facebook.ads.redexgen.core.C2580oH) r1
            com.facebook.ads.redexgen.X.Am<com.facebook.ads.redexgen.X.oH> r0 = r7.A02
            java.lang.Object r0 = r0.get(r5)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L4a
            r2 = 0
            r1 = 60
            r0 = 101(0x65, float:1.42E-43)
            java.lang.String r0 = A01(r2, r1, r0)
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r0)
            r2 = 60
            r1 = 15
            r0 = 90
            java.lang.String r3 = A01(r2, r1, r0)
            r2 = 0
            r1 = 0
            r0 = 115(0x73, float:1.61E-43)
            java.lang.String r0 = A01(r2, r1, r0)
            com.facebook.ads.redexgen.core.AnonymousClass44.A08(r3, r0, r4)
        L4a:
            int r5 = r5 + 1
            goto Lb
        L4d:
            int r6 = r6 + 1
            goto L1
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2451mA.A02():void");
    }

    public final int A04(C2580oH c2580oH) {
        int index = this.A02.indexOf(c2580oH);
        if (index >= 0) {
            return index;
        }
        return -1;
    }

    public final C2580oH A05(int i10) {
        return this.A02.get(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2451mA c2451mA = (C2451mA) obj;
        return this.A01 == c2451mA.A01 && this.A02.equals(c2451mA.A02);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = this.A02.hashCode();
        }
        int i10 = this.A00;
        String[] strArr = A04;
        if (strArr[3].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        A04[6] = "ifk0Ba0Zppjn7MlaJBrmzFqZbJ0HKklT";
        return i10;
    }
}
