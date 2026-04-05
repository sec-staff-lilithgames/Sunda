package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;
import javax.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class YX extends View {

    @Nullable
    public YW A00;

    public YX(C1937dL c1937dL, YW yw2) {
        super(c1937dL);
        this.A00 = yw2;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        YW yw2 = this.A00;
    }
}
