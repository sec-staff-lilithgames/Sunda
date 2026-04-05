package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: assets/audience_network.dex */
public final class Mn extends AbstractC1728Zv {
    public final TextView A00;
    public final TextView A01;
    public static final int A02 = (int) (AbstractC1640Wl.A02 * 36.0f);
    public static final int A05 = (int) (AbstractC1640Wl.A02 * 4.0f);
    public static final int A03 = (int) (AbstractC1640Wl.A02 * 8.0f);
    public static final int A04 = (int) (AbstractC1640Wl.A02 * 4.0f);

    public Mn(C1937dL c1937dL, int i10, C1400My c1400My, boolean z10, String str, US us, InterfaceC1668Xn interfaceC1668Xn, C2010eX c2010eX, XH xh2, N3 n32) {
        super(c1937dL, null, i10, c1400My, z10, str, us, interfaceC1668Xn, c2010eX, xh2, n32, false, "");
        setOrientation(0);
        setPadding(A05, A05, A05, A05);
        this.A01 = A01(-16448251, 13, true);
        this.A00 = A01(-10131605, 12, false);
        this.A06.addView(A00(i10), new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        addView(this.A06, layoutParams);
        this.A08.setPadding(A03, 0, A03, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, A02);
        layoutParams2.gravity = 17;
        addView(this.A08, layoutParams2);
    }

    private LinearLayout A00(int i10) {
        LinearLayout linearLayout = new LinearLayout(this.A07);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A04, 0, A04, 0);
        linearLayout.addView(this.A01, AbstractC1728Zv.A0B);
        linearLayout.addView(this.A00, AbstractC1728Zv.A0B);
        LinearLayout linearLayout2 = new LinearLayout(this.A07);
        linearLayout2.setOrientation(0);
        linearLayout2.addView(this.A09, new LinearLayout.LayoutParams(i10, i10));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        linearLayout2.addView(linearLayout, layoutParams);
        return linearLayout2;
    }

    private TextView A01(int i10, int i11, boolean z10) {
        TextView textView = new TextView(this.A07);
        textView.setTextColor(i10);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        XP.A0W(textView, z10, i11);
        return textView;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1728Zv
    public final void A0g() {
        super.A0g();
        setOnClickListener(this.A05);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1728Zv
    public final void A0h(int i10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1728Zv
    public void setInfo(C1398Mw c1398Mw, C1401Mz c1401Mz, String str, String str2, InterfaceC1650Wv interfaceC1650Wv, InterfaceC1737a4 interfaceC1737a4) {
        super.setInfo(c1398Mw, c1401Mz, str, str2, interfaceC1650Wv, interfaceC1737a4);
        this.A01.setText(c1398Mw.A0F());
        this.A00.setText(c1398Mw.A0E());
        if (TextUtils.isEmpty(c1401Mz.A04())) {
            XP.A0F(this.A08);
        }
    }
}
