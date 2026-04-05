package com.facebook.ads.redexgen.core;

import android.text.Layout;
import android.text.TextUtils;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.Jz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1324Jz {
    public static byte[] A0I;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;

    @MetaExoPlayerCustomization("Removed parameter in r2.18")
    public Layout.Alignment A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public Set<String> A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0I, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0I = new byte[]{-70, -39, -37, -29, -33, -22, -25, -19, -26, -36, -104, -37, -25, -28, -25, -22, -104, -26, -25, -20, -104, -36, -35, -34, -31, -26, -35, -36, -90, -104, -63, -64, -58, 114, -75, -63, -66, -63, -60, 114, -64, -63, -58, 114, -74, -73, -72, -69, -64, -73, -74};
    }

    public C1324Jz() {
        String strA01 = A01(0, 0, 10);
        this.A0B = strA01;
        this.A0C = strA01;
        this.A0E = Collections.emptySet();
        this.A0D = strA01;
        this.A0A = null;
        this.A0H = false;
        this.A0G = false;
        this.A06 = -1;
        this.A08 = -1;
        this.A02 = -1;
        this.A05 = -1;
        this.A04 = -1;
        this.A09 = null;
        this.A07 = -1;
        this.A0F = false;
    }

    public static int A00(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public final float A03() {
        return this.A00;
    }

    public final int A04() {
        if (this.A0G) {
            return this.A01;
        }
        throw new IllegalStateException(A01(0, 29, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE));
    }

    public final int A05() {
        if (this.A0H) {
            return this.A03;
        }
        throw new IllegalStateException(A01(29, 22, 80));
    }

    public final int A06() {
        return this.A04;
    }

    public final int A07() {
        return this.A07;
    }

    public final int A08() {
        if (this.A02 == -1 && this.A05 == -1) {
            return -1;
        }
        return (this.A02 == 1 ? 1 : 0) | (this.A05 == 1 ? 2 : 0);
    }

    public final int A09(String str, String str2, Set<String> set, String str3) {
        if (this.A0B.isEmpty() && this.A0C.isEmpty() && this.A0E.isEmpty() && this.A0D.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iA00 = A00(A00(A00(0, this.A0B, str, 1073741824), this.A0C, str2, 2), this.A0D, str3, 4);
        if (iA00 == -1 || !set.containsAll(this.A0E)) {
            return 0;
        }
        return iA00 + (this.A0E.size() * 4);
    }

    public final C1324Jz A0A(float f10) {
        this.A00 = f10;
        return this;
    }

    public final C1324Jz A0B(int i10) {
        this.A01 = i10;
        this.A0G = true;
        return this;
    }

    public final C1324Jz A0C(int i10) {
        this.A03 = i10;
        this.A0H = true;
        return this;
    }

    public final C1324Jz A0D(int i10) {
        this.A04 = i10;
        return this;
    }

    public final C1324Jz A0E(int i10) {
        this.A07 = i10;
        return this;
    }

    public final C1324Jz A0F(String str) {
        this.A0A = str == null ? null : AbstractC2244iY.A01(str);
        return this;
    }

    public final C1324Jz A0G(boolean z10) {
        this.A02 = z10 ? 1 : 0;
        return this;
    }

    public final C1324Jz A0H(boolean z10) {
        this.A0F = z10;
        return this;
    }

    public final C1324Jz A0I(boolean z10) {
        this.A05 = z10 ? 1 : 0;
        return this;
    }

    public final C1324Jz A0J(boolean z10) {
        this.A08 = z10 ? 1 : 0;
        return this;
    }

    public final String A0K() {
        return this.A0A;
    }

    public final void A0L(String str) {
        this.A0B = str;
    }

    public final void A0M(String str) {
        this.A0C = str;
    }

    public final void A0N(String str) {
        this.A0D = str;
    }

    public final void A0O(String[] strArr) {
        this.A0E = new HashSet(Arrays.asList(strArr));
    }

    public final boolean A0P() {
        return this.A0F;
    }

    public final boolean A0Q() {
        return this.A0G;
    }

    public final boolean A0R() {
        return this.A0H;
    }

    public final boolean A0S() {
        return this.A06 == 1;
    }

    public final boolean A0T() {
        return this.A08 == 1;
    }
}
