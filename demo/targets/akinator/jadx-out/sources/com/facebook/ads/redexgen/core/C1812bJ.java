package com.facebook.ads.redexgen.core;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.bJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1812bJ extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final KE A02;
    public static final int A05 = (int) (AbstractC1640Wl.A02 * 36.0f);
    public static final int A06 = (int) (AbstractC1640Wl.A02 * 36.0f);
    public static final int A03 = (int) (AbstractC1640Wl.A02 * 23.0f);
    public static final int A04 = (int) (AbstractC1640Wl.A02 * 3.0f);
    public static final int A07 = (int) (AbstractC1640Wl.A02 * 4.0f);

    public C1812bJ(C1937dL c1937dL, KE ke2, AbstractC2212hy abstractC2212hy, US us, InterfaceC1668Xn interfaceC1668Xn, C2010eX c2010eX, XH xh2, C1400My c1400My, InterfaceC1737a4 interfaceC1737a4) {
        super(c1937dL);
        this.A00 = c1400My.A09(true);
        this.A01 = new RelativeLayout(c1937dL);
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        this.A01.setClickable(false);
        A01(c1937dL, abstractC2212hy.A20().A0J().A04());
        if (ke2 == null) {
            this.A02 = new KE(c1937dL, abstractC2212hy.A0r(), (C1400My) null, us, interfaceC1668Xn, c2010eX, xh2, abstractC2212hy.A21());
        } else {
            this.A02 = ke2;
        }
        A03();
        this.A02.setCta(abstractC2212hy.A20().A0J(), abstractC2212hy.A25(), new HashMap(), interfaceC1737a4);
        this.A02.setIsInAppBrowser(true);
        FrameLayout.LayoutParams ctaButtonParams = new FrameLayout.LayoutParams(-1, -1);
        addView(this.A02, ctaButtonParams);
    }

    private void A00(C1937dL c1937dL, View view) {
        ImageView imageView = new ImageView(c1937dL);
        imageView.setImageBitmap(XY.A01(XX.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        imageView.setClickable(false);
        imageView.setColorFilter(this.A00);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A03, A03);
        imageView.setPadding(A04, A04, A04, A04);
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A01(C1937dL c1937dL, String str) {
        Button button = new Button(c1937dL);
        XP.A0I(button);
        button.setPadding(A06, 0, A06, 0);
        button.setText(str.toUpperCase(Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(Typeface.defaultFromStyle(1));
        XP.A0M(button, this.A00, A07);
        button.setTextColor(-16777216);
        RelativeLayout.LayoutParams ctaParams = new RelativeLayout.LayoutParams(-2, A05);
        ctaParams.addRule(12);
        ctaParams.addRule(14);
        this.A01.addView(button, ctaParams);
        A00(c1937dL, button);
    }

    public final ME A02(String str) {
        return this.A02.A0E(str);
    }

    public final void A03() {
        this.A02.setBackgroundColor(0);
        this.A02.setTextColor(0);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }

    public void setAutoClickTime(AbstractC2212hy abstractC2212hy, AbstractC1667Xm abstractC1667Xm) {
        this.A02.A0F(abstractC2212hy, abstractC1667Xm);
    }

    public void setCta(C1401Mz c1401Mz, String str, HashMap<String, String> extras, InterfaceC1737a4 interfaceC1737a4) {
        this.A02.setCta(c1401Mz, str, extras, interfaceC1737a4);
    }
}
