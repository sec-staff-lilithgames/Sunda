package com.facebook.ads.redexgen.core;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeAd;

/* renamed from: com.facebook.ads.redexgen.X.dN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1939dN extends LinearLayout {
    public static final int A00 = (int) (AbstractC1640Wl.A02 * 32.0f);
    public static final int A01 = (int) (AbstractC1640Wl.A02 * 8.0f);

    public C1939dN(C1937dL c1937dL, NativeAd nativeAd, C1597Ur c1597Ur, C1751aK c1751aK, AdOptionsView adOptionsView) {
        super(c1937dL);
        setOrientation(0);
        c1751aK.setFullCircleCorners(true);
        LinearLayout.LayoutParams iconViewParams = new LinearLayout.LayoutParams(A00, A00);
        iconViewParams.gravity = 16;
        iconViewParams.setMargins(0, 0, A01, 0);
        addView(c1751aK, iconViewParams);
        TextView textView = new TextView(c1937dL);
        c1597Ur.A08(textView);
        textView.setMaxLines(1);
        textView.setText(nativeAd.getAdvertiserName());
        TextView sponsoredTextView = new TextView(c1937dL);
        c1597Ur.A06(sponsoredTextView);
        sponsoredTextView.setMaxLines(1);
        sponsoredTextView.setText(nativeAd.getSponsoredTranslation());
        LinearLayout linearLayout = new LinearLayout(c1937dL);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams iconViewParams2 = new LinearLayout.LayoutParams(0, -2);
        iconViewParams2.weight = 1.0f;
        iconViewParams2.gravity = 16;
        LinearLayout.LayoutParams textContainerParams = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.addView(textView, textContainerParams);
        LinearLayout.LayoutParams textContainerParams2 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.addView(sponsoredTextView, textContainerParams2);
        addView(linearLayout, iconViewParams2);
        ViewGroup.LayoutParams textContainerParams3 = new LinearLayout.LayoutParams(-2, -2);
        addView(adOptionsView, textContainerParams3);
    }
}
