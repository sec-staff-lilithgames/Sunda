package com.facebook.ads.redexgen.core;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1665Xk extends LinearLayout {
    public static byte[] A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final ImageView A00;
    public final ImageView A01;
    public final O2 A02;
    public final C1937dL A03;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{103, 66};
    }

    static {
        A03();
        A08 = (int) (AbstractC1640Wl.A02 * 50.0f);
        A05 = (int) (AbstractC1640Wl.A02 * 10.0f);
        A06 = (int) (AbstractC1640Wl.A02 * 20.0f);
        A09 = (int) (AbstractC1640Wl.A02 * 4.0f);
        A07 = (int) (AbstractC1640Wl.A02 * 12.0f);
    }

    public C1665Xk(C1937dL c1937dL, int i10) {
        super(c1937dL);
        this.A03 = c1937dL;
        this.A02 = O3.A00(c1937dL.A02());
        setOrientation(0);
        this.A00 = new ImageView(c1937dL);
        this.A01 = new ImageView(c1937dL);
        A04(i10);
    }

    private void A04(int i10) {
        XX xx;
        A05(this.A00, XX.AD_CHOICES_ICON);
        if (i10 == 2) {
            setPadding(A05, A05 / 3, A05, A05 / 3);
            TextView textView = new TextView(this.A03);
            textView.setText(A02(0, 2, 80));
            textView.setTextColor(-1);
            textView.setPadding(0, A05 / 2, A05 / 2, A05 / 2);
            XP.A0W(textView, true, 13);
            LinearLayout.LayoutParams textViewParams = new LinearLayout.LayoutParams(-2, -2);
            textViewParams.gravity = 16;
            addView(textView, textViewParams);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A07, A07);
            layoutParams.gravity = 16;
            addView(this.A00, layoutParams);
            return;
        }
        setPadding(A05, A05, A05, A05);
        if (i10 == 1) {
            xx = XX.AN_INFO_ICON;
        } else {
            xx = XX.DEFAULT_INFO_ICON;
        }
        A05(this.A01, xx);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(A06, A06);
        layoutParams2.gravity = 17;
        addView(this.A01, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(A06, A06);
        layoutParams3.setMargins(A09, 0, 0, 0);
        layoutParams3.gravity = 17;
        addView(this.A00, layoutParams3);
    }

    public static void A05(ImageView imageView, XX xx) {
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(XY.A01(xx));
        imageView.setColorFilter(-1);
    }

    public void setAdDetails(N9 n9, String str, C1580Ua c1580Ua, InterfaceC1668Xn interfaceC1668Xn) {
        setOnClickListener(new ViewOnClickListenerC1664Xj(this, c1580Ua, interfaceC1668Xn, str, n9));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(A08);
        gradientDrawable.setColor(i10);
        XP.A0Q(this, gradientDrawable);
    }

    public void setIconColors(int i10) {
        this.A00.setColorFilter(i10);
        this.A01.setColorFilter(i10);
    }
}
