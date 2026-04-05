package com.facebook.ads.redexgen.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public class GD implements InterfaceC1721Zo {
    public final /* synthetic */ C4K A00;

    public GD(C4K c4k) {
        this.A00 = c4k;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1721Zo
    public final void ADT(C1720Zn c1720Zn) {
        if (this.A00.A02 != null && c1720Zn.A00() != null) {
            this.A00.A02.setImageBitmap(c1720Zn.A00());
            this.A00.A02.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.A00.A02.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }
}
