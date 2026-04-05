package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.widget.Button;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.aB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1742aB extends Button {
    public static byte[] A0B;
    public static String[] A0C = {"AuzWZ8osEfq4z249PYqxDxnd", "GmaNjpajnwuNMOpMTnafkSdm", "IXSwi1vel7aGkSvKIjHlp", "5xYCukR2VNv2y0", "9gt7y21mjsR", "XkvVk", "YCgMHGcNxR5BY", "3lMWF0VDfBsAiU48Gpk3b"};
    public static final int A0D;
    public static final int A0E;
    public int A00;
    public int A01;
    public int A02;
    public C1400My A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final float A07;
    public final int A08;
    public final Runnable A09;
    public final Runnable A0A;

    public static String A09(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 86);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A0B = new byte[]{125, -35, -12, -84};
    }

    static {
        A0C();
        A0D = (int) (AbstractC1640Wl.A02 * 16.0f);
        A0E = (int) (AbstractC1640Wl.A02 * 4.0f);
    }

    public AbstractC1742aB(C1937dL c1937dL, C1400My c1400My) {
        super(c1937dL);
        this.A04 = false;
        this.A02 = 0;
        this.A00 = 0;
        this.A01 = A0E;
        this.A05 = true;
        this.A06 = false;
        this.A09 = new K9(this);
        this.A0A = new K1(this);
        this.A03 = c1400My;
        this.A08 = U7.A05(c1937dL);
        this.A07 = U7.A00(c1937dL);
        XP.A0W(this, false, 16);
        setGravity(17);
        A0A();
    }

    private void A0A() {
        if (this.A03 != null) {
            this.A00 = this.A03.A09(this.A06);
            this.A02 = this.A03.A0A(this.A06);
        }
        XP.A0M(this, this.A00, this.A05 ? this.A01 : 0);
        setTextColor(this.A02);
    }

    private void A0B() {
        if (this.A08 < 0 || this.A04) {
            return;
        }
        this.A04 = true;
        String[] strArr = A0C;
        if (strArr[1].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[1] = "QVGWsKZ9hUXhPHMuZeCIqAcU";
        strArr2[0] = "lfolaSZCl8ASaScD6QDCGzAz";
        if (U7.A2b(getContext())) {
            postDelayed(this.A09, this.A08);
        }
    }

    public final void A0D() {
        String string = getText().toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        String text = A09(1, 3, 43);
        String[] strArrSplit = string.split(text);
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            StringBuilder sb2 = new StringBuilder();
            String text2 = strArrSplit[i10].substring(0, 1).toUpperCase(Locale.getDefault());
            StringBuilder sbAppend = sb2.append(text2);
            String text3 = strArrSplit[i10];
            strArrSplit[i10] = sbAppend.append(text3.substring(1).toLowerCase(Locale.getDefault())).toString();
        }
        String text4 = A09(0, 1, 7);
        super.setText((CharSequence) AbstractC1741aA.A01(text4, strArrSplit));
    }

    public C1400My getColorInfo() {
        return this.A03;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A0B();
    }

    public void setCornerRadiusPx(int i10) {
        this.A01 = i10;
    }

    public void setRoundedCornersEnabled(boolean z10) {
        this.A05 = z10;
        A0A();
    }

    public void setText(String str) {
        super.setText((CharSequence) str.toUpperCase(Locale.US));
    }

    public void setUpButtonColors(C1400My c1400My) {
        this.A03 = c1400My;
        A0A();
    }

    public void setViewShowsOverMedia(boolean z10) {
        this.A06 = z10;
        A0A();
    }
}
