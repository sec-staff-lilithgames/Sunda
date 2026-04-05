package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.cm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1903cm extends LinearLayout {
    public static final int A04 = (int) (AbstractC1640Wl.A02 * 32.0f);
    public static final int A05 = (int) (AbstractC1640Wl.A02 * 8.0f);
    public TextView A00;
    public TextView A01;
    public C1751aK A02;
    public final C1937dL A03;

    public C1903cm(C1937dL c1937dL) {
        super(c1937dL);
        this.A03 = c1937dL;
        A00(c1937dL);
    }

    private final void A00(C1937dL c1937dL) {
        setGravity(16);
        this.A02 = new C1751aK(c1937dL);
        this.A02.setFullCircleCorners(true);
        LinearLayout.LayoutParams pageImageViewParams = new LinearLayout.LayoutParams(A04, A04);
        pageImageViewParams.setMargins(0, 0, A05, 0);
        addView(this.A02, pageImageViewParams);
        LinearLayout pageInfoView = new LinearLayout(c1937dL);
        pageInfoView.setOrientation(1);
        this.A00 = new TextView(c1937dL);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        XP.A0W(this.A00, true, 16);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setSingleLine(true);
        this.A01 = new TextView(c1937dL);
        XP.A0W(this.A01, false, 14);
        pageInfoView.addView(this.A00);
        pageInfoView.addView(this.A01);
        addView(pageInfoView, layoutParams);
    }

    public final void A01() {
        this.A02.setImageBitmap(null);
        this.A00.setText("");
        this.A01.setText("");
    }

    public final void A02(int i10, int i11) {
        this.A00.setTextColor(i10);
        this.A01.setTextColor(i11);
    }

    public void setPageDetails(N9 n9) {
        KZ kz = new KZ(this.A02, this.A03);
        kz.A05(A04, A04);
        kz.A07(n9.A01());
        this.A00.setText(n9.A02());
        this.A01.setText(n9.A03());
    }
}
