package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.androidx.media3.common.Format;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.oH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2580oH implements C1S {
    public static byte[] A05;
    public static final C1R<C2580oH> A06;
    public static final String A07;
    public static final String A08;
    public int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final C2614or[] A04;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{95, 28, 16, 18, 29, 22, 17, 26, 27, 95, 22, 17, 95, 16, 17, 26, 95, 43, 13, 30, 28, 20, 56, 13, 16, 10, 15, 69, 95, 88, 100, 99, 107, 55, 49, 34, 32, 40, 99, 112, 119, AbstractJsonLexerKt.TC_INVALID, 35, 37, 54, 52, 60, 119, 103, 126, 119, 54, 57, 51, 119, 112, 62, 106, 71, 72, 72, 75, 92, 75, 64, 90, 14, 22, 48, 35, 33, 41, 5, 48, 45, 55, 50, 50, Utf8.REPLACEMENT_BYTE, 48, 57, 43, Utf8.REPLACEMENT_BYTE, 57, 59, 45, 40, 53, 54, Utf8.REPLACEMENT_BYTE, 122, 60, 54, 59, 61, 41, 61, 38, 44};
    }

    static {
        A05();
        A07 = AbstractC09264a.A0h(0);
        A08 = AbstractC09264a.A0h(1);
        A06 = new C1R() { // from class: com.facebook.ads.redexgen.X.oI
            @Override // com.facebook.ads.redexgen.core.C1R
            public final C1S A6X(Bundle bundle) {
                return C2580oH.A01(bundle);
            }
        };
    }

    public C2580oH(String str, C2614or... c2614orArr) {
        C3M.A07(c2614orArr.length > 0);
        this.A03 = str;
        this.A04 = c2614orArr;
        this.A01 = c2614orArr.length;
        int iA01 = AbstractC08812h.A01(c2614orArr[0].A0W);
        this.A02 = iA01 == -1 ? AbstractC08812h.A01(c2614orArr[0].A0S) : iA01;
        A04();
    }

    public C2580oH(C2614or... c2614orArr) {
        this(A02(0, 0, 114), c2614orArr);
    }

    public static int A00(int i10) {
        return i10 | 16384;
    }

    public static /* synthetic */ C2580oH A01(Bundle bundle) {
        List listA01;
        List<Format> formats = bundle.getParcelableArrayList(A07);
        if (formats == null) {
            listA01 = MetaExoPlayerCustomizedCollections.A01();
        } else {
            listA01 = C3S.A01(C2614or.A0b, formats);
        }
        String id2 = bundle.getString(A08, A02(0, 0, 114));
        return new C2580oH(id2, (C2614or[]) listA01.toArray(new C2614or[0]));
    }

    public static String A03(String str) {
        return (str == null || str.equals(A02(96, 3, 71))) ? A02(0, 0, 114) : str;
    }

    private void A04() {
        String strA03 = A03(this.A04[0].A0V);
        int iA00 = A00(this.A04[0].A0E);
        for (int i10 = 1; i10 < this.A04.length; i10++) {
            String language = this.A04[i10].A0V;
            if (!strA03.equals(A03(language))) {
                String str = this.A04[0].A0V;
                String str2 = this.A04[i10].A0V;
                String language2 = A02(77, 9, 81);
                A06(language2, str, str2, i10);
                return;
            }
            if (iA00 != A00(this.A04[i10].A0E)) {
                String binaryString = Integer.toBinaryString(this.A04[0].A0E);
                String binaryString2 = Integer.toBinaryString(this.A04[i10].A0E);
                String language3 = A02(86, 10, 85);
                A06(language3, binaryString, binaryString2, i10);
                return;
            }
        }
    }

    public static void A06(String str, String str2, String str3, int i10) {
        AnonymousClass44.A08(A02(67, 10, 77), A02(0, 0, 114), new IllegalStateException(A02(57, 10, 33) + str + A02(0, 30, 112) + str2 + A02(39, 17, 88) + str3 + A02(30, 9, 76) + i10 + A02(56, 1, 24)));
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A07(com.facebook.ads.redexgen.core.C2614or r3) {
        /*
            r2 = this;
            r1 = 0
        L1:
            com.facebook.ads.redexgen.X.or[] r0 = r2.A04
            int r0 = r0.length
            if (r1 >= r0) goto L10
            com.facebook.ads.redexgen.X.or[] r0 = r2.A04
            r0 = r0[r1]
            if (r3 != r0) goto Ld
            return r1
        Ld:
            int r1 = r1 + 1
            goto L1
        L10:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2580oH.A07(com.facebook.ads.redexgen.X.or):int");
    }

    public final C2614or A08(int i10) {
        return this.A04[i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2580oH c2580oH = (C2580oH) obj;
        return this.A03.equals(c2580oH.A03) && Arrays.equals(this.A04, c2580oH.A04);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int result = this.A03.hashCode();
            this.A00 = (((17 * 31) + result) * 31) + Arrays.hashCode(this.A04);
        }
        int result2 = this.A00;
        return result2;
    }
}
