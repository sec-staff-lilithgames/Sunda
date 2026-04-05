package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ob, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2598ob implements C1S {
    public static byte[] A03;
    public static String[] A04 = {"UnBMZo2POSkJfz8F5ORuhqz31kXq7ERt", "GIL9xJe6rQGrNyWVB8WflXUexCYVOXiL", "1YJSMghIf03NGeOR9kmJ9bGOSAOIDk9h", "FbkWhL7EvytxWPK79enAjrYaTxkw07sQ", "DvmeNztcauqB3GuZI4NFBZAXEAF", "3h1K0W52WnqAecgG5ddVr1SgL8ZiRxH3", "SzBXc", "YkLyJW6tcdkoyMoq5nPmYT201JvYdNzP"};
    public static final C1R<C2598ob> A05;
    public static final C2598ob A06;
    public static final String A07;
    public static final String A08;
    public final float A00;
    public final float A01;
    public final int A02;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{109, 81, 92, 68, 95, 92, 94, 86, 109, 92, 79, 92, 80, 88, 73, 88, 79, 78, 21, 78, 77, 88, 88, 89, 0, 24, 19, 15, 91, 17, 29, 77, 84, 73, 94, 85, 0, 24, 19, 15, 91, 20};
    }

    static {
        A02();
        A06 = new C2598ob(1.0f);
        A08 = AbstractC09264a.A0h(0);
        A07 = AbstractC09264a.A0h(1);
        A05 = new C1R() { // from class: com.facebook.ads.redexgen.X.oc
            @Override // com.facebook.ads.redexgen.core.C1R
            public final C1S A6X(Bundle bundle) {
                return C2598ob.A00(bundle);
            }
        };
    }

    public C2598ob(float f10) {
        this(f10, 1.0f);
    }

    public C2598ob(float f10, float f11) {
        C3M.A07(f10 > 0.0f);
        C3M.A07(f11 > 0.0f);
        this.A01 = f10;
        this.A00 = f11;
        this.A02 = Math.round(1000.0f * f10);
    }

    public static /* synthetic */ C2598ob A00(Bundle bundle) {
        float f10 = bundle.getFloat(A08, 1.0f);
        float pitch = bundle.getFloat(A07, 1.0f);
        return new C2598ob(f10, pitch);
    }

    public final long A03(long j10) {
        return this.A02 * j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2598ob c2598ob = (C2598ob) obj;
        if (this.A01 == c2598ob.A01) {
            float f10 = this.A00;
            float f11 = c2598ob.A00;
            if (A04[7].charAt(19) == 'U') {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[6] = "pC9U2";
            strArr[4] = "3ca7HvojzYBlvf3WwnTfkyYQmWq";
            if (f10 == f11) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = Float.floatToRawIntBits(this.A01);
        return (((17 * 31) + result) * 31) + Float.floatToRawIntBits(this.A00);
    }

    public final String toString() {
        return AbstractC09264a.A0n(A01(0, 42, 46), Float.valueOf(this.A01), Float.valueOf(this.A00));
    }
}
