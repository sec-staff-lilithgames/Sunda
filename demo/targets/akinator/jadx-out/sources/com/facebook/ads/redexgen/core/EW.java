package com.facebook.ads.redexgen.core;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class EW extends C1752aL {
    public final ImageView A00;
    public final C1937dL A01;

    public EW(C1937dL c1937dL) {
        super(c1937dL);
        this.A01 = c1937dL;
        setRadius(30);
        this.A00 = new ImageView(c1937dL);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final /* synthetic */ void A00(C1720Zn c1720Zn) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = -2;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.updateViewLayout(this, layoutParams);
        }
    }

    public void setUrl(String str) {
        KZ kz = new KZ(this.A00, this.A01);
        kz.A04();
        kz.A07(str);
        kz.A06(new InterfaceC1721Zo() { // from class: com.facebook.ads.redexgen.X.EX
            @Override // com.facebook.ads.redexgen.core.InterfaceC1721Zo
            public final void ADT(C1720Zn c1720Zn) {
                this.A00.A00(c1720Zn);
            }
        });
    }
}
