package com.facebook.ads.redexgen.core;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Yc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1683Yc extends RelativeLayout {
    public final int A00;
    public final int A01;
    public final O2 A02;
    public final C1937dL A03;
    public final InterfaceC1686Yf A04;
    public final boolean A05;
    public static final int A09 = (int) (AbstractC1640Wl.A02 * 16.0f);
    public static final int A0A = (int) (AbstractC1640Wl.A02 * 8.0f);
    public static final int A0D = (int) (AbstractC1640Wl.A02 * 44.0f);
    public static final int A08 = (int) (AbstractC1640Wl.A02 * 10.0f);
    public static final int A07 = A09 - A08;
    public static final int A0E = (int) (AbstractC1640Wl.A02 * 75.0f);
    public static final int A0B = (int) (AbstractC1640Wl.A02 * 25.0f);
    public static final int A0F = (int) (AbstractC1640Wl.A02 * 45.0f);
    public static final int A0C = (int) (AbstractC1640Wl.A02 * 15.0f);
    public static final int A06 = (int) (AbstractC1640Wl.A02 * 16.0f);

    public C1683Yc(C1682Yb c1682Yb) {
        super(c1682Yb.A0C);
        this.A03 = c1682Yb.A0C;
        this.A02 = O3.A00(this.A03.A02());
        this.A04 = c1682Yb.A02;
        this.A01 = c1682Yb.A0B ? A0E : A0F;
        this.A00 = c1682Yb.A0B ? A0B : A0C;
        this.A05 = c1682Yb.A07;
        setFocusable(true);
        View viewA01 = A01(c1682Yb);
        View viewA00 = A00(c1682Yb);
        View footerView = getFooterView();
        XP.A0I(viewA01);
        XP.A0I(viewA00);
        XP.A0I(footerView);
        RelativeLayout.LayoutParams contentParams = new RelativeLayout.LayoutParams(-1, -2);
        contentParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        layoutParams.addRule(3, viewA01.getId());
        layoutParams.addRule(2, footerView.getId());
        RelativeLayout.LayoutParams footerParams = new RelativeLayout.LayoutParams(-1, -2);
        footerParams.addRule(12);
        footerParams.setMargins(A09, 0, A09, A09);
        addView(viewA01, contentParams);
        addView(viewA00, layoutParams);
        addView(footerView, footerParams);
        footerView.setVisibility(c1682Yb.A08 ? 0 : 8);
    }

    public /* synthetic */ C1683Yc(C1682Yb c1682Yb, YZ yz) {
        this(c1682Yb);
    }

    private View A00(C1682Yb c1682Yb) {
        ImageView imageView = new ImageView(getContext());
        imageView.setPadding(this.A00, this.A00, this.A00, this.A00);
        imageView.setImageBitmap(XY.A01(c1682Yb.A01));
        imageView.setColorFilter(-1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.A01, this.A01);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(c1682Yb.A00);
        XP.A0Q(imageView, gradientDrawable);
        layoutParams.gravity = 17;
        layoutParams.setMargins(A09, 0, A09, A09);
        TextView subtitleView = new TextView(getContext());
        XP.A0W(subtitleView, true, 20);
        subtitleView.setTextColor(-14934495);
        subtitleView.setText(c1682Yb.A06);
        subtitleView.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(A09, 0, A09, A09);
        TextView titleView = new TextView(getContext());
        XP.A0W(titleView, false, 16);
        titleView.setTextColor(-10459280);
        titleView.setText(c1682Yb.A05);
        titleView.setGravity(17);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(A09, 0, A09, A09);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(subtitleView, layoutParams2);
        linearLayout.addView(titleView, layoutParams3);
        if (c1682Yb.A09) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            if (!TextUtils.isEmpty(c1682Yb.A04)) {
                C1751aK c1751aK = new C1751aK(this.A03);
                LinearLayout.LayoutParams iconParams = new LinearLayout.LayoutParams(A0F, A0F);
                iconParams.setMargins(0, 0, A0A, 0);
                c1751aK.setFullCircleCorners(true);
                new KZ(c1751aK, this.A03).A05(A0F, A0F).A07(c1682Yb.A04);
                linearLayout2.addView(c1751aK, iconParams);
            }
            C1688Yh c1688Yh = new C1688Yh(this.A03);
            c1688Yh.setData(c1682Yb.A03, XX.CHECKMARK);
            c1688Yh.setSelected(true);
            linearLayout2.addView(c1688Yh, new LinearLayout.LayoutParams(-2, -2));
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    private View A01(C1682Yb c1682Yb) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        if (c1682Yb.A0A) {
            ImageView imageView = new ImageView(getContext());
            imageView.setPadding(A08, A08, A08, A08);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(XY.A01(XX.CROSS));
            imageView.setOnClickListener(new YZ(this));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A0D, A0D);
            layoutParams.setMargins(A07, A07, A07, A07);
            linearLayout.addView(imageView, layoutParams);
        }
        return linearLayout;
    }

    private View getFooterView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(XY.A01(XX.SETTINGS));
        imageView.setColorFilter(-13272859);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A06, A06);
        layoutParams.gravity = 17;
        TextView textView = new TextView(getContext());
        XP.A0W(textView, false, 16);
        textView.setTextColor(-13272859);
        textView.setPadding(A0A, A0A, A0A, A0A);
        textView.setText(this.A02.A0J());
        LinearLayout.LayoutParams settingsIconParams = new LinearLayout.LayoutParams(-2, -2);
        settingsIconParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new ViewOnClickListenerC1681Ya(this));
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, settingsIconParams);
        return linearLayout;
    }
}
