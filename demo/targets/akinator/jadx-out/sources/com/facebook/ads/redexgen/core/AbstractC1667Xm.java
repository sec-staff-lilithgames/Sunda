package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.Xm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1667Xm extends LinearLayout {
    public static int A00 = (int) (AbstractC1640Wl.A02 * 56.0f);
    public static int A01 = (int) (AbstractC1640Wl.A02 * 56.0f);

    public abstract void A06();

    public abstract void A07();

    public abstract void A08();

    public abstract void A09(float f10, int i10);

    public abstract void A0A(C1400My c1400My, boolean z10);

    public abstract boolean A0B();

    public abstract int getToolbarActionMode();

    public abstract int getToolbarHeight();

    public abstract InterfaceC1666Xl getToolbarListener();

    public abstract void setAdReportingVisible(boolean z10);

    public abstract void setCTAClickListener(View.OnClickListener onClickListener);

    public abstract void setCTAClickListener(KE ke2);

    public abstract void setFullscreen(boolean z10);

    public abstract void setPageDetails(N9 n9, String str, int i10, NF nf2);

    public abstract void setPageDetailsVisible(boolean z10);

    public abstract void setProgress(float f10);

    public abstract void setProgressClickListener(View.OnClickListener onClickListener);

    public abstract void setProgressImage(XX xx);

    public abstract void setProgressImmediate(float f10);

    public abstract void setProgressSpinnerInvisible(boolean z10);

    public abstract void setToolbarActionMessage(String str);

    public abstract void setToolbarActionMode(int i10);

    public abstract void setToolbarListener(InterfaceC1666Xl interfaceC1666Xl);

    public AbstractC1667Xm(Context context) {
        super(context);
    }
}
