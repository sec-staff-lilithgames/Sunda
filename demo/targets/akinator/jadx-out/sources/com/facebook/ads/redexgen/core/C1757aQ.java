package com.facebook.ads.redexgen.core;

import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1757aQ extends LinearLayout {
    public static byte[] A04;
    public static String[] A05 = {"5HLU", "cJmhtdIbv5Y5xdwCDl3dT8HPvklAUmwI", "4stzzs6gVfUC8wPYX", "7o6tBFGKBnQKcZsvXBJ4ayd9LnRtCNJ", "BSijPHOaulEPVGa4U1fKlqwI", "TamflSlcNH2rcKEIo3f72qWopMk8DENN", "Hhh3HDuTgivrAf4KqreTZK2", "SugScFu"};
    public static final float A06;
    public static final int A07;
    public static final int A08;
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final boolean A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 106);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{31, 26, 26, 27, 10, 31, 23, 18, 13};
    }

    static {
        A01();
        A06 = Resources.getSystem().getDisplayMetrics().density;
        A08 = (int) (A06 * 6.0f);
        A07 = (int) (A06 * 8.0f);
    }

    public C1757aQ(C1937dL c1937dL, C1400My c1400My, boolean z10, int i10, int i11, int i12) {
        super(c1937dL);
        setOrientation(1);
        this.A02 = new TextView(c1937dL);
        XP.A0W(this.A02, true, i10);
        this.A02.setEllipsize(TextUtils.TruncateAt.END);
        this.A02.setLineSpacing(A08, 1.0f);
        this.A01 = new TextView(c1937dL);
        this.A00 = new TextView(c1937dL);
        XP.A0W(this.A00, false, i11);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setLineSpacing(A08, 1.0f);
        this.A03 = U7.A17(c1937dL);
        int i13 = this.A03 ? -2 : -1;
        addView(this.A02, new LinearLayout.LayoutParams(i13, -2));
        addView(this.A01, new LinearLayout.LayoutParams(i13, -2));
        this.A01.setVisibility(8);
        A03(c1400My, z10);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i13, -2);
        layoutParams.setMargins(0, i12, 0, 0);
        addView(this.A00, layoutParams);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1757aQ(C1937dL c1937dL, C1400My c1400My, boolean z10, boolean z11, boolean z12) {
        int i10 = z11 ? 18 : 22;
        int i11 = z11 ? 14 : 16;
        int i12 = A07;
        this(c1937dL, c1400My, z10, i10, i11, z12 ? i12 / 2 : i12);
    }

    public final void A02() {
        this.A02.setTypeface(this.A02.getTypeface(), 1);
    }

    public final void A03(C1400My c1400My, boolean z10) {
        this.A02.setTextColor(c1400My.A07(z10));
        this.A01.setTextColor(c1400My.A05(z10));
        this.A00.setTextColor(c1400My.A06(z10));
    }

    public final void A04(String str, String str2, String str3, boolean z10, boolean z11) {
        boolean z12 = !TextUtils.isEmpty(str);
        boolean z13 = !TextUtils.isEmpty(str2);
        TextView textView = this.A02;
        if (!z12) {
            str = str2;
        }
        textView.setText(str);
        if (str3 != null) {
            this.A01.setText(str3);
        }
        TextView textView2 = this.A00;
        if (!z12) {
            str2 = A00(0, 0, 51);
        }
        textView2.setText(str2);
        int i10 = 3;
        String[] strArr = A05;
        if (strArr[6].length() != strArr[4].length()) {
            String[] strArr2 = A05;
            strArr2[3] = "nuTyQWYrKUsKt4wC014k9cpf4UiNlrc";
            strArr2[0] = "l7Wy";
            if (!z12 || !z13) {
                TextView textView3 = this.A02;
                if (A05[1].charAt(4) != 'F') {
                    String[] strArr3 = A05;
                    strArr3[3] = "qWmgL2iM9nfMb7yMq7CVR7HS6Guvx6S";
                    strArr3[0] = "mFhP";
                    if (z10) {
                        i10 = 2;
                    } else if (z11) {
                        i10 = 4;
                    }
                    textView3.setMaxLines(i10);
                    return;
                }
            } else {
                this.A02.setMaxLines(z10 ? 1 : 2);
                this.A00.setMaxLines(z10 ? 1 : z11 ? 3 : 2);
                return;
            }
        }
        throw new RuntimeException();
    }

    public TextView getDescriptionTextView() {
        return this.A00;
    }

    public TextView getTitleTextView() {
        return this.A02;
    }

    public void setAlignment(int i10) {
        if (this.A03) {
            setGravity(i10);
        }
        this.A02.setGravity(i10);
        this.A00.setGravity(i10);
    }

    public void setCTAClickListener(KE ke2) {
        ViewOnClickListenerC1761aU viewOnClickListenerC1761aUA03 = AbstractC1762aV.A03(ke2, A00(0, 9, 20));
        this.A02.setOnClickListener(viewOnClickListenerC1761aUA03);
        this.A00.setOnClickListener(viewOnClickListenerC1761aUA03);
        this.A01.setOnClickListener(viewOnClickListenerC1761aUA03);
    }

    public void setDescriptionTextSize(int i10) {
        this.A00.setTextSize(i10);
    }

    public void setDescriptionVisibility(int i10) {
        this.A00.setVisibility(i10);
    }

    public void setTitleTextSize(int i10) {
        this.A02.setTextSize(i10);
    }
}
