package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeBannerAd;
import java.util.ArrayList;

/* loaded from: assets/audience_network.dex */
public final class EQ extends LinearLayout implements InterfaceC1938dM {
    public final NativeBannerAd A00;
    public final C1937dL A01;
    public final ArrayList<View> A02;
    public static final int A04 = (int) (AbstractC1640Wl.A02 * 42.0f);
    public static final int A03 = (int) (AbstractC1640Wl.A02 * 48.0f);
    public static final int A05 = (int) (AbstractC1640Wl.A02 * 54.0f);
    public static final int A07 = (int) (AbstractC1640Wl.A02 * 4.0f);
    public static final int A06 = (int) (AbstractC1640Wl.A02 * 8.0f);

    public EQ(C1937dL c1937dL, NativeBannerAd nativeBannerAd, C1597Ur c1597Ur, EnumC1598Us enumC1598Us, MediaView mediaView, AdOptionsView adOptionsView) {
        LinearLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams ctaButtonParams;
        super(c1937dL);
        this.A02 = new ArrayList<>();
        this.A00 = nativeBannerAd;
        this.A01 = c1937dL;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        int iA00 = A00(enumC1598Us);
        C1752aL c1752aL = new C1752aL(this.A01);
        c1752aL.setFullCircleCorners(true);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iA00, iA00);
        layoutParams2.gravity = 16;
        c1752aL.addView(mediaView, new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(c1752aL, layoutParams2);
        C1935dJ c1935dJ = new C1935dJ(c1937dL, this.A00, enumC1598Us, c1597Ur, adOptionsView);
        c1935dJ.setPadding(A06, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
        layoutParams3.weight = 1.0f;
        layoutParams3.gravity = 16;
        linearLayout.addView(c1935dJ, layoutParams3);
        if (enumC1598Us == EnumC1598Us.A0A) {
            setPadding(A07, A07, A07, A07);
            setOrientation(0);
            layoutParams = new LinearLayout.LayoutParams(0, -1);
            ctaButtonParams = new LinearLayout.LayoutParams(-2, -1);
            linearLayout.setPadding(0, 0, A07, 0);
        } else {
            setPadding(A06, A06, A06, A06);
            setOrientation(1);
            layoutParams = new LinearLayout.LayoutParams(-1, 0);
            ctaButtonParams = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.setPadding(0, 0, 0, A06);
        }
        layoutParams.weight = 1.0f;
        addView(linearLayout, layoutParams);
        TextView ctaButton = new TextView(getContext());
        ctaButton.setPadding(A06, A07, A06, A07);
        c1597Ur.A05(ctaButton);
        ctaButton.setText(this.A00.getAdCallToAction());
        addView(ctaButton, ctaButtonParams);
        this.A02.add(mediaView);
        this.A02.add(ctaButton);
    }

    public static int A00(EnumC1598Us enumC1598Us) {
        switch (enumC1598Us) {
            case A0A:
                return A04;
            case A06:
                return A03;
            default:
                return A05;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1938dM
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1938dM
    public ArrayList<View> getViewsForInteraction() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1938dM
    public final void unregisterView() {
        this.A00.unregisterView();
    }
}
