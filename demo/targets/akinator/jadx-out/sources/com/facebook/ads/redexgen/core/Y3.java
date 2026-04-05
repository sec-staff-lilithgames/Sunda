package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public abstract class Y3 extends RelativeLayout {
    public boolean A00;
    public final C1937dL A01;
    public final Y2 A02;
    public static final int A04 = (int) (AbstractC1640Wl.A02 * 4.0f);
    public static final int A05 = (int) (AbstractC1640Wl.A02 * 40.0f);
    public static final int A03 = (int) (AbstractC1640Wl.A02 * 24.0f);

    public abstract int getMediaViewId();

    public Y3(C1937dL c1937dL, View.OnClickListener onClickListener) {
        super(c1937dL);
        this.A00 = true;
        this.A01 = c1937dL;
        this.A02 = new Y2(this.A01);
        this.A02.setOnClickListener(onClickListener);
    }

    public final RelativeLayout.LayoutParams A00(boolean z10, boolean z11) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A05, A03);
        layoutParams.setMargins(A04, A04, A04, A04);
        if (this.A00) {
            layoutParams.addRule(z10 ? 12 : 10);
            layoutParams.addRule(z11 ? 11 : 9);
        } else {
            int mediaViewId = getMediaViewId();
            layoutParams.addRule(z10 ? 8 : 6, mediaViewId);
            layoutParams.addRule(z11 ? 7 : 5, mediaViewId);
        }
        return layoutParams;
    }

    public void A0A() {
    }

    public void A0B() {
    }

    public void A0C() {
        XP.A0H(this.A02);
        this.A02.setLayoutParams(A00(false, true));
        addView(this.A02);
    }

    public boolean A0D() {
        return true;
    }

    public boolean A0E() {
        return true;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        boolean zA0E = A0E();
        boolean newShouldLayoutButtonsRelativeToParent = this.A00;
        if (zA0E != newShouldLayoutButtonsRelativeToParent) {
            this.A00 = zA0E;
            A0C();
        }
    }
}
