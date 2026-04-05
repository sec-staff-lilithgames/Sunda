package com.facebook.ads.redexgen.core;

import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Yh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1688Yh extends LinearLayout {
    public boolean A00;
    public final ImageView A01;
    public final TextView A02;
    public static final int A04 = (int) (AbstractC1640Wl.A02 * 16.0f);
    public static final int A05 = (int) (AbstractC1640Wl.A02 * 12.0f);
    public static final int A06 = (int) (AbstractC1640Wl.A02 * 12.0f);
    public static final int A03 = (int) (AbstractC1640Wl.A02 * 16.0f);

    public C1688Yh(C1937dL c1937dL) {
        super(c1937dL);
        this.A00 = false;
        setOrientation(0);
        setPadding(A04, A05, A04, A05);
        this.A01 = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A03, A03);
        layoutParams.gravity = 17;
        this.A02 = new TextView(getContext());
        ViewGroup.LayoutParams textViewParams = new LinearLayout.LayoutParams(-2, -2);
        addView(this.A01, layoutParams);
        addView(this.A02, textViewParams);
        A00();
    }

    private void A00() {
        int textColor;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(this.A00 ? -13272859 : -1315344);
        gradientDrawable.setCornerRadius(50.0f);
        XP.A0Q(this, gradientDrawable);
        XP.A0W(this.A02, false, 14);
        if (this.A00) {
            textColor = -1;
        } else {
            textColor = -10459280;
        }
        this.A02.setTextColor(textColor);
        this.A01.setColorFilter(textColor);
    }

    public final void A01() {
        setSelected(!this.A00);
    }

    public void setData(String str, XX xx) {
        this.A02.setText(str);
        if (xx != null) {
            this.A01.setImageBitmap(XY.A01(xx));
            this.A01.setVisibility(0);
            this.A02.setPadding(A06, 0, 0, 0);
        } else {
            this.A01.setVisibility(8);
            this.A02.setPadding(0, 0, 0, 0);
        }
        A00();
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        this.A00 = z10;
        A00();
    }
}
