package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Je, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1303Je implements ZY {
    public static byte[] A01;
    public final /* synthetic */ JU A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 104);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{73, 71, 57, 70, 51, 66, 53, 74, 61, 59, 53, 72, 61, 67, 66, 51, 61, 53, 54};
    }

    public C1303Je(JU ju2) {
        this.A00 = ju2;
    }

    @Override // com.facebook.ads.redexgen.core.ZY
    public final void AES(String str) {
        this.A00.A0X = false;
        this.A00.A0K.setProgress(100);
        XP.A0L(this.A00.A0K, 8);
        if (this.A00.A0H.A1d() && this.A00.A0L != null) {
            String strA0y = this.A00.A0H.A0y();
            if (!TextUtils.isEmpty(strA0y)) {
                this.A00.A0L.loadUrl(strA0y);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.ZY
    public final void AEU(String str) throws SecurityException {
        this.A00.A0X = true;
        XP.A0L(this.A00.A0K, 0);
        this.A00.A0J.setUrl(str);
        if (!this.A00.A0V && this.A00.A01 > 1) {
            this.A00.A0V = true;
            this.A00.A0h(A00(0, 19, 108));
        }
        JU.A03(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.ZY
    public final void AEq(int i10) {
        if (this.A00.A0X) {
            this.A00.A0K.setProgress(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.ZY
    public final void AEt(String str) {
        this.A00.A0J.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.core.ZY
    public final void AEw() {
        this.A00.A0N.A0D().ACf(14);
    }
}
