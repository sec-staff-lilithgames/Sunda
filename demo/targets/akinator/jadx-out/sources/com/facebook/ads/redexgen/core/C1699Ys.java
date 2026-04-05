package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Ys, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1699Ys extends LinearLayout {
    public final ImageView A00;
    public final LinearLayout A01;
    public final TextView A02;
    public static final int A05 = (int) (AbstractC1640Wl.A02 * 8.0f);
    public static final int A06 = (int) (AbstractC1640Wl.A02 * 14.5d);
    public static final int A04 = (int) (AbstractC1640Wl.A02 * 20.0f);
    public static final LinearLayout.LayoutParams A03 = new LinearLayout.LayoutParams(-1, -2);

    public C1699Ys(C1937dL c1937dL) {
        super(c1937dL);
        this.A00 = new ImageView(c1937dL);
        this.A00.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A04, A04);
        layoutParams.gravity = 16;
        this.A00.setLayoutParams(layoutParams);
        this.A01 = new LinearLayout(c1937dL);
        this.A01.setOrientation(1);
        this.A01.setPadding(A05 * 2, 0, 0, 0);
        LinearLayout linearLayout = this.A01;
        LinearLayout.LayoutParams iconParams = A03;
        linearLayout.setLayoutParams(iconParams);
        this.A02 = new TextView(c1937dL);
        XP.A0W(this.A02, true, 16);
        this.A02.setTextColor(-14934495);
        LinearLayout linearLayout2 = this.A01;
        TextView textView = this.A02;
        LinearLayout.LayoutParams iconParams2 = A03;
        linearLayout2.addView(textView, iconParams2);
        setOrientation(0);
        addView(this.A00);
        addView(this.A01);
    }

    public void setInfo(XX xx, String str, String str2) {
        this.A00.setImageBitmap(XY.A01(xx));
        this.A02.setText(str);
        if (!TextUtils.isEmpty(str2)) {
            TextView textView = new TextView(getContext());
            XP.A0W(textView, false, 14);
            textView.setTextColor(-10459280);
            textView.setText(str2);
            this.A01.addView(textView, A03);
            setPadding(0, A05, 0, A05);
            return;
        }
        setPadding(0, A06, 0, A06);
    }
}
